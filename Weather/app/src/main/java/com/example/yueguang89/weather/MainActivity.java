package com.example.yueguang89.weather;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.baidu.apistore.sdk.ApiCallBack;
import com.baidu.apistore.sdk.ApiStoreSDK;
import com.baidu.apistore.sdk.network.Parameters;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //地址数据库
    private File f = new File("/sdcard/weather/address.db");

    //省份菜单
    private Spinner provinces;
    //城市菜单
    private Spinner cities;
    //查询按钮
    private Button select;
    //收藏按钮
    private Button input;
    //读取按钮
    private Button output;
    //城市
    private TextView city;
    //日期
    private TextView date;
    //今天气温
    private TextView temperature1;
    //明天气温
    private TextView temperature2;
    //后天气温
    private TextView temperature3;
    //今天天气
    private TextView weather1;
    //明天天气
    private TextView weather2;
    //后天天气
    private TextView weather3;
    //今天风向
    private TextView wind1;
    //明天风向
    private TextView wind2;
    //后天风向
    private TextView wind3;
    //今天风力
    private TextView windpower1;
    //明天风力
    private TextView windpower2;
    //后天风力
    private TextView windpower3;

    private TextView save;
    private TextView citysave;

    private List<String> proset = new ArrayList<String>();
    private List<String> citset = new ArrayList<String>();
    private int pro_id;

    private GestureDetector mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        new WriteToSD(this);

        provinces = (Spinner) findViewById(R.id.provinces);
        ArrayAdapter<String> pro_adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, getProSet());
        provinces.setAdapter(pro_adapter);
        provinces.setOnItemSelectedListener(new SelectProvince());
        cities = (Spinner) findViewById(R.id.cities);
        cities.setOnItemSelectedListener(new SelectCity());
        /*
        *
        * 监听Button
        *
        * */
        select.setOnClickListener(this);
        input.setOnClickListener(this);
        output.setOnClickListener(this);

        mGestureDetector = new GestureDetector(this,Listener );


    }

    GestureDetector.OnGestureListener Listener = new GestureDetector.SimpleOnGestureListener() {
        @Override
        public boolean onDown(MotionEvent event){
            return true;
        }
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if(Math.abs(e1.getRawY() - e2.getRawY())>100){
                //Toast.makeText(getApplicationContext(), "动作不合法", 0).show();
                return true;
            }
            if(Math.abs(velocityX)<150){
                //Toast.makeText(getApplicationContext(), "移动太慢", 0).show();
                return true;
            }
            if ((e1.getRawX() - e2.getRawX()) > 200) {// 向右滑动
                city.setText(save.getText().toString());
                getWeather();
                return true;
            }
            if ((e2.getRawX() - e1.getRawX()) > 200) {// 向左滑动
                city.setText(citysave.getText().toString());
                getWeather();
                return true;
            }
            return true;
        }
    };

    /*
    *
    * 二级菜单联动
    *
    */
    class SelectProvince implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> parent, View view,
                                   int position, long id) {
            pro_id=position;
            cities.setAdapter(getAdapter());
        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }

    class SelectCity implements AdapterView.OnItemSelectedListener {
        public void onItemSelected(AdapterView<?> parent, View view,
                                   int position, long id) {
            String cityname = parent.getItemAtPosition(position).toString();
            citysave.setText(cityname);
        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }

    public List<String> getProSet() {
        SQLiteDatabase db1 = SQLiteDatabase.openOrCreateDatabase(f, null);
        Cursor cursor = db1.query("provinces", null, null,
                null, null, null, null);
        while(cursor.moveToNext()){
            String pro=cursor.getString(cursor.getColumnIndexOrThrow("name"));
            proset.add(pro);
        }
        cursor.close();
        db1.close();
        return proset;
    }
    public List<String> getCitSet(int pro_id){
        citset.clear();
        SQLiteDatabase db1 = SQLiteDatabase.openOrCreateDatabase(f, null);
        Cursor cursor=db1.query("citys", null, "province_id="+pro_id,
                null, null, null, null);
        while(cursor.moveToNext()){
            String pro=cursor.getString(cursor.getColumnIndexOrThrow("name"));
            citset.add(pro);
        }
        cursor.close();
        db1.close();
        return citset;
    }
    public ArrayAdapter<String> getAdapter(){
        ArrayAdapter<String> adapter1=new ArrayAdapter(this,
                android.R.layout.simple_spinner_item,getCitSet(pro_id));
        return adapter1;
    }

    //初始化控件
    private void initView() {
        select = (Button)findViewById(R.id.select);
        input = (Button)findViewById(R.id.input);
        output = (Button)findViewById(R.id.output);
        city = (TextView) findViewById(R.id.city);
        date = (TextView) findViewById(R.id.date);
        temperature1 = (TextView) findViewById(R.id.temperature1);
        temperature2 = (TextView) findViewById(R.id.temperature2);
        temperature3 = (TextView) findViewById(R.id.temperature3);
        weather1 = (TextView) findViewById(R.id.weather1);
        weather2 = (TextView) findViewById(R.id.weather2);
        weather3 = (TextView) findViewById(R.id.weather3);
        wind1 = (TextView) findViewById(R.id.wind1);
        wind2 = (TextView) findViewById(R.id.wind2);
        wind3 = (TextView) findViewById(R.id.wind3);
        windpower1 = (TextView) findViewById(R.id.windpower1);
        windpower2 = (TextView) findViewById(R.id.windpower2);
        windpower3 = (TextView) findViewById(R.id.windpower3);
        save = (TextView)findViewById(R.id.save);
        citysave =(TextView)findViewById(R.id.citysave);
    }

    //点击事件
    public void onClick(View v){
        switch (v.getId()){
            //选择城市
            case R.id.select:
                city.setText(citysave.getText().toString());
                getWeather();
                break;
            //收藏城市
            case R.id.input:
                save.setText(city.getText().toString());
                Toast.makeText(getApplicationContext(),"已收藏",
                        Toast.LENGTH_SHORT).show();
                break;
            //读取收藏
            case R.id.output:
                    city.setText(save.getText().toString());
                break;
            default:
                break;
        }
    }

    /*
    *
    * 天气信息获取
    *
    * */
    private void getWeather() {
        String thisCity;
        Parameters para = new Parameters();
        thisCity = city.getText().toString();
        para.put("area", thisCity);
        //使用百度天气API
        ApiStoreSDK.
                execute("http://apis.baidu.com/showapi_open_bus/weather_showapi/address",
                        ApiStoreSDK.GET, para, new ApiCallBack() {
            @Override
            public void onSuccess(int status, String responseString) {
                Gson gson = new Gson();
                Type tpye = new TypeToken<GsonBean>() {
                }.getType();
                GsonBean gsonBean = gson.fromJson(responseString, tpye);
                date.setText((getDate()));
                //取得当日数据
                GsonBean.ShowapiResBodyEntity.F1Entity f1 =
                        gsonBean.getShowapi_res_body().getF1();
                GsonBean.ShowapiResBodyEntity.F2Entity f2 =
                        gsonBean.getShowapi_res_body().getF2();
                GsonBean.ShowapiResBodyEntity.F3Entity f3 =
                        gsonBean.getShowapi_res_body().getF3();
                //获得温度
                temperature1.setText(f1.getNight_air_temperature()
                        + "℃~" + f1.getDay_air_temperature() + "℃");
                temperature2.setText(f2.getNight_air_temperature()
                        + "℃~" + f2.getDay_air_temperature() + "℃");
                temperature3.setText(f3.getNight_air_temperature()
                        + "℃~" + f3.getDay_air_temperature() + "℃");
                Calendar c = Calendar.getInstance();
                c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
                int hour = c.get(Calendar.HOUR_OF_DAY);
                //判断早晚
                if (hour >= 6 && hour <= 18) {
                    //获得天气
                    weather1.setText(f1.getDay_weather());
                    weather2.setText(f2.getDay_weather());
                    weather3.setText(f3.getDay_weather());
                    //获得风向
                    wind1.setText(f1.getDay_wind_direction());
                    wind2.setText(f2.getDay_wind_direction());
                    wind3.setText(f3.getDay_wind_direction());
                    //获得风力
                    windpower1.setText(f1.getDay_wind_power());
                    windpower2.setText(f2.getDay_wind_power());
                    windpower3.setText(f3.getDay_wind_power());
                } else {
                    weather1.setText(f1.getNight_weather());
                    weather2.setText(f2.getNight_weather());
                    weather3.setText(f3.getNight_weather());
                    wind1.setText(f1.getNight_wind_direction());
                    wind2.setText(f2.getNight_wind_direction());
                    wind3.setText(f3.getNight_wind_direction());
                    windpower1.setText(f1.getNight_wind_power());
                    windpower2.setText(f2.getNight_wind_power());
                    windpower3.setText(f3.getNight_wind_power());
                }
            }
        });
    }

    /*
    *
    * 时间信息获取
    *
    * */
    private String getDate() {
        final Calendar c = Calendar.getInstance();
        c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        //取得年份
        String mYear = String.valueOf(c.get(Calendar.YEAR));
        //取得月份
        String mMonth = String.valueOf(c.get(Calendar.MONTH) + 1);
        //取得日期
        String mDay = String.valueOf(c.get(Calendar.DAY_OF_MONTH));
        //取得星期
        String mWay = String.valueOf(c.get(Calendar.DAY_OF_WEEK));
        if ("1".equals(mWay)) {
            mWay = "日";
        } else if ("2".equals(mWay)) {
            mWay = "一";
        } else if ("3".equals(mWay)) {
            mWay = "二";
        } else if ("4".equals(mWay)) {
            mWay = "三";
        } else if ("5".equals(mWay)) {
            mWay = "四";
        } else if ("6".equals(mWay)) {
            mWay = "五";
        } else if ("7".equals(mWay)) {
            mWay = "六";
        }
        return mYear + "年" + mMonth + "月" + mDay + "日" + "(星期" + mWay + ")";
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        return mGestureDetector.onTouchEvent(event);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.close);
    }
}

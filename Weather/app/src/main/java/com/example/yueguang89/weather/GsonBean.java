package com.example.yueguang89.weather;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({ "unchecked", "rawtypes" })
public class GsonBean {
    /**
     * showapi_res_code : 0 showapi_res_error : showapi_res_body :
     * {"cityInfo":{"c1"
     * :"101040100","c10":"1","c11":"023","c12":"400000","c15":"260"
     * ,"c16":"AZ9230"
     * ,"c17":"+8","c2":"chongqing","c3":"重庆","c4":"chongqing","c5"
     * :"重庆","c6":"chongqing"
     * ,"c7":"重庆","c8":"china","c9":"中国","latitude":29.581,
     * "longitude":106.549},"f1"
     * :{"air_press":"994 hPa","day":"20160114","day_air_temperature"
     * :"10","day_weather":"小雨","day_weather_code":"07","day_weather_pic":
     * "http://app1.showapi.com/weather/icon/day/07.png"
     * ,"day_wind_direction":"无持续风向"
     * ,"day_wind_power":"微风<10m/h","jiangshui":"55%"
     * ,"night_air_temperature":"8"
     * ,"night_weather":"阴","night_weather_code":"02" ,"night_weather_pic":
     * "http://app1.showapi.com/weather/icon/night/02.png"
     * ,"night_wind_direction"
     * :"无持续风向","night_wind_power":"微风<10m/h","sun_begin_end"
     * :"07:49|18:15","weekday"
     * :4,"ziwaixian":"最弱"},"f2":{"day":"20160115","day_air_temperature"
     * :"12","day_weather":"多云","day_weather_code":"01","day_weather_pic":
     * "http://app1.showapi.com/weather/icon/day/01.png"
     * ,"day_wind_direction":"无持续风向"
     * ,"day_wind_power":"微风<10m/h","night_air_temperature"
     * :"8","night_weather":"小雨","night_weather_code":"07","night_weather_pic":
     * "http://app1.showapi.com/weather/icon/night/07.png"
     * ,"night_wind_direction"
     * :"无持续风向","night_wind_power":"微风<10m/h","sun_begin_end"
     * :"07:49|18:15","weekday"
     * :5},"f3":{"day":"20160116","day_air_temperature":"9"
     * ,"day_weather":"小雨","day_weather_code":"07","day_weather_pic":
     * "http://app1.showapi.com/weather/icon/day/07.png"
     * ,"day_wind_direction":"无持续风向"
     * ,"day_wind_power":"微风<10m/h","night_air_temperature"
     * :"6","night_weather":"小雨","night_weather_code":"07","night_weather_pic":
     * "http://app1.showapi.com/weather/icon/night/07.png"
     * ,"night_wind_direction"
     * :"无持续风向","night_wind_power":"微风<10m/h","sun_begin_end"
     * :"07:49|18:15","weekday"
     * :6},"now":{"aqi":89,"aqiDetail":{"aqi":89,"area":"重庆"
     * ,"area_code":"chongqing"
     * ,"co":1.552,"no2":38,"o3":7,"o3_8h":7,"pm10":80,"pm2_5"
     * :66,"primary_pollutant"
     * :"颗粒物(PM2.5)","quality":"良","so2":16},"sd":"91%","temperature"
     * :"8","temperature_time"
     * :"11:00","weather":"多云","weather_code":"01","weather_pic"
     * :"http://appimg.showapi.com/images/weather/icon/day/01.png"
     * ,"wind_direction"
     * :"西北风","wind_power":"1级"},"ret_code":0,"time":"20160114073000"}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    /**
     * cityInfo :
     * {"c1":"101040100","c10":"1","c11":"023","c12":"400000","c15":"260"
     * ,"c16":"AZ9230"
     * ,"c17":"+8","c2":"chongqing","c3":"重庆","c4":"chongqing","c5"
     * :"重庆","c6":"chongqing"
     * ,"c7":"重庆","c8":"china","c9":"中国","latitude":29.581,"longitude":106.549}
     * f1 : {"air_press":"994 hPa","day":"20160114","day_air_temperature":"10",
     * "day_weather":"小雨","day_weather_code":"07","day_weather_pic":
     * "http://app1.showapi.com/weather/icon/day/07.png"
     * ,"day_wind_direction":"无持续风向"
     * ,"day_wind_power":"微风<10m/h","jiangshui":"55%"
     * ,"night_air_temperature":"8"
     * ,"night_weather":"阴","night_weather_code":"02" ,"night_weather_pic":
     * "http://app1.showapi.com/weather/icon/night/02.png"
     * ,"night_wind_direction"
     * :"无持续风向","night_wind_power":"微风<10m/h","sun_begin_end"
     * :"07:49|18:15","weekday":4,"ziwaixian":"最弱"} f2 :
     * {"day":"20160115","day_air_temperature"
     * :"12","day_weather":"多云","day_weather_code":"01","day_weather_pic":
     * "http://app1.showapi.com/weather/icon/day/01.png"
     * ,"day_wind_direction":"无持续风向"
     * ,"day_wind_power":"微风<10m/h","night_air_temperature"
     * :"8","night_weather":"小雨","night_weather_code":"07","night_weather_pic":
     * "http://app1.showapi.com/weather/icon/night/07.png"
     * ,"night_wind_direction"
     * :"无持续风向","night_wind_power":"微风<10m/h","sun_begin_end"
     * :"07:49|18:15","weekday":5} f3 :
     * {"day":"20160116","day_air_temperature":"9"
     * ,"day_weather":"小雨","day_weather_code":"07","day_weather_pic":
     * "http://app1.showapi.com/weather/icon/day/07.png"
     * ,"day_wind_direction":"无持续风向"
     * ,"day_wind_power":"微风<10m/h","night_air_temperature"
     * :"6","night_weather":"小雨","night_weather_code":"07","night_weather_pic":
     * "http://app1.showapi.com/weather/icon/night/07.png"
     * ,"night_wind_direction"
     * :"无持续风向","night_wind_power":"微风<10m/h","sun_begin_end"
     * :"07:49|18:15","weekday":6} now :
     * {"aqi":89,"aqiDetail":{"aqi":89,"area":"重庆"
     * ,"area_code":"chongqing","co":1.552
     * ,"no2":38,"o3":7,"o3_8h":7,"pm10":80,"pm2_5"
     * :66,"primary_pollutant":"颗粒物(PM2.5)"
     * ,"quality":"良","so2":16},"sd":"91%","temperature"
     * :"8","temperature_time":"11:00"
     * ,"weather":"多云","weather_code":"01","weather_pic"
     * :"http://appimg.showapi.com/images/weather/icon/day/01.png"
     * ,"wind_direction":"西北风","wind_power":"1级"} ret_code : 0 time :
     * 20160114073000
     */

    private ShowapiResBodyEntity showapi_res_body;

    public static GsonBean objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, GsonBean.class);
    }

    public static GsonBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new com.google.gson.Gson().fromJson(
                    jsonObject.getString(str), GsonBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<GsonBean> arrayGsonBeanFromData(String str) {

        Type listType = new com.google.gson.reflect.TypeToken<ArrayList<GsonBean>>() {
        }.getType();

        return new com.google.gson.Gson().fromJson(str, listType);
    }

    public static List<GsonBean> arrayGsonBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new com.google.gson.reflect.TypeToken<ArrayList<GsonBean>>() {
            }.getType();

            return new com.google.gson.Gson().fromJson(
                    jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();

    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public void setShowapi_res_body(ShowapiResBodyEntity showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public ShowapiResBodyEntity getShowapi_res_body() {
        return showapi_res_body;
    }

    public static class ShowapiResBodyEntity {
        /**
         * c1 : 101040100 c10 : 1 c11 : 023 c12 : 400000 c15 : 260 c16 : AZ9230
         * c17 : +8 c2 : chongqing c3 : 重庆 c4 : chongqing c5 : 重庆 c6 : chongqing
         * c7 : 重庆 c8 : china c9 : 中国 latitude : 29.581 longitude : 106.549
         */

        private CityInfoEntity cityInfo;
        /**
         * air_press : 994 hPa day : 20160114 day_air_temperature : 10
         * day_weather : 小雨 day_weather_code : 07 day_weather_pic :
         * http://app1.showapi.com/weather/icon/day/07.png day_wind_direction :
         * 无持续风向 day_wind_power : 微风<10m/h jiangshui : 55% night_air_temperature
         * : 8 night_weather : 阴 night_weather_code : 02 night_weather_pic :
         * http://app1.showapi.com/weather/icon/night/02.png
         * night_wind_direction : 无持续风向 night_wind_power : 微风<10m/h
         * sun_begin_end : 07:49|18:15 weekday : 4 ziwaixian : 最弱
         */

        private F1Entity f1;
        /**
         * day : 20160115 day_air_temperature : 12 day_weather : 多云
         * day_weather_code : 01 day_weather_pic :
         * http://app1.showapi.com/weather/icon/day/01.png day_wind_direction :
         * 无持续风向 day_wind_power : 微风<10m/h night_air_temperature : 8
         * night_weather : 小雨 night_weather_code : 07 night_weather_pic :
         * http://app1.showapi.com/weather/icon/night/07.png
         * night_wind_direction : 无持续风向 night_wind_power : 微风<10m/h
         * sun_begin_end : 07:49|18:15 weekday : 5
         */

        private F2Entity f2;
        /**
         * day : 20160116 day_air_temperature : 9 day_weather : 小雨
         * day_weather_code : 07 day_weather_pic :
         * http://app1.showapi.com/weather/icon/day/07.png day_wind_direction :
         * 无持续风向 day_wind_power : 微风<10m/h night_air_temperature : 6
         * night_weather : 小雨 night_weather_code : 07 night_weather_pic :
         * http://app1.showapi.com/weather/icon/night/07.png
         * night_wind_direction : 无持续风向 night_wind_power : 微风<10m/h
         * sun_begin_end : 07:49|18:15 weekday : 6
         */

        private F3Entity f3;
        /**
         * aqi : 89 aqiDetail :
         * {"aqi":89,"area":"重庆","area_code":"chongqing","co"
         * :1.552,"no2":38,"o3"
         * :7,"o3_8h":7,"pm10":80,"pm2_5":66,"primary_pollutant"
         * :"颗粒物(PM2.5)","quality":"良","so2":16} sd : 91% temperature : 8
         * temperature_time : 11:00 weather : 多云 weather_code : 01 weather_pic :
         * http://appimg.showapi.com/images/weather/icon/day/01.png
         * wind_direction : 西北风 wind_power : 1级
         */

        private NowEntity now;
        private int ret_code;
        private String time;

        public static ShowapiResBodyEntity objectFromData(String str) {

            return new com.google.gson.Gson().fromJson(str,
                    ShowapiResBodyEntity.class);
        }

        public static ShowapiResBodyEntity objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new com.google.gson.Gson().fromJson(
                        jsonObject.getString(str), ShowapiResBodyEntity.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<ShowapiResBodyEntity> arrayShowapiResBodyEntityFromData(
                String str) {

            Type listType = new com.google.gson.reflect.TypeToken<ArrayList<ShowapiResBodyEntity>>() {
            }.getType();

            return new com.google.gson.Gson().fromJson(str, listType);
        }

        public static List<ShowapiResBodyEntity> arrayShowapiResBodyEntityFromData(
                String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<ShowapiResBodyEntity>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(
                        jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();

        }

        public void setCityInfo(CityInfoEntity cityInfo) {
            this.cityInfo = cityInfo;
        }

        public void setF1(F1Entity f1) {
            this.f1 = f1;
        }

        public void setF2(F2Entity f2) {
            this.f2 = f2;
        }

        public void setF3(F3Entity f3) {
            this.f3 = f3;
        }

        public void setNow(NowEntity now) {
            this.now = now;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public CityInfoEntity getCityInfo() {
            return cityInfo;
        }

        public F1Entity getF1() {
            return f1;
        }

        public F2Entity getF2() {
            return f2;
        }

        public F3Entity getF3() {
            return f3;
        }

        public NowEntity getNow() {
            return now;
        }

        public int getRet_code() {
            return ret_code;
        }

        public String getTime() {
            return time;
        }

        public static class CityInfoEntity {
            private String c1;
            private String c10;
            private String c11;
            private String c12;
            private String c15;
            private String c16;
            private String c17;
            private String c2;
            private String c3;
            private String c4;
            private String c5;
            private String c6;
            private String c7;
            private String c8;
            private String c9;
            private double latitude;
            private double longitude;

            public static CityInfoEntity objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str,
                        CityInfoEntity.class);
            }

            public static CityInfoEntity objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(
                            jsonObject.getString(str), CityInfoEntity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<CityInfoEntity> arrayCityInfoEntityFromData(
                    String str) {

                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<CityInfoEntity>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(str, listType);
            }

            public static List<CityInfoEntity> arrayCityInfoEntityFromData(
                    String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new com.google.gson.reflect.TypeToken<ArrayList<CityInfoEntity>>() {
                    }.getType();

                    return new com.google.gson.Gson().fromJson(
                            jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();

            }

            public void setC1(String c1) {
                this.c1 = c1;
            }

            public void setC10(String c10) {
                this.c10 = c10;
            }

            public void setC11(String c11) {
                this.c11 = c11;
            }

            public void setC12(String c12) {
                this.c12 = c12;
            }

            public void setC15(String c15) {
                this.c15 = c15;
            }

            public void setC16(String c16) {
                this.c16 = c16;
            }

            public void setC17(String c17) {
                this.c17 = c17;
            }

            public void setC2(String c2) {
                this.c2 = c2;
            }

            public void setC3(String c3) {
                this.c3 = c3;
            }

            public void setC4(String c4) {
                this.c4 = c4;
            }

            public void setC5(String c5) {
                this.c5 = c5;
            }

            public void setC6(String c6) {
                this.c6 = c6;
            }

            public void setC7(String c7) {
                this.c7 = c7;
            }

            public void setC8(String c8) {
                this.c8 = c8;
            }

            public void setC9(String c9) {
                this.c9 = c9;
            }

            public void setLatitude(double latitude) {
                this.latitude = latitude;
            }

            public void setLongitude(double longitude) {
                this.longitude = longitude;
            }

            public String getC1() {
                return c1;
            }

            public String getC10() {
                return c10;
            }

            public String getC11() {
                return c11;
            }

            public String getC12() {
                return c12;
            }

            public String getC15() {
                return c15;
            }

            public String getC16() {
                return c16;
            }

            public String getC17() {
                return c17;
            }

            public String getC2() {
                return c2;
            }

            public String getC3() {
                return c3;
            }

            public String getC4() {
                return c4;
            }

            public String getC5() {
                return c5;
            }

            public String getC6() {
                return c6;
            }

            public String getC7() {
                return c7;
            }

            public String getC8() {
                return c8;
            }

            public String getC9() {
                return c9;
            }

            public double getLatitude() {
                return latitude;
            }

            public double getLongitude() {
                return longitude;
            }
        }

        public static class F1Entity {
            private String air_press;
            private String day;
            private String day_air_temperature;
            private String day_weather;
            private String day_weather_code;
            private String day_weather_pic;
            private String day_wind_direction;
            private String day_wind_power;
            private String jiangshui;
            private String night_air_temperature;
            private String night_weather;
            private String night_weather_code;
            private String night_weather_pic;
            private String night_wind_direction;
            private String night_wind_power;
            private String sun_begin_end;
            private int weekday;
            private String ziwaixian;

            public static F1Entity objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, F1Entity.class);
            }

            public static F1Entity objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(
                            jsonObject.getString(str), F1Entity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<F1Entity> arrayF1EntityFromData(String str) {

                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<F1Entity>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(str, listType);
            }

            public static List<F1Entity> arrayF1EntityFromData(String str,
                                                               String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new com.google.gson.reflect.TypeToken<ArrayList<F1Entity>>() {
                    }.getType();

                    return new com.google.gson.Gson().fromJson(
                            jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();

            }

            public void setAir_press(String air_press) {
                this.air_press = air_press;
            }

            public void setDay(String day) {
                this.day = day;
            }

            public void setDay_air_temperature(String day_air_temperature) {
                this.day_air_temperature = day_air_temperature;
            }

            public void setDay_weather(String day_weather) {
                this.day_weather = day_weather;
            }

            public void setDay_weather_code(String day_weather_code) {
                this.day_weather_code = day_weather_code;
            }

            public void setDay_weather_pic(String day_weather_pic) {
                this.day_weather_pic = day_weather_pic;
            }

            public void setDay_wind_direction(String day_wind_direction) {
                this.day_wind_direction = day_wind_direction;
            }

            public void setDay_wind_power(String day_wind_power) {
                this.day_wind_power = day_wind_power;
            }

            public void setJiangshui(String jiangshui) {
                this.jiangshui = jiangshui;
            }

            public void setNight_air_temperature(String night_air_temperature) {
                this.night_air_temperature = night_air_temperature;
            }

            public void setNight_weather(String night_weather) {
                this.night_weather = night_weather;
            }

            public void setNight_weather_code(String night_weather_code) {
                this.night_weather_code = night_weather_code;
            }

            public void setNight_weather_pic(String night_weather_pic) {
                this.night_weather_pic = night_weather_pic;
            }

            public void setNight_wind_direction(String night_wind_direction) {
                this.night_wind_direction = night_wind_direction;
            }

            public void setNight_wind_power(String night_wind_power) {
                this.night_wind_power = night_wind_power;
            }

            public void setSun_begin_end(String sun_begin_end) {
                this.sun_begin_end = sun_begin_end;
            }

            public void setWeekday(int weekday) {
                this.weekday = weekday;
            }

            public void setZiwaixian(String ziwaixian) {
                this.ziwaixian = ziwaixian;
            }

            public String getAir_press() {
                return air_press;
            }

            public String getDay() {
                return day;
            }

            public String getDay_air_temperature() {
                return day_air_temperature;
            }

            public String getDay_weather() {
                return day_weather;
            }

            public String getDay_weather_code() {
                return day_weather_code;
            }

            public String getDay_weather_pic() {
                return day_weather_pic;
            }

            public String getDay_wind_direction() {
                return day_wind_direction;
            }

            public String getDay_wind_power() {
                return day_wind_power;
            }

            public String getJiangshui() {
                return jiangshui;
            }

            public String getNight_air_temperature() {
                return night_air_temperature;
            }

            public String getNight_weather() {
                return night_weather;
            }

            public String getNight_weather_code() {
                return night_weather_code;
            }

            public String getNight_weather_pic() {
                return night_weather_pic;
            }

            public String getNight_wind_direction() {
                return night_wind_direction;
            }

            public String getNight_wind_power() {
                return night_wind_power;
            }

            public String getSun_begin_end() {
                return sun_begin_end;
            }

            public int getWeekday() {
                return weekday;
            }

            public String getZiwaixian() {
                return ziwaixian;
            }
        }

        public static class F2Entity {
            private String day;
            private String day_air_temperature;
            private String day_weather;
            private String day_weather_code;
            private String day_weather_pic;
            private String day_wind_direction;
            private String day_wind_power;
            private String night_air_temperature;
            private String night_weather;
            private String night_weather_code;
            private String night_weather_pic;
            private String night_wind_direction;
            private String night_wind_power;
            private String sun_begin_end;
            private int weekday;

            public static F2Entity objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, F2Entity.class);
            }

            public static F2Entity objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(
                            jsonObject.getString(str), F2Entity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<F2Entity> arrayF2EntityFromData(String str) {

                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<F2Entity>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(str, listType);
            }

            public static List<F2Entity> arrayF2EntityFromData(String str,
                                                               String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new com.google.gson.reflect.TypeToken<ArrayList<F2Entity>>() {
                    }.getType();

                    return new com.google.gson.Gson().fromJson(
                            jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();

            }

            public void setDay(String day) {
                this.day = day;
            }

            public void setDay_air_temperature(String day_air_temperature) {
                this.day_air_temperature = day_air_temperature;
            }

            public void setDay_weather(String day_weather) {
                this.day_weather = day_weather;
            }

            public void setDay_weather_code(String day_weather_code) {
                this.day_weather_code = day_weather_code;
            }

            public void setDay_weather_pic(String day_weather_pic) {
                this.day_weather_pic = day_weather_pic;
            }

            public void setDay_wind_direction(String day_wind_direction) {
                this.day_wind_direction = day_wind_direction;
            }

            public void setDay_wind_power(String day_wind_power) {
                this.day_wind_power = day_wind_power;
            }

            public void setNight_air_temperature(String night_air_temperature) {
                this.night_air_temperature = night_air_temperature;
            }

            public void setNight_weather(String night_weather) {
                this.night_weather = night_weather;
            }

            public void setNight_weather_code(String night_weather_code) {
                this.night_weather_code = night_weather_code;
            }

            public void setNight_weather_pic(String night_weather_pic) {
                this.night_weather_pic = night_weather_pic;
            }

            public void setNight_wind_direction(String night_wind_direction) {
                this.night_wind_direction = night_wind_direction;
            }

            public void setNight_wind_power(String night_wind_power) {
                this.night_wind_power = night_wind_power;
            }

            public void setSun_begin_end(String sun_begin_end) {
                this.sun_begin_end = sun_begin_end;
            }

            public void setWeekday(int weekday) {
                this.weekday = weekday;
            }

            public String getDay() {
                return day;
            }

            public String getDay_air_temperature() {
                return day_air_temperature;
            }

            public String getDay_weather() {
                return day_weather;
            }

            public String getDay_weather_code() {
                return day_weather_code;
            }

            public String getDay_weather_pic() {
                return day_weather_pic;
            }

            public String getDay_wind_direction() {
                return day_wind_direction;
            }

            public String getDay_wind_power() {
                return day_wind_power;
            }

            public String getNight_air_temperature() {
                return night_air_temperature;
            }

            public String getNight_weather() {
                return night_weather;
            }

            public String getNight_weather_code() {
                return night_weather_code;
            }

            public String getNight_weather_pic() {
                return night_weather_pic;
            }

            public String getNight_wind_direction() {
                return night_wind_direction;
            }

            public String getNight_wind_power() {
                return night_wind_power;
            }

            public String getSun_begin_end() {
                return sun_begin_end;
            }

            public int getWeekday() {
                return weekday;
            }
        }

        public static class F3Entity {
            private String day;
            private String day_air_temperature;
            private String day_weather;
            private String day_weather_code;
            private String day_weather_pic;
            private String day_wind_direction;
            private String day_wind_power;
            private String night_air_temperature;
            private String night_weather;
            private String night_weather_code;
            private String night_weather_pic;
            private String night_wind_direction;
            private String night_wind_power;
            private String sun_begin_end;
            private int weekday;

            public static F3Entity objectFromData(String str) {

                return new com.google.gson.Gson().fromJson(str, F3Entity.class);
            }

            public static F3Entity objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(
                            jsonObject.getString(str), F3Entity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<F3Entity> arrayF3EntityFromData(String str) {

                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<F3Entity>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(str, listType);
            }

            public static List<F3Entity> arrayF3EntityFromData(String str,
                                                               String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new com.google.gson.reflect.TypeToken<ArrayList<F3Entity>>() {
                    }.getType();

                    return new com.google.gson.Gson().fromJson(
                            jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();

            }

            public void setDay(String day) {
                this.day = day;
            }

            public void setDay_air_temperature(String day_air_temperature) {
                this.day_air_temperature = day_air_temperature;
            }

            public void setDay_weather(String day_weather) {
                this.day_weather = day_weather;
            }

            public void setDay_weather_code(String day_weather_code) {
                this.day_weather_code = day_weather_code;
            }

            public void setDay_weather_pic(String day_weather_pic) {
                this.day_weather_pic = day_weather_pic;
            }

            public void setDay_wind_direction(String day_wind_direction) {
                this.day_wind_direction = day_wind_direction;
            }

            public void setDay_wind_power(String day_wind_power) {
                this.day_wind_power = day_wind_power;
            }

            public void setNight_air_temperature(String night_air_temperature) {
                this.night_air_temperature = night_air_temperature;
            }

            public void setNight_weather(String night_weather) {
                this.night_weather = night_weather;
            }

            public void setNight_weather_code(String night_weather_code) {
                this.night_weather_code = night_weather_code;
            }

            public void setNight_weather_pic(String night_weather_pic) {
                this.night_weather_pic = night_weather_pic;
            }

            public void setNight_wind_direction(String night_wind_direction) {
                this.night_wind_direction = night_wind_direction;
            }

            public void setNight_wind_power(String night_wind_power) {
                this.night_wind_power = night_wind_power;
            }

            public void setSun_begin_end(String sun_begin_end) {
                this.sun_begin_end = sun_begin_end;
            }

            public void setWeekday(int weekday) {
                this.weekday = weekday;
            }

            public String getDay() {
                return day;
            }

            public String getDay_air_temperature() {
                return day_air_temperature;
            }

            public String getDay_weather() {
                return day_weather;
            }

            public String getDay_weather_code() {
                return day_weather_code;
            }

            public String getDay_weather_pic() {
                return day_weather_pic;
            }

            public String getDay_wind_direction() {
                return day_wind_direction;
            }

            public String getDay_wind_power() {
                return day_wind_power;
            }

            public String getNight_air_temperature() {
                return night_air_temperature;
            }

            public String getNight_weather() {
                return night_weather;
            }

            public String getNight_weather_code() {
                return night_weather_code;
            }

            public String getNight_weather_pic() {
                return night_weather_pic;
            }

            public String getNight_wind_direction() {
                return night_wind_direction;
            }

            public String getNight_wind_power() {
                return night_wind_power;
            }

            public String getSun_begin_end() {
                return sun_begin_end;
            }

            public int getWeekday() {
                return weekday;
            }
        }

        public static class NowEntity {
            private int aqi;
            /**
             * aqi : 89 area : 重庆 area_code : chongqing co : 1.552 no2 : 38 o3 :
             * 7 o3_8h : 7 pm10 : 80 pm2_5 : 66 primary_pollutant : 颗粒物(PM2.5)
             * quality : 良 so2 : 16
             */

            private AqiDetailEntity aqiDetail;
            private String sd;
            private String temperature;
            private String temperature_time;
            private String weather;
            private String weather_code;
            private String weather_pic;
            private String wind_direction;
            private String wind_power;

            public static NowEntity objectFromData(String str) {

                return new com.google.gson.Gson()
                        .fromJson(str, NowEntity.class);
            }

            public static NowEntity objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new com.google.gson.Gson().fromJson(
                            jsonObject.getString(str), NowEntity.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<NowEntity> arrayNowEntityFromData(String str) {

                Type listType = new com.google.gson.reflect.TypeToken<ArrayList<NowEntity>>() {
                }.getType();

                return new com.google.gson.Gson().fromJson(str, listType);
            }

            public static List<NowEntity> arrayNowEntityFromData(String str,
                                                                 String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new com.google.gson.reflect.TypeToken<ArrayList<NowEntity>>() {
                    }.getType();

                    return new com.google.gson.Gson().fromJson(
                            jsonObject.getString(str), listType);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return new ArrayList();

            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public void setAqiDetail(AqiDetailEntity aqiDetail) {
                this.aqiDetail = aqiDetail;
            }

            public void setSd(String sd) {
                this.sd = sd;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public void setTemperature_time(String temperature_time) {
                this.temperature_time = temperature_time;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public void setWeather_code(String weather_code) {
                this.weather_code = weather_code;
            }

            public void setWeather_pic(String weather_pic) {
                this.weather_pic = weather_pic;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public void setWind_power(String wind_power) {
                this.wind_power = wind_power;
            }

            public int getAqi() {
                return aqi;
            }

            public AqiDetailEntity getAqiDetail() {
                return aqiDetail;
            }

            public String getSd() {
                return sd;
            }

            public String getTemperature() {
                return temperature;
            }

            public String getTemperature_time() {
                return temperature_time;
            }

            public String getWeather() {
                return weather;
            }

            public String getWeather_code() {
                return weather_code;
            }

            public String getWeather_pic() {
                return weather_pic;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public String getWind_power() {
                return wind_power;
            }

            public static class AqiDetailEntity {
                private int aqi;
                private String area;
                private String area_code;
                private double co;
                private int no2;
                private int o3;
                private int o3_8h;
                private int pm10;
                private int pm2_5;
                private String primary_pollutant;
                private String quality;
                private int so2;

                public static AqiDetailEntity objectFromData(String str) {

                    return new com.google.gson.Gson().fromJson(str,
                            AqiDetailEntity.class);
                }

                public static AqiDetailEntity objectFromData(String str,
                                                             String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);

                        return new com.google.gson.Gson().fromJson(
                                jsonObject.getString(str),
                                AqiDetailEntity.class);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return null;
                }

                public static List<AqiDetailEntity> arrayAqiDetailEntityFromData(
                        String str) {

                    Type listType = new com.google.gson.reflect.TypeToken<ArrayList<AqiDetailEntity>>() {
                    }.getType();

                    return new com.google.gson.Gson().fromJson(str, listType);
                }

                public static List<AqiDetailEntity> arrayAqiDetailEntityFromData(
                        String str, String key) {

                    try {
                        JSONObject jsonObject = new JSONObject(str);
                        Type listType = new com.google.gson.reflect.TypeToken<ArrayList<AqiDetailEntity>>() {
                        }.getType();

                        return new com.google.gson.Gson().fromJson(
                                jsonObject.getString(str), listType);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    return new ArrayList();

                }

                public void setAqi(int aqi) {
                    this.aqi = aqi;
                }

                public void setArea(String area) {
                    this.area = area;
                }

                public void setArea_code(String area_code) {
                    this.area_code = area_code;
                }

                public void setCo(double co) {
                    this.co = co;
                }

                public void setNo2(int no2) {
                    this.no2 = no2;
                }

                public void setO3(int o3) {
                    this.o3 = o3;
                }

                public void setO3_8h(int o3_8h) {
                    this.o3_8h = o3_8h;
                }

                public void setPm10(int pm10) {
                    this.pm10 = pm10;
                }

                public void setPm2_5(int pm2_5) {
                    this.pm2_5 = pm2_5;
                }

                public void setPrimary_pollutant(String primary_pollutant) {
                    this.primary_pollutant = primary_pollutant;
                }

                public void setQuality(String quality) {
                    this.quality = quality;
                }

                public void setSo2(int so2) {
                    this.so2 = so2;
                }

                public int getAqi() {
                    return aqi;
                }

                public String getArea() {
                    return area;
                }

                public String getArea_code() {
                    return area_code;
                }

                public double getCo() {
                    return co;
                }

                public int getNo2() {
                    return no2;
                }

                public int getO3() {
                    return o3;
                }

                public int getO3_8h() {
                    return o3_8h;
                }

                public int getPm10() {
                    return pm10;
                }

                public int getPm2_5() {
                    return pm2_5;
                }

                public String getPrimary_pollutant() {
                    return primary_pollutant;
                }

                public String getQuality() {
                    return quality;
                }

                public int getSo2() {
                    return so2;
                }
            }
        }
    }
}

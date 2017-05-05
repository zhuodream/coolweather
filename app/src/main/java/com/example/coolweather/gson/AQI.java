package com.example.coolweather.gson;

/**
 * Created by zhangwen on 2017/5/5.
 */

public class AQI
{
    public AQICity city;

    public class AQICity
    {
        public String aqi;

        public String pm25;
    }
}

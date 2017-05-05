package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangwen on 2017/5/5.
 */

public class Basic
{
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update
    {
        @SerializedName("loc")
        public String updateTime;
    }

}

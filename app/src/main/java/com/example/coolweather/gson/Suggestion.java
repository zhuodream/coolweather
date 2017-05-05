package com.example.coolweather.gson;

import com.bumptech.glide.load.model.StreamEncoder;
import com.google.gson.annotations.SerializedName;

/**
 * Created by zhangwen on 2017/5/5.
 */

public class Suggestion
{
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort
    {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash
    {
        @SerializedName("txt")
        public String info;
    }

    public class Sport
    {
        @SerializedName("txt")
        public String info;
    }
}

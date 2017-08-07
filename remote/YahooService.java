package com.android.huminskiy1325.weatherapp.remote;

import com.android.huminskiy1325.weatherapp.Model.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by cubru on 06.08.2017.
 */

public interface YahooService {
    @GET
    Call<Weather> getWeather(@Url String loc);
}

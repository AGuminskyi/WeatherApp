package com.android.huminskiy1325.weatherapp.remote;

import android.content.Context;

import retrofit2.Retrofit;

/**
 * Created by cubru on 06.08.2017.
 */

public class YahooApi {
    private static YahooService yahooService;
    private static Context mAppContext;

   public static YahooService getYahooService(Context context){
       mAppContext = context.getApplicationContext();
       if(mAppContext == null)
           return null;
       if(yahooService == null){
           Retrofit retrofit = new Retrofit.Builder()
                   .baseUrl("https://query.yahooapis.com/v1/public/")
                   .build();
           yahooService = retrofit.create(YahooService.class);
       }
       return yahooService;
   }
}

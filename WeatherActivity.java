package com.android.huminskiy1325.weatherapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class WeatherActivity extends AppCompatActivity {
    private static String cityName;
    private GpsLocation mGpsLocation;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        initToolbar();


        mGpsLocation = new GpsLocation();

        //take name of city in current GPS location
        if (mGpsLocation.displayGpsStatus(this.getBaseContext())) {
            //cityName = getGPSLocation();
        }
        else{
            DialogFactory.gpsTurnOn(this);
        }

    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.myToolbar);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
    }
}

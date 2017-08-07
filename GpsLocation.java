package com.android.huminskiy1325.weatherapp;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.media.audiofx.BassBoost;
import android.net.Uri;
import android.provider.Settings;

/**
 * Created by cubru on 07.08.2017.
 */

public class GpsLocation {
    private static ContentResolver mContentResolver;

    //display GPS status
    public boolean displayGpsStatus(Context context) {
        mContentResolver = context.getContentResolver();
        boolean gpsStatus = Settings.Secure.isLocationProviderEnabled(mContentResolver, LocationManager.GPS_PROVIDER);
        return gpsStatus;
    }

    //turn ON GPS
//    public static void turnGpsOn(Context context) {
//        Intent intent=new Intent("android.location.GPS_ENABLED_CHANGE");
//        intent.putExtra("enabled", true);
//        context.sendBroadcast(intent);
////        String provider = Settings.Secure.getString(mContentResolver, Settings.Secure.LOCATION_PROVIDERS_ALLOWED);
////        final Intent poke = new Intent();
////        if (!provider.contains("gps")) {
////            poke.setClassName("com.android.settings", "com.android.settings.widget.SettingsAppWidgetProvider");
////            poke.addCategory(Intent.CATEGORY_ALTERNATIVE);
////            poke.setData(Uri.parse("3"));
////            context.sendBroadcast(poke);
////        }
////        Intent myIntent = new Intent(
////                Settings.ACTION_SECURITY_SETTINGS);
////       context.startActivity(myIntent);
//    }


}

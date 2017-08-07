package com.android.huminskiy1325.weatherapp;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by cubru on 07.08.2017.
 */

public class DialogFactory {
    private static GoogleApiGPS googleApiGPS;
    public static void gpsTurnOn(final Activity activity){
        Snackbar.make(activity.findViewById(android.R.id.content),
                activity.getString(R.string.gpsTurnOFF),Snackbar.LENGTH_INDEFINITE)
                .setAction(activity.getString(R.string.gpsTurnON), new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Context context = activity.getBaseContext();
                        googleApiGPS = new GoogleApiGPS(context);
                        googleApiGPS.turnGpsOn();
                    }
                }).show();
    }
}

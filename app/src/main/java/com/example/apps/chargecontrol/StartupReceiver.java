package com.example.apps.chargecontrol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class StartupReceiver extends BroadcastReceiver {
    private static final String TAG = "StartupReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction() == Intent.ACTION_BATTERY_LOW) {
            Toast.makeText(context, "Battery Low",Toast.LENGTH_SHORT);
        } else {
            // TODO to continue
        }
    }
}
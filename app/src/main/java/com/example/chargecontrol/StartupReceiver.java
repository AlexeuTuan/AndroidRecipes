package com.example.chargecontrol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class StartupReceiver extends BroadcastReceiver {
    private static final String TAG = "StartupReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        // context.sendBroadcast(new Intent(Intent.ACTION_SEND));
        Log.i(TAG, "Received broadcast intent: " + intent.getAction());
    }
}
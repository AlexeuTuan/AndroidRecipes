package com.example.chargecontrol;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class StartupReceiver extends BroadcastReceiver {
    private static final String TAG = "StartupReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = getResultExtras(false);
        Toast.makeText(context, intent.getStringExtra(bundle.getString("string")), Toast.LENGTH_SHORT).show();
    }
}
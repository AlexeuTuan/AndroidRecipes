package com.example.chargecontrol;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public abstract class VisibleFragment extends Fragment {

    public static final String PERM_PRIVATE = "com.bignerdranch.android.photogallery.PRIVATE";
    private static final String TAG = "VisibleFragment";
    public static final String ACTION_SHOW_NOTIFICATION = "SOMETHING";

    @Override
    public void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(ACTION_SHOW_NOTIFICATION);
        getActivity().registerReceiver(mOnShowNotification, filter, PERM_PRIVATE, null);
    }
    @Override
    public void onStop() {
        super.onStop();
        getActivity().unregisterReceiver(mOnShowNotification);
    }
    private BroadcastReceiver mOnShowNotification = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(getActivity(),
                    "Got a broadcast:" + intent.getAction(),
                    Toast.LENGTH_LONG).show();
            Log.i(TAG, "canceling notification");
            Bundle bundle = new Bundle();
            bundle.putString("string", "123");
            setResultExtras(bundle);
            setResult(Activity.RESULT_CANCELED, "data", bundle);
        }
    };
}
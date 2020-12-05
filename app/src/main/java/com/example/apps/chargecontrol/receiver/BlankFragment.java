package com.example.apps.chargecontrol.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.apps.R;
import com.example.apps.chargecontrol.VisibleFragment;


public class BlankFragment extends VisibleFragment {

    private BroadcastReceiver broadcastReceiver;
    private IntentFilter filter;


    public static BlankFragment newInstance() {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // TODO under case there's something in bundle
        }
        broadcastReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                int level = intent.getIntExtra("level", 0);
                Toast.makeText(context, "Battery level: " + level, Toast.LENGTH_SHORT).show();
            }
        };

        filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        setBroadcastReceiver(broadcastReceiver);
        setFilter(filter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }
}
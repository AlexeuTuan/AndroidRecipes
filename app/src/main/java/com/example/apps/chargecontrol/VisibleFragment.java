package com.example.apps.chargecontrol;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;


import androidx.fragment.app.Fragment;

public abstract class VisibleFragment extends Fragment {


    private BroadcastReceiver broadcastReceiver;
    private IntentFilter filter;

    @Override
    public void onStart() {
        super.onStart();
        getActivity().registerReceiver(broadcastReceiver, filter);
    }
    @Override
    public void onStop() {
        super.onStop();
        getActivity().unregisterReceiver(broadcastReceiver);
    }

    public BroadcastReceiver getBroadcastReceiver() {
        return broadcastReceiver;
    }

    public void setBroadcastReceiver(BroadcastReceiver broadcastReceiver) {
        this.broadcastReceiver = broadcastReceiver;
    }

    public IntentFilter getFilter() {
        return filter;
    }

    public void setFilter(IntentFilter filter) {
        this.filter = filter;
    }
}
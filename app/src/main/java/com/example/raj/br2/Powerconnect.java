package com.example.raj.br2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Raj on 6/17/2017.
 */

public class Powerconnect extends BroadcastReceiver
{

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();

        if(action.equals(Intent.ACTION_POWER_CONNECTED))
        {
            // Do something when power connected
            Toast.makeText(context, "connected", Toast.LENGTH_SHORT).show();
        }
        else if(action.equals(Intent.ACTION_POWER_DISCONNECTED))
        {
            // Do something when power disconnected
            Toast.makeText(context, "Disconnected", Toast.LENGTH_SHORT).show();
        }
    }
}


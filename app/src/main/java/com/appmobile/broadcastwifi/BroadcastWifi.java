package com.appmobile.broadcastwifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class BroadcastWifi extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Boolean conectado = intent.getBooleanExtra("connected", false);        // an Intent broadcast.
        if(conectado){
            Intent intent2 = new Intent(intent.ACTION_CALL);
            //agrego mi numero
            //intent2.setData(Uri.parse("tel:2664325477"));
            intent2.setData(Uri.parse("tel:2664553747"));
            context.startActivity(intent2);
        }
    }
}
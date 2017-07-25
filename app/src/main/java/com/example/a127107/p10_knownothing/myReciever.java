package com.example.a127107.p10_knownothing;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by 127107 on 25/7/2017.
 */

public class myReciever extends BroadcastReceiver{
    int reqCode = 123;

    @Override
    public void onReceive(Context context, Intent intent) {

        //receiving an Intent broadcast.
        Intent i = new Intent(context, MainActivity.class);
        PendingIntent pIntent = PendingIntent.getActivity(context, reqCode,
                i, PendingIntent.FLAG_CANCEL_CURRENT);

        // build notification
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle("Read Later");
        builder.setContentText("Know Your Factsss");
        builder.setSmallIcon(android.R.drawable.ic_dialog_info);
        builder.setContentIntent(pIntent);
        builder.setAutoCancel(true);
        Notification n = builder.build();
        NotificationManager notificationManager = (NotificationManager)
                context.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(123, n);


    }
}

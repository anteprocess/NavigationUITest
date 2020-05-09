package com.example.android.navigation.notify

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat
import com.example.android.navigation.R

class AlarmReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        //TODO("Not yet implemented")
        val notificationManager = ContextCompat.getSystemService(
                context!!,
        NotificationManager::class.java
        ) as NotificationManager
        notificationManager.sendNotification(
                context.getText(R.string.android_trivia).toString(),
                context
        )
    }
}
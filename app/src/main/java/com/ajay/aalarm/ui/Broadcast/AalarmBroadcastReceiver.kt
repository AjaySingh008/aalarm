package com.ajay.aalarm.ui.Broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_AIRPLANE_MODE_CHANGED
import android.net.ConnectivityManager
import android.widget.Toast

/**
 * @author Ajay Kadian
 * @since 3/1/20
 * <h1>AalarmBroadcastReciever</h1>
 * <p>Description of class</p>
 */


class AalarmBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (ACTION_AIRPLANE_MODE_CHANGED.equals(intent?.action)) {
            Toast.makeText(context, "connect", Toast.LENGTH_SHORT).show()
        }
    }
}
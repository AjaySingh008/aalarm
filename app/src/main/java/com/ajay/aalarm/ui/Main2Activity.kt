package com.ajay.aalarm.ui

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.ajay.aalarm.R
import com.ajay.aalarm.ui.Broadcast.AalarmBroadcastReceiver
import com.ajay.aalarm.ui.Fragments.Alarm

class Main2Activity : AppCompatActivity() {

    private val aalarmBroadcastReceiver by lazy {
        AalarmBroadcastReceiver()
    }

    private var intentFilter = IntentFilter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container, Alarm(), "Alarm")
        fragmentTransaction.commit()

        var alarmFrag= supportFragmentManager.findFragmentByTag("Alarm")

        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)

    }

    override fun onStart() {
        super.onStart()
        registerReceiver(aalarmBroadcastReceiver, intentFilter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(aalarmBroadcastReceiver)
    }

}

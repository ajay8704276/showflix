package com.app.showflix.view.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BaseActivity : AppCompatActivity(),CoroutineScope/* ConnectivityReceiver.ConnectivityReceiverListener*/ {
    private lateinit var job:Job

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResourceId())
    }

    open abstract fun getLayoutResourceId():Int

    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        *//**
         * Registering broadcast receiver i
         * in BaseActivity to listen connectivity everywhere
         *//*
        registerReceiver(
            ConnectivityReceiver(),
            IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        )

    }

    override fun onResume() {
        super.onResume()
        ConnectivityReceiver.connectivityReceiverListener = this
    }

    override fun onNetworkConnectionChanged(isConnected: Boolean) {
        showMessage(isConnected)
    }

    @SuppressLint("WrongConstant")
    private fun showMessage(isConnected: Boolean) {
        if (!isConnected) {
            val messageToUser = "You are offline now." //TODO
            mSnackbar = Snackbar.make(
                findViewById(R.id.main_activity),
                messageToUser,
                Snackbar.LENGTH_LONG
            ) //Assume "rootLayout" as the root layout of every activity.
            mSnackbar?.duration = Snackbar.LENGTH_INDEFINITE
            mSnackbar?.show()
        } else {
            mSnackbar?.dismiss()
        }
    }*/
}
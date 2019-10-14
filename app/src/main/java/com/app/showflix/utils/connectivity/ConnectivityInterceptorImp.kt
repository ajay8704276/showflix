package com.app.showflix.utils.connectivity

import android.content.Context
import android.net.ConnectivityManager
import com.app.showflix.utils.NoConnectivityFoundException
import okhttp3.Interceptor
import okhttp3.Response

class ConnectivityInterceptorImp(context: Context) : ConnectivityInterceptor {

    private val appContext = context.applicationContext

    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isOnline()) {
            throw NoConnectivityFoundException()
        }
        return chain.proceed(chain.request())
    }

    /**
     * function to check network connectivity
     */
    private fun isOnline(): Boolean {
        val connectivityManager =
            appContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val netWorkInfo = connectivityManager.activeNetworkInfo
        return netWorkInfo != null && netWorkInfo.isConnected
    }

}
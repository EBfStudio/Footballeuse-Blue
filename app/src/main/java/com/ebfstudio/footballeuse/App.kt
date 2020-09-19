package com.ebfstudio.footballeuse

import android.app.Application
import android.os.StrictMode
import android.os.StrictMode.ThreadPolicy.Builder

/**
 * Created by Vince on 19/09/2020
 */
class App : Application() {

    override fun onCreate() {

        // Enable strict mode
        if (BuildConfig.DEBUG) {
            enableStrictMode()
        }

        super.onCreate()

    }

    private fun enableStrictMode() {
        StrictMode.setThreadPolicy(
            Builder()
                .detectDiskReads()
                .detectDiskWrites()
                .detectNetwork()
                .penaltyLog()
                .build()
        )
    }

}
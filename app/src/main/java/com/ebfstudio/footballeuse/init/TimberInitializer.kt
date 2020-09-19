package com.ebfstudio.footballeuse.init

import android.content.Context
import androidx.startup.Initializer
import com.ebfstudio.footballeuse.BuildConfig
import timber.log.Timber

/**
 * Created by Vince on 19/09/2020
 */
class TimberInitializer : Initializer<Unit> {

    override fun create(context: Context) {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(Timber.DebugTree())
            // TODO("Timber.plant(CrashlyticsTree())")
        }
        Timber.d("init ok")
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> = mutableListOf()

}

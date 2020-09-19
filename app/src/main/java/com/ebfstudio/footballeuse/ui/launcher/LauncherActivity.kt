package com.ebfstudio.footballeuse.ui.launcher

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ebfstudio.footballeuse.MainActivity
import com.ebfstudio.footballeuse.shared.EventObserver
import com.ebfstudio.footballeuse.ui.launcher.LaunchDestination.MAIN_ACTIVITY
import com.ebfstudio.footballeuse.ui.launcher.LaunchDestination.ONBOARDING
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * Created by Vince on 28/08/2020
 */
class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel: LauncherViewModel by viewModel()

        viewModel.launchDestination.observe(this, EventObserver { destination ->
            val destinationClass = when(destination) {
                MAIN_ACTIVITY -> MainActivity::class.java
                ONBOARDING -> MainActivity::class.java          // OnboardingActivity::class.java
            }
            startActivity(Intent(this, destinationClass))
            finish()
        })
    }

}

package com.ebfstudio.footballeuse.ui.launcher

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.ebfstudio.footballeuse.repo.PreferenceStorage
import com.ebfstudio.footballeuse.shared.Event
import kotlinx.coroutines.Dispatchers

/**
 * Created by Vince on 28/08/2020
 */
class LauncherViewModel(prefsStorage: PreferenceStorage) : ViewModel() {

    val launchDestination = liveData(Dispatchers.IO) {
        val destination = when(prefsStorage.onboardingCompleted) {
            true -> LaunchDestination.MAIN_ACTIVITY
            false -> LaunchDestination.ONBOARDING
        }
        emit(Event(destination))
    }

}

enum class LaunchDestination {
    ONBOARDING,
    MAIN_ACTIVITY
}

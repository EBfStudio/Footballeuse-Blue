package com.ebfstudio.footballeuse.di

import com.ebfstudio.footballeuse.repo.PreferenceStorage
import com.ebfstudio.footballeuse.repo.SharedPrefsStorage
import com.ebfstudio.footballeuse.ui.launcher.LauncherViewModel
import com.ebfstudio.footballeuse.ui.onboarding.OnboardingViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Created by Vince on 19/09/2020
 */
val appModule = module {
    viewModel { LauncherViewModel(get()) }
    viewModel { OnboardingViewModel(get()) }
    single<PreferenceStorage> { SharedPrefsStorage(androidContext()) }
}
package com.koen.storyapp.app.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.koen.storyapp.app.di.annotation.ViewModelKey
import com.koen.storyapp.app.ui.viewmodel.SplashViewModel
import com.koen.storyapp.app.ui.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun viewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    @Singleton
    abstract fun mainViewModel(splashViewModel: SplashViewModel) : ViewModel
}
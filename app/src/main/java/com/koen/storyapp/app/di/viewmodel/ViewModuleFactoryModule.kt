package com.koen.storyapp.app.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.koen.storyapp.app.di.annotation.ViewModelKey
import com.koen.storyapp.app.ui.viewmodel.SplashViewModel
import com.koen.storyapp.app.ui.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModuleFactoryModule {
    @Binds
    abstract fun viewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}
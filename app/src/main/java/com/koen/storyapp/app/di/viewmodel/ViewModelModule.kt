package com.koen.storyapp.app.di.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.koen.storyapp.app.di.annotation.ViewModelKey
import com.koen.storyapp.app.ui.viewmodel.SplashViewModel
import com.koen.storyapp.app.ui.viewmodel.ViewModelFactory
import com.koen.storyapp.domain.usecase.JwtInitUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
class ViewModelModule {
    @Provides
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    @Singleton
    fun provideSplashViewModel(jwtInitUseCase: JwtInitUseCase): ViewModel = SplashViewModel(
        jwtInitUseCase = jwtInitUseCase,
        dispatcher = Dispatchers.Main
    )
}
package com.koen.storyapp.app.di.viewmodel

import com.koen.storyapp.app.ui.viewmodel.IViewModelController
import com.koen.storyapp.app.ui.viewmodel.ViewModelController
import com.koen.storyapp.app.ui.viewmodel.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ViewModelControllerModule {
    @Provides
    fun provideViewModelController(viewModelFactory: ViewModelFactory): IViewModelController {
        return ViewModelController(viewModelFactory)
    }
}
package com.koen.storyapp.app.di

import com.koen.storyapp.app.di.annotation.ActivityScope
import com.koen.storyapp.app.ui.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [AbstractFragmentCreationModule::class, FragmentManagerModule::class])
    abstract fun bindMainActivity(): MainActivity
}
package com.koen.storyapp.app.di

import androidx.fragment.app.FragmentManager
import com.koen.storyapp.app.di.annotation.ActivityScope
import com.koen.storyapp.app.ui.FragmentFactoryScoped
import com.koen.storyapp.app.ui.activity.MainActivity
import com.koen.storyapp.app.ui.NavigationController
import dagger.Module
import dagger.Provides

@Module
class FragmentManagerModule {
    @Provides
    fun provideFragmentManager(mainActivity: MainActivity): FragmentManager {
        return mainActivity.supportFragmentManager
    }

    @Provides
    @ActivityScope
    fun provideNavController(
        fragmentFactoryScoped: FragmentFactoryScoped,
        fragmentManager: FragmentManager
    ): NavigationController {
        return NavigationController(fragmentManager, fragmentFactoryScoped)
    }
}
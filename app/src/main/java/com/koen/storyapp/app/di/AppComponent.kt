package com.koen.storyapp.app.di

import android.app.Application
import com.koen.storyapp.app.di.modules.RetrofitModule
import com.koen.storyapp.app.di.modules.UserModule
import com.koen.storyapp.app.di.viewmodel.ViewModelModule
import com.koen.storyapp.app.di.viewmodel.ViewModuleFactoryModule
import com.koen.storyapp.app.ui.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityModule::class,
        FragmentModule::class,
        ViewModelModule::class,
        RetrofitModule::class,
        UserModule::class,
        ViewModuleFactoryModule::class
    ]
)
interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(instance: Application): Builder

        fun build(): AppComponent
    }

}
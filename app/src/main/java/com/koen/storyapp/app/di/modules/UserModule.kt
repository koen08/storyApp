package com.koen.storyapp.app.di.modules

import com.koen.storyapp.data.remote.StoryApi
import com.koen.storyapp.data.remote.UserRemoteDataSource
import com.koen.storyapp.data.remote.model.UserJwtRemote
import com.koen.storyapp.data.repository.JwtSingleton
import com.koen.storyapp.data.repository.UserRepository
import com.koen.storyapp.data.repository.remote.IUserRemoteDataSource
import com.koen.storyapp.domain.repository.IUserRepository
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
class UserModule {
    @Provides
    fun provideUserRepository(
        jwtSingleton: JwtSingleton,
        userRemoteDataSource: IUserRemoteDataSource
    ): IUserRepository = UserRepository(
        jwtSingleton = jwtSingleton,
        userRemoteDataSource = userRemoteDataSource,
        dispatcher = Dispatchers.IO
    )

    @Provides
    @Singleton
    fun provideJwtSingleton(): JwtSingleton = JwtSingleton("")

    @Provides
    @Singleton
    fun provideUserRemoteDataSource(storyApi: StoryApi): IUserRemoteDataSource =
        UserRemoteDataSource(storyApi)
}
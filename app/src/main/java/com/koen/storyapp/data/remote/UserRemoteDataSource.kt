package com.koen.storyapp.data.remote

import com.koen.storyapp.data.repository.remote.IUserRemoteDataSource

class UserRemoteDataSource(private val storyApi: StoryApi) : IUserRemoteDataSource {
    override suspend fun getJwt(id: String): String {
        val userJwtRemote = storyApi.getJwt(id)
        return userJwtRemote.jwt
    }
}
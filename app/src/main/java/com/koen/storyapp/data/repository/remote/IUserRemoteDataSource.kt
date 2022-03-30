package com.koen.storyapp.data.repository.remote

interface IUserRemoteDataSource {
    suspend fun getJwt(id: String) : String
}
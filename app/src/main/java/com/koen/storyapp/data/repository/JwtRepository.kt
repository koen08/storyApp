package com.koen.storyapp.data.repository

import com.koen.storyapp.data.repository.remote.IJwtRemoteDataSource
import com.koen.storyapp.domain.repository.IJwtRepository

class JwtRepository constructor(
    private val jwtRemoteDataSource: IJwtRemoteDataSource
) : IJwtRepository {
    override fun get(id: String) {
        TODO("Not yet implemented")
    }
}
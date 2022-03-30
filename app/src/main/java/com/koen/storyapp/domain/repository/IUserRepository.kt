package com.koen.storyapp.domain.repository

interface IUserRepository {
    suspend fun initJwt(id: String): Boolean
}
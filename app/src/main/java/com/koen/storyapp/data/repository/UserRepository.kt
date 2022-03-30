package com.koen.storyapp.data.repository

import android.util.Log
import com.koen.storyapp.data.repository.remote.IUserRemoteDataSource
import com.koen.storyapp.domain.repository.IUserRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class UserRepository constructor(
    private val userRemoteDataSource: IUserRemoteDataSource,
    private val jwtSingleton: JwtSingleton,
    private val dispatcher: CoroutineDispatcher
) : IUserRepository {
    override suspend fun initJwt(id: String): Boolean {
        withContext(dispatcher) {
            val jwt = userRemoteDataSource.getJwt(id)
            Log.i("JWT", jwt)
            jwtSingleton.jwt = jwt
        }
        return true
    }
}
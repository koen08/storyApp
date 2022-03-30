package com.koen.storyapp.domain.usecase

import com.koen.storyapp.domain.repository.IUserRepository
import javax.inject.Inject

class JwtInitUseCase @Inject constructor(
    private val userRepository: IUserRepository
) {
    suspend fun useCase(id: String) : Boolean {
        return userRepository.initJwt(id)
    }
}
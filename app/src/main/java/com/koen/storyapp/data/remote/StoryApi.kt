package com.koen.storyapp.data.remote

import com.google.gson.annotations.SerializedName
import com.koen.storyapp.data.remote.model.UserJwtRemote
import retrofit2.http.POST
import retrofit2.http.Query

interface StoryApi {
    @POST("/auth")
    suspend fun getJwt(
        @Query("userId") id: String
    ) : UserJwtRemote
}
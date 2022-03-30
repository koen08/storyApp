package com.koen.storyapp.data.remote.model

import com.google.gson.annotations.SerializedName

data class UserJwtRemote(
    @SerializedName("jwt") val jwt: String
)
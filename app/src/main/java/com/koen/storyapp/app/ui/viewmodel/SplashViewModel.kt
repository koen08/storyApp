package com.koen.storyapp.app.ui.viewmodel

import android.annotation.SuppressLint
import android.content.Context
import android.provider.Settings
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koen.storyapp.domain.usecase.JwtInitUseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashViewModel constructor(
    private val jwtInitUseCase: JwtInitUseCase,
    private val dispatcher: CoroutineDispatcher
) : ViewModel() {
    private val jwtInitMutable = MutableLiveData<Boolean>()
    val jwtInit: LiveData<Boolean> = jwtInitMutable

    @SuppressLint("HardwareIds")
    fun getJwt(context: Context) {
        viewModelScope.launch(dispatcher) {
            val deviceId =
                Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
            jwtInitMutable.value = jwtInitUseCase.useCase(deviceId)
        }
    }

}
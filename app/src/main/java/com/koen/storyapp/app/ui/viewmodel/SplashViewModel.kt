package com.koen.storyapp.app.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SplashViewModel @Inject constructor() : ViewModel() {

    fun getLog() {
        Log.i("viewmodel123", "GET LOG...")
    }

}
package com.koen.storyapp.app.ui.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import javax.inject.Inject

class ViewModelController @Inject constructor(
    val viewModelFactory: ViewModelFactory
) {
    inline fun <reified T: ViewModel> injectViewModel(viewModelStoreOwner: ViewModelStoreOwner): T {
        return ViewModelProvider(viewModelStoreOwner, viewModelFactory).get(T::class.java)
    }
}
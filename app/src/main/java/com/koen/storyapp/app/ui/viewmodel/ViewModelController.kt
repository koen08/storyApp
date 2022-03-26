package com.koen.storyapp.app.ui.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import javax.inject.Inject

class ViewModelController @Inject constructor(
    private val viewModelFactory: ViewModelFactory
) : IViewModelController {
    override fun <T: ViewModel> injectViewModel(viewModelStoreOwner: ViewModelStoreOwner, klass: Class<T>): ViewModel {
        return ViewModelProvider(viewModelStoreOwner, viewModelFactory).get(klass)
    }
}
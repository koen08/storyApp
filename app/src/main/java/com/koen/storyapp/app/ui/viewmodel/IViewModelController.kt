package com.koen.storyapp.app.ui.viewmodel

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner

interface IViewModelController {
    fun <T: ViewModel> injectViewModel(viewModelStoreOwner: ViewModelStoreOwner, klass: Class<T>): ViewModel
}
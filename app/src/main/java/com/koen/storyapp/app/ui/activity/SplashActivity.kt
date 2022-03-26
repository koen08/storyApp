package com.koen.storyapp.app.ui.activity

import android.content.Intent
import android.os.Bundle
import com.koen.storyapp.app.ui.viewmodel.IViewModelController
import com.koen.storyapp.app.ui.viewmodel.SplashViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class SplashActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelController: IViewModelController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = viewModelController.injectViewModel(this, SplashViewModel::class.java) as SplashViewModel
        viewModel.getLog()
        startActivity(
            Intent(
                this,
                MainActivity::class.java
            )
        )
        finish()
    }
}
package com.koen.storyapp.app.ui.activity

import android.content.Intent
import android.os.Bundle
import com.koen.storyapp.app.ui.viewmodel.SplashViewModel
import com.koen.storyapp.app.ui.viewmodel.ViewModelController
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class SplashActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelController: ViewModelController

    private lateinit var viewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = viewModelController.injectViewModel(this)
        viewModel.getJwt(this)

        viewModel.jwtInit.observe(this) { jwtInit ->
            if (jwtInit) {
                startActivity(
                    Intent(
                        this,
                        MainActivity::class.java
                    )
                )
                finish()
            }
        }
    }
}
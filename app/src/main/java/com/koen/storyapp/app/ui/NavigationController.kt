package com.koen.storyapp.app.ui

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.koen.storyapp.R
import javax.inject.Inject
import kotlin.reflect.KClass

class NavigationController @Inject constructor(
    private val fragmentManager: FragmentManager,
    private val fragmentFactoryScoped: FragmentFactoryScoped
) {

    fun <T : Fragment> makeCurrentFragment(
        fragmentClass: Class<T>,
    ) {
        val fragment = fragmentFactoryScoped.create(fragmentClass)
        fragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}
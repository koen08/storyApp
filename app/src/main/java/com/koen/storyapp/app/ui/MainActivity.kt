package com.koen.storyapp.app.ui

import android.os.Bundle
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import com.koen.storyapp.R
import com.koen.storyapp.app.ui.fragments.editor.EditorFragment
import com.koen.storyapp.app.ui.fragments.profile.ProfileFragment
import com.koen.storyapp.app.ui.fragments.tape.TapeFragment
import com.koen.storyapp.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @Inject
    lateinit var navigationController: NavigationController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val chipNavigationBar: ChipNavigationBar = binding.navigation
        chipNavigationBar.setOnItemSelectedListener { id ->
            when(id) {
                R.id.menu_tape -> navigationController.makeCurrentFragment(TapeFragment::class.java)
                R.id.menu_edit -> navigationController.makeCurrentFragment(EditorFragment::class.java)
                R.id.menu_profile -> navigationController.makeCurrentFragment(ProfileFragment::class.java)
            }
        }
    }

}
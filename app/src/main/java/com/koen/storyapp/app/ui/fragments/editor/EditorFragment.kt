package com.koen.storyapp.app.ui.fragments.editor

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.koen.storyapp.R
import com.koen.storyapp.app.ui.NavigationController
import com.koen.storyapp.app.ui.fragments.profile.ProfileFragment
import com.koen.storyapp.app.ui.fragments.tape.TapeFragment
import com.koen.storyapp.databinding.ActivityMainBinding
import com.koen.storyapp.databinding.FragmentEditorBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class EditorFragment @Inject constructor(val navigationController: NavigationController) : DaggerFragment() {
    private lateinit var binding: FragmentEditorBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEditorBinding.inflate(inflater, container, false)

        val button: Button = binding.button

        button.setOnClickListener {
            navigationController.makeCurrentFragment(TapeFragment::class.java)
        }

        return binding.root
    }

}
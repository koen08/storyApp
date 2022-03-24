package com.koen.storyapp.app.ui.fragments.tape

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.koen.storyapp.R
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class TapeFragment @Inject constructor() : DaggerFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tape, container, false)
    }

}
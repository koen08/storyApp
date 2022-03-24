package com.koen.storyapp.app.di

import com.koen.storyapp.app.di.annotation.FragmentScope
import com.koen.storyapp.app.ui.fragments.editor.EditorFragment
import com.koen.storyapp.app.ui.fragments.profile.ProfileFragment
import com.koen.storyapp.app.ui.fragments.tape.TapeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface FragmentModule {

    @ContributesAndroidInjector()
    fun bindProfileFragment(): ProfileFragment

    @ContributesAndroidInjector()
    fun bindEditorFragment(): EditorFragment

    @ContributesAndroidInjector()
    fun bindTapeFragment(): TapeFragment
}
package com.koen.storyapp.app.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.koen.storyapp.app.di.annotation.ActivityScope
import com.koen.storyapp.app.di.annotation.FragmentKey
import com.koen.storyapp.app.ui.FragmentFactoryScoped
import com.koen.storyapp.app.ui.fragments.editor.EditorFragment
import com.koen.storyapp.app.ui.fragments.profile.ProfileFragment
import com.koen.storyapp.app.ui.fragments.tape.TapeFragment
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AbstractFragmentCreationModule {

    @Binds
    @IntoMap
    @FragmentKey(ProfileFragment::class)
    @ActivityScope
    abstract fun bindsProfileFragment(profileFragment: ProfileFragment): Fragment

    @Binds
    @IntoMap
    @FragmentKey(EditorFragment::class)
    @ActivityScope
    abstract fun bindsEditorFragment(editorFragment: EditorFragment): Fragment
    
    @Binds
    @IntoMap
    @FragmentKey(TapeFragment::class)
    @ActivityScope
    abstract fun bindsTapeFragment(tapeFragment: TapeFragment): Fragment

}
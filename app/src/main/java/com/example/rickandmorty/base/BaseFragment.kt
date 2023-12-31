package com.example.rickandmorty.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.example.rickandmorty.databinding.FragmentRickAndMortyBinding

abstract class BaseFragment<VB : ViewBinding, VM : ViewModel>(@LayoutRes val layoutRes: Int) :
Fragment(layoutRes) {

    abstract val viewBinding: VB
    abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialize()
        setupSubscribes()
        setupRequests()
        setupListeners()
    }


    protected open fun initialize() {}

    protected open fun setupSubscribes() {}

    protected open fun setupRequests() {}

    protected open fun setupListeners() {}

    abstract val binding: FragmentRickAndMortyBinding
}
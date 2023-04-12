package com.acikgoz.lcwaikikiappodev4.ui.view

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.acikgoz.lcwaikikiappodev4.R
import com.acikgoz.lcwaikikiappodev4.databinding.FragmentFavoriBinding


class FavoriFragment : Fragment() {

    private lateinit var binding : FragmentFavoriBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentFavoriBinding.inflate(inflater,container,false)
        return binding.root
    }


}
package com.acikgoz.lcwaikikiappodev4.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.acikgoz.lcwaikikiappodev4.R
import com.acikgoz.lcwaikikiappodev4.databinding.FragmentProfilBinding

class ProfilFragment : Fragment() {

    private lateinit var binding : FragmentProfilBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentProfilBinding.inflate(inflater,container,false)
        return binding.root
    }
}
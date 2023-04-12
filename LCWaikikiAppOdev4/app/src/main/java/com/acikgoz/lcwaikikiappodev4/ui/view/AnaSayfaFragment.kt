package com.acikgoz.lcwaikikiappodev4.ui.view

import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.acikgoz.lcwaikikiappodev4.R
import com.acikgoz.lcwaikikiappodev4.databinding.FragmentAnaSayfaBinding


 class AnaSayfaFragment : Fragment()  {

    private lateinit var binding: FragmentAnaSayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)


        binding.chipUrun.setOnClickListener {

            val gecis = AnaSayfaFragmentDirections.toliste()
            Navigation.findNavController(it).navigate(gecis)
        }

        return binding.root
        }

    }



package com.acikgoz.lcwaikikiappodev4.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.acikgoz.lcwaikikiappodev4.R
import com.acikgoz.lcwaikikiappodev4.databinding.FragmentDetayBinding
import com.google.android.material.chip.Chip
import com.google.android.material.snackbar.Snackbar


class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle : DetayFragmentArgs by navArgs()
        val gelenUrun = bundle.urun


        binding.toolbarUrunDetay.title = gelenUrun.ad
        binding.imageLcwResim.setImageResource(resources.getIdentifier(gelenUrun.resim_adi , "drawable" , requireContext().packageName))
        binding.twUrunAdi.text = gelenUrun.urunAdi
        binding.twUrunRengi.text = gelenUrun.renk
        binding.twUrunFiyat.text = "${gelenUrun.fiyat} ₺"
        val urunTipi = gelenUrun.type

        when(urunTipi) {

            "giyim" -> {
                binding.chipGrupSize.visibility = View.VISIBLE
            }
            "ayakkabı"->{
                binding.chipGrupNum.visibility = View.VISIBLE
            }

            "standart" ->{
                binding.chipGrupNum.visibility = View.GONE
            }
        }

        binding.btnSepeteEkle.setOnClickListener {
            Snackbar.make(it , "${gelenUrun.urunAdi} sepetinize eklendi." , Snackbar.LENGTH_LONG).show()
        }


        val idInput : Int = binding.chipGrupNum.checkedChipId

        if (idInput!=-1){

            val chip : Chip = binding.chipGrupNum.findViewById(id)
            Toast.makeText(context,"Seçilen Beden : ${chip.text}",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context,"Lütfen Beden Seçiniz",Toast.LENGTH_SHORT).show()
        }

        return binding.root

    }

}
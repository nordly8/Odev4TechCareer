package com.acikgoz.lcwaikikiappodev4.ui.view


import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.acikgoz.lcwaikikiappodev4.data.LCWUrunler
import com.acikgoz.lcwaikikiappodev4.databinding.FragmentListeBinding
import com.acikgoz.lcwaikikiappodev4.ui.adapter.LCWRecyclerView
import java.util.*


class ListeFragment : Fragment() {

    private lateinit var binding: FragmentListeBinding

    private var urunListesiLcw = ArrayList<LCWUrunler>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListeBinding.inflate(inflater, container, false)


        binding.rv.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)


        val u1 = LCWUrunler(1, "Erkek Bere", "bere", 69.99, "Açık Mürdüm", "Pamuklu Etiket Nakışlı Erkek Bere", "Lcw Accessories", "giyim")
        val u2 = LCWUrunler(2, "Kadın Spor Ayakkabı", "ayakkabi", 379.99, "Beyaz", "Bağcıklı File Detaylı Kadın Aktif Spor Ayakkabı", "Lcw Casual", "ayakkabı")
        val u3 = LCWUrunler(3, "Kadın Uzun Elbise", "elbise", 459.99, "Yeşil", "Gömel Yaka Çiçekli Uzun Kollu Kadın Elbise", "Lcw Modest", "giyim")
        val u4 = LCWUrunler(4, "Kadın Uzun Etek", "etek", 379.99, "Haki", "Kadın Uzun Boy Düğme Detaylı  Etek", "Lcw Modest", "giyim")
        val u5 = LCWUrunler(5, "Kadın Sweatshirt", "kazak", 249.99, "Pembe", "Oversize  Uzun  Kollu Sweatshirt", "Lcw Casual", "giyim")
        val u6 = LCWUrunler(6, "Kadın Şişme Mont", "mont", 899.99, "Haki", "Kadın Kapüşonlu Şişme Uzun Mont", "Lcw Basic", "giyim")
        val u7 = LCWUrunler(7, "Erkek Pantolon", "pantolon", 299.99, "Siyah", "Erkek Regular Fit Jean Pantolon", "Lcw Jeans", "giyim")
        val u8 = LCWUrunler(8, "Erkek Yüzme Şort", "sort", 159.99, "Lacivert", "Erkek Standar Boy Deniz Şortu", "Lcw Swimwear", "giyim")
        val u9 = LCWUrunler(9, "Kadın Terlik", "terlik", 79.99, "Beyaz", "Kadın Çift Bantlı Toka Detaylı Terlik", "Lcw Steps", "ayakkabı")
        val u10 = LCWUrunler(10, "Erkek Tshirt", "tshirt", 119.99, "Yeşil", "Bisiklet Yaka Kısa Kollu Erkek Tshirt", "Lcw Classic", "giyim")
        val u11 = LCWUrunler(10, "Kadın Yağmurluk", "yagmurluk", 699.99, "Gri", "Kapüşonlu Uzun Kollu Kadın Yağmurluk", "Lcw Modest", "giyim")
        val u12 = LCWUrunler(10, "Erkek Sandalet", "sandalet", 169.99, "Siyah", "Deri Görünümlü Cırt Cırtlı Erkek Sandalet", "Lcw Steps", "ayakkabı")
        val u13 = LCWUrunler(10, "Kadın Çanta", "kadincanta", 129.99, "Kahverengi", "Fermuarlı Mini Sırt Çantası", "Lcw Bags", "standart")
        val u14 = LCWUrunler(10, "Erkek Gömlek", "gomlek", 309.99, "Bej Baskılı", "Fit Kısa Kollu Desenli Viskon Erkek Gömlek", "Lcw Casual", "giyim")
        val u15 = LCWUrunler(10, "Kadın Bot", "botkadin", 599.99, "Siyah", "Deri Görünümlü Toka Detaylı Fermuarlı Kadın Bot", "Lcw Modest", "ayakkabı")
        urunListesiLcw.add(u1)
        urunListesiLcw.add(u2)
        urunListesiLcw.add(u3)
        urunListesiLcw.add(u4)
        urunListesiLcw.add(u5)
        urunListesiLcw.add(u6)
        urunListesiLcw.add(u7)
        urunListesiLcw.add(u8)
        urunListesiLcw.add(u9)
        urunListesiLcw.add(u10)
        urunListesiLcw.add(u11)
        urunListesiLcw.add(u12)
        urunListesiLcw.add(u13)
        urunListesiLcw.add(u14)
        urunListesiLcw.add(u15)

        val adapter = LCWRecyclerView(requireContext(), urunListesiLcw)
        binding.rv.adapter = adapter
        return binding.root
    }
}


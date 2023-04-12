package com.acikgoz.lcwaikikiappodev4.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.acikgoz.lcwaikikiappodev4.data.LCWUrunler
import com.acikgoz.lcwaikikiappodev4.databinding.CardviewTasarimlcwBinding
import com.acikgoz.lcwaikikiappodev4.ui.view.ListeFragmentDirections
import com.google.android.material.snackbar.Snackbar
import java.util.*
import kotlin.collections.ArrayList


open class LCWRecyclerView(var context: Context, var urunList : List<LCWUrunler>) : RecyclerView.Adapter<LCWRecyclerView.LcwHolderClass>() {




    inner class LcwHolderClass(var binding: CardviewTasarimlcwBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LcwHolderClass {

        var binding = CardviewTasarimlcwBinding.inflate(LayoutInflater.from(context) , parent , false)
        return LcwHolderClass(binding)
    }

    override fun getItemCount(): Int {

        return urunList.size
    }

    override fun onBindViewHolder(holder: LcwHolderClass, position: Int) {

        val urun = urunList.get(position)

        val lcw = holder.binding

        lcw.imageViewCard.setImageResource(context.resources.getIdentifier(urun.resim_adi , "drawable" , context.packageName))
        lcw.twUrunAdiCard.text = urun.ad
        lcw.twUrunFiyatCard.text = "${urun.fiyat} ₺"
        lcw.LcwMain.text = "${urun.lcwManin}"


        holder.binding.buttonSepeteEkle.setOnClickListener {

            Snackbar.make(it , "${urun.urunAdi} sepetinize eklendi." , Snackbar.LENGTH_LONG).show()
        }

        lcw.cardLcw.setOnClickListener {
            val gecis = ListeFragmentDirections.toDetay(urun = urun)
            Navigation.findNavController(it).navigate(gecis)
        }

        holder.binding.ratingBar2.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Snackbar.make(ratingBar.rootView,"Yorum için teşekkürler..", Snackbar.LENGTH_LONG).show()
            holder.binding.yorumText2.text = rating.toString()
        }

    }


    fun filterList(filteredCourseList: ArrayList<LCWUrunler>) {
        this.urunList = filteredCourseList;
        notifyDataSetChanged();
    }
}
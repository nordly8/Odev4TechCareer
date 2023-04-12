package com.acikgoz.lcwaikikiappodev4


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.acikgoz.lcwaikikiappodev4.databinding.ActivityMainBinding
import com.acikgoz.lcwaikikiappodev4.ui.view.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val anaSayfaFragment  = AnaSayfaFragment()
        val kategoriFragment  = KategoriFragment()
        val favoriFragement = FavoriFragment()
        val sepetFragment = SepetFragment()
        val profileFragement = ProfilFragment()


        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.anasayfa -> replaceFragment(anaSayfaFragment)
                R.id.kategori -> replaceFragment(kategoriFragment)
                R.id.person -> replaceFragment(profileFragement)
                R.id.shop -> replaceFragment(sepetFragment)
                R.id.favorite -> replaceFragment(favoriFragement)

                else  -> {}
            }
            true
        }
    }
    private fun replaceFragment(fragment : Fragment){
        val fragmentManager  = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }

}



package com.acikgoz.lcwaikikiappodev4.data

data class LCWUrunler(
    var id: Int,
    var ad: String,
    var resim_adi: String,
    var fiyat: Double,
    var renk: String,
    var urunAdi: String,
    var lcwManin: String,
    val type:String,
) : java.io.Serializable
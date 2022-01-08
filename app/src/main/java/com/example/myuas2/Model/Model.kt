package com.example.myuas2.Model

class Model (
    val perpustakaan: List<Data>
) {
    data class Data (val id:String?, val nama_buku:String?, val kategori_buku:String?)
}
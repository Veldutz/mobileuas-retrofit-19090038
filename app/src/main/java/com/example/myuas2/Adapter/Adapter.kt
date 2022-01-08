package com.example.myuas2.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myuas2.Model.Model
import com.example.myuas2.R

class Adapter (
    val perpustakaan: ArrayList<Model.Data>
): RecyclerView.Adapter<Adapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter, parent, false)
    )

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val data = perpustakaan[position]
        holder.textNama_buku.text = data.nama_buku
        holder.textKategori_buku.text = data.kategori_buku
    }

    override fun getItemCount() = perpustakaan.size

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val textNama_buku = view.findViewById<TextView>(R.id.textnama_buku)
        val textKategori_buku = view.findViewById<TextView>(R.id.textkategori_buku)
    }

    public fun setData(data: List<Model.Data>){
        perpustakaan.clear()
        perpustakaan.addAll(data)
        notifyDataSetChanged()
    }

}
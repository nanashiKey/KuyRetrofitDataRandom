package com.ngopidev.project.kuyretrofitdatarandom.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ngopidev.project.kuyretrofitdatarandom.R
import com.ngopidev.project.kuyretrofitdatarandom.modelmodel.DataBuku
import kotlinx.android.synthetic.main.item_data.view.*


/**
 *   created by Irfan Assidiq on 2019-07-12
 *   email : assidiq.irfan@gmail.com
 **/
class DataBukuAdapters : RecyclerView.Adapter<DataBukuAdapters.DataBukuViewHolder> {

    lateinit var listDataBuku : List<DataBuku>
    lateinit var mContext : Context

    constructor(){

    }
    constructor(mcontext : Context, listDataBuku : List<DataBuku>){
        this.listDataBuku = listDataBuku
        this.mContext = mcontext
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataBukuViewHolder {
        val viewss = LayoutInflater.from(mContext).inflate(R.layout.item_data, parent, false)
        return DataBukuViewHolder(viewss)
    }

    override fun getItemCount(): Int {
        return listDataBuku.size
    }

    override fun onBindViewHolder(holder: DataBukuViewHolder, position: Int) {
        val buku = listDataBuku[position]
        holder.judul.text = buku.judul
        holder.tanggal.text = buku.tanggal
        holder.penulis.text = buku.penulis
    }

    class DataBukuViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){
        var judul : TextView
        var penulis : TextView
        var tanggal : TextView
        init {
            judul = itemview.findViewById(R.id.tv_judul)
            penulis = itemview.findViewById(R.id.tv_nama)
            tanggal = itemview.findViewById(R.id.tv_tanggal)
        }
    }
}
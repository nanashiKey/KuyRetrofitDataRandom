package com.ngopidev.project.kuyretrofitdatarandom.modelmodel

import com.google.gson.annotations.SerializedName


/**
 *   created by Irfan Assidiq on 2019-07-12
 *   email : assidiq.irfan@gmail.com
 **/
class DataBuku{
    @SerializedName("id")
    lateinit var id : String

    @SerializedName("judul")
    lateinit var judul : String

    @SerializedName("penulis")
    lateinit var penulis :String

    @SerializedName("description")
    lateinit var desc : String

    @SerializedName("tahun_terbit")
    lateinit var tanggal : String


    constructor(){}

    constructor(judul : String, penulis : String, desc : String, tanggal : String){
        this.judul = judul
        this.penulis = penulis
        this.desc=desc
        this.tanggal = tanggal
    }
    constructor(id : String, judul : String, penulis : String, desc : String, tanggal : String){
        this.id = id
        this.judul = judul
        this.penulis = penulis
        this.desc=desc
        this.tanggal = tanggal
    }
}


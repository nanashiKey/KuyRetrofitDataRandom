package com.ngopidev.project.kuyretrofitdatarandom.dataExecutor

import com.ngopidev.project.kuyretrofitdatarandom.modelmodel.DataBuku
import retrofit2.Call
import retrofit2.http.GET


/**
 *   created by Irfan Assidiq on 2019-07-12
 *   email : assidiq.irfan@gmail.com
 **/
interface OnlyAPI {
    @GET("simplesample/showdata.php")
    fun getData() : Call<List<DataBuku>>

}
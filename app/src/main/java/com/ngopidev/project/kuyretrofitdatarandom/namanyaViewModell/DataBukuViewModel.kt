package com.ngopidev.project.kuyretrofitdatarandom.namanyaViewModell

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ngopidev.project.kuyretrofitdatarandom.dataExecutor.Const
import com.ngopidev.project.kuyretrofitdatarandom.dataExecutor.OnlyAPI
import com.ngopidev.project.kuyretrofitdatarandom.modelmodel.DataBuku
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 *   created by Irfan Assidiq on 2019-07-12
 *   email : assidiq.irfan@gmail.com
 **/
class DataBukuViewModel : ViewModel(){

    var listBuku : MutableLiveData<List<DataBuku>>? = null
    val datadata : LiveData<List<DataBuku>>
        get() {
            if(listBuku == null){
                listBuku = MutableLiveData()
                loadDataBuku()
            }
            return listBuku!!
        }

    fun loadDataBuku(){
        val retrofit = Retrofit.Builder()
            .baseUrl(Const.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apidata = retrofit.create(OnlyAPI::class.java)
        val calldata = apidata.getData()

        calldata.enqueue(object : Callback<List<DataBuku>> {
            override fun onResponse(call: Call<List<DataBuku>>, response: Response<List<DataBuku>>) {
                listBuku!!.value = response.body()
            }

            override fun onFailure(call: Call<List<DataBuku>>, t: Throwable) {

            }

        })
    }
}
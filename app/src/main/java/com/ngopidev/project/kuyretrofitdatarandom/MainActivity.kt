package com.ngopidev.project.kuyretrofitdatarandom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.util.Log.e
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ngopidev.project.kuyretrofitdatarandom.adapters.DataBukuAdapters
import com.ngopidev.project.kuyretrofitdatarandom.dataExecutor.Const
import com.ngopidev.project.kuyretrofitdatarandom.dataExecutor.OnlyAPI
import com.ngopidev.project.kuyretrofitdatarandom.modelmodel.DataBuku
import com.ngopidev.project.kuyretrofitdatarandom.namanyaViewModell.DataBukuViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    var rcView : RecyclerView? = null
    var dataBukuAdapter : DataBukuAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcView = findViewById(R.id.rcView)
        rcView!!.setHasFixedSize(true)
        rcView!!.layoutManager = LinearLayoutManager(this)

        val modelize = ViewModelProviders.of(this).get(DataBukuViewModel::class.java)
        modelize.datadata.observeForever {
            e("TAGERROR", it.get(0).judul)
            dataBukuAdapter = DataBukuAdapters(this@MainActivity, it)
            rcView!!.adapter = dataBukuAdapter
        }


    }
}

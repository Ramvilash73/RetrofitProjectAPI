package com.midas.RetrofitAPIProject

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.midas.RetrofitAPIProject.Model.ResponseDataClassProductlist
import com.midas.RetrofitAPIProject.MyController.MyController
import com.midas.RetrofitAPIProject.RequestModelclass.ProductListRequest
import com.midas.RetrofitAPIProject.RequestModelclass.RequestContainer
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val controller = MyController()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val postData=ProductListRequest(RequestContainer( "POSPriorware",
            "1.0.0.1",
         4,
        "ad09a8aaf5940d53",
       "POS#@2023Priorware",
        "7854859,44784574",
         "cashierCa",
        "IOS"),ProductListRequest.RequestData("1","1"))
        controller.postData(postData, object : Callback<ResponseDataClassProductlist> {
            @SuppressLint("SuspiciousIndentation")
            override fun onResponse(call: Call<ResponseDataClassProductlist>, response: Response<ResponseDataClassProductlist>) {
                // Handle the response here
                if (response.isSuccessful) {
                    val responseData = response.body()
                        Log.e("responseData",responseData!!.d.responseCode.toString())
                    // Process responseData
                } else {
                    // Handle error
                }
            }

            override fun onFailure(call: Call<ResponseDataClassProductlist>, t: Throwable) {
                // Handle failure
            }
        })
    }
}
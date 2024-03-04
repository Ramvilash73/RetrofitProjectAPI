package com.midas.RetrofitAPIProject.MyController

import com.midas.RetrofitAPIProject.Model.ResponseDataClassProductlist
import com.midas.RetrofitAPIProject.RequestModelclass.ProductListRequest
import com.midas.RetrofitAPIProject.RetrofitInstance.RetrofitInstance
import retrofit2.Callback

class MyController {
    fun postData(postData: ProductListRequest, callback: Callback<ResponseDataClassProductlist>) {
        val call = RetrofitInstance.apiService.postData(postData)
        call.enqueue(callback)
    }
}
package com.midas.RetrofitAPIProject.ApiService

import com.midas.RetrofitAPIProject.Model.ResponseDataClassProductlist
import com.midas.RetrofitAPIProject.RequestModelclass.ProductListRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    @POST("CashierActionPopUp.asmx/GetScreenProductList")
    @Headers("Authorization: ", "Content-Type: application/json")
    fun postData(@Body postData: ProductListRequest): Call<ResponseDataClassProductlist>
}
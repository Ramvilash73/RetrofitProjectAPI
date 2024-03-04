package com.midas.RetrofitAPIProject.RequestModelclass


import com.google.gson.annotations.SerializedName

data class ProductListRequest(
    @SerializedName("requestContainer")
    val requestContainer: RequestContainer,
    @SerializedName("requestData")
    val requestData: RequestData
){
    data class RequestData(
        @SerializedName("ScreenId")
        val screenId: String,
        @SerializedName("StoreId")
        val storeId: String
    )
}
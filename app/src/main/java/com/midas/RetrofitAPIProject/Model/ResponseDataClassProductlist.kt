package com.midas.RetrofitAPIProject.Model


import com.google.gson.annotations.SerializedName

data class ResponseDataClassProductlist(
    @SerializedName("d")
    val d: D
){
    data class D(
        @SerializedName("responseCode")
        val responseCode: String,
        @SerializedName("responseData")
        val responseData: List<ResponseData>,
        @SerializedName("responseMessage")
        val responseMessage: String
    )
    data class ResponseData(
        @SerializedName("ProductList")
        val productList: List<Product>,
        @SerializedName("ScreenId")
        val screenId: Int,
        @SerializedName("ScreenName")
        val screenName: String
    )
    data class Product(
        @SerializedName("Age")
        val age: Int,
        @SerializedName("AutoId")
        val autoId: Int,
        @SerializedName("BG_ColorCode")
        val bGColorCode: String,
        @SerializedName("Barcode")
        val barcode: Int,
        @SerializedName("ImagePath")
        val imagePath: String,
        @SerializedName("ProductName")
        val productName: String,
        @SerializedName("Quantity")
        val quantity: Int,
        @SerializedName("SKUAutoId")
        val sKUAutoId: Int,
        @SerializedName("SKUCount")
        val sKUCount: Int,
        @SerializedName("TEXT_ColorCode")
        val tEXTColorCode: String,
        @SerializedName("ViewImage")
        val viewImage: Int
    )
}
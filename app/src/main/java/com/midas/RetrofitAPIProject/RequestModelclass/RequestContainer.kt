package com.midas.RetrofitAPIProject.RequestModelclass


import com.google.gson.annotations.SerializedName

data class RequestContainer(
    @SerializedName("AccessToken")
    val accessToken: String,
    @SerializedName("AppVersion")
    val appVersion: String,
    @SerializedName("AutoId")
    val autoId: Int,
    @SerializedName("DeviceId")
    val deviceId: String,
    @SerializedName("Hashkey")
    val hashkey: String,
    @SerializedName("LatLong")
    val latLong: String,
    @SerializedName("LoginId")
    val loginId: String,
    @SerializedName("RequestSource")
    val requestSource: String
)
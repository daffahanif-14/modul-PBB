package com.example.modul9restapi.model.response


import com.example.modul9restapi.model.request.DetailDataMahasiswa
import com.google.gson.annotations.SerializedName

data class ResponseDetailMahasiswa(
    @SerializedName("data")
    val data : DetailDataMahasiswa,
    @SerializedName("status")
    val status: String
)
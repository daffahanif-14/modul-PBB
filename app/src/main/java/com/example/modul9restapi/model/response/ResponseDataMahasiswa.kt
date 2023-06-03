package com.example.modul9restapi.model.response


import com.example.modul9restapi.model.request.DataMahasiswa
import com.google.gson.annotations.SerializedName

data class ResponseDataMahasiswa(
    @SerializedName("data")
    val data: List<DataMahasiswa>,
    @SerializedName("status")
    val status: String
)
package com.example.nit3213app.data.api.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Entity(
    @SerializedName("property1")
    val property1: String,

    @SerializedName("property2")
    val property2: String,

    @SerializedName("description")
    val description: String
) : Parcelable
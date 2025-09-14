package com.example.nit3213app.data.api.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Entity(
    @SerializedName("name") val name: String,
    @SerializedName("architect") val architect: String,
    @SerializedName("location") val location: String,
    @SerializedName("yearCompleted") val yearCompleted: Int,
    @SerializedName("style") val style: String,
    @SerializedName("height") val height: Int,
    @SerializedName("description") val description: String
) : Parcelable
package com.example.nit3213app.data.api.models

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("keypass")
    val keypass: String
)
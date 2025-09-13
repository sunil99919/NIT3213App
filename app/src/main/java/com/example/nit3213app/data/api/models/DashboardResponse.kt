package com.example.nit3213app.data.api.models

import com.google.gson.annotations.SerializedName

data class DashboardResponse(
    @SerializedName("entities")
    val entities: List<Entity>,

    @SerializedName("entityTotal")
    val entityTotal: Int
)
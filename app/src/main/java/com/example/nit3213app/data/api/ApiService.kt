package com.example.nit3213app.data.api

import com.example.nit3213app.data.api.models.DashboardResponse
import com.example.nit3213app.data.api.models.LoginRequest
import com.example.nit3213app.data.api.models.LoginResponse
import com.example.nit3213app.utils.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {

    @POST(Constants.LOGIN_ENDPOINT)
    suspend fun login(@Body loginRequest: LoginRequest): Response<LoginResponse>

    @GET(Constants.DASHBOARD_ENDPOINT)
    suspend fun getDashboard(@Path("keypass") keypass: String): Response<DashboardResponse>
}
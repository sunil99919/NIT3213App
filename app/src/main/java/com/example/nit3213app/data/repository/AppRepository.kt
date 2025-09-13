package com.example.nit3213app.data.repository

import com.example.nit3213app.data.api.models.DashboardResponse
import com.example.nit3213app.data.api.models.LoginRequest
import com.example.nit3213app.data.api.models.LoginResponse

interface AppRepository {
    suspend fun login(loginRequest: LoginRequest): Result<LoginResponse>
    suspend fun getDashboard(keypass: String): Result<DashboardResponse>
}
package com.example.nit3213app.data.api;

import com.example.nit3213app.data.api.models.DashboardResponse;
import com.example.nit3213app.data.api.models.LoginRequest;
import com.example.nit3213app.data.api.models.LoginResponse;
import com.example.nit3213app.utils.Constants;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/nit3213app/data/api/ApiService;", "", "getDashboard", "Lretrofit2/Response;", "Lcom/example/nit3213app/data/api/models/DashboardResponse;", "keypass", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/example/nit3213app/data/api/models/LoginResponse;", "loginRequest", "Lcom/example/nit3213app/data/api/models/LoginRequest;", "(Lcom/example/nit3213app/data/api/models/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface ApiService {
    
    @retrofit2.http.POST(value = "br/auth")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.nit3213app.data.api.models.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.nit3213app.data.api.models.LoginResponse>> $completion);
    
    @retrofit2.http.GET(value = "dashboard/{keypass}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDashboard(@retrofit2.http.Path(value = "keypass")
    @org.jetbrains.annotations.NotNull()
    java.lang.String keypass, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.nit3213app.data.api.models.DashboardResponse>> $completion);
}
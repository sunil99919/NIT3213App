package com.example.nit3213app.data.repository;

import com.example.nit3213app.data.api.ApiService;
import com.example.nit3213app.data.api.models.DashboardResponse;
import com.example.nit3213app.data.api.models.LoginRequest;
import com.example.nit3213app.data.api.models.LoginResponse;
import retrofit2.HttpException;
import java.io.IOException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006\u0012"}, d2 = {"Lcom/example/nit3213app/data/repository/AppRepositoryImpl;", "Lcom/example/nit3213app/data/repository/AppRepository;", "apiService", "Lcom/example/nit3213app/data/api/ApiService;", "(Lcom/example/nit3213app/data/api/ApiService;)V", "getDashboard", "Lkotlin/Result;", "Lcom/example/nit3213app/data/api/models/DashboardResponse;", "keypass", "", "getDashboard-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/example/nit3213app/data/api/models/LoginResponse;", "loginRequest", "Lcom/example/nit3213app/data/api/models/LoginRequest;", "login-gIAlu-s", "(Lcom/example/nit3213app/data/api/models/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AppRepositoryImpl implements com.example.nit3213app.data.repository.AppRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.nit3213app.data.api.ApiService apiService = null;
    
    @javax.inject.Inject()
    public AppRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.nit3213app.data.api.ApiService apiService) {
        super();
    }
}
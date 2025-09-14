package com.example.nit3213app;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import com.example.nit3213app.data.api.models.LoginResponse;
import com.example.nit3213app.data.repository.AppRepository;
import com.example.nit3213app.ui.login.LoginViewModel;
import com.example.nit3213app.ui.login.LoginViewModel.LoginState;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@org.junit.runner.RunWith(value = org.mockito.junit.MockitoJUnitRunner.class)
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0007J\f\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0007J\f\u0010\u0013\u001a\u00060\u0010j\u0002`\u0011H\u0007J\b\u0010\u0014\u001a\u00020\u0010H\u0007R\u0013\u0010\u0003\u001a\u00020\u00048G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u00020\b8G\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/nit3213app/LoginViewModelTest;", "", "()V", "instantTaskExecutorRule", "Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "getInstantTaskExecutorRule", "()Landroidx/arch/core/executor/testing/InstantTaskExecutorRule;", "mainCoroutineRule", "Lcom/example/nit3213app/MainCoroutineRule;", "getMainCoroutineRule", "()Lcom/example/nit3213app/MainCoroutineRule;", "repository", "Lcom/example/nit3213app/data/repository/AppRepository;", "viewModel", "Lcom/example/nit3213app/ui/login/LoginViewModel;", "login with empty credentials should return error", "", "Lkotlinx/coroutines/test/TestResult;", "login with invalid credentials should return error", "login with valid credentials should return success", "setup", "app_debugUnitTest"})
@kotlinx.coroutines.ExperimentalCoroutinesApi()
public final class LoginViewModelTest {
    @org.jetbrains.annotations.NotNull()
    private final androidx.arch.core.executor.testing.InstantTaskExecutorRule instantTaskExecutorRule = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.nit3213app.MainCoroutineRule mainCoroutineRule = null;
    @org.mockito.Mock()
    private com.example.nit3213app.data.repository.AppRepository repository;
    private com.example.nit3213app.ui.login.LoginViewModel viewModel;
    
    public LoginViewModelTest() {
        super();
    }
    
    @org.junit.Rule()
    @org.jetbrains.annotations.NotNull()
    public final androidx.arch.core.executor.testing.InstantTaskExecutorRule getInstantTaskExecutorRule() {
        return null;
    }
    
    @org.junit.Rule()
    @org.jetbrains.annotations.NotNull()
    public final com.example.nit3213app.MainCoroutineRule getMainCoroutineRule() {
        return null;
    }
    
    @org.junit.Before()
    public final void setup() {
    }
}
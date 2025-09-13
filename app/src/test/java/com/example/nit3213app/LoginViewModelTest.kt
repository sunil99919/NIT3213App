package com.example.nit3213app

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.nit3213app.data.api.models.LoginResponse
import com.example.nit3213app.data.repository.AppRepository
import com.example.nit3213app.ui.login.LoginState
import com.example.nit3213app.ui.login.LoginViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.whenever

@ExperimentalCoroutinesApi
@RunWith(MockitoJUnitRunner::class)
class LoginViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val mainCoroutineRule = MainCoroutineRule()

    @Mock
    private lateinit var repository: AppRepository

    private lateinit var viewModel: LoginViewModel

    @Before
    fun setup() {
        viewModel = LoginViewModel(repository)
    }

    @Test
    fun `login with empty credentials should return error`() = runTest {
        // When
        viewModel.login("", "")

        // Then
        val state = viewModel.loginState.value as LoginState.Error
        assertEquals("Please enter both username and password", state.message)
    }

    @Test
    fun `login with valid credentials should return success`() = runTest {
        // Given
        val username = "John"
        val password = "12345678"
        val keypass = "test-keypass"
        whenever(repository.login(any())).thenReturn(Result.success(LoginResponse(keypass)))

        // When
        viewModel.login(username, password)

        // Then
        val state = viewModel.loginState.value as LoginState.Success
        assertEquals(keypass, state.keypass)
    }

    @Test
    fun `login with invalid credentials should return error`() = runTest {
        // Given
        val username = "John"
        val password = "12345678"
        val errorMessage = "Invalid credentials"
        whenever(repository.login(any())).thenReturn(Result.failure(Exception(errorMessage)))

        // When
        viewModel.login(username, password)

        // Then
        val state = viewModel.loginState.value as LoginState.Error
        assertEquals(errorMessage, state.message)
    }
}
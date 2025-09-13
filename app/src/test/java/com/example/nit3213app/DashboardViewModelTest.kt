package com.example.nit3213app

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.nit3213app.data.api.models.DashboardResponse
import com.example.nit3213app.data.api.models.Entity
import com.example.nit3213app.data.repository.AppRepository
import com.example.nit3213app.ui.dashboard.DashboardState
import com.example.nit3213app.ui.dashboard.DashboardViewModel
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
class DashboardViewModelTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val mainCoroutineRule = MainCoroutineRule()

    @Mock
    private lateinit var repository: AppRepository

    private lateinit var viewModel: DashboardViewModel

    @Before
    fun setup() {
        viewModel = DashboardViewModel(repository)
    }

    @Test
    fun `loadEntities with valid keypass should return success`() = runTest {
        // Given
        val keypass = "test-keypass"
        val entities = listOf(
            Entity("value1", "value2", "description1"),
            Entity("value3", "value4", "description2")
        )
        val dashboardResponse = DashboardResponse(entities, 2)
        whenever(repository.getDashboard(keypass)).thenReturn(Result.success(dashboardResponse))

        // When
        viewModel.loadEntities(keypass)

        // Then
        val state = viewModel.dashboardState.value as DashboardState.Success
        assertEquals(entities, state.entities)
    }

    @Test
    fun `loadEntities with invalid keypass should return error`() = runTest {
        // Given
        val keypass = "invalid-keypass"
        val errorMessage = "Invalid keypass"
        whenever(repository.getDashboard(keypass)).thenReturn(Result.failure(Exception(errorMessage)))

        // When
        viewModel.loadEntities(keypass)

        // Then
        val state = viewModel.dashboardState.value as DashboardState.Error
        assertEquals(errorMessage, state.message)
    }
}
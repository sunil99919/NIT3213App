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
            Entity(
                name = "Eiffel Tower",
                architect = "Gustave Eiffel",
                location = "Paris, France",
                yearCompleted = 1889,
                style = "Structural Expressionism",
                height = 324,
                description = "Iconic iron lattice tower"
            ),
            Entity(
                name = "Taj Mahal",
                architect = "Ustad Ahmad Lahauri",
                location = "Agra, India",
                yearCompleted = 1653,
                style = "Mughal Architecture",
                height = 73,
                description = "Ivory-white marble mausoleum"
            )
        )
        val dashboardResponse = DashboardResponse(entities, entities.size)
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
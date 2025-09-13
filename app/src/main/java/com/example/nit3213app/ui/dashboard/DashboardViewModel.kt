package com.example.nit3213app.ui.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nit3213app.data.api.models.Entity
import com.example.nit3213app.data.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val repository: AppRepository
) : ViewModel() {

    private val _dashboardState = MutableStateFlow<DashboardState>(DashboardState.Idle)
    val dashboardState: StateFlow<DashboardState> = _dashboardState.asStateFlow()

    fun loadEntities(keypass: String) {
        _dashboardState.value = DashboardState.Loading

        viewModelScope.launch {
            val result = repository.getDashboard(keypass)

            result.onSuccess { dashboardResponse ->
                _dashboardState.value = DashboardState.Success(dashboardResponse.entities)
            }.onFailure { exception ->
                _dashboardState.value = DashboardState.Error(exception.message ?: "Failed to load data")
            }
        }
    }

    fun resetState() {
        _dashboardState.value = DashboardState.Idle
    }
}

sealed class DashboardState {
    object Idle : DashboardState()
    object Loading : DashboardState()
    data class Success(val entities: List<Entity>) : DashboardState()
    data class Error(val message: String) : DashboardState()
}
package com.example.nit3213app.ui.details

import androidx.lifecycle.ViewModel
import com.example.nit3213app.data.api.models.Entity
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor() : ViewModel() {

    lateinit var entity: Entity

    fun setEntity(entity: Entity) {
        this.entity = entity
    }
}
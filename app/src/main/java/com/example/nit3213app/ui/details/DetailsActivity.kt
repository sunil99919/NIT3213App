package com.example.nit3213app.ui.details

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.nit3213app.data.api.models.Entity
import com.example.nit3213app.databinding.ActivityDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private val viewModel: DetailsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val entity = intent.getParcelableExtra<Entity>("ENTITY")
        if (entity == null) {
            finish()
            return
        }

        // Assign directly to the ViewModel property
        viewModel.entity = entity

        setupUI()
    }

    private fun setupUI() {
        // Use data binding or assign fields manually
        binding.entity = viewModel.entity

        supportActionBar?.apply {
            title = "Entity Details"
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

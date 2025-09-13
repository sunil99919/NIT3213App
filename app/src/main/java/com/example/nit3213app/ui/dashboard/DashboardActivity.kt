package com.example.nit3213app.ui.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nit3213app.databinding.ActivityDashboardBinding
import com.example.nit3213app.ui.dashboard.adapter.EntityAdapter
import com.example.nit3213app.ui.details.DetailsActivity
import com.example.nit3213app.utils.showToast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    private val viewModel: DashboardViewModel by viewModels()
    private lateinit var adapter: EntityAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val keypass = intent.getStringExtra("KEYPASS")
        if (keypass.isNullOrEmpty()) {
            showToast("Authentication error")
            finish()
            return
        }

        setupRecyclerView()
        setupObservers()
        viewModel.loadEntities(keypass)
    }

    private fun setupRecyclerView() {
        adapter = EntityAdapter { entity ->
            val intent = Intent(this, DetailsActivity::class.java).apply {
                putExtra("ENTITY", entity)
            }
            startActivity(intent)
        }

        binding.entitiesRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.entitiesRecyclerView.adapter = adapter
        binding.entitiesRecyclerView.setHasFixedSize(true)
    }

    private fun setupObservers() {
        viewModel.dashboardState.observe(this) { state ->
            when (state) {
                is DashboardState.Idle -> {
                    binding.progressBar.isVisible = false
                }
                is DashboardState.Loading -> {
                    binding.progressBar.isVisible = true
                    binding.errorTextView.isVisible = false
                    binding.entitiesRecyclerView.isVisible = false
                }
                is DashboardState.Success -> {
                    binding.progressBar.isVisible = false
                    binding.errorTextView.isVisible = false
                    binding.entitiesRecyclerView.isVisible = true
                    adapter.submitList(state.entities)
                }
                is DashboardState.Error -> {
                    binding.progressBar.isVisible = false
                    binding.errorTextView.isVisible = true
                    binding.entitiesRecyclerView.isVisible = false
                    binding.errorTextView.text = state.message
                    showToast(state.message)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.resetState()
    }
}
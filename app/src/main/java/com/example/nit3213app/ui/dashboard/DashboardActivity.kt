package com.example.nit3213app.ui.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.example.nit3213app.databinding.ActivityDashboardBinding
import com.example.nit3213app.ui.dashboard.adapter.EntityAdapter
import com.example.nit3213app.ui.details.DetailsActivity
import com.example.nit3213app.ui.login.LoginActivity
import com.example.nit3213app.utils.showToast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    private val viewModel: DashboardViewModel by viewModels()
    private lateinit var adapter: EntityAdapter
    private var keypass: String? = null   // keep keypass available for navigation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        keypass = intent.getStringExtra("KEYPASS")
        if (keypass.isNullOrEmpty()) {
            showToast("Authentication error")
            finish()
            return
        }

        setupRecyclerView()
        setupObservers()
        viewModel.loadEntities(keypass!!)

        // Retry handler
        binding.retryButton.setOnClickListener {
            keypass?.let { safeKey -> viewModel.loadEntities(safeKey) }
        }
    }

    private fun setupRecyclerView() {
        adapter = EntityAdapter { entity ->
            val intent = Intent(this, DetailsActivity::class.java).apply {
                putExtra("ENTITY", entity)
                putExtra("KEYPASS", keypass) // forward the dashboard keypass if needed
            }
            startActivity(intent)
        }

        binding.entitiesRecyclerView.layoutManager = GridLayoutManager(this, 2)
        binding.entitiesRecyclerView.adapter = adapter
        binding.entitiesRecyclerView.setHasFixedSize(true)
    }

    private fun setupObservers() {
        lifecycleScope.launch {
            viewModel.dashboardState.collect { state ->
                when (state) {
                    is DashboardState.Idle -> {
                        binding.loadingLayout.isVisible = false
                        binding.errorLayout.isVisible = false
                        binding.contentLayout.isVisible = false
                    }
                    is DashboardState.Loading -> {
                        binding.loadingLayout.isVisible = true
                        binding.errorLayout.isVisible = false
                        binding.contentLayout.isVisible = false
                    }
                    is DashboardState.Success -> {
                        binding.loadingLayout.isVisible = false
                        binding.errorLayout.isVisible = false
                        binding.contentLayout.isVisible = true
                        adapter.submitList(state.entities)

                        binding.entityCountTextView.text =
                            "${state.entities.size} items available"
                    }
                    is DashboardState.Error -> {
                        binding.loadingLayout.isVisible = false
                        binding.errorLayout.isVisible = true
                        binding.contentLayout.isVisible = false
                        binding.errorTextView.text = state.message
                        showToast(state.message)
                    }
                }
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        // Always navigate back to LoginActivity
        val intent = Intent(this, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }

    override fun onResume() {
        super.onResume()
        viewModel.resetState()
    }
}
package com.example.nit3213app.ui.details

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nit3213app.data.api.models.Entity
import com.example.nit3213app.databinding.ActivityDetailsBinding
import com.example.nit3213app.ui.dashboard.DashboardActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private var keypass: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get entity + keypass
        val entity = intent.getParcelableExtra<Entity>("ENTITY")
        keypass = intent.getStringExtra("KEYPASS")

        // ✅ Bind entity directly to XML (no manual .text assignments needed)
        binding.entity = entity

        // Handle Back button
        binding.backButton.setOnClickListener {
            val dashboardIntent = Intent(this, DashboardActivity::class.java).apply {
                putExtra("KEYPASS", keypass)
            }
            startActivity(dashboardIntent)
            finish()
        }
    }

    override fun onBackPressed() {
        val dashboardIntent = Intent(this, DashboardActivity::class.java).apply {
            putExtra("KEYPASS", keypass)
        }
        startActivity(dashboardIntent)
        finish()
    }
}

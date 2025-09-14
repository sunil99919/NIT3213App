package com.example.nit3213app.ui.details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.nit3213app.data.api.models.Entity
import com.example.nit3213app.databinding.ActivityDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val entity = intent.getParcelableExtra<Entity>("ENTITY")
        if (entity == null) {
            finish()
            return
        }

        // bind the entity directly to XML
        binding.entity = entity

        supportActionBar?.apply {
            title = entity.name
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}
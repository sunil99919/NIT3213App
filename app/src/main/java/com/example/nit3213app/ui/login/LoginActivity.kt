package com.example.nit3213app.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.lifecycleScope
import com.example.nit3213app.databinding.ActivityLoginBinding
import com.example.nit3213app.ui.dashboard.DashboardActivity
import com.example.nit3213app.utils.showToast
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
        setupObservers()
    }

    private fun setupUI() {
        binding.loginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString().trim()
            val password = binding.passwordEditText.text.toString().trim()
            viewModel.login(username, password)
        }

        binding.usernameEditText.addTextChangedListener { validateForm() }
        binding.passwordEditText.addTextChangedListener { validateForm() }
    }

    private fun validateForm() {
        val username = binding.usernameEditText.text.toString().trim()
        val password = binding.passwordEditText.text.toString().trim()
        binding.loginButton.isEnabled = username.isNotEmpty() && password.isNotEmpty()
    }

    private fun setupObservers() {
        // Collect StateFlow in a lifecycle-aware coroutine
        lifecycleScope.launchWhenStarted {
            viewModel.loginState.collect { state ->
                when (state) {
                    is LoginViewModel.LoginState.Idle -> {
                        binding.progressBar.isVisible = false
                        binding.loginButton.isEnabled = true
                        binding.errorTextView.isVisible = false
                    }
                    is LoginViewModel.LoginState.Loading -> {
                        binding.progressBar.isVisible = true
                        binding.loginButton.isEnabled = false
                        binding.errorTextView.isVisible = false
                    }
                    is LoginViewModel.LoginState.Success -> {
                        binding.progressBar.isVisible = false
                        binding.loginButton.isEnabled = true
                        navigateToDashboard(state.keypass)
                    }
                    is LoginViewModel.LoginState.Error -> {
                        binding.progressBar.isVisible = false
                        binding.loginButton.isEnabled = true
                        binding.errorTextView.isVisible = true
                        binding.errorTextView.text = state.message
                        showToast(state.message)
                    }
                }
            }
        }
    }

    private fun navigateToDashboard(keypass: String) {
        val intent = Intent(this, DashboardActivity::class.java).apply {
            putExtra("KEYPASS", keypass)
        }
        startActivity(intent)
        finish()
    }

    override fun onResume() {
        super.onResume()
        viewModel.resetState()
    }
}

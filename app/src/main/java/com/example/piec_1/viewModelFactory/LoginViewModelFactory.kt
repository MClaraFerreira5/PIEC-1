package com.example.piec_1.viewModelFactory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.piec_1.viewModel.LoginViewModel

class LoginViewModelFactory(private val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return LoginViewModel(application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
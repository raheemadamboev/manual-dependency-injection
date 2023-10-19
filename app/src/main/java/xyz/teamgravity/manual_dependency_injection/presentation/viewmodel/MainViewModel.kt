package xyz.teamgravity.manual_dependency_injection.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import xyz.teamgravity.manual_dependency_injection.data.repository.AuthRepository

class MainViewModel(
    private val auth: AuthRepository
) : ViewModel() {

    init {
        viewModelScope.launch {
            auth.login(
                email = "2Pac",
                password = "Check my resume, sipping crystals and hennessy"
            )
        }
    }
}
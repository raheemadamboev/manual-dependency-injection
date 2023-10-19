package xyz.teamgravity.manual_dependency_injection.injection.module

import xyz.teamgravity.manual_dependency_injection.data.remote.api.AuthApi
import xyz.teamgravity.manual_dependency_injection.data.repository.AuthRepository

interface ApplicationModule {
    val authApi: AuthApi
    val authRepository: AuthRepository
}
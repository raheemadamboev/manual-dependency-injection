package xyz.teamgravity.manual_dependency_injection.injection.module

import android.content.Context
import xyz.teamgravity.manual_dependency_injection.data.remote.api.AuthApi
import xyz.teamgravity.manual_dependency_injection.data.remote.api.AuthApiImp
import xyz.teamgravity.manual_dependency_injection.data.repository.AuthRepository
import xyz.teamgravity.manual_dependency_injection.data.repository.AuthRepositoryImp

class ApplicationModuleImp(
    private val context: Context
) : ApplicationModule {

    override val authApi: AuthApi by lazy {
        AuthApiImp(context)
    }

    override val authRepository: AuthRepository by lazy {
        AuthRepositoryImp(authApi)
    }
}
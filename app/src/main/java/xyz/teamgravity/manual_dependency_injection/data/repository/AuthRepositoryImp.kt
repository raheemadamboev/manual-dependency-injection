package xyz.teamgravity.manual_dependency_injection.data.repository

import xyz.teamgravity.manual_dependency_injection.data.remote.api.AuthApi

class AuthRepositoryImp(
    private val api: AuthApi
) : AuthRepository {

    override suspend fun login(email: String, password: String) {
        api.login(
            email = email,
            password = password
        )
    }
}
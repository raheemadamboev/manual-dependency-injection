package xyz.teamgravity.manual_dependency_injection.data.remote.api

interface AuthApi {

    suspend fun login(
        email: String,
        password: String
    )
}
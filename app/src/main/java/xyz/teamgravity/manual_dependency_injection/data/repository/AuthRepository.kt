package xyz.teamgravity.manual_dependency_injection.data.repository

interface AuthRepository {

    suspend fun login(email: String, password: String)
}
package xyz.teamgravity.manual_dependency_injection.data.remote.api

import android.content.Context
import android.util.Log
import xyz.teamgravity.manual_dependency_injection.R

class AuthApiImp(
    private val context: Context
) : AuthApi {

    override suspend fun login(email: String, password: String) {
        Log.d("2Pac", context.getString(R.string.tupac_wise_word))
    }
}
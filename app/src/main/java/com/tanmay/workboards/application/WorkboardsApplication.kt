package com.tanmay.workboards.application

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

open class WorkboardsApplication : Application() {

    companion object {
        val SHARED_PREFERENCES_KEY = "com.tanmay.workboards_preferences"

        lateinit var instance: WorkboardsApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    fun getAppPreferences(): SharedPreferences = instance.getSharedPreferences(
        SHARED_PREFERENCES_KEY,
        Context.MODE_PRIVATE
    )

    fun isUserLoggedIn(prefs: SharedPreferences = getAppPreferences()) =
        prefs.contains(User.KEY_EMAIL)

    fun getUser(prefs: SharedPreferences = getAppPreferences()): User {
        return User(
            prefs.getString(User.KEY_FIRST_NAME, null),
            prefs.getString(User.KEY_LAST_NAME, null),
            prefs.getString(User.KEY_EMAIL, "")!!,
            prefs.getString(User.KEY_PASSWORD, null)
        )
    }

    data class User(
        val firstName: String?,
        val lastName: String?,
        val email: String,
        val password: String?
    ) {
        companion object {
            val KEY_FIRST_NAME: String = "user_first_name"
            val KEY_LAST_NAME: String = "user_last_name"
            val KEY_EMAIL = "user_email_address"
            val KEY_PASSWORD = "user_password"
        }
    }

}
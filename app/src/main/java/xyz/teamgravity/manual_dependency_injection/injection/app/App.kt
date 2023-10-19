package xyz.teamgravity.manual_dependency_injection.injection.app

import android.app.Application
import xyz.teamgravity.manual_dependency_injection.injection.module.ApplicationModule
import xyz.teamgravity.manual_dependency_injection.injection.module.ApplicationModuleImp

class App : Application() {

    companion object {
        lateinit var MODULE: ApplicationModule
    }

    override fun onCreate() {
        super.onCreate()

        MODULE = ApplicationModuleImp(this)
    }
}
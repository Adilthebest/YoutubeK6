package kg.example.youtubeapi

import android.app.Application
import kg.example.youtubeapi.di.koinModules
import kg.example.youtubeapi.repository.Repository
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {


    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(koinModules)
        }
    }
}
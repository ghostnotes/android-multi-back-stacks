package co.ghostnotes.sample.multibackstacks

import android.app.Application
import timber.log.Timber

class MultiBackStacksApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
        Timber.d("### onCreate()")
    }

}

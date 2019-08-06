package app.matrix.wallpaperpexels.database.sharedPreference

import android.content.Context
import android.content.SharedPreferences
import app.matrix.wallpaperpexels.database.statickt.GlobalValue.Companion.applicationName
import app.matrix.wallpaperpexels.WallPaperApp.Companion.applicationContext


class SharedPreferenceKt{

    private val sharedPref: SharedPreferences = applicationContext().getSharedPreferences(applicationName, Context.MODE_PRIVATE)
    //Getting SharedPreference
    fun providePreferences(): SharedPreferences {
        return sharedPref
    }
}

package app.matrix.wallpaperpexels

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.multidex.MultiDex
import app.matrix.wallpaperpexels.database.LocalSharedPreference
import com.google.firebase.FirebaseApp

class WallPaperApp : Application() {


    private var localdatabase: LocalSharedPreference? = null

    init {
        instance = this
    }

    companion object {
        private val TAG: String = WallPaperApp::class.java.simpleName

        private var instance: WallPaperApp? = null


        fun applicationContext(): Context {
            return instance!!.applicationContext
        }


        fun getPref(): LocalSharedPreference {
            Log.e(TAG, "LocalDatabase Initialized")
            return instance!!.localdatabase as LocalSharedPreference
        }

    }




    override fun onCreate() {
        super.onCreate()
        //initialize multidex for over 65k methods in application class
        MultiDex.install(this)

        var context: Context = WallPaperApp.applicationContext()

        Log.e(TAG, "This is Application Class Oncreate")

        //initialize localdatabase in the application class
        localdatabase = LocalSharedPreference(context)
        //initialize Firebase sdk in application class
        FirebaseApp.initializeApp(applicationContext)


    }//End Of Oncreate


}
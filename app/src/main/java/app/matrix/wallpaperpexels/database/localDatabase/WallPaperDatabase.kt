package app.matrix.wallpaperpexels.database.localDatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import app.matrix.wallpaperpexels.database.localDatabase.model.Demo

@Database(
    entities =
    [Demo::class], version = 1, exportSchema = false
)
abstract class WallPaperAppDatabase : RoomDatabase() {




    companion object {

        private var INSTANCE: WallPaperAppDatabase? = null

        fun getDatabase(context: Context): WallPaperAppDatabase {

            if (INSTANCE == null) {

                /*

                inMemoryDatabaseBuilder():
                 /////////////////////////////////////
                 The database will be created in system memory,
                  If you kill the app (Killing your process),
                   database will be removed and data will not be persisted.
                    This can be used while Testing.

                databaseBuilder() :
                 /////////////////////////////////////
                 The database will be created in /data/data/com.your.app and will be persisted.
                  This you will be using it in production.

                  */

                synchronized(WallPaperAppDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        WallPaperAppDatabase::class.java,
                        "wallpaperApplication.db"
                    )   .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE!!
        }

    }

}
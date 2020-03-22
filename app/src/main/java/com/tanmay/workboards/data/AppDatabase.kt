package com.tanmay.workboards.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.tanmay.workboards.data.dao.BoardDao
import com.tanmay.workboards.data.entity.Board

@Database(
    entities = arrayOf(
        Board::class
    ), version = 1, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun boardDao(): BoardDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}
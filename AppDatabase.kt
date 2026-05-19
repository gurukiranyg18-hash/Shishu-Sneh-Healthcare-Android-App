package com.shishusneh.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Baby::class, Vaccine::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun babyDao(): BabyDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {

            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "shishu_db"
                ).build()

                INSTANCE = instance
                instance
            }
        }
    }
}

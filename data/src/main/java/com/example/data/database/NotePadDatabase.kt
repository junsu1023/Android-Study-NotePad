package com.example.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.data.dao.NotePadDao
import com.example.data.entity.NotePadEntity

@Database(entities = [NotePadEntity::class], version = 1)
abstract class NotePadDatabase: RoomDatabase() {
    abstract fun notePadDao(): NotePadDao

    companion object {
        @Volatile
        private var INSTANCE: NotePadDatabase? = null

        fun getDatabase(context: Context): NotePadDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NotePadDatabase::class.java,
                    "notepad-database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
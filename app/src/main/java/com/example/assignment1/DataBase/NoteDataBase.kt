package com.example.assignment1.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.assignment1.Models.Note
import com.example.assignment1.Utilities.DATABASE_NAME

@Database(entities = arrayOf(Note::class),version = 1, exportSchema = false)
 abstract class NoteDataBase : RoomDatabase()
{
    abstract fun getNoteDao() : NoteDAO

    companion object{
        @Volatile
        private var INSTANCE : NoteDataBase? =null
        fun getDatabase(context : Context) :NoteDataBase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NoteDataBase ::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE =instance
                instance

            }
        }
    }
}
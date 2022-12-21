package com.example.assignment1.DataBase

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.assignment1.Models.Note

@Dao
interface NoteDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)

    @Delete
    suspend fun delete(note:Note)
    @Query("Select * from notes_table order by id ASC")
    fun getAllNotes():LiveData<List<Note>>

   // suspend fun update(id :Int?,title:String?,note:String?)
    @Query("UPDATE notes_table Set title =:title,note=:note WHERE id=:id")
            suspend fun update(id:Int?,title:String?,note: String?)
}
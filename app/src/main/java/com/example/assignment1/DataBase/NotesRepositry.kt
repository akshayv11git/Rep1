package com.example.assignment1.DataBase

import androidx.lifecycle.LiveData
import com.example.assignment1.Models.Note

class NotesRepositry (private val noteDAO :NoteDAO){
    val allNotes : LiveData<List<Note>> = noteDAO.getAllNotes()
    suspend fun insert (note :Note){
        noteDAO.insert(note)
    }
    suspend fun delete (note :Note){
        noteDAO.delete(note)
    }
    suspend fun update(note :Note){
        noteDAO.update(note.id,note.title,note.note)
    }

}
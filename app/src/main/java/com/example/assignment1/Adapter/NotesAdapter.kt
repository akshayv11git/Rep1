package com.example.assignment1.Adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignment1.Models.Note

class NotesAdapter(private val context :Context): RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {

    private val NotesList :ArrayList<Note>()
    private val fullList :ArrayList<Note>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
    inner class NoteViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView){

    }

}
package com.cazallau.noteapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cazallau.noteapp.model.Note;
import com.cazallau.noteapp.model.Notes;

/**
 * Created by gemabeltran on 19/1/17.
 */

public class NoteAdapter extends RecyclerView.Adapter<NoteRowViewHolder> {

    private Notes listNotes;
    LayoutInflater inflater;

    public NoteAdapter(Notes listNotes, Context context) {
        this.listNotes = listNotes;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public NoteRowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.note_row, parent, false);


        NoteRowViewHolder viewHolder = new NoteRowViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NoteRowViewHolder holder, int position) {

        Note note = listNotes.get(position);
        holder.setNote(note);
    }

    @Override
    public int getItemCount() {
        return listNotes.count();
    }
}

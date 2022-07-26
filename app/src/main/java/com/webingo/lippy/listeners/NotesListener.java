package com.webingo.lippy.listeners;

import android.view.View;

import com.webingo.lippy.entities.Note;

public interface NotesListener {
    void onNoteClicked(View view, Note note, int position);

    void onNoteLongClicked(View view, Note note, int position);
}

package com.sugarseries.mynotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GridMenuMyNotes extends AppCompatActivity {

    CardView addNote,listNote,settNotes,aboutNotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_menu);

        aboutNotes = findViewById(R.id.aboutNotesCV);
        addNote = findViewById(R.id.addNotesCV);
        listNote = findViewById(R.id.listNotesCV);
        settNotes = findViewById(R.id.settingNotesCV);

        aboutNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GridMenuMyNotes.this,AboutActivity.class));
            }
        });

        listNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GridMenuMyNotes.this,MainActivity.class));
            }
        });

        addNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GridMenuMyNotes.this,AddNoteActivity.class));
            }
        });
    }
}
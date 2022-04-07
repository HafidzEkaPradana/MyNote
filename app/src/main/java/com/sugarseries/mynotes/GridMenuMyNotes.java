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

        aboutNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GridMenuMyNotes.this,AboutActivity.class));
            }
        });
    }
}
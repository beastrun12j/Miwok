package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Find the View that shows the numbers category */

        TextView numbers = findViewById(R.id.numbers);

        /** Set a click listener on for the numbers TextView */

        numbers.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,NumbersActivity.class);
            startActivity(intent);
        });

        /** Find the View that shows the family category */

        TextView family = findViewById(R.id.family);

        /** Set a click listener on for the family TextView */

        family.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,FamilyActivity.class);
            startActivity(intent);
        });

        /** Find the View that shows the numbers category */

        TextView colors = findViewById(R.id.colors);

        /** Set a click listener on for the numbers TextView */

        colors.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,ColorsActivity.class);
            startActivity(intent);
        });

        /** Find the View that shows the numbers category */

        TextView phrases = findViewById(R.id.phrases);

        /** Set a click listener on for the numbers TextView */

        phrases.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,PhrasesActivity.class);
            startActivity(intent);
        });

    }
}

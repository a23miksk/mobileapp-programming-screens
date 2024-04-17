package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String text = extras.getString("carriedText");

            // Do something with the name and number
            TextView textViewText = findViewById(R.id.text);
            textViewText.setText(text);
        }

    }
}
package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activityButton = findViewById(R.id.activityButton);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Button clicked");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                EditText myNewEditText = (EditText) findViewById(R.id.editedText);
                intent.putExtra("carriedText", myNewEditText.getText().toString()); // Optional

                startActivity(intent);
            }
        });
    }
}

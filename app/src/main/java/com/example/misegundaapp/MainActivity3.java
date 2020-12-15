package com.example.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button button3 = findViewById(R.id.menu);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeIntent();
            }
        });
    }
    private void makeIntent(){
        Intent intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);
    }
}
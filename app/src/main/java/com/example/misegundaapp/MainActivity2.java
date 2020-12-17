package com.example.misegundaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.misegundaapp.databinding.ActivityMain2Binding;
import com.example.misegundaapp.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {
private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.continuar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeIntent();
            }
        });
    }
    private void makeIntent(){
        Intent intent2 = new Intent(this, MainActivity3.class);
        startActivity(intent2);
    }

}
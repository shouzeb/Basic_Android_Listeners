package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen3 extends AppCompatActivity implements View.OnClickListener {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        b1=findViewById(R.id.login3);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (R.id.login3) {
            case R.id.login3: {
                Intent i = new Intent(this, screen4.class);
                startActivity(i);
                break;
            }

        }
    }}

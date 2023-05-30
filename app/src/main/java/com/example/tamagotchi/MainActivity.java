package com.example.tamagotchi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);
        Bundle arguments = getIntent().getExtras();
        if(arguments!=null){
            int son = arguments.getInt("progress_son");
            textView11.setText(son);
        }
        setContentView(textView);
    }
    public void OnClick(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
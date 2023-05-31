package com.example.tamagotchi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView11,textView13;
    ProgressBar health,progressBar,progressBar2,progressBar3,progressBar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle arguments = getIntent().getExtras();
        Intent intent = new Intent();
        if(arguments!=null){
            int variableValue = intent.getIntExtra("variableName", 0);
            textView11.setText(variableValue);
        }



    }
    private void postProgress_korm(int progress_korm) {
        String strProgress = String.valueOf(progress_korm) + " %";
        progressBar2.setProgress(progress_korm);

        if (progress_korm == 0) {
            progressBar2.setSecondaryProgress(0);
        } else {
            progressBar2.setSecondaryProgress(progress_korm + 5);
        }
        textView13.setText(strProgress);

    }
    public void OnClick(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
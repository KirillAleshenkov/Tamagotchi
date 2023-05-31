package com.example.tamagotchi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity{
    private int progress_korm = 0;
    private int progress_igra = 0;
    private int progress_son = 0;
    private ProgressBar progressBar5,progressBar6,progressBar7;
    private TextView textView6,textView7,textView8;
    private long startTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //SQLiteDatabase db = DbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("PROGRESS_IGRA",progress_igra);
        values.put("PROGRESS_SON",progress_son);
        values.put("PROGRESS_KORM",progress_korm);
        values.put("TIME",startTime);
        //db.insert("Time", null, values);
        //db.close();

        setContentView(R.layout.activity_main2);

        progressBar5 = findViewById(R.id.progressBar5);
        textView6 = findViewById(R.id.textView6);
        progressBar6 = findViewById(R.id.progressBar6);
        textView7 = findViewById(R.id.textView7);
        progressBar7 = findViewById(R.id.progressBar7);
        textView8 = findViewById(R.id.textView8);
        startTime = System.currentTimeMillis();
        final TextView timerTextView = (TextView) findViewById(R.id.textView10);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                long currentTime = System.currentTimeMillis();
                long elapsedTime = currentTime - startTime;

                int seconds = (int) (elapsedTime / 1000) % 60;
                int minutes = (int) ((elapsedTime / (1000 * 60)) % 60);
                int hours = (int) ((elapsedTime / (1000 * 60 * 60)) % 24);

                String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
                timerTextView.setText(timeString);

                new Handler().postDelayed(this, 1000);
            }
        },1000);

    }


    public void onClick1(View v) {
        progress_korm = progress_korm + 10;
        postProgress_korm(progress_korm);
        if (progress_korm == 100){
           progress_korm -= 10;
        }
    }
    public void onClick2(View v) {
        progress_igra = progress_igra + 10;
        postProgress_igra(progress_igra);
        if (progress_igra == 100){
            progress_igra -= 10;
        }
    }
    public void onClick3(View v) {
        progress_son = progress_son + 10;
        postProgress_son(progress_son);
        if (progress_son == 100){
            progress_son -= 10;
        }
    }

    private void postProgress_korm(int progress_korm) {
        String strProgress = String.valueOf(progress_korm) + " %";
        progressBar5.setProgress(progress_korm);

        if (progress_korm == 0) {
            progressBar5.setSecondaryProgress(0);
        } else {
            progressBar5.setSecondaryProgress(progress_korm + 5);
        }
        textView6.setText(strProgress);

    }
    private void postProgress_igra(int progress_igra) {
        String strProgress = String.valueOf(progress_igra) + " %";
        progressBar6.setProgress(progress_igra);

        if (progress_igra == 0) {
            progressBar6.setSecondaryProgress(0);
        } else {
            progressBar6.setSecondaryProgress(progress_igra + 5);
        }
        textView7.setText(strProgress);
    }
    private void postProgress_son(int progress_son) {
        String strProgress = String.valueOf(progress_son) + " %";
        progressBar7.setProgress(progress_son);

        if (progress_son == 0) {
            progressBar7.setSecondaryProgress(0);
        } else {
            progressBar7.setSecondaryProgress(progress_son + 5);
        }
        textView8.setText(strProgress);
    }
    public void onClick_per(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("variableName", progress_son);
        intent.putExtra("progress_korm",progress_korm);
        intent.putExtra("progress_igra",progress_igra);
        startActivity(intent);

    }

}

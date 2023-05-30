package com.example.tamagotchi;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class DbManager {
    private Context context;
    private DbHelper dbHelper;
    private SQLiteDatabase db;


    public DbManager(Context context) {
        this.context = context;
        dbHelper = new DbHelper(context);
    }
    public void openDb(){
        db = dbHelper.getWritableDatabase();
    }
    public void insertToDb(float time){
        ContentValues cv = new ContentValues();
        cv.put(String.valueOf(DbConst.TIME),time);
        db.insert(DbConst.TABLE_NAME,null,cv);
    }


    public void closeDb(){
        dbHelper.close();
    }

}

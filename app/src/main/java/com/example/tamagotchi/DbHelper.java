package com.example.tamagotchi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.Nullable;

import java.sql.SQLClientInfoException;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context){
        super(context, DbConst.DATABASE_NAME, null, DbConst.DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db){
        db.execSQL(DbConst.CREATE_TABLE);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL(DbConst.DELETE_TABLE);
        onCreate(db);
    }
}

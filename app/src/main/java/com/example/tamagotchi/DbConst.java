package com.example.tamagotchi;

public class DbConst {
    public static final String TABLE_NAME = "Time";
    public static final float TIME = 0;
    public static final int PROGRESS_IGRA = 0;
    public static final int PROGRESS_SON = 0;
    public static final int PROGRESS_KORM = 0;
    public static final String DATABASE_NAME = "Saves.db";
    public static final int DATABASE_VERSION = 1;
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
            TABLE_NAME + " (" + TIME + " INTEGER PRIMARY KEY,"+ PROGRESS_IGRA +"INTEGER PRIMARY KEY," + PROGRESS_SON +"INTEGER PRIMARY KEY," + PROGRESS_KORM +"INTEGER PRIMARY KEY,)";
    public static final String DELETE_TABLE =
            "DROP TABLE IF EXISTS " + TABLE_NAME;
}

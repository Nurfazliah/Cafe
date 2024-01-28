package com.example.kafe;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "personalbiodata.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }
    public void onCreate (SQLiteDatabase db){
        String sql = "create table biodata(no integer primary key, name text null, dob text null, gender text null, address text null);";
        Log.d("Data","onCreate:"+sql);
        db.execSQL(sql);
    }
    public void onUpgrade (SQLiteDatabase arg0, int arg1, int arg2){

    }
}

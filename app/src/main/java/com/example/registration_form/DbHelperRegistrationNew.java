package com.example.registration_form;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

class DbHelperRegistrationNew extends SQLiteOpenHelper {
    public static final String DATABASE_NAME_Re = "database_three";//defining database name
    public static final int DATABASE_VERSION_Re = 3;
    public static final String CREATE_TABLE_Re = "CREATE TABLE  user_registration(firstname  text ,middlename text ,lastname text ,email text, phoneNo text , gender text,student_id text,Entry_year text ,grade text)";

    public DbHelperRegistrationNew(@Nullable Context context) {
        super(context, DATABASE_NAME_Re, null, DATABASE_VERSION_Re);


    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_Re);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}


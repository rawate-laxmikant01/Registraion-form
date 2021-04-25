package com.example.registration_form;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
class DbHelper extends SQLiteOpenHelper {

    //declaring constant variables
    public static final String DATABASE_NAME = "database_one";//defining database name
    public static final int DATABASE_VERSION = 1;
    public static final String CREATE_TABLE = "CREATE TABLE user_login(username  text ,password text)";

    // in create table text is the datatype and username & password is variable
    //default constructor
    //context = this .context is used in separate  classes only
    //name = table name
    //sql query
    //version
    //we need only context here and nothing else
    public DbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean updateData(String user,String pass,String name){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("username",user);
        values.put("password",pass);

        db.update("user_login",values,"username=?",new String[]{String.valueOf(name)});
        return true;

    }

    public boolean deletedata(String name){
        SQLiteDatabase db=this.getWritableDatabase();
        db.delete("user_login","username=?",new String[]{String.valueOf(name)});
        return true;
    }

}

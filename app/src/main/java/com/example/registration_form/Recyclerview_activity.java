package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import java.util.ArrayList;

public class Recyclerview_activity extends AppCompatActivity {

    RecyclerView rv_data;

    ArrayList<Model> modellist;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_activity);

        rv_data=findViewById(R.id.rv_data);

        modellist=new ArrayList<Model>();
        rv_data.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter=new RecyclerViewAdapter(modellist,this);


        DbHelper dbHelper=new DbHelper(this);
        SQLiteDatabase db=dbHelper.getReadableDatabase();

        String[] col={"username","password"};

        Cursor cursor=db.query("user_login",col,"",null,"","","");

        while (cursor.moveToNext()){
            String userName=cursor.getString(cursor.getColumnIndexOrThrow("username"));
            String passWord=cursor.getString(cursor.getColumnIndexOrThrow("password"));

            Model p1=new Model(""+userName,""+passWord);

            modellist.add(p1);


        }

        cursor.close();
        rv_data.setAdapter(recyclerViewAdapter);

    }
}
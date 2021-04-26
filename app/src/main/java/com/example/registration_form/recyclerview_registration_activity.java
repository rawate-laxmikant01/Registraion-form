package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import java.util.ArrayList;

public class recyclerview_registration_activity extends AppCompatActivity {

    RecyclerView rv_data;

    ArrayList<Model_registration>modellist_regi;
    RecyclerViewAdapterRegistration recyclerViewAdapter_regi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview_activity);

        rv_data=findViewById(R.id.rv_data);

        modellist_regi=new ArrayList<Model_registration>();
        rv_data.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter_regi=new RecyclerViewAdapterRegistration(modellist_regi,this);


        DbHelperRegistrationNew dbHelper=new DbHelperRegistrationNew(this);
        SQLiteDatabase db=dbHelper.getReadableDatabase();

        String[] col={"firstname","middlename","lastname","email","phoneNo","gender","student_id","Entry_year","grade"};

        Cursor cursor=db.query("user_registration",col,"",null,"","","");

        while (cursor.moveToNext()){
            String fName=cursor.getString(cursor.getColumnIndexOrThrow("firstname"));
            String mName=cursor.getString(cursor.getColumnIndexOrThrow("middlename"));
            String lName=cursor.getString(cursor.getColumnIndexOrThrow("lastname"));
            String Email=cursor.getString(cursor.getColumnIndexOrThrow("email"));
            String pNo=cursor.getString(cursor.getColumnIndexOrThrow("phoneNo"));
            String genderr=cursor.getString(cursor.getColumnIndexOrThrow("gender"));
            String studentIdd=cursor.getString(cursor.getColumnIndexOrThrow("student_id"));
            String entryYearr=cursor.getString(cursor.getColumnIndexOrThrow("Entry_year"));
            String gradee=cursor.getString(cursor.getColumnIndexOrThrow("grade"));


            Model_registration p2=new Model_registration(""+fName,""+mName,""+lName,""+Email,""+pNo,""+genderr,""+studentIdd,""+entryYearr,""+gradee,"");

            modellist_regi.add(p2);


        }

        cursor.close();
        rv_data.setAdapter(recyclerViewAdapter_regi);

    }
}
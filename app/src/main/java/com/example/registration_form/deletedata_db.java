package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class deletedata_db extends AppCompatActivity {

    DbHelper db;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deletedata_db);

        name=findViewById(R.id.delete_name);
    }

    public void update(View view) {

        String deleteName=name.getText().toString().trim();

        Boolean dele=db.deletedata(deleteName);
        if(dele==true){
            Toast.makeText(this, "Data deleted...", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Unable to delete", Toast.LENGTH_SHORT).show();
        }
    }
}
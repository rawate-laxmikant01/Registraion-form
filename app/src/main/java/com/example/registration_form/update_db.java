package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class update_db extends AppCompatActivity {

    EditText oldname,newname,newpass;
    DbHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_db);

        oldname=findViewById(R.id.oldname);
        newname=findViewById(R.id.newname);
        newpass=findViewById(R.id.newpass);
        db=new DbHelper(this);
    }
    public void update(View view) {
        String oName=oldname.getText().toString().trim();
        String Newname=newname.getText().toString().trim();
        String Npass=newpass.getText().toString().trim();

//        Boolean isupdate=db.updateData("raju","12345","raj");
        Boolean isupdate=db.updateData(Newname,Npass,oName);
        if(isupdate==true){
            Toast.makeText(this, "Data is updated", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Failed to update", Toast.LENGTH_SHORT).show();
        }
    }
}
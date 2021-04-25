package com.example.registration_form;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class Login extends AppCompatActivity {

    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.email_login_id);
        password=findViewById(R.id.password_login_id);

    }

    public void registration_Now(View view) {

        Intent intent =new Intent(Login.this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
//            case R.id.item_1:
//                Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show();
//                break;

            case R.id.logout_id:
                Toast.makeText(this, "Log out....", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void logIn_now(View view) {
        String Username=email.getText().toString().trim();
        String Password=password.getText().toString().trim();

        //object created for Database class DbHelper

        DbHelper dbHelper = new DbHelper(this);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        //content  values is used to put values that we want to put in the table
        ContentValues values = new ContentValues();
        values.put("username", Username);
        values.put("password", Password);

        long rowId = db.insert("user_login", null, values);

        Log.e("Row Id", "**********" + rowId);
        Toast.makeText(this, " Data Inserted Sucessfully\n" + Username + "\n " + Password + "\n " + rowId, Toast.LENGTH_LONG).show();
    }

    public void showData(View view) {

        startActivity(new Intent(Login.this,Recyclerview_activity.class));

      //  Toast.makeText(this, ""+ password, Toast.LENGTH_SHORT).show();
    }

    public void showData_regi(View view) {
        startActivity(new Intent(Login.this,recyclerview_registration_activity.class));
    }

    public void updateData(View view) {

        startActivity(new Intent(Login.this,update_db.class));
    }

    public void deleteData(View view) {
        startActivity(new Intent(Login.this,deletedata_db.class));
    }
}
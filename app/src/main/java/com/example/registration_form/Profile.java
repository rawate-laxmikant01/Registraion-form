package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    TextView firstname,middlwname,lastname,email,phoneno,ethinity,gender,studentid,eyear,grade,semister,D,M,Y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        firstname=findViewById(R.id.firstname_output_id);
        middlwname=findViewById(R.id.middle_name_output_id);
        lastname=findViewById(R.id.lastname_output_id);
        email=findViewById(R.id.email_output_id);
        phoneno=findViewById(R.id.phoneNo_outpput_id);
        ethinity=findViewById(R.id.ethinicity_output_id);
        gender=findViewById(R.id.gender_output_id);
        studentid=findViewById(R.id.Student_output_id);
        eyear=findViewById(R.id.entry_output_id);
        grade=findViewById(R.id.grade_output_id);
        semister=findViewById(R.id.semister_output_id);
        D=findViewById(R.id.D_outPut_id);
        M=findViewById(R.id.MM_output_id);
        Y=findViewById(R.id.YY_output_id);


        Intent intent=getIntent();
        String o_fname=intent.getStringExtra("fN");       //Where o_fname,nmae.....are variable declare to assign the value from last activity to these.
        String o_mName=intent.getStringExtra("mL");
        String o_lName=intent.getStringExtra("lN");
        String o_email=intent.getStringExtra("EM");
        String o_phone=intent.getStringExtra("num");
        String o_ethinity=intent.getStringExtra("Eth");
        String o_gender=intent.getStringExtra("Gen");
        String o_studentid=intent.getStringExtra("StuId");
        String o_eyear=intent.getStringExtra("EY");
        String o_grade=intent.getStringExtra("Grd");
        String o_semister=intent.getStringExtra("Sem");
        String o_d=intent.getStringExtra("Day");
        String o_m=intent.getStringExtra("Mon");
        String o_y=intent.getStringExtra("Ye");


        firstname.setText(o_fname);
        middlwname.setText(o_mName);
        lastname.setText(o_lName);
        email.setText(o_email);
        phoneno.setText(o_phone);
        ethinity.setText(o_ethinity);
        gender.setText(o_gender);
        studentid.setText(o_studentid);
        eyear.setText(o_eyear);
        semister.setText(o_semister);
        grade.setText(o_grade);
        D.setText(o_d);
        M.setText(o_m);
        Y.setText(o_y);

    }
}
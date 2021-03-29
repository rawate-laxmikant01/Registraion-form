package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstName,middleName,lastName,email,phoneNo,ethirinity,studentid,entryyear,grade,day,month,year;
    RadioGroup gender;
    RadioButton radioButton;
    CheckBox term;
    Spinner semister,ethinicity;
    String semisterlist[]={"1","2","3","4","5","6","7","8"};
    String ethnicitylist[]={"Indian","Non-Indian"};

    ArrayAdapter<String> semister_adapter;
    ArrayAdapter<String> ethicity_adapter;

    String semister_store;
    String ethinicity_store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName=findViewById(R.id.first_name_id);
        middleName=findViewById(R.id.middle_name_id);
        lastName=findViewById(R.id.last_name_id);
        email=findViewById(R.id.email_id);
        phoneNo=findViewById(R.id.phone_no_id);
       // ethirinity=findViewById(R.id.ethnicity_id);
        ethinicity=findViewById(R.id.spin_ethnicity);
        gender=findViewById(R.id.gender_id);
        studentid=findViewById(R.id.studentid);
        entryyear=findViewById(R.id.entryid);
        grade=findViewById(R.id.grade_id);
     //   semister=findViewById(R.id.semister_id);
        semister=findViewById(R.id.spin_semister);
        day=findViewById(R.id.day_id);
        month=findViewById(R.id.month_id);
        year=findViewById(R.id.year_id);
        term=findViewById(R.id.tearm_id);


        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {             //code for cheking the radiobutton for gender
                radioButton =gender.findViewById(checkedId);
            }
        });

        //**********************************************************************************************************************************
        //code for ethinicity spinner to list down the ethinicitt
        ethicity_adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,ethnicitylist);
        ethinicity.setAdapter(ethicity_adapter);

        ethinicity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ethinicity_store=ethnicitylist[position];

                //temperory value have been stored in ethinicity_store of list which user have been selected.
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


      //************************************************************************************************************


        //  Code for semister spinner to list down the semister

        semister_adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,semisterlist);
        semister.setAdapter(semister_adapter);

        semister.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+semisterlist[position], Toast.LENGTH_SHORT).show();
                semister_store=semisterlist[position];
                //temperory value store in semister_store which have been selected.
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
//**********************************************************************************************************************
    //method for register Button
    public void Register_now(View view) {




        int selectid =gender.getCheckedRadioButtonId();

        if(selectid==-1){
            Toast.makeText(this, " You have not selected Gender " , Toast.LENGTH_SHORT).show();
        }
        else{

            Toast.makeText(this, "You selected gender "+ radioButton.getText(), Toast.LENGTH_SHORT).show();
        }


        String fName=firstName.getText().toString().trim();
        String mName=middleName.getText().toString().trim();
        String lName=lastName.getText().toString().trim();
        String Email=email.getText().toString().trim();
        String pNo=phoneNo.getText().toString().trim();
    //    String ethiri=ethirinity.getText().toString().trim();
        String ethiri=ethinicity_store;        //tempory ethinicity_store value assign for sending to next activity.
        String gen=radioButton.getText().toString().trim();
        String Sid=studentid.getText().toString().trim();
        String Eyear=entryyear.getText().toString().trim();
        String grd=grade.getText().toString().trim();
        String sem=semister_store;//tempory semister_store value assign for sending to next activity.
        String D=day.getText().toString().trim();
        String M=month.getText().toString().trim();
        String Y=year.getText().toString().trim();



     if(term.isChecked()) {

         Intent intent = new Intent(MainActivity.this, Profile.class);
         intent.putExtra("fN", fName);
         intent.putExtra("mL", mName);
         intent.putExtra("lN", lName);
         intent.putExtra("EM", Email);
         intent.putExtra("num", pNo);
         intent.putExtra("Eth", ethiri);
         intent.putExtra("Gen", gen);
         intent.putExtra("StuId", Sid);
        intent.putExtra("Sem", sem);
         intent.putExtra("EY", Eyear);
         intent.putExtra("Grd", grd);
         intent.putExtra("Day", D);
         intent.putExtra("Mon", M);
         intent.putExtra("Ye", Y);

         startActivity(intent);
     }
     else {
         Toast.makeText(this, "Please agree Tearm and Conditions", Toast.LENGTH_SHORT).show();
     }



    }
}
package com.example.registration_form;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapterRegistration extends RecyclerView.Adapter<RecyclerViewAdapterRegistration.myViewHolderRegistration> {

    ArrayList<Model_registration> list;
    Context context;

    public RecyclerViewAdapterRegistration(ArrayList<Model_registration> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolderRegistration onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_custome_registration,parent,false);
        return new myViewHolderRegistration(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolderRegistration holder, int position) {
        holder.fullname.setText(list.get(position).getFullname());
        holder.midname.setText(list.get(position).getMidname());
        holder.lastname.setText(list.get(position).getLastname());
        holder.email.setText(list.get(position).getEmail());
        holder.phone.setText(list.get(position).getPhone());
        holder.gender.setText(list.get(position).getGender());
        holder.student_id.setText(list.get(position).getStudent_id());
        holder.entryyear.setText(list.get(position).getEntryyear());
        holder.grade.setText(list.get(position).getGrade());
        holder.semister.setText(list.get(position).getSemister());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class myViewHolderRegistration extends RecyclerView.ViewHolder {

        TextView fullname,midname,lastname,email,phone,gender,student_id,entryyear,grade,semister;
        public myViewHolderRegistration(@NonNull View itemView) {
            super(itemView);
            fullname=itemView.findViewById(R.id.reg_cust_fullname);
            midname=itemView.findViewById(R.id.reg_cust_midname);
            lastname=itemView.findViewById(R.id.reg_cust_lastname);
            email=itemView.findViewById(R.id.reg_cust_email);
            phone=itemView.findViewById(R.id.reg_cust_phone);
            gender=itemView.findViewById(R.id.reg_cust_gender);
            student_id=itemView.findViewById(R.id.reg_cust_student_id);
            entryyear=itemView.findViewById(R.id.reg_cust_entry_year);
            grade=itemView.findViewById(R.id.reg_cust_grade);
            semister=itemView.findViewById(R.id.reg_cust_sem);

        }
    }
}

package com.example.registration_form;

public class Model_registration {
    String fullname,midname,lastname,email,phone,gender,student_id,entryyear,grade,semister;

    public Model_registration(String fullname, String midname, String lastname, String email, String phone, String gender, String student_id, String entryyear, String grade, String semister) {
        this.fullname = fullname;
        this.midname = midname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.student_id = student_id;
        this.entryyear = entryyear;
        this.grade = grade;
        this.semister = semister;
    }

    public Model_registration() {
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMidname() {
        return midname;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getEntryyear() {
        return entryyear;
    }

    public void setEntryyear(String entryyear) {
        this.entryyear = entryyear;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSemister() {
        return semister;
    }

    public void setSemister(String semister) {
        this.semister = semister;
    }
}

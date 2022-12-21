package com.example.hospital.classes;

import java.util.ArrayList;
import java.util.List;

public class User {
    String Name,status,number,age,id,gender;
    public List<Doctor> favouriteDoctors = new ArrayList<Doctor>();
    public List<Doctor> bookedDoctors = new ArrayList<Doctor>();

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getage() {
        return age;
    }

    public void setage(String age) {
        this.age = age;
    }
}

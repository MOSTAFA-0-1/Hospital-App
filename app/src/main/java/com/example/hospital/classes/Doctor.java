package com.example.hospital.classes;

import android.view.View;

public class Doctor {
    String firstName;
    String lastName;
    String price;
    String specialty;
    String url;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPrice() {
        return price;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    void Doctor(){}
//    void Doctor(String firstName,String lastName,String price,String specialty,String url){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.price = price;
//        this.specialty = specialty;
//        this.url = url;
//    }
}

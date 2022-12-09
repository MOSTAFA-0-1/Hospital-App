package com.example.hospital.classes;

import android.view.View;

public class Doctor {
    String firstName;
    String lastName;
    String price;
    String specialty;
    String url;
    String availableTime;
    int patientStories;
    double ratePrecent;

    public String getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
    }

    public int getPatientStories() {
        return patientStories;
    }

    public void setPatientStories(int patientStories) {
        this.patientStories = patientStories;
    }

    public double getRatePrecent() {
        return ratePrecent;
    }

    public void setRatePrecent(double ratePrecent) {
        this.ratePrecent = ratePrecent;
    }



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



}

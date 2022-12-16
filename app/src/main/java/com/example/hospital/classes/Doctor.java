package com.example.hospital.classes;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String firstName;
    String lastName;
    String price;
    String specialty;
    String url;
    String availableTime;
    int patientStories;
    double ratePrecent;
    String id;
    List<String> freeTime = new ArrayList<>();
    List<String> worktimes = new ArrayList<>();

    public List<String> getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(List<String> freeTime) {
        this.freeTime = freeTime;
    }

    public List<String> getWorktimes() {
        return worktimes;
    }

    public void setWorktimes(List<String> worktimes) {
        this.worktimes = worktimes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

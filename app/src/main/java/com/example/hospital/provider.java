package com.example.hospital;

import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class provider  extends AppCompatActivity {
      List<Map<String,String>> doctors = new  ArrayList();
      Map<String,String> doctor = new HashMap<>();
      void addDoctor(String firstName,String lastName,String price,String spitialce,String url){
          doctor.put("firstName",firstName);
          doctor.put("lastName",lastName);
          doctor.put("price",price+" $/Hour");
          doctor.put("spitialce",spitialce);
          doctor.put("url",url);
          doctors.add(doctor);
      }


}

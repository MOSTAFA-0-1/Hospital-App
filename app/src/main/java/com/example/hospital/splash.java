package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.firestore.FirebaseFirestore;

import java.security.Provider;
import java.util.ArrayList;
import java.util.List;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        FirebaseFirestore store = FirebaseFirestore.getInstance();
//        provider.addDoctor("Nasr","Shnyar","40","surgery","drawable/dr4.jpg","9",27,80);
//        provider.addDoctor("abdo","ahmed","50","bones","drawable/dr4.jpg","8",23,85);
//        provider.addDoctor("Hidy","Yaser","60","eyes","drawable/dr2.jpg","10",40,83);
//        provider.addDoctor("mohamed","mostafa","30","surgery","drawable/dr3.jpg","11",28,83);
//        provider.addDoctor("mohamed","awes","25","eyes","drawable/dr5.jpg","12",25,90);
//        provider.addDoctor("Asem","Ali","90","surgery","drawable/dr6.jpg","11:30",16,92);
//
//        List data = new ArrayList();
//        data.add("5 PM");
//        data.add("3 PM");
//        data.add("4 PM");
//        provider.addDoctor("Asem","Ali","90",
//                "surgery","drawable/dr6.jpg","11:30"
//                ,16,92,data);
        provider.getData();


        provider.setUserName("Ahmed");
        Thread thread = new Thread(){

            @Override
            public void run(){

                try {
                    sleep(4000);
//                    System.out.println(provider.doctors.get(9).getFreeTime().get(0));
//                    provider.setUserName("nasr");
                    Intent intent =new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        thread.start();
    }
}
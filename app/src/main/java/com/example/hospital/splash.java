package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.firestore.FirebaseFirestore;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        FirebaseFirestore store = FirebaseFirestore.getInstance();
//        provider.addDoctor("Nasr","Shnyar","40","surgery","drawable/dr4.jpg");
//        provider.addDoctor("abdo","ahmed","50","bones","drawable/dr4.jpg");
//        provider.addDoctor("Hidy","Yaser","60","eyes","drawable/dr2.jpg");
//        provider.addDoctor("mohamed","mostafa","30","surgery","drawable/dr3.jpg");
//        provider.addDoctor("mohamed","awes","25","eyes","drawable/dr5.jpg");
//        provider.addDoctor("Asem","Ali","90","surgery","drawable/dr6.jpg");
//        System.out.println(provider.doctors.get(0));
        provider.getData();

        Thread thread = new Thread(){

            @Override
            public void run(){

                try {
                    sleep(2000);
                    Intent intent =new Intent(getApplicationContext(),Tests_Screen.class);
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
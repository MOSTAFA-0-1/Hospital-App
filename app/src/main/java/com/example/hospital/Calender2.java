package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Calender2 extends AppCompatActivity {
    RecyclerView recycle1 ;
    calender_Adaptor adaptor1 ;
    RecyclerView recycle2;
    calendar_Adaptor2 adaptor2;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender2);
        recycle1=findViewById(R.id.cRec1);
        recycle2= findViewById(R.id.cRec2);


        recycle1.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,true));
        recycle1.setAdapter(adaptor1);

        recycle2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,true));
        recycle2.setAdapter(adaptor2);
    }
}
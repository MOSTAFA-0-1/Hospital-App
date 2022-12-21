package com.example.hospital;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.TextView;

public class Calender2 extends AppCompatActivity {
    RecyclerView recycle1 ;
    calender_Adaptor adaptor1 ;
    RecyclerView recycle2;
    CalendarView cv;
    TextView date;
    calendar_Adaptor2 adaptor2;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender2);
        recycle1=findViewById(R.id.cRec1);
        recycle2= findViewById(R.id.cRec2);


        recycle1.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,true));
        adaptor1 = new calender_Adaptor(this);
        recycle1.setAdapter(adaptor1);

        cv = findViewById(R.id.calend);



        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String day = i2+"/"+i1+"/"+i;
                Log.d("date",day);

            }
        });


//        recycle2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL,true));
//        recycle2.setAdapter(adaptor2);
    }
}
package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class doctor_details extends AppCompatActivity {

    TextView doctorName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

       int index = getIntent().getIntExtra("index",0);

        doctorName = findViewById(R.id.doc_name);
        //
        doctorName.setText(provider.doctors.get(index).getFirstName()+""+provider.doctors.get(index).getLastName());

    }
}


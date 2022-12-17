package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class doctor_details extends AppCompatActivity {

    TextView  doctorName;
    TextView doctorSpec;
    TextView doctorPrice;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);
        int index = getIntent().getIntExtra("index" , 0);


        doctorName = findViewById(R.id.doc_name);
        doctorSpec = findViewById(R.id.dDoc_spec);
        doctorPrice = findViewById(R.id.dDoc_price);

        doctorName.setText(provider.doctors.get(index).getFirstName() + " " + provider.doctors.get(index).getLastName());
        doctorSpec.setText((provider.doctors.get(index).getSpecialty()));
        doctorPrice.setText(provider.doctors.get(index).getPrice());




    }
}


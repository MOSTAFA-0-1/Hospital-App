package com.example.hospital;

import static com.example.hospital.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.android.material.textfield.TextInputLayout;

public class Patien_Detailes_2 extends AppCompatActivity {

EditText Name;
//EditText age;
EditText number;
RadioButton male;
RadioButton female;
Button Continue;
TextInputLayout AGE;
boolean isMale = true;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_patien_detailes2);



            Name = findViewById(id.editName22);
            number = findViewById(id.editTextphNumber);
            //age = findViewById(id.editTextAge);
            AGE = (TextInputLayout) findViewById(id.editTextAge1);
            male = findViewById(id.RB_male);
            female = findViewById(id.RB_female);



            male.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    isMale = true;
                }
            });
            female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isMale = false;
            }
        });
            Continue = findViewById(id.debutton);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!Name.getText().toString().isEmpty() && !AGE.getEditText().toString().isEmpty()
                            && !number.getText().toString().isEmpty()
                    )
                    {provider.setUserData(Name.getText().toString(),AGE.getEditText().toString(),isMale,number.getText().toString());}
               provider.intentTo(getApplicationContext(),MainActivity.class);
                }

                });



    }

    @Override
    protected void onStart() {
        super.onStart();
      if(provider.lastUser.getName() != null)
        Name.setText(provider.lastUser.getName());
    }
}
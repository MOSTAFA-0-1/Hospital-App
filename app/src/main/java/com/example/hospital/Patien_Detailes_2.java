package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Patien_Detailes_2 extends AppCompatActivity {

EditText Name;
EditText age;
EditText number;
RadioButton male;
RadioButton female;
Button Continue;
boolean isMale = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patien_detailes2);



            Name = findViewById(R.id.editName22);
            number = findViewById(R.id.editTextphNumber);
            age = findViewById(R.id.editTextAge);

            male = findViewById(R.id.RB_male);
            female = findViewById(R.id.RB_female);

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
            Continue = findViewById(R.id.debutton);
            Continue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!Name.getText().toString().isEmpty() && !age.getText().toString().isEmpty()
                            && !number.getText().toString().isEmpty()
                    )
                    provider.setUserData(Name.getText().toString(),age.getText().toString(),isMale,number.getText().toString());
               provider.intentTo(Patien_Detailes_2.this,MainActivity.class);
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
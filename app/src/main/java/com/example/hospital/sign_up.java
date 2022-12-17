package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sign_up extends AppCompatActivity {
     TextView gotosignin;
     Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        gotosignin = findViewById(R.id.goToSignIn);
        button = findViewById(R.id.sinup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openActivaty(home.class);
            }
        });
        gotosignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivaty(LogIn.class);
            }
        });
    }
    void openActivaty(Class clas){
        Intent intent = new Intent(this, clas);
        startActivity(intent);
    }
}
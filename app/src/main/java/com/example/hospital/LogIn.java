package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class LogIn extends AppCompatActivity {
    TextView textView;
    TextView forget;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        textView = findViewById(R.id.textView4);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),sign_up.class);
                startActivity(intent);
            }
        });
        button = findViewById(R.id.btn_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivaty(home.class);
            }
        });






        forget = findViewById(R.id.forget);
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//            showBottomSheetDialog();
                openActivaty(code.class);
            }
        });

    }
//    private void showBottomSheetDialog() {
//
//        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
//        bottomSheetDialog.setContentView(R.layout.activity_digits);
//        Button Continue = findViewById(R.id.nextSheet);
//        Continue.setText("Continue");
//        bottomSheetDialog.show();
//    }
    void openActivaty(Class clas){
        Intent intent = new Intent(this, clas);
        startActivity(intent);
    }
}
package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class My_Doctor extends AppCompatActivity {
    boolean isFavourite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_doctor);
        ImageView favclick = (ImageView) findViewById(R.id.favorite);
        favclick.setColorFilter(getResources().getColor(R.color.white));
        favclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isFavourite = !isFavourite;
                if(isFavourite)
                    favclick.setColorFilter(getResources().getColor(android.R.color.holo_red_dark));
                else
                    favclick.setColorFilter(getResources().getColor(R.color.white));

            }
        });

    }

}


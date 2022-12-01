package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class popular_doctors extends AppCompatActivity {
    boolean isFavourite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_doctors);
        ImageView favclick= (ImageView) findViewById(R.id.love1);
        favclick.setColorFilter(getResources().getColor(R.color.white));
        favclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isFavourite = !isFavourite;
                if(isFavourite)
                    favclick.setColorFilter(getResources().getColor(R.color.purple_700));
                else
                    favclick.setColorFilter(getResources().getColor(R.color.white));

            }
        });

    }
}

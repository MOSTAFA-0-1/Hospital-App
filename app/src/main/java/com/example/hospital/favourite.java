package com.example.hospital;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.hospital.classes.favourite_Adaptor2;
import com.google.android.material.navigation.NavigationView;

public class favourite extends AppCompatActivity {


    RecyclerView recyclerView;
    favourite_Adaptor2 adapter;
    String [] arr = {"nasr","assem"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);



        int[] images = {R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4};



        recyclerView = findViewById(R.id.rec_favdoc2);
        adapter = new favourite_Adaptor2(this,images);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,true));
        recyclerView.setAdapter(adapter);



    }
}
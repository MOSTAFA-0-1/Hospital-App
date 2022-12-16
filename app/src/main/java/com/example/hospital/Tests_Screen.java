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

import com.example.hospital.classes.RecAdapter;
import com.google.android.material.navigation.NavigationView;

public class Tests_Screen extends AppCompatActivity {


   RecyclerView recyclerView;
   RecAdapter adapter;
    String [] arr = {"nasr","assem"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests_screen);


        System.out.println( provider.doctors.size());
        int[] images = {R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4};

        System.out.println( provider.doctors.get(0).getLastName());

        recyclerView = findViewById(R.id.rec1);
        adapter = new RecAdapter(this,images);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,true));
        recyclerView.setAdapter(adapter);



    }
}
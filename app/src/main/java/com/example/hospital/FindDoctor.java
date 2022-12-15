package com.example.hospital;

import android.os.Bundle;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.view.Window;
import android.view.WindowManager;
import com.example.hospital.classes.FindDoctorAdapter;
import com.example.hospital.classes.RecAdapter;
import com.google.android.material.navigation.NavigationView;

public class FindDoctor extends AppCompatActivity {
    RecyclerView recyclerView1;
    FindDoctorAdapter adapter1;
    String [] arr = {"peter","jack"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);


        recyclerView1 =(RecyclerView) findViewById(R.id.cycler);
        int[] images = {R.drawable.dr1,R.drawable.dr2,R.drawable.dr3,R.drawable.dr4,R.drawable.dr5,R.drawable.dr6,R.drawable.doc8,R.drawable.doc9};
        adapter1 = new FindDoctorAdapter(this,images);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,true));
        recyclerView1.setAdapter(adapter1);
    }
}
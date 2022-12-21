package com.example.hospital.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hospital.FindDoctor;
import com.example.hospital.R;
import com.example.hospital.HomeAdapterForFeature;
import com.example.hospital.HomeAdapterForPopular;
import com.example.hospital.popular_doctors;
import com.google.android.material.navigation.NavigationView;


public class HomeFragment extends Fragment {

    Button go;
    Button go1;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    TextView name;
    ImageView imageView;
    MenuItem item;

    RecyclerView popularDoctorsRecyclerView;
    RecyclerView featuredDoctorsRecyclerView;

    HomeAdapterForPopular adapterForHomeActivityPop;
    HomeAdapterForFeature adapterForHomeActivityFeat;
    String [] arr = {"peter","jack"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        popularDoctorsRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerPopDoctor);
        int[] images = {R.drawable.dr1,R.drawable.dr2,R.drawable.dr3,R.drawable.dr4,R.drawable.dr5,R.drawable.dr6,R.drawable.doc8,R.drawable.doc9};
        adapterForHomeActivityPop = new HomeAdapterForPopular(view.getContext(),images);
        popularDoctorsRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL,true));
        popularDoctorsRecyclerView.setAdapter(adapterForHomeActivityPop);

        featuredDoctorsRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerFeatDoctor);
        adapterForHomeActivityFeat = new HomeAdapterForFeature(view.getContext(),images);
        featuredDoctorsRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL,true));
        featuredDoctorsRecyclerView.setAdapter(adapterForHomeActivityPop);

        go =(Button) view.findViewById(R.id.button7);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), popular_doctors.class);
                startActivity(i);
            }
        });

        go1 =(Button) view.findViewById(R.id.button70);
        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), FindDoctor.class);
                startActivity(i);
            }
        });
        return view;
    }


}
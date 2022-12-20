package com.example.hospital.Fragment;

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
import androidx.recyclerview.widget.RecyclerView;

import com.example.hospital.R;
import com.example.hospital.classes.HomeAdapterForFeature;
import com.example.hospital.classes.HomeAdapterForPopular;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


}
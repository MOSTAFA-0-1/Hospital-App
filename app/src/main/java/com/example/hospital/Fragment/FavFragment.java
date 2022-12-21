package com.example.hospital.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hospital.R;
import com.example.hospital.favourite_Adaptor2;


public class FavFragment extends Fragment {


    RecyclerView recyclerView;
    favourite_Adaptor2 adapter;
    String [] arr = {"nasr","assem"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_fav, container, false);
        int[] images = {R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4};


        recyclerView = (RecyclerView) view.findViewById(R.id.rec_favdoc2);

        adapter = new favourite_Adaptor2(view.getContext(),images);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(),RecyclerView.HORIZONTAL,true));
        recyclerView.setAdapter(adapter);
        return view;
    }
}
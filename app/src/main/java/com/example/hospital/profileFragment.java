package com.example.hospital;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.hospital.R;

public class profileFragment extends Fragment {
    EditText personName;
    EditText phoneNum;
    EditText age;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_profile, container, false);
        personName = view.findViewById(R.id.editTextTextPersonName);
        phoneNum = view.findViewById(R.id.editTextTextphone);
        age = view.findViewById(R.id.editTextTextdata);
        personName.setText(provider.lastUser.getName());
        phoneNum.setText(provider.lastUser.getNumber());
        age.setText(provider.lastUser.getage());




        return view;



    }
}
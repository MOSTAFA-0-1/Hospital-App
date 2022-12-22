package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Medicines_orders extends AppCompatActivity {
    RecyclerView recyclerView ;
    history_adaptor adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicines_orders);
        recyclerView=findViewById(R.id.h_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,true));
        int[] images = {R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4,R.drawable.dr4,R.drawable.dr3,R.drawable.dr4};
        adapter = new history_adaptor(this,images);
        recyclerView.setAdapter(adapter);
    }
}
package com.example.hospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class My_Doctor extends AppCompatActivity {
    boolean isFavourite = false;
    RecyclerView recyclerView;
    My_Doctor_Adapter adapter;
    String [] arr = {"peter","jack"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.my_doctor);
        setContentView(R.layout.activity_my_doctor);
        /*ImageView favclick= (ImageView) findViewById(R.id.favorite1);
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
        });*/

        recyclerView =(RecyclerView) findViewById(R.id.recycler);
        int[] images = {R.drawable.dr1,R.drawable.dr2,R.drawable.dr3,R.drawable.dr4,R.drawable.dr5,R.drawable.dr6,R.drawable.doc8,R.drawable.doc9};
        adapter = new My_Doctor_Adapter(this,images);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,true));
        recyclerView.setAdapter(adapter);

    }


}


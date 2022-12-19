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

public class popular_doctors extends AppCompatActivity {
//    boolean isFavourite = false;
    RecyclerView recyclerView_p2 ;
    popular_Adpter2 adapter;
    RecyclerView recyclerView_p1;
    popular_Adpter1 adapter_p1;
    String [] arr = {"nasr","assem"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_doctors);
        recyclerView_p2=findViewById(R.id.p2_rec);
        int[] images = {R.drawable.dr1,R.drawable.dr2,R.drawable.dr3,R.drawable.dr4,R.drawable.dr1,
                R.drawable.dr2,R.drawable.dr4,R.drawable.dr3};
        adapter = new popular_Adpter2(this,images);
        recyclerView_p2.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,true));
        recyclerView_p2.setAdapter(adapter);
        recyclerView_p1 = findViewById(R.id.p1_rec);
        adapter_p1 = new popular_Adpter1(this,images);
        recyclerView_p1.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,true));
        recyclerView_p1.setAdapter(adapter_p1);










//        ImageView favclick= (ImageView) findViewById(R.id.love11);
//        favclick.setColorFilter(getResources().getColor(R.color.white));
//        favclick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                isFavourite = !isFavourite;
//                if(isFavourite)
//                    favclick.setColorFilter(getResources().getColor(R.color.purple_700));
//                else
//                    favclick.setColorFilter(getResources().getColor(R.color.white));
//
//            }
//        });

    }
}

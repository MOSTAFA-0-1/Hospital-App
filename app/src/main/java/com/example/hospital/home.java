package com.example.hospital;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class home extends AppCompatActivity {
    Button go;
    Button go1;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;
    TextView name;
    ImageView imageView;
    MenuItem item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


//        item = findViewById(R.id.logout);
//        item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem menuItem) {
////                FirebaseAuth.getInstance().signOut();
////                Intent i = new Intent(home.this,sign_up.class);
////                startActivity(i);
//               return true;
//            }
//        });


        go =(Button) findViewById(R.id.button7);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this, popular_doctors.class);
                startActivity(i);
            }
        });
        go1 =(Button) findViewById(R.id.button70);
        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(home.this, FindDoctor.class);
                startActivity(i);
            }
        });
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.Navigation_drawer_open,R.string.Navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

             name = findViewById(R.id.name);
             if (provider.doctors.get(0).getFirstName() !=null)
                 name.setText(provider.doctors.get(4).getFirstName());
             else
                 name.setText("Null");
        int drawableId = this.getResources().getIdentifier("dr4", "drawable", this.getPackageName());
             imageView = findViewById(R.id.imageurl);
             imageView.setImageResource(drawableId);

    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.drawer_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseAuth.getInstance().signOut();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.logout:
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(home.this,sign_up.class);
                startActivity(i);
                return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
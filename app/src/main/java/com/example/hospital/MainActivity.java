package com.example.hospital;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hospital.Fragment.FavFragment;
import com.example.hospital.Fragment.HomeFragment;
import com.example.hospital.profileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
//    private static final String TAG = "";
//    FirebaseFirestore db = FirebaseFirestore.getInstance();
//    ImageView imageView;
//    Boolean isFavourite = false;
//    FirebaseAuth auth = FirebaseAuth.getInstance();
//    String emial = "";
//    String password = "";

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    FavFragment favFragment = new FavFragment();
    com.example.hospital.profileFragment profileFragment = new profileFragment();

TextView gotosignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.nav_button);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;

                    case R.id.navigation_Fav:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,favFragment).commit();
                        return true;

                    case R.id.navigation_notifications:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment).commit();
                        return true;
                }
                return false;
            }
        });
//        gotosignin = findViewById(R.id.goToSignIn);
//        gotosignin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openActivaty(LogIn.class);
//            }
//        });

//        Map<String, Object> user = new HashMap<>();
//        user.put("first", "Ada");
//        user.put("last", "Lovelace");
//        user.put("born", 1815);
//        auth.createUserWithEmailAndPassword(emial,password).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//
//            }
//        });
//        auth.signInWithEmailAndPassword(emial,password);
//
////        db.collection("users")
////                .add(user)
////                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
////
////                    public void onSuccess(DocumentReference documentReference) {
////                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
////                    }
////                })
////                .addOnFailureListener(new OnFailureListener() {
////
////                    public void onFailure(@NonNull Exception e) {
////                        Log.w(TAG, "Error adding document", e);
////                    }
////                });
//
//           imageView = findViewById(R.id.favourite);
//        imageView.setColorFilter(getResources().getColor(R.color.white));
//        imageView.setOnClickListener(new View.OnClickListener() {
//               @Override
//               public void onClick(View view) {
//                   isFavourite = !isFavourite;
//                   if (isFavourite)
//                   imageView.setColorFilter(getResources().getColor(R.color.primary));
//                   else
//                   imageView.setColorFilter(getResources().getColor(R.color.white));
//               }
//           });
    }
    /*void openActivaty(Class clas){
        Intent intent = new Intent(this, clas);
        startActivity(intent);
    }*/
}
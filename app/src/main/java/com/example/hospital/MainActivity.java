package com.example.hospital;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
//    private static final String TAG = "";
//    FirebaseFirestore db = FirebaseFirestore.getInstance();
//    ImageView imageView;
//    Boolean isFavourite = false;
//    FirebaseAuth auth = FirebaseAuth.getInstance();
//    String emial = "";
//    String password = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

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
}
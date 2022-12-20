package com.example.hospital;

import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.hospital.classes.Doctor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.api.core.ApiFuture;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class provider  extends AppCompatActivity {
    static Intent intent;
    static  void intentTo(Context context,Class clas,int index){
        intent = new Intent(context,clas);
        intent.putExtra("index",index);
        context.startActivity(intent);
    }
    static FirebaseFirestore store = FirebaseFirestore.getInstance();

   static    void addDoctor(String firstName,String lastName,String price,String specialty,
                            String url,String availableTime, int patientStories, double ratePrecent,List freetimes){
       Map<String,Object> doctor = new HashMap<>();
          doctor.put("firstName",firstName);
          doctor.put("lastName",lastName);
          doctor.put("price",price+" $/Hour");

          doctor.put("specialty",specialty);
          doctor.put("availableTime",availableTime);
          doctor.put("patientStories",patientStories);
          doctor.put("ratePrecent",ratePrecent);
          doctor.put("url",url);
          doctor.put("freetimes",freetimes);
        store.collection("Doctors").add(doctor);
      }

  static  public List<Doctor> doctors = new ArrayList<Doctor>();


      static     void  getData(){
           store.collection("Doctors").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
               @Override
               public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                   for (QueryDocumentSnapshot  document : queryDocumentSnapshots){
                       Doctor doctor = document.toObject(Doctor.class);
                       doctors.add(doctor);
}
               }
           });
          }

//
}

package com.example.hospital;

import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.hospital.classes.Doctor;
import com.example.hospital.classes.User;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.api.core.ApiFuture;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class provider  extends AppCompatActivity {
   static FirebaseAuth auth = FirebaseAuth.getInstance();
  static     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    static Intent intent;
    static  void intentTo(Context context,Class clas,int index){
        intent = new Intent(context,clas);
        intent.putExtra("index",index);
        context.startActivity(intent);
    }
    static  void intentTo(Context context,Class clas){
        intent = new Intent(context,clas);
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

   static     Date date = new Date();
    static CollectionReference usersRef(){
          return store.collection("users");
    }

   static User lastUser;
    static void setUserName(String name,FireStoreCallBack fire){
        Map<String,Object> userName = new HashMap<>();
        String id2 ;
        userName.put("Name",name);
        String dat = formatter.format(date);
        userName.put("time",dat);
         usersRef().add(userName);
         userName.put("uid",auth.getUid());
        store.collection("users").orderBy("time").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                for (QueryDocumentSnapshot  document : queryDocumentSnapshots){
                    User user = document.toObject(User.class);
                    lastUser = user;
                    if (user.getId() == null){
                    String id = document.getId();
                    userName.put("id",id);
                    usersRef().document(id).update(userName);
                    }
                    fire.callBack(lastUser);
                }
                System.out.println(lastUser.getName());
            }
        });
}
    static void setUserData(String name,String age , boolean isMale , String phonenum,FireStoreubload fire) {
        Map<String, Object> user = new HashMap<>();
        user.put("Name",name);
        user.put("age",age);
        if (isMale)
            user.put("gender","Male");
        else
            user.put("gender","FeMale");
        user.put("number",phonenum);

        usersRef().document(lastUser.getId()).update(user);
        fire.ubloded();

    }
    static void getUserData(FireStoreCallBack fire){
        usersRef().get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                for (QueryDocumentSnapshot  document : queryDocumentSnapshots){
                    User user = document.toObject(User.class);
                    if (user.getId() == auth.getUid()){
                        lastUser = user;
                        fire.callBack(lastUser);
                        break;
                    }

                        }
            }
        });
    }
    interface  FireStoreCallBack{
        void callBack(User user);
    }
    interface  FireStoreubload{
        void ubloded();
    }

}

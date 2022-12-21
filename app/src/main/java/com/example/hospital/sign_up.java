package com.example.hospital;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hospital.classes.User;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import java.util.jar.Attributes;

public class sign_up extends AppCompatActivity {
    TextView gotosignin;
    Button button;
    EditText userName, email, pass;
    FirebaseAuth Auth = FirebaseAuth.getInstance();
    String password;
    String email2;

    LinearLayout google;
    private GoogleSignInClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

//       Auth.getUid();

//        FirebaseAuth.getInstance().signOut();
        gotosignin = findViewById(R.id.goToSignIn);
        button = findViewById(R.id.sinup);

        email = findViewById(R.id.userEmail);
        pass = findViewById(R.id.userPass);
        userName = findViewById(R.id.userName);

        GoogleSignInOptions options = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        client = GoogleSignIn.getClient(this,options);

        google = findViewById(R.id.google);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = client.getSignInIntent();
                startActivityForResult(i,1234);
            }
        });




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                password = pass.getText().toString();
                email2 = email.getText().toString();
                if (email2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "E-mial is Empty", Toast.LENGTH_LONG).show();
                }
                if (password.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Password is Empty", Toast.LENGTH_LONG).show();
                }
                if(email2.isEmpty() == false && password.isEmpty() == false)
                Auth.createUserWithEmailAndPassword(email2, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            System.out.println("success");

                            if (!userName.getText().toString().isEmpty())
                             provider.setUserName(userName.getText().toString(), new provider.FireStoreCallBack() {
                                 @Override
                                 public void callBack(User user) {
                                     System.out.println("successssssssssss");
                                     openActivaty(Patien_Detailes_2.class);
                                 }
                             });
                            else
                                provider.setUserName("",new provider.FireStoreCallBack() {
                                    @Override
                                    public void callBack(User user) {

                                        openActivaty(Patien_Detailes_2.class);
                                    }
                                });


                        }
                        if(task.isCanceled())
                            Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_LONG).show();

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();

                    }
                });

            }

        });






        gotosignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivaty(LogIn.class);
            }
        });
    }
    void openActivaty(Class clas){
        Intent intent = new Intent(this, clas);
        startActivity(intent);
    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1234) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                GoogleSignInAccount account = task.getResult(ApiException.class);

                AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);
                FirebaseAuth.getInstance().signInWithCredential(credential)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Intent intent = new Intent(getApplicationContext(), Patien_Detailes_2.class);
                                    startActivity(intent);

                                } else {
//                                    Toast.makeText(this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }

                            }
                        });

            } catch (ApiException e) {
                e.printStackTrace();
            }

        }
    }
//    protected void onStart() {
//        super.onStart();
//        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//        if(user!= null){
//            Intent intent = new Intent(this,home.class);
//            startActivity(intent);
//        }
//    }
}
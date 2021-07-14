package edu.cnm.deepdive.googlesignindemo.controller;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import edu.cnm.deepdive.googlesignindemo.databinding.ActivityLoginBinding;
import edu.cnm.deepdive.googlesignindemo.service.GoogleSignInService;

public class LoginActivity extends AppCompatActivity {

  private static final int LOGIN_REQUEST_CODE = 1000;

  private GoogleSignInService service;
  private ActivityLoginBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    service = GoogleSignInService.getInstance();
    service.refresh()
        .addOnSuccessListener((account) ->{/*switch to the MainActivity*/} )
        .addOnFailureListener((throwable)-> {
          binding = ActivityLoginBinding.inflate(getLayoutInflater());
          binding.signIn.setOnClickListener((view)->
              service.startSignIn(this, LOGIN_REQUEST_CODE)
              );
        });
    setContentView(binding.getRoot());
  }
}
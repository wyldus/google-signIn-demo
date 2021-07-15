package edu.cnm.deepdive.googlesignindemo.controller;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.Nullable;
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
        .addOnSuccessListener((account) -> switchToMain())
        .addOnFailureListener((throwable) -> {
          binding = ActivityLoginBinding.inflate(getLayoutInflater());
          binding.signIn.setOnClickListener((view) ->
              service.startSignIn(this, LOGIN_REQUEST_CODE));
          setContentView(binding.getRoot());
        });
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

    if (requestCode == LOGIN_REQUEST_CODE) {
      service.completeSignIn(data)
          .addOnSuccessListener((account) -> switchToMain())
          .addOnFailureListener((throwable) ->
                  Toast.makeText(this, "Unable to sign in with the provided credentials.",
                  Toast.LENGTH_LONG).show());
    } else {
      super.onActivityResult(requestCode, resultCode, data);
    }


  }

  private void switchToMain() {
    Intent intent = new Intent(this, MainActivity.class)
        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
    startActivity(intent);
  }
}
package edu.cnm.deepdive.googlesignindemo;

import android.app.Application;
import edu.cnm.deepdive.googlesignindemo.service.GoogleSignInService;

public class SignInApplication extends Application {

  @Override
  //OnCreate is on create of application
  public void onCreate() {
    super.onCreate();
    GoogleSignInService.setContext(this);
  }


}

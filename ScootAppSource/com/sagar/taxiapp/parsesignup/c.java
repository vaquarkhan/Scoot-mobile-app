package com.sagar.taxiapp.parsesignup;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.parse.ParseUser;
import com.sagar.taxiapp.ActivityMainNew;
import com.sagar.taxiapp.NewUserScreen;

public final class c
{
  SharedPreferences a;
  SharedPreferences.Editor b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private Context i;
  private String j;
  
  public c(Context paramContext)
  {
    this.i = paramContext;
  }
  
  public c(String paramString1, String paramString2, Context paramContext)
  {
    this.e = paramString1;
    this.f = paramString2;
    this.i = paramContext;
  }
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, Context paramContext)
  {
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramString5;
    this.h = paramString6;
    this.j = paramString7;
    this.i = paramContext;
  }
  
  public void a()
  {
    ProgressDialog localProgressDialog = new ProgressDialog(this.i);
    localProgressDialog.setMessage("Logging In...");
    localProgressDialog.show();
    ParseUser.logInInBackground(this.e, this.f, new e(this, localProgressDialog));
  }
  
  public void a(Activity paramActivity)
  {
    ProgressDialog localProgressDialog = new ProgressDialog(paramActivity);
    localProgressDialog.setMessage("Signing Up...");
    localProgressDialog.show();
    ParseUser localParseUser = new ParseUser();
    localParseUser.setUsername(this.e);
    localParseUser.setPassword(this.f);
    localParseUser.setEmail(this.e);
    localParseUser.put("firstName", this.c);
    localParseUser.put("lastName", this.d);
    localParseUser.put("phone", this.g);
    localParseUser.put("usertype", this.h);
    localParseUser.put("displayPictureUrl", this.j);
    localParseUser.put("workAddress", "");
    localParseUser.put("workPlaceId", "");
    localParseUser.put("homePlaceId", "");
    localParseUser.put("homeAddress", "");
    localParseUser.put("deviceType", "ANDROID");
    localParseUser.signUpInBackground(new d(this, localProgressDialog, paramActivity));
  }
  
  public void a(String paramString)
  {
    ParseUser.requestPasswordResetInBackground(paramString, new f(this));
  }
  
  public void b()
  {
    if (ParseUser.getCurrentUser() != null)
    {
      localIntent = new Intent(this.i, ActivityMainNew.class);
      this.i.startActivity(localIntent);
      return;
    }
    Intent localIntent = new Intent(this.i, NewUserScreen.class);
    this.i.startActivity(localIntent);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\parsesignup\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
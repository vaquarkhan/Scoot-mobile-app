package com.sagar.taxiapp;

import android.widget.EditText;
import android.widget.Toast;
import com.digits.sdk.android.bs;
import com.digits.sdk.android.cb;
import com.digits.sdk.android.g;
import com.sagar.taxiapp.parsesignup.c;

final class dl
  implements g
{
  dl(SignupPage paramSignupPage) {}
  
  public void a(bs parambs)
  {
    Toast.makeText(this.a, "Oops! Connection Error. Please try again.", 1).show();
  }
  
  public void a(cb paramcb, String paramString)
  {
    SignupPage.a(this.a, SignupPage.b(this.a).getText().toString());
    SignupPage.b(this.a, SignupPage.c(this.a).getText().toString());
    SignupPage.c(this.a, SignupPage.d(this.a).getText().toString());
    SignupPage.d(this.a, SignupPage.e(this.a).getText().toString());
    new c(SignupPage.f(this.a), SignupPage.g(this.a), SignupPage.h(this.a), SignupPage.i(this.a), paramString, "scoot", "NA", this.a).a(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.sagar.taxiapp;

import android.widget.EditText;
import android.widget.Toast;
import com.digits.sdk.android.bs;
import com.digits.sdk.android.cb;
import com.digits.sdk.android.g;
import com.sagar.taxiapp.parsesignup.c;

final class dq
  implements g
{
  dq(SocialAccountSignup paramSocialAccountSignup) {}
  
  public void a(bs parambs)
  {
    Toast.makeText(this.a, "Oops! Connection Error. Please try again.", 1).show();
  }
  
  public void a(cb paramcb, String paramString)
  {
    SocialAccountSignup.a(this.a, SocialAccountSignup.a(this.a).getText().toString());
    SocialAccountSignup.b(this.a, SocialAccountSignup.b(this.a).getText().toString());
    SocialAccountSignup.c(this.a, SocialAccountSignup.c(this.a).getText().toString());
    new c(SocialAccountSignup.d(this.a), SocialAccountSignup.e(this.a), SocialAccountSignup.f(this.a), SocialAccountSignup.g(this.a), paramString, SocialAccountSignup.h(this.a), SocialAccountSignup.i(this.a), this.a).a(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
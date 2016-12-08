package com.sagar.taxiapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

final class bw
  implements View.OnClickListener
{
  bw(LoginPage paramLoginPage) {}
  
  public void onClick(View paramView)
  {
    LoginPage.b(this.a, LoginPage.b(this.a).getText().toString());
    LoginPage.c(this.a, LoginPage.c(this.a).getText().toString());
    if (LoginPage.a(LoginPage.d(this.a)))
    {
      LoginPage.a(this.a, true);
      if (!LoginPage.e(this.a)) {
        break label108;
      }
      LoginPage.a(this.a, LoginPage.d(this.a), LoginPage.f(this.a));
    }
    label108:
    while (LoginPage.e(this.a))
    {
      return;
      LoginPage.a(this.a, false);
      break;
    }
    LoginPage.a(this.a, "Invalid Email Id", LoginPage.b(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
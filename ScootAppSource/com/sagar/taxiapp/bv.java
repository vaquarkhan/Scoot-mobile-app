package com.sagar.taxiapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

final class bv
  implements View.OnClickListener
{
  bv(LoginPage paramLoginPage) {}
  
  public void onClick(View paramView)
  {
    paramView = LoginPage.b(this.a).getText().toString();
    if (LoginPage.a(paramView))
    {
      LoginPage.a(this.a, paramView);
      return;
    }
    LoginPage.a(this.a, "Enter Email Id to reset password", LoginPage.b(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
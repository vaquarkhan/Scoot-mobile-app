package com.sagar.taxiapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class di
  implements View.OnClickListener
{
  di(SignupPage paramSignupPage) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, LoginPage.class);
    this.a.startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\di.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
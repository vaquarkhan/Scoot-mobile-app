package com.sagar.taxiapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.AccessToken;

final class bs
  implements View.OnClickListener
{
  bs(LoginPage paramLoginPage) {}
  
  public void onClick(View paramView)
  {
    LoginPage.a(this.a, AccessToken.a());
    this.a.h();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.sagar.taxiapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class bt
  implements View.OnClickListener
{
  bt(LoginPage paramLoginPage) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, SignupPage.class);
    this.a.startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.sagar.taxiapp;

import android.app.AlertDialog;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.view.View.OnClickListener;

final class cm
  implements View.OnClickListener
{
  cm(ck paramck, AlertDialog paramAlertDialog) {}
  
  public void onClick(View paramView)
  {
    MyAccounts.a(this.b.a, false);
    MyAccounts.f(this.b.a).setChecked(true);
    this.a.dismiss();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
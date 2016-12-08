package com.sagar.taxiapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.SharedPreferences;
import android.support.v7.widget.SwitchCompat;

final class cn
  implements DialogInterface.OnDismissListener
{
  cn(ck paramck) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (MyAccounts.g(this.a.a).getBoolean("loggedIn", false))
    {
      MyAccounts.f(this.a.a).setChecked(true);
      MyAccounts.b(this.a.a, false);
      return;
    }
    MyAccounts.b(this.a.a, true);
    MyAccounts.f(this.a.a).setChecked(false);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.sagar.taxiapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.SharedPreferences;
import android.support.v7.widget.SwitchCompat;

final class co
  implements DialogInterface.OnDismissListener
{
  co(MyAccounts paramMyAccounts) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if (MyAccounts.g(this.a).getBoolean("loggedIn", false))
    {
      MyAccounts.f(this.a).setChecked(true);
      MyAccounts.a(this.a, false);
      MyAccounts.b(this.a, false);
      return;
    }
    MyAccounts.b(this.a, true);
    MyAccounts.f(this.a).setChecked(false);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
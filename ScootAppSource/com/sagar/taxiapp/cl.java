package com.sagar.taxiapp;

import android.app.AlertDialog;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;

final class cl
  implements View.OnClickListener
{
  cl(ck paramck, AlertDialog paramAlertDialog) {}
  
  public void onClick(View paramView)
  {
    MyAccounts.e(this.b.a).clear().apply();
    MyAccounts.a(this.b.a, true);
    this.a.dismiss();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
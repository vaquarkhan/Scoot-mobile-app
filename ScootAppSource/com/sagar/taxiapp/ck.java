package com.sagar.taxiapp;

import android.app.AlertDialog;
import android.support.v4.b.c;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.scootapp.tv.d.g;

final class ck
  implements CompoundButton.OnCheckedChangeListener
{
  ck(MyAccounts paramMyAccounts) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if ((paramBoolean) && (MyAccounts.c(this.a))) {
      this.a.l();
    }
    if ((!paramBoolean) && (!MyAccounts.d(this.a)))
    {
      paramCompoundButton = new g(this.a).a("Are you sure you want to log out?").c("Yes").d("No").c(c.c(this.a, 2131689705)).d(c.c(this.a, 2131689705));
      AlertDialog localAlertDialog = paramCompoundButton.create();
      localAlertDialog.show();
      paramCompoundButton.a(new cl(this, localAlertDialog));
      paramCompoundButton.b(new cm(this, localAlertDialog));
      localAlertDialog.setOnDismissListener(new cn(this));
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
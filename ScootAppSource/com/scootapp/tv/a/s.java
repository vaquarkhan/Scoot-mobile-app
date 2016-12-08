package com.scootapp.tv.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.a.ah;
import com.sagar.taxiapp.ActivityMainNew;

final class s
  implements DialogInterface.OnClickListener
{
  s(q paramq) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    paramDialogInterface = new Intent(this.a.c, ActivityMainNew.class);
    this.a.c.startActivity(paramDialogInterface);
    this.a.c.finish();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
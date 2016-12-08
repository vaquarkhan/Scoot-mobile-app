package com.scootapp.tv.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.a.ah;
import com.sagar.taxiapp.ActivityBookingHistory;

final class e
  implements DialogInterface.OnClickListener
{
  e(d paramd) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    paramDialogInterface = new Intent(this.a.c, ActivityBookingHistory.class);
    if (this.a.b.equalsIgnoreCase("intercity")) {
      paramDialogInterface.putExtra("currentItem", 1);
    }
    for (;;)
    {
      this.a.c.startActivity(paramDialogInterface);
      this.a.c.finish();
      return;
      paramDialogInterface.putExtra("currentItem", 2);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.scootapp.tv.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.a.ah;
import com.sagar.taxiapp.ActivityBookingHistory;

final class n
  implements DialogInterface.OnClickListener
{
  n(m paramm) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.dismiss();
    paramDialogInterface = new Intent(this.a.b, ActivityBookingHistory.class);
    paramDialogInterface.putExtra("currentItem", 1);
    this.a.b.startActivity(paramDialogInterface);
    this.a.b.finish();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
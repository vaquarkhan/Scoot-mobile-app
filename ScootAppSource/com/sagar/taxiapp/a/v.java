package com.sagar.taxiapp.a;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.sagar.taxiapp.beans.b;
import java.util.HashMap;

final class v
  implements View.OnClickListener
{
  v(u paramu, AlertDialog paramAlertDialog) {}
  
  public void onClick(View paramView)
  {
    this.a.dismiss();
    paramView = ProgressDialog.show(s.b(this.b.b), "Please wait . . . ", "Cancelling Booking . . .", false);
    paramView.setCancelable(false);
    if (this.b.a.b.m().equalsIgnoreCase("clear car rental"))
    {
      localHashMap = new HashMap();
      localHashMap.put("tripId", this.b.a.b.c());
      localHashMap.put("mobileNumber", this.b.a.b.h());
      localHashMap.put("UserIPAddress", this.b.a.b.i());
      localHashMap.put("userId", this.b.a.b.j());
      localHashMap.put("cars", this.b.a.b.l());
      this.b.b.d(localHashMap, paramView, this.b.a);
    }
    do
    {
      return;
      if (this.b.a.b.m().equalsIgnoreCase("makson"))
      {
        localHashMap = new HashMap();
        localHashMap.put("tripId", this.b.a.b.c());
        localHashMap.put("totalAmount", this.b.a.b.e());
        this.b.b.e(localHashMap, paramView, this.b.a);
        return;
      }
      if (this.b.a.b.m().equalsIgnoreCase("one way cabs"))
      {
        localHashMap = new HashMap();
        localHashMap.put("tripId", this.b.a.b.c());
        localHashMap.put("totalAmount", this.b.a.b.e());
        this.b.b.a(localHashMap, paramView, this.b.a);
        return;
      }
      if (this.b.a.b.m().equalsIgnoreCase("roder"))
      {
        localHashMap = new HashMap();
        localHashMap.put("tripId", this.b.a.b.c());
        localHashMap.put("totalAmount", this.b.a.b.e());
        this.b.b.c(localHashMap, paramView, this.b.a);
        return;
      }
    } while (!this.b.a.b.m().equalsIgnoreCase("savaari"));
    HashMap localHashMap = new HashMap();
    localHashMap.put("tripId", this.b.a.b.c());
    localHashMap.put("totalAmount", this.b.a.b.e());
    this.b.b.b(localHashMap, paramView, this.b.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.sagar.taxiapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.location.places.a.b;

final class cw
  implements View.OnClickListener
{
  cw(OnDemandSearchAddress paramOnDemandSearchAddress) {}
  
  public void onClick(View paramView)
  {
    if (!this.a.q.getBoolean("homeAdded", false)) {}
    try
    {
      OnDemandSearchAddress.a(this.a, false);
      paramView = new b(2).a(this.a);
      this.a.startActivityForResult(paramView, this.a.m);
      return;
    }
    catch (c paramView)
    {
      return;
    }
    catch (d paramView) {}
    this.a.r.putString("yourLocation", this.a.q.getString("homeAddress", "Enter Your Location")).apply();
    new cy(this.a, this.a.q.getString("homePlaceId", "")).execute(new Void[0]);
    return;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
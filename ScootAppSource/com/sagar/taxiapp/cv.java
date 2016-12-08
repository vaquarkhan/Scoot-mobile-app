package com.sagar.taxiapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.location.places.a.b;

final class cv
  implements View.OnClickListener
{
  cv(OnDemandSearchAddress paramOnDemandSearchAddress) {}
  
  public void onClick(View paramView)
  {
    if (!this.a.q.getBoolean("workAdded", false)) {}
    try
    {
      OnDemandSearchAddress.a(this.a, true);
      paramView = new b(2).a(this.a);
      this.a.startActivityForResult(paramView, this.a.m);
      return;
    }
    catch (c paramView)
    {
      return;
    }
    catch (d paramView) {}
    this.a.r.putString("yourLocation", this.a.q.getString("workAddress", "Enter Your Location")).apply();
    new cy(this.a, this.a.q.getString("workPlaceId", "")).execute(new Void[0]);
    return;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
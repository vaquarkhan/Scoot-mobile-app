package com.sagar.taxiapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.location.places.a.b;

final class ct
  implements View.OnClickListener
{
  ct(OnDemandSearchAddress paramOnDemandSearchAddress) {}
  
  public void onClick(View paramView)
  {
    try
    {
      OnDemandSearchAddress.a(this.a, true);
      paramView = new b(2).a(this.a);
      this.a.startActivityForResult(paramView, this.a.m);
      return;
    }
    catch (c paramView) {}catch (d paramView) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
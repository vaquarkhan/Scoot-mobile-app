package com.sagar.taxiapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import com.google.android.gms.common.api.u;
import com.google.android.gms.location.places.b;
import com.google.android.gms.location.places.d;
import com.google.android.gms.location.places.m;

final class at
  implements AdapterView.OnItemClickListener
{
  at(CarRentalCityPrompt paramCarRentalCityPrompt) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = CarRentalCityPrompt.a(this.a).a(paramInt);
    paramView = paramAdapterView.b();
    paramAdapterView.b(null);
    CarRentalCityPrompt.b(this.a).setHint("");
    CarRentalCityPrompt.b(this.a).setText("");
    m.e.a(this.a.m, new String[] { paramView }).a(CarRentalCityPrompt.c(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
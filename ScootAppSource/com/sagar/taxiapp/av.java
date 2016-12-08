package com.sagar.taxiapp;

import android.app.Activity;
import android.content.Intent;
import android.widget.AutoCompleteTextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.y;
import com.google.android.gms.location.places.e;
import com.google.android.gms.location.places.f;

final class av
  implements y<f>
{
  av(CarRentalCityPrompt paramCarRentalCityPrompt) {}
  
  public void a(f paramf)
  {
    if (!paramf.b().f())
    {
      paramf.a();
      return;
    }
    e locale = paramf.b(0);
    CarRentalCityPrompt.b(this.a).setText(locale.d());
    Intent localIntent = new Intent();
    localIntent.putExtra("cityName", locale.d());
    this.a.a(locale.d().toString());
    if (this.a.getParent() == null) {
      this.a.setResult(-1, localIntent);
    }
    for (;;)
    {
      paramf.a();
      this.a.finish();
      return;
      this.a.getParent().setResult(-1, localIntent);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
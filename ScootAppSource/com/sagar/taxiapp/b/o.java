package com.sagar.taxiapp.b;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.sagar.taxiapp.CarRentalCityPrompt;

final class o
  implements View.OnClickListener
{
  o(h paramh) {}
  
  public void onClick(View paramView)
  {
    h.b(this.a, false);
    paramView = new Intent(this.a.l(), CarRentalCityPrompt.class);
    this.a.startActivityForResult(paramView, 1);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
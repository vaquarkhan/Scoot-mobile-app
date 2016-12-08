package com.sagar.taxiapp.b;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.sagar.taxiapp.CarRentalCityPrompt;

final class n
  implements View.OnClickListener
{
  n(h paramh) {}
  
  public void onClick(View paramView)
  {
    try
    {
      h.b(this.a, true);
      paramView = new Intent(this.a.l(), CarRentalCityPrompt.class);
      this.a.startActivityForResult(paramView, 1);
      return;
    }
    catch (Exception paramView)
    {
      paramView.printStackTrace();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
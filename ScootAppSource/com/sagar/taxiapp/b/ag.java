package com.sagar.taxiapp.b;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.sagar.taxiapp.OnDemandSearchAddress;

final class ag
  implements View.OnClickListener
{
  ag(v paramv) {}
  
  public void onClick(View paramView)
  {
    v.a(this.a, true);
    paramView = new Intent(this.a.l(), OnDemandSearchAddress.class);
    paramView.putExtra("autocompletetext", "Enter Your Destination");
    this.a.startActivityForResult(paramView, 202);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
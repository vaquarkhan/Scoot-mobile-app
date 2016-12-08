package com.sagar.taxiapp.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tushar.taxiapp.scootapp.BookingConfirmation;

final class b
  implements View.OnClickListener
{
  b(a parama) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(a.a(this.a), BookingConfirmation.class);
    a.a(this.a).startActivity(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
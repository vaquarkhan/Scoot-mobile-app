package com.codetroopers.betterpickers.calendardatepicker;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Calendar;

final class c
  implements View.OnClickListener
{
  c(b paramb) {}
  
  public void onClick(View paramView)
  {
    this.a.e_();
    if (b.a(this.a) != null) {
      b.a(this.a).a(this.a, b.b(this.a).get(1), b.b(this.a).get(2), b.b(this.a).get(5));
    }
    this.a.a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\calendardatepicker\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
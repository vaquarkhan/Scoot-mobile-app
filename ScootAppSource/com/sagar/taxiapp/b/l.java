package com.sagar.taxiapp.b;

import android.support.v4.b.c;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.codetroopers.betterpickers.calendardatepicker.b;

final class l
  implements View.OnClickListener
{
  l(h paramh) {}
  
  public void onClick(View paramView)
  {
    if ((h.i(this.a)) && (h.j(this.a).getText().length() != 0))
    {
      h.c(this.a).setTextColor(c.c(this.a.k(), 2131689623));
      h.a(this.a, false);
      paramView = this.a.n();
      b localb = b.a(this.a, h.k(this.a), h.l(this.a) - 1, h.m(this.a));
      localb.a(new com.codetroopers.betterpickers.calendardatepicker.l(h.k(this.a), h.l(this.a) - 1, h.m(this.a)), null);
      localb.b(2131558631);
      localb.a(paramView, "Date Picker");
      return;
    }
    h.a(this.a, "Select Date", h.j(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.sagar.taxiapp.b;

import android.support.v4.b.c;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.codetroopers.betterpickers.calendardatepicker.l;

final class k
  implements View.OnClickListener
{
  k(h paramh) {}
  
  public void onClick(View paramView)
  {
    h.d(this.a).setTextColor(c.c(this.a.k(), 2131689623));
    h.e(this.a).setImageResource(2130837760);
    h.a(this.a, true);
    paramView = this.a.n();
    e.b.a.b localb = e.b.a.b.o_();
    com.codetroopers.betterpickers.calendardatepicker.b localb1 = com.codetroopers.betterpickers.calendardatepicker.b.a(this.a, localb.c(), localb.e() - 1, localb.f());
    if (h.a(this.a).getText().length() != 0) {
      localb1.a(new l(localb.c(), localb.e() - 1, localb.f()), new l(h.f(this.a), h.g(this.a) - 1, h.h(this.a)));
    }
    for (;;)
    {
      localb1.b(2131558631);
      localb1.a(paramView, "Date Picker");
      return;
      localb1.a(new l(localb.c(), localb.e() - 1, localb.f()), null);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
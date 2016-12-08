package com.sagar.taxiapp.b;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.codetroopers.betterpickers.calendardatepicker.l;

final class az
  implements View.OnClickListener
{
  az(av paramav) {}
  
  public void onClick(View paramView)
  {
    av.d(this.a).setTextColor(this.a.m().getColor(2131689623));
    av.e(this.a).setImageResource(2130837760);
    paramView = this.a.n();
    e.b.a.b localb = e.b.a.b.o_();
    com.codetroopers.betterpickers.calendardatepicker.b localb1 = com.codetroopers.betterpickers.calendardatepicker.b.a(this.a, localb.c(), localb.e() - 1, localb.f());
    localb1.a(new l(localb.c(), localb.e() - 1, localb.f()), null);
    localb1.b(2131558631);
    localb1.a(paramView, "Date Picker");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
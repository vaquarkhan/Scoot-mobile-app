package com.sagar.taxiapp.b;

import android.support.v4.b.c;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.sagar.taxiapp.a.q;
import com.sagar.taxiapp.beans.h;
import java.util.ArrayList;
import java.util.Collections;

final class am
  implements View.OnClickListener
{
  am(v paramv) {}
  
  public void onClick(View paramView)
  {
    if (v.e(this.a).size() > 0)
    {
      v.a(this.a, "Price");
      v.ao = true;
      v.aq = true;
      v.l(this.a).setTextColor(c.c(this.a.l(), 2131689696));
      v.m(this.a).setTextColor(c.c(this.a.l(), 2131689696));
      if (v.j(this.a))
      {
        Collections.sort(v.k(this.a), h.n);
        v.f(this.a).a(v.k(this.a));
      }
    }
    else
    {
      return;
    }
    Collections.sort(v.e(this.a), h.n);
    v.f(this.a).a(v.e(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
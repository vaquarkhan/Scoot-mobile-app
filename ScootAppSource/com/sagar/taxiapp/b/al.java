package com.sagar.taxiapp.b;

import android.support.v4.b.c;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.sagar.taxiapp.a.q;
import com.sagar.taxiapp.beans.h;
import java.util.ArrayList;
import java.util.Collections;

final class al
  implements View.OnClickListener
{
  al(v paramv) {}
  
  public void onClick(View paramView)
  {
    if (v.g(this.a).getText().toString().isEmpty())
    {
      v.a(this.a, v.g(this.a));
      v.g(this.a).setFocusable(true);
      v.g(this.a).requestFocus();
    }
    while (v.e(this.a).size() <= 0) {
      return;
    }
    v.a(this.a, "Time");
    v.ao = true;
    v.ap = true;
    v.h(this.a).setTextColor(c.c(this.a.l(), 2131689696));
    v.i(this.a).setTextColor(c.c(this.a.l(), 2131689696));
    if (v.j(this.a))
    {
      Collections.sort(v.k(this.a), h.l);
      v.f(this.a).a(v.k(this.a));
      return;
    }
    Collections.sort(v.e(this.a), h.l);
    v.f(this.a).a(v.e(this.a));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
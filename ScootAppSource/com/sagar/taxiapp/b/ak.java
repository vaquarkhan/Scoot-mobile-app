package com.sagar.taxiapp.b;

import android.content.SharedPreferences;
import android.support.v4.app.aa;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.ce;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.text.Editable;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;
import com.sagar.taxiapp.ApplicationTaxi;
import com.sagar.taxiapp.a.q;
import com.sagar.taxiapp.ab;
import java.util.ArrayList;

final class ak
  implements ce
{
  ak(v paramv) {}
  
  public void l_()
  {
    v.c(this.a).clear();
    if ((v.d(this.a).getText() != null) && (v.d(this.a).getText().length() > 0))
    {
      v.ao = false;
      v.a(this.a, "All");
      if (this.a.l() != null)
      {
        ((ApplicationTaxi)this.a.l().getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("USER INTERACTIONS").c("Refresh Clicked").a());
        v.a(this.a, this.a.ak.getString("sourceLat", ""), this.a.ak.getString("sourceLng", ""));
      }
      return;
    }
    v.a(this.a, v.d(this.a));
    v.d(this.a).setFocusable(true);
    v.d(this.a).requestFocus();
    v.d(this.a).setHint("Enter Your Location");
    this.a.e.setRefreshing(false);
    v.e(this.a).clear();
    v.f(this.a).c();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
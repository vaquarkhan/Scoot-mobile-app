package com.sagar.taxiapp.b;

import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.sagar.taxiapp.a.o;
import com.scootapp.tv.d.d;

final class an
  implements View.OnClickListener
{
  an(v paramv) {}
  
  public void onClick(View paramView)
  {
    v.b(this.a, false);
    if (d.c() > 0)
    {
      if (v.n(this.a))
      {
        v.o(this.a).animate().translationY(v.o(this.a).getHeight() + v.p(this.a).getHeight());
        v.q(this.a).b();
        v.c(this.a, false);
      }
    }
    else {
      return;
    }
    v.o(this.a).setAdapter(v.r(this.a));
    v.c(this.a, true);
    v.r(this.a).a(d.b());
    v.o(this.a).animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator(2.0F)).setStartDelay(0L).start();
    v.q(this.a).a();
    v.d(this.a, true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
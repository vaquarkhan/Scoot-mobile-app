package com.sagar.taxiapp.b;

import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.sagar.taxiapp.a.g;
import com.scootapp.tv.d.e;

final class x
  implements View.OnClickListener
{
  x(v paramv) {}
  
  public void onClick(View paramView)
  {
    v.c(this.a, false);
    if (e.a() > 0)
    {
      if (v.s(this.a))
      {
        v.o(this.a).animate().translationY(v.o(this.a).getHeight() + v.p(this.a).getHeight());
        v.q(this.a).b();
        v.b(this.a, false);
      }
    }
    else {
      return;
    }
    v.o(this.a).setAdapter(v.t(this.a));
    v.b(this.a, true);
    v.t(this.a).a();
    v.o(this.a).animate().translationY(0.0F).setInterpolator(new DecelerateInterpolator(2.0F)).setStartDelay(0L).start();
    v.q(this.a).a();
    v.e(this.a, true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\b\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
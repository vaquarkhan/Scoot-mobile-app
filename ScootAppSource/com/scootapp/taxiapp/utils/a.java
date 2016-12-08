package com.scootapp.taxiapp.utils;

import android.os.Build.VERSION;
import android.view.View;

final class a
  implements Runnable
{
  private int f = this.a;
  private int g = this.b;
  private int h;
  
  a(CustomScrollingViewBehavior paramCustomScrollingViewBehavior, int paramInt1, int paramInt2, View paramView1, View paramView2) {}
  
  public void run()
  {
    int j = 1;
    int i = this.c.getTop();
    int k = this.d.getTop();
    if (i != this.f)
    {
      this.f = i;
      this.h = 0;
    }
    for (i = 1;; i = 0)
    {
      if (k != this.g)
      {
        this.g = k;
        this.h = 0;
        i = j;
      }
      for (;;)
      {
        if (i == 0) {
          this.h += 1;
        }
        if (this.h <= 5)
        {
          this.c.requestLayout();
          if (Build.VERSION.SDK_INT >= 16) {
            this.c.postOnAnimation(this);
          }
          return;
        }
        this.c.requestLayout();
        CustomScrollingViewBehavior.a(this.e, false);
        return;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\taxiapp\utils\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.scootapp.taxiapp.utils;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;

final class e
  implements View.OnClickListener
{
  private e(SlidingTabLayout paramSlidingTabLayout) {}
  
  public void onClick(View paramView)
  {
    int i = 0;
    for (;;)
    {
      if (i < SlidingTabLayout.a(this.a).getChildCount())
      {
        if (paramView == SlidingTabLayout.a(this.a).getChildAt(i)) {
          SlidingTabLayout.c(this.a).setCurrentItem(i);
        }
      }
      else {
        return;
      }
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\taxiapp\utils\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
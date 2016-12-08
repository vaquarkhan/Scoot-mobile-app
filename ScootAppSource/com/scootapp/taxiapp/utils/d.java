package com.scootapp.taxiapp.utils;

import android.support.v4.view.ea;
import android.view.View;

final class d
  implements ea
{
  private int b;
  
  private d(SlidingTabLayout paramSlidingTabLayout) {}
  
  public void a(int paramInt)
  {
    if (this.b == 0)
    {
      SlidingTabLayout.a(this.a).a(paramInt, 0.0F);
      SlidingTabLayout.a(this.a, paramInt, 0);
    }
    int i = 0;
    if (i < SlidingTabLayout.a(this.a).getChildCount())
    {
      View localView = SlidingTabLayout.a(this.a).getChildAt(i);
      if (paramInt == i) {}
      for (boolean bool = true;; bool = false)
      {
        localView.setSelected(bool);
        i += 1;
        break;
      }
    }
    if (SlidingTabLayout.b(this.a) != null) {
      SlidingTabLayout.b(this.a).a(paramInt);
    }
  }
  
  public void a(int paramInt1, float paramFloat, int paramInt2)
  {
    int i = SlidingTabLayout.a(this.a).getChildCount();
    if ((i == 0) || (paramInt1 < 0) || (paramInt1 >= i)) {
      return;
    }
    SlidingTabLayout.a(this.a).a(paramInt1, paramFloat);
    View localView = SlidingTabLayout.a(this.a).getChildAt(paramInt1);
    if (localView != null) {}
    for (i = (int)(localView.getWidth() * paramFloat);; i = 0)
    {
      SlidingTabLayout.a(this.a, paramInt1, i);
      if (SlidingTabLayout.b(this.a) == null) {
        break;
      }
      SlidingTabLayout.b(this.a).a(paramInt1, paramFloat, paramInt2);
      return;
    }
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
    if (SlidingTabLayout.b(this.a) != null) {
      SlidingTabLayout.b(this.a).b(paramInt);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\taxiapp\utils\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
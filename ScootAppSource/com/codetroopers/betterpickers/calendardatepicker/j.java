package com.codetroopers.betterpickers.calendardatepicker;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;

public final class j
  implements Runnable
{
  private int b;
  
  protected j(h paramh) {}
  
  public void a(AbsListView paramAbsListView, int paramInt)
  {
    this.a.f.removeCallbacks(this);
    this.b = paramInt;
    this.a.f.postDelayed(this, 40L);
  }
  
  public void run()
  {
    int j = 1;
    this.a.m = this.b;
    if (Log.isLoggable("MonthFragment", 3)) {
      Log.d("MonthFragment", "new scroll state: " + this.b + " old state: " + this.a.l);
    }
    if ((this.b == 0) && (this.a.l != 0) && (this.a.l != 1))
    {
      this.a.l = this.b;
      Object localObject = this.a.getChildAt(0);
      int i = 0;
      while ((localObject != null) && (((View)localObject).getBottom() <= 0))
      {
        localObject = this.a;
        i += 1;
        localObject = ((h)localObject).getChildAt(i);
      }
      if (localObject == null) {
        return;
      }
      i = this.a.getFirstVisiblePosition();
      int k = this.a.getLastVisiblePosition();
      if ((i != 0) && (k != this.a.getCount() - 1)) {}
      for (i = j;; i = 0)
      {
        j = ((View)localObject).getTop();
        k = ((View)localObject).getBottom();
        int m = this.a.getHeight() / 2;
        if ((i == 0) || (j >= -1)) {
          break;
        }
        if (k <= m) {
          break label246;
        }
        this.a.smoothScrollBy(j, 250);
        return;
      }
      label246:
      this.a.smoothScrollBy(k, 250);
      return;
    }
    this.a.l = this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\calendardatepicker\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
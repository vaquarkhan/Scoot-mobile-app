package com.payu.custombrowser;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;

final class aa
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private final int c = 100;
  private final int d;
  private final Rect e;
  
  aa(a parama, View paramView)
  {
    if (Build.VERSION.SDK_INT >= 21) {}
    for (int i = 48;; i = 0)
    {
      this.d = (i + 100);
      this.e = new Rect();
      return;
    }
  }
  
  public void onGlobalLayout()
  {
    int i = (int)TypedValue.applyDimension(1, this.d, this.a.getResources().getDisplayMetrics());
    this.a.getWindowVisibleDisplayFrame(this.e);
    if (this.a.getRootView().getHeight() - (this.e.bottom - this.e.top) >= i) {}
    for (i = 1;; i = 0)
    {
      if ((i != 0) && (a.s(this.b) == 0))
      {
        ((InputMethodManager)a.e(this.b).getSystemService("input_method")).toggleSoftInput(3, 0);
        a.b(this.b, 1);
      }
      return;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class p
  implements ViewTreeObserver.OnPreDrawListener
{
  p(m paramm, View paramView, r paramr, int paramInt, Object paramObject) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    m.a(this.e, this.b, this.c, this.d);
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
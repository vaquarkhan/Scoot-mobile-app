package android.support.v4.app;

import android.support.v4.g.a;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

final class o
  implements ViewTreeObserver.OnPreDrawListener
{
  o(m paramm, View paramView, Object paramObject, ArrayList paramArrayList, r paramr, boolean paramBoolean, Fragment paramFragment1, Fragment paramFragment2) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null)
    {
      aw.a(this.b, this.c);
      this.c.clear();
      a locala = m.a(this.h, this.d, this.e, this.f);
      aw.a(this.b, this.d.d, locala, this.c);
      m.a(this.h, locala, this.d);
      m.a(this.h, this.d, this.f, this.g, this.e, locala);
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
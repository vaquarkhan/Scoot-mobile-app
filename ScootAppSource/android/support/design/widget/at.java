package android.support.design.widget;

import android.support.v4.view.cb;
import android.support.v4.widget.bp;
import android.view.View;

final class at
  implements Runnable
{
  private final CoordinatorLayout b;
  private final V c;
  
  at(CoordinatorLayout paramCoordinatorLayout, V paramV)
  {
    this.b = paramV;
    View localView;
    this.c = localView;
  }
  
  public void run()
  {
    if ((this.c != null) && (as.a(this.a) != null))
    {
      if (as.a(this.a).g())
      {
        this.a.a_(this.b, this.c, as.a(this.a).c());
        cb.a(this.c, this);
      }
    }
    else {
      return;
    }
    this.a.a(this.b, this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.design.widget;

import android.support.v4.view.cb;
import android.support.v4.widget.cp;
import android.view.View;

final class bw
  implements Runnable
{
  private final View b;
  private final boolean c;
  
  bw(SwipeDismissBehavior paramSwipeDismissBehavior, View paramView, boolean paramBoolean)
  {
    this.b = paramView;
    this.c = paramBoolean;
  }
  
  public void run()
  {
    if ((SwipeDismissBehavior.b(this.a) != null) && (SwipeDismissBehavior.b(this.a).a(true))) {
      cb.a(this.b, this);
    }
    while ((!this.c) || (SwipeDismissBehavior.a(this.a) == null)) {
      return;
    }
    SwipeDismissBehavior.a(this.a).a(this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
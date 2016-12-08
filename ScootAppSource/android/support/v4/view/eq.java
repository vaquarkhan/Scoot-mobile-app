package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

final class eq
  implements Runnable
{
  WeakReference<View> a;
  en b;
  
  private eq(ep paramep, en paramen, View paramView)
  {
    this.a = new WeakReference(paramView);
    this.b = paramen;
  }
  
  public void run()
  {
    View localView = (View)this.a.get();
    if (localView != null) {
      ep.a(this.c, this.b, localView);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\eq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
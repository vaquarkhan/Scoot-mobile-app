package android.support.v7.widget;

import android.view.View;
import android.view.ViewParent;

final class dj
  implements Runnable
{
  private dj(di paramdi) {}
  
  public void run()
  {
    di.a(this.a).getParent().requestDisallowInterceptTouchEvent(true);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
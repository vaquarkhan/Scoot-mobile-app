package android.support.v7.widget;

import android.support.v4.view.cb;
import android.widget.PopupWindow;

final class dp
  implements Runnable
{
  private dp(dd paramdd) {}
  
  public void run()
  {
    if ((dd.a(this.a) != null) && (cb.H(dd.a(this.a))) && (dd.a(this.a).getCount() > dd.a(this.a).getChildCount()) && (dd.a(this.a).getChildCount() <= this.a.b))
    {
      dd.b(this.a).setInputMethodMode(2);
      this.a.c();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
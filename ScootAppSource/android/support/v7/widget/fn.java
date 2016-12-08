package android.support.v7.widget;

import android.view.View;

final class fn
  implements Runnable
{
  fn(fm paramfm, View paramView) {}
  
  public void run()
  {
    int i = this.a.getLeft();
    int j = (this.b.getWidth() - this.a.getWidth()) / 2;
    this.b.smoothScrollTo(i - j, 0);
    this.b.a = null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\fn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
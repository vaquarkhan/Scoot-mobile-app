package android.support.v7.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class bm
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  bm(bk parambk) {}
  
  public void onGlobalLayout()
  {
    if (!bk.a(this.a, this.a.a))
    {
      this.a.i();
      return;
    }
    this.a.b();
    bk.b(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
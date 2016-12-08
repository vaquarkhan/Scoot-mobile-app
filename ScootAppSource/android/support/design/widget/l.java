package android.support.design.widget;

import android.support.v4.view.cb;
import android.support.v4.widget.cp;
import android.view.View;

final class l
  implements Runnable
{
  private final View b;
  private final int c;
  
  l(BottomSheetBehavior paramBottomSheetBehavior, View paramView, int paramInt)
  {
    this.b = paramView;
    this.c = paramInt;
  }
  
  public void run()
  {
    if ((BottomSheetBehavior.j(this.a) != null) && (BottomSheetBehavior.j(this.a).a(true)))
    {
      cb.a(this.b, this);
      return;
    }
    BottomSheetBehavior.b(this.a, this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
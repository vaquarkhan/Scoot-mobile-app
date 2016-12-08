package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

final class dn
  implements AbsListView.OnScrollListener
{
  private dn(dd paramdd) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 1) && (!this.a.l()) && (dd.b(this.a).getContentView() != null))
    {
      dd.d(this.a).removeCallbacks(dd.c(this.a));
      dd.c(this.a).run();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
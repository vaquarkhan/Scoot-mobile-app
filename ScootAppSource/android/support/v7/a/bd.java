package android.support.v7.a;

import android.support.v4.view.cb;
import android.support.v4.view.en;
import android.support.v4.view.ff;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

final class bd
  extends ff
{
  bd(bc parambc) {}
  
  public void b(View paramView)
  {
    this.a.a.n.setVisibility(8);
    if (this.a.a.o != null) {
      this.a.a.o.dismiss();
    }
    for (;;)
    {
      this.a.a.n.removeAllViews();
      this.a.a.q.a(null);
      this.a.a.q = null;
      return;
      if ((this.a.a.n.getParent() instanceof View)) {
        cb.w((View)this.a.a.n.getParent());
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
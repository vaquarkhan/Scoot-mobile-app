package android.support.v7.a;

import android.support.v4.view.cb;
import android.support.v4.view.en;
import android.support.v4.view.ff;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;

final class ba
  extends ff
{
  ba(at paramat) {}
  
  public void a(View paramView)
  {
    this.a.n.setVisibility(0);
    this.a.n.sendAccessibilityEvent(32);
    if (this.a.n.getParent() != null) {
      cb.w((View)this.a.n.getParent());
    }
  }
  
  public void b(View paramView)
  {
    cb.c(this.a.n, 1.0F);
    this.a.q.a(null);
    this.a.q = null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
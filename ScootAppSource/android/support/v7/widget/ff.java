package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a;
import android.support.v4.view.a.l;
import android.view.View;

final class ff
  extends a
{
  ff(fe paramfe) {}
  
  public void a(View paramView, l paraml)
  {
    super.a(paramView, paraml);
    if ((!fe.a(this.a)) && (this.a.a.getLayoutManager() != null)) {
      this.a.a.getLayoutManager().a(paramView, paraml);
    }
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle)) {
      return true;
    }
    if ((!fe.a(this.a)) && (this.a.a.getLayoutManager() != null)) {
      return this.a.a.getLayoutManager().a(paramView, paramInt, paramBundle);
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v7.widget;

import android.support.v4.view.ff;
import android.view.View;

final class gw
  extends ff
{
  private boolean c = false;
  
  gw(gu paramgu, int paramInt) {}
  
  public void a(View paramView)
  {
    gu.a(this.b).setVisibility(0);
  }
  
  public void b(View paramView)
  {
    if (!this.c) {
      gu.a(this.b).setVisibility(this.a);
    }
  }
  
  public void c(View paramView)
  {
    this.c = true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\gw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
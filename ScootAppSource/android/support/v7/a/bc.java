package android.support.v7.a;

import android.support.v4.view.cb;
import android.support.v4.view.en;
import android.support.v7.view.b;
import android.support.v7.view.c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

final class bc
  implements c
{
  private c b;
  
  public bc(at paramat, c paramc)
  {
    this.b = paramc;
  }
  
  public void a(b paramb)
  {
    this.b.a(paramb);
    if (this.a.o != null) {
      this.a.b.getDecorView().removeCallbacks(this.a.p);
    }
    if (this.a.n != null)
    {
      at.c(this.a);
      this.a.q = cb.s(this.a.n).a(0.0F);
      this.a.q.a(new bd(this));
    }
    if (this.a.e != null) {
      this.a.e.b(this.a.m);
    }
    this.a.m = null;
  }
  
  public boolean a(b paramb, Menu paramMenu)
  {
    return this.b.a(paramb, paramMenu);
  }
  
  public boolean a(b paramb, MenuItem paramMenuItem)
  {
    return this.b.a(paramb, paramMenuItem);
  }
  
  public boolean b(b paramb, Menu paramMenu)
  {
    return this.b.b(paramb, paramMenu);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
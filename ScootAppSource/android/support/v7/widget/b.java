package android.support.v7.widget;

import android.support.v4.view.en;
import android.support.v4.view.fe;
import android.view.View;

public final class b
  implements fe
{
  int a;
  private boolean c = false;
  
  protected b(a parama) {}
  
  public b a(en paramen, int paramInt)
  {
    this.b.f = paramen;
    this.a = paramInt;
    return this;
  }
  
  public void a(View paramView)
  {
    a.a(this.b, 0);
    this.c = false;
  }
  
  public void b(View paramView)
  {
    if (this.c) {
      return;
    }
    this.b.f = null;
    a.b(this.b, this.a);
  }
  
  public void c(View paramView)
  {
    this.c = true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
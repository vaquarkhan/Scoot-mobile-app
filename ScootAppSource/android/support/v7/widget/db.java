package android.support.v7.widget;

import android.view.View;
import java.util.List;

final class db
{
  boolean a = true;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h = 0;
  boolean i = false;
  int j;
  List<fd> k = null;
  boolean l;
  
  private View b()
  {
    int n = this.k.size();
    int m = 0;
    if (m < n)
    {
      View localView = ((fd)this.k.get(m)).a;
      ep localep = (ep)localView.getLayoutParams();
      if (localep.c()) {}
      while (this.d != localep.e())
      {
        m += 1;
        break;
      }
      a(localView);
      return localView;
    }
    return null;
  }
  
  View a(eu parameu)
  {
    if (this.k != null) {
      return b();
    }
    parameu = parameu.c(this.d);
    this.d += this.e;
    return parameu;
  }
  
  public void a()
  {
    a(null);
  }
  
  public void a(View paramView)
  {
    paramView = b(paramView);
    if (paramView == null)
    {
      this.d = -1;
      return;
    }
    this.d = ((ep)paramView.getLayoutParams()).e();
  }
  
  boolean a(fa paramfa)
  {
    return (this.d >= 0) && (this.d < paramfa.e());
  }
  
  public View b(View paramView)
  {
    int i2 = this.k.size();
    Object localObject = null;
    int m = Integer.MAX_VALUE;
    int n = 0;
    if (n < i2)
    {
      View localView = ((fd)this.k.get(n)).a;
      ep localep = (ep)localView.getLayoutParams();
      if (localView != paramView) {
        if (!localep.c()) {}
      }
      for (;;)
      {
        n += 1;
        break;
        int i1 = (localep.e() - this.d) * this.e;
        if (i1 >= 0) {
          if (i1 < m)
          {
            if (i1 == 0) {
              return localView;
            }
            localObject = localView;
            m = i1;
          }
        }
      }
    }
    return (View)localObject;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
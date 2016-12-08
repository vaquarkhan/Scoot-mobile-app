package android.support.v7.view;

import android.support.v4.view.fe;
import android.support.v4.view.ff;
import android.view.View;
import java.util.ArrayList;

final class m
  extends ff
{
  private boolean b = false;
  private int c = 0;
  
  m(l paraml) {}
  
  void a()
  {
    this.c = 0;
    this.b = false;
    l.b(this.a);
  }
  
  public void a(View paramView)
  {
    if (this.b) {}
    do
    {
      return;
      this.b = true;
    } while (l.a(this.a) == null);
    l.a(this.a).a(null);
  }
  
  public void b(View paramView)
  {
    int i = this.c + 1;
    this.c = i;
    if (i == l.c(this.a).size())
    {
      if (l.a(this.a) != null) {
        l.a(this.a).b(null);
      }
      a();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\view\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
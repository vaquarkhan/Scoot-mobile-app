package android.support.v7.a;

import android.view.View;
import android.view.View.OnClickListener;

final class g
  implements View.OnClickListener
{
  g(f paramf) {}
  
  public void onClick(View paramView)
  {
    if (f.a(this.a)) {
      f.b(this.a);
    }
    while (f.c(this.a) == null) {
      return;
    }
    f.c(this.a).onClick(paramView);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
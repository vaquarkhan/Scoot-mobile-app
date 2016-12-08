package android.support.v7.a;

import android.support.v4.view.bs;
import android.support.v4.view.cb;
import android.support.v4.view.fh;
import android.view.View;

final class av
  implements bs
{
  av(at paramat) {}
  
  public fh a(View paramView, fh paramfh)
  {
    int i = paramfh.b();
    int j = at.c(this.a, i);
    fh localfh = paramfh;
    if (i != j) {
      localfh = paramfh.a(paramfh.a(), j, paramfh.c(), paramfh.d());
    }
    return cb.a(paramView, localfh);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
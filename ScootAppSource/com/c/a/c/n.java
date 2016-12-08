package com.c.a.c;

import android.app.Activity;
import b.a.a.a.a.g.t;
import b.a.a.a.a.g.w;
import b.a.a.a.f;

final class n
  implements t<Boolean>
{
  n(h paramh) {}
  
  public Boolean a(w paramw)
  {
    boolean bool2 = true;
    Activity localActivity = this.a.F().b();
    boolean bool1 = bool2;
    if (localActivity != null)
    {
      bool1 = bool2;
      if (!localActivity.isFinishing())
      {
        bool1 = bool2;
        if (this.a.x()) {
          bool1 = h.a(this.a, localActivity, paramw.c);
        }
      }
    }
    return Boolean.valueOf(bool1);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
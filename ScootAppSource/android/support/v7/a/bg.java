package android.support.v7.a;

import android.support.v7.view.menu.i;
import android.support.v7.view.menu.y;
import android.view.Window.Callback;

final class bg
  implements y
{
  private bg(at paramat) {}
  
  public void a(i parami, boolean paramBoolean)
  {
    i locali = parami.p();
    if (locali != parami) {}
    for (int i = 1;; i = 0)
    {
      at localat = this.a;
      if (i != 0) {
        parami = locali;
      }
      parami = at.a(localat, parami);
      if (parami != null)
      {
        if (i == 0) {
          break;
        }
        at.a(this.a, parami.a, parami, locali);
        at.a(this.a, parami, true);
      }
      return;
    }
    at.a(this.a, parami, paramBoolean);
  }
  
  public boolean a(i parami)
  {
    if ((parami == null) && (this.a.h))
    {
      Window.Callback localCallback = this.a.q();
      if ((localCallback != null) && (!this.a.p())) {
        localCallback.onMenuOpened(108, parami);
      }
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
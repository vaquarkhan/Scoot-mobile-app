package android.support.v7.a;

import android.support.v7.view.menu.i;
import android.support.v7.view.menu.j;
import android.support.v7.widget.cd;
import android.view.MenuItem;
import android.view.Window.Callback;

final class bo
  implements j
{
  private bo(bk parambk) {}
  
  public void a(i parami)
  {
    if (bk.a(this.a) != null)
    {
      if (!bk.c(this.a).i()) {
        break label41;
      }
      bk.a(this.a).onPanelClosed(108, parami);
    }
    label41:
    while (!bk.a(this.a).onPreparePanel(0, null, parami)) {
      return;
    }
    bk.a(this.a).onMenuOpened(108, parami);
  }
  
  public boolean a(i parami, MenuItem paramMenuItem)
  {
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
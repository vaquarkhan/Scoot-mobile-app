package android.support.v7.a;

import android.support.v7.view.menu.i;
import android.support.v7.view.menu.y;
import android.support.v7.widget.cd;
import android.view.Window.Callback;

final class bn
  implements y
{
  private boolean b;
  
  private bn(bk parambk) {}
  
  public void a(i parami, boolean paramBoolean)
  {
    if (this.b) {
      return;
    }
    this.b = true;
    bk.c(this.a).n();
    if (bk.a(this.a) != null) {
      bk.a(this.a).onPanelClosed(108, parami);
    }
    this.b = false;
  }
  
  public boolean a(i parami)
  {
    if (bk.a(this.a) != null)
    {
      bk.a(this.a).onMenuOpened(108, parami);
      return true;
    }
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
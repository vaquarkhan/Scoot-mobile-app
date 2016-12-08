package android.support.v7.a;

import android.support.v7.view.menu.i;
import android.support.v7.view.menu.y;
import android.view.Window.Callback;

final class bp
  implements y
{
  private bp(bk parambk) {}
  
  public void a(i parami, boolean paramBoolean)
  {
    if (bk.a(this.a) != null) {
      bk.a(this.a).onPanelClosed(0, parami);
    }
  }
  
  public boolean a(i parami)
  {
    if ((parami == null) && (bk.a(this.a) != null)) {
      bk.a(this.a).onMenuOpened(0, parami);
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v7.a;

import android.support.v7.view.n;
import android.support.v7.widget.cd;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;

final class bq
  extends n
{
  public bq(bk parambk, Window.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public View onCreatePanelView(int paramInt)
  {
    switch (paramInt)
    {
    }
    Menu localMenu;
    do
    {
      return super.onCreatePanelView(paramInt);
      localMenu = bk.c(this.a).r();
    } while ((!onPreparePanel(paramInt, null, localMenu)) || (!onMenuOpened(paramInt, localMenu)));
    return bk.a(this.a, localMenu);
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    boolean bool = super.onPreparePanel(paramInt, paramView, paramMenu);
    if ((bool) && (!bk.b(this.a)))
    {
      bk.c(this.a).m();
      bk.a(this.a, true);
    }
    return bool;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
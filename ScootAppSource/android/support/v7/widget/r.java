package android.support.v7.widget;

import android.content.Context;
import android.support.v7.appcompat.R.attr;
import android.support.v7.view.menu.i;
import android.support.v7.view.menu.v;
import android.view.View;

final class r
  extends v
{
  public r(k paramk, Context paramContext, i parami, View paramView, boolean paramBoolean)
  {
    super(paramContext, parami, paramView, paramBoolean, R.attr.actionOverflowMenuStyle);
    a(8388613);
    a(paramk.g);
  }
  
  public void onDismiss()
  {
    super.onDismiss();
    if (k.c(this.c) != null) {
      k.d(this.c).close();
    }
    k.a(this.c, null);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
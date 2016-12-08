package android.support.v7.widget;

import android.support.v7.view.menu.a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;

final class gv
  implements View.OnClickListener
{
  final a a = new a(gu.a(this.b).getContext(), 0, 16908332, 0, 0, gu.b(this.b));
  
  gv(gu paramgu) {}
  
  public void onClick(View paramView)
  {
    if ((gu.c(this.b) != null) && (gu.d(this.b))) {
      gu.c(this.b).onMenuItemSelected(0, this.a);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\gv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v7.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class s
  extends f<MenuItem.OnMenuItemClickListener>
  implements MenuItem.OnMenuItemClickListener
{
  s(o paramo, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    super(paramOnMenuItemClickListener);
  }
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    return ((MenuItem.OnMenuItemClickListener)this.b).onMenuItemClick(this.a.a(paramMenuItem));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\view\menu\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
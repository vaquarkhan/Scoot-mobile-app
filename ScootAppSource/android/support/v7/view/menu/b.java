package android.support.v7.view.menu;

import android.support.v7.widget.dd;
import android.support.v7.widget.di;

final class b
  extends di
{
  public b(ActionMenuItemView paramActionMenuItemView)
  {
    super(paramActionMenuItemView);
  }
  
  public dd a()
  {
    if (ActionMenuItemView.a(this.a) != null) {
      return ActionMenuItemView.a(this.a).a();
    }
    return null;
  }
  
  protected boolean b()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (ActionMenuItemView.b(this.a) != null)
    {
      bool1 = bool2;
      if (ActionMenuItemView.b(this.a).a(ActionMenuItemView.c(this.a)))
      {
        dd localdd = a();
        bool1 = bool2;
        if (localdd != null)
        {
          bool1 = bool2;
          if (localdd.k()) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\view\menu\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
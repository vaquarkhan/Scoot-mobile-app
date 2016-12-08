package android.support.v7.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;

final class o
  implements h
{
  final Toolbar a;
  final Drawable b;
  final CharSequence c;
  
  o(Toolbar paramToolbar)
  {
    this.a = paramToolbar;
    this.b = paramToolbar.getNavigationIcon();
    this.c = paramToolbar.getNavigationContentDescription();
  }
  
  public Drawable a()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0)
    {
      this.a.setNavigationContentDescription(this.c);
      return;
    }
    this.a.setNavigationContentDescription(paramInt);
  }
  
  public void a(Drawable paramDrawable, int paramInt)
  {
    this.a.setNavigationIcon(paramDrawable);
    a(paramInt);
  }
  
  public Context b()
  {
    return this.a.getContext();
  }
  
  public boolean c()
  {
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
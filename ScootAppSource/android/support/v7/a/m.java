package android.support.v7.a;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

final class m
  implements h
{
  final Activity a;
  q b;
  
  private m(Activity paramActivity)
  {
    this.a = paramActivity;
  }
  
  public Drawable a()
  {
    return p.a(this.a);
  }
  
  public void a(int paramInt)
  {
    this.b = p.a(this.b, this.a, paramInt);
  }
  
  public void a(Drawable paramDrawable, int paramInt)
  {
    this.a.getActionBar().setDisplayShowHomeEnabled(true);
    this.b = p.a(this.b, this.a, paramDrawable, paramInt);
    this.a.getActionBar().setDisplayShowHomeEnabled(false);
  }
  
  public Context b()
  {
    ActionBar localActionBar = this.a.getActionBar();
    if (localActionBar != null) {
      return localActionBar.getThemedContext();
    }
    return this.a;
  }
  
  public boolean c()
  {
    ActionBar localActionBar = this.a.getActionBar();
    return (localActionBar != null) && ((localActionBar.getDisplayOptions() & 0x4) != 0);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
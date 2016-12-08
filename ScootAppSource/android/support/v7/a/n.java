package android.support.v7.a;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

final class n
  implements h
{
  final Activity a;
  
  private n(Activity paramActivity)
  {
    this.a = paramActivity;
  }
  
  public Drawable a()
  {
    TypedArray localTypedArray = b().obtainStyledAttributes(null, new int[] { 16843531 }, 16843470, 0);
    Drawable localDrawable = localTypedArray.getDrawable(0);
    localTypedArray.recycle();
    return localDrawable;
  }
  
  public void a(int paramInt)
  {
    ActionBar localActionBar = this.a.getActionBar();
    if (localActionBar != null) {
      localActionBar.setHomeActionContentDescription(paramInt);
    }
  }
  
  public void a(Drawable paramDrawable, int paramInt)
  {
    ActionBar localActionBar = this.a.getActionBar();
    if (localActionBar != null)
    {
      localActionBar.setHomeAsUpIndicator(paramDrawable);
      localActionBar.setHomeActionContentDescription(paramInt);
    }
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


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
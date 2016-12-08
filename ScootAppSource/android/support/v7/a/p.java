package android.support.v7.a;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.Method;

final class p
{
  private static final int[] a = { 16843531 };
  
  public static Drawable a(Activity paramActivity)
  {
    paramActivity = paramActivity.obtainStyledAttributes(a);
    Drawable localDrawable = paramActivity.getDrawable(0);
    paramActivity.recycle();
    return localDrawable;
  }
  
  public static q a(q paramq, Activity paramActivity, int paramInt)
  {
    q localq = paramq;
    if (paramq == null) {
      localq = new q(paramActivity);
    }
    if (localq.a != null) {}
    try
    {
      paramq = paramActivity.getActionBar();
      localq.b.invoke(paramq, new Object[] { Integer.valueOf(paramInt) });
      if (Build.VERSION.SDK_INT <= 19) {
        paramq.setSubtitle(paramq.getSubtitle());
      }
      return localq;
    }
    catch (Exception paramq)
    {
      Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set content description via JB-MR2 API", paramq);
    }
    return localq;
  }
  
  public static q a(q paramq, Activity paramActivity, Drawable paramDrawable, int paramInt)
  {
    paramq = new q(paramActivity);
    if (paramq.a != null) {
      try
      {
        paramActivity = paramActivity.getActionBar();
        paramq.a.invoke(paramActivity, new Object[] { paramDrawable });
        paramq.b.invoke(paramActivity, new Object[] { Integer.valueOf(paramInt) });
        return paramq;
      }
      catch (Exception paramActivity)
      {
        Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator via JB-MR2 API", paramActivity);
        return paramq;
      }
    }
    if (paramq.c != null)
    {
      paramq.c.setImageDrawable(paramDrawable);
      return paramq;
    }
    Log.w("ActionBarDrawerToggleHoneycomb", "Couldn't set home-as-up indicator");
    return paramq;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class db
{
  static final dg a = new dc();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new df();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new de();
      return;
    }
    if (Build.VERSION.SDK_INT >= 8)
    {
      a = new dd();
      return;
    }
  }
  
  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return a.a(paramViewConfiguration);
  }
  
  public static boolean b(ViewConfiguration paramViewConfiguration)
  {
    return a.b(paramViewConfiguration);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
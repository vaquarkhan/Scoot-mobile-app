package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;

public final class g
{
  private static final j a = new i();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new h();
      return;
    }
  }
  
  public static boolean a(AccessibilityManager paramAccessibilityManager)
  {
    return a.a(paramAccessibilityManager);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
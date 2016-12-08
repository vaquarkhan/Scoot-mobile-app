package android.support.v4.widget;

import android.widget.PopupWindow;
import java.lang.reflect.Method;

final class bm
{
  private static Method a;
  private static boolean b;
  
  static void a(PopupWindow paramPopupWindow, int paramInt)
  {
    if (!b) {}
    try
    {
      a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[] { Integer.TYPE });
      a.setAccessible(true);
      b = true;
      if (a != null) {}
      try
      {
        a.invoke(paramPopupWindow, new Object[] { Integer.valueOf(paramInt) });
        return;
      }
      catch (Exception paramPopupWindow) {}
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
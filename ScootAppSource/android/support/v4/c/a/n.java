package android.support.v4.c.a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

final class n
{
  private static Method a;
  private static boolean b;
  private static Method c;
  private static boolean d;
  
  public static int a(Drawable paramDrawable)
  {
    if (!d) {}
    try
    {
      c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
      c.setAccessible(true);
      d = true;
      if (c == null) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          int i = ((Integer)c.invoke(paramDrawable, new Object[0])).intValue();
          return i;
        }
        catch (Exception paramDrawable)
        {
          Log.i("DrawableCompatJellybeanMr1", "Failed to invoke getLayoutDirection() via reflection", paramDrawable);
          c = null;
        }
        localNoSuchMethodException = localNoSuchMethodException;
        Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve getLayoutDirection() method", localNoSuchMethodException);
      }
    }
    return -1;
  }
  
  public static void a(Drawable paramDrawable, int paramInt)
  {
    if (!b) {}
    try
    {
      a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[] { Integer.TYPE });
      a.setAccessible(true);
      b = true;
      if (a == null) {}
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          a.invoke(paramDrawable, new Object[] { Integer.valueOf(paramInt) });
          return;
        }
        catch (Exception paramDrawable)
        {
          Log.i("DrawableCompatJellybeanMr1", "Failed to invoke setLayoutDirection(int) via reflection", paramDrawable);
          a = null;
        }
        localNoSuchMethodException = localNoSuchMethodException;
        Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve setLayoutDirection(int) method", localNoSuchMethodException);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\c\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
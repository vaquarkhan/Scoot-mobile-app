package android.support.v4.app;

import android.content.Context;
import android.os.Build.VERSION;

public final class h
{
  private static final k a = new k(null);
  
  static
  {
    if (Build.VERSION.SDK_INT >= 23)
    {
      a = new j(null);
      return;
    }
  }
  
  public static int a(Context paramContext, String paramString1, String paramString2)
  {
    return a.a(paramContext, paramString1, paramString2);
  }
  
  public static String a(String paramString)
  {
    return a.a(paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
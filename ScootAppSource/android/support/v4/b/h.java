package android.support.v4.b;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build.VERSION;

public final class h
{
  private static final i a = new j();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 15)
    {
      a = new l();
      return;
    }
    if (i >= 11)
    {
      a = new k();
      return;
    }
  }
  
  public static Intent a(ComponentName paramComponentName)
  {
    return a.a(paramComponentName);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
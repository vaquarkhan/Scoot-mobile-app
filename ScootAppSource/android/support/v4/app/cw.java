package android.support.v4.app;

import android.os.Build.VERSION;
import android.os.Bundle;

public final class cw
  extends de
{
  public static final df a;
  private static final cy g;
  private final String b;
  private final CharSequence c;
  private final CharSequence[] d;
  private final boolean e;
  private final Bundle f;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 20) {
      g = new cz();
    }
    for (;;)
    {
      a = new cx();
      return;
      if (Build.VERSION.SDK_INT >= 16) {
        g = new db();
      } else {
        g = new da();
      }
    }
  }
  
  public String a()
  {
    return this.b;
  }
  
  public CharSequence b()
  {
    return this.c;
  }
  
  public CharSequence[] c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return this.e;
  }
  
  public Bundle e()
  {
    return this.f;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
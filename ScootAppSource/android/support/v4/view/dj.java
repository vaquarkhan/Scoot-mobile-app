package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class dj
{
  static final dm a = new dp();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new do();
      return;
    }
    if (i >= 18)
    {
      a = new dn();
      return;
    }
    if (i >= 14)
    {
      a = new dl();
      return;
    }
    if (i >= 11)
    {
      a = new dk();
      return;
    }
  }
  
  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, paramBoolean);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
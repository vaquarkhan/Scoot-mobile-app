package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class ah
{
  static final ai a = new aj();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new al();
      return;
    }
    if (i >= 11)
    {
      a = new ak();
      return;
    }
  }
  
  public static ar a(LayoutInflater paramLayoutInflater)
  {
    return a.a(paramLayoutInflater);
  }
  
  public static void a(LayoutInflater paramLayoutInflater, ar paramar)
  {
    a.a(paramLayoutInflater, paramar);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
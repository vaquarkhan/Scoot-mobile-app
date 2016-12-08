package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class bw
{
  static final bz a = new bx();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      a = new by();
      return;
    }
  }
  
  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.a(paramVelocityTracker, paramInt);
  }
  
  public static float b(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return a.b(paramVelocityTracker, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package android.support.v4.view;

import android.view.KeyEvent;

final class ag
{
  public static int a(int paramInt)
  {
    return KeyEvent.normalizeMetaState(paramInt);
  }
  
  public static boolean a(int paramInt1, int paramInt2)
  {
    return KeyEvent.metaStateHasModifiers(paramInt1, paramInt2);
  }
  
  public static boolean b(int paramInt)
  {
    return KeyEvent.metaStateHasNoModifiers(paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
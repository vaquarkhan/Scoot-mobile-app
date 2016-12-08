package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.List;

public class ae
{
  private static final af a = new ak();
  private final Object b;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new ai();
      return;
    }
    if (Build.VERSION.SDK_INT >= 16)
    {
      a = new ag();
      return;
    }
  }
  
  public ae()
  {
    this.b = a.a(this);
  }
  
  public ae(Object paramObject)
  {
    this.b = paramObject;
  }
  
  public l a(int paramInt)
  {
    return null;
  }
  
  public Object a()
  {
    return this.b;
  }
  
  public List<l> a(String paramString, int paramInt)
  {
    return null;
  }
  
  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return false;
  }
  
  public l b(int paramInt)
  {
    return null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\view\a\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
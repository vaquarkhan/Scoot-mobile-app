package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;

public abstract class n<TListener>
{
  private TListener a;
  private boolean b;
  
  public n(TListener paramTListener)
  {
    Object localObject;
    this.a = localObject;
    this.b = false;
  }
  
  protected abstract void a(TListener paramTListener);
  
  protected abstract void b();
  
  public void c()
  {
    for (;;)
    {
      try
      {
        Object localObject1 = this.a;
        if (this.b)
        {
          String str = String.valueOf(this);
          Log.w("GmsClient", String.valueOf(str).length() + 47 + "Callback proxy " + str + " being reused. This is not safe.");
        }
        if (localObject1 != null) {}
        b();
      }
      finally
      {
        try
        {
          a(localObject1);
        }
        catch (RuntimeException localRuntimeException)
        {
          b();
          throw localRuntimeException;
        }
        try
        {
          this.b = true;
          d();
          return;
        }
        finally {}
        localObject2 = finally;
      }
    }
  }
  
  public void d()
  {
    e();
    synchronized (i.d(this.d))
    {
      i.d(this.d).remove(this);
      return;
    }
  }
  
  public void e()
  {
    try
    {
      this.a = null;
      return;
    }
    finally {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
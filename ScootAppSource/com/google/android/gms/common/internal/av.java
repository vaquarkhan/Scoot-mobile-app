package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;

public abstract class av
{
  private static final Object a = new Object();
  private static av b;
  
  public static av a(Context paramContext)
  {
    synchronized (a)
    {
      if (b == null) {
        b = new aw(paramContext.getApplicationContext());
      }
      return b;
    }
  }
  
  public abstract boolean a(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3);
  
  public abstract void b(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
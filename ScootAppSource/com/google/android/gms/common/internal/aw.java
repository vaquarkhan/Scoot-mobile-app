package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.HashMap;

final class aw
  extends av
  implements Handler.Callback
{
  private final HashMap<ax, ay> a = new HashMap();
  private final Context b;
  private final Handler c;
  private final com.google.android.gms.common.stats.b d;
  private final long e;
  
  aw(Context paramContext)
  {
    this.b = paramContext.getApplicationContext();
    this.c = new Handler(paramContext.getMainLooper(), this);
    this.d = com.google.android.gms.common.stats.b.a();
    this.e = 5000L;
  }
  
  private boolean a(ax paramax, ServiceConnection paramServiceConnection, String paramString)
  {
    b.a(paramServiceConnection, "ServiceConnection must not be null");
    for (;;)
    {
      ay localay;
      synchronized (this.a)
      {
        localay = (ay)this.a.get(paramax);
        if (localay == null)
        {
          localay = new ay(this, paramax);
          localay.a(paramServiceConnection, paramString);
          localay.a(paramString);
          this.a.put(paramax, localay);
          paramax = localay;
          boolean bool = paramax.a();
          return bool;
        }
        this.c.removeMessages(0, localay);
        if (localay.a(paramServiceConnection))
        {
          paramax = String.valueOf(paramax);
          throw new IllegalStateException(String.valueOf(paramax).length() + 81 + "Trying to bind a GmsServiceConnection that was already connected before.  config=" + paramax);
        }
      }
      localay.a(paramServiceConnection, paramString);
      switch (localay.b())
      {
      case 1: 
        paramServiceConnection.onServiceConnected(localay.e(), localay.d());
        paramax = localay;
        break;
      case 2: 
        localay.a(paramString);
        paramax = localay;
        break;
      default: 
        paramax = localay;
      }
    }
  }
  
  private void b(ax paramax, ServiceConnection paramServiceConnection, String paramString)
  {
    b.a(paramServiceConnection, "ServiceConnection must not be null");
    ay localay;
    synchronized (this.a)
    {
      localay = (ay)this.a.get(paramax);
      if (localay == null)
      {
        paramax = String.valueOf(paramax);
        throw new IllegalStateException(String.valueOf(paramax).length() + 50 + "Nonexistent connection status for service config: " + paramax);
      }
    }
    if (!localay.a(paramServiceConnection))
    {
      paramax = String.valueOf(paramax);
      throw new IllegalStateException(String.valueOf(paramax).length() + 76 + "Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + paramax);
    }
    localay.b(paramServiceConnection, paramString);
    if (localay.c())
    {
      paramax = this.c.obtainMessage(0, localay);
      this.c.sendMessageDelayed(paramax, this.e);
    }
  }
  
  public boolean a(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3)
  {
    return a(new ax(paramString1, paramString2), paramServiceConnection, paramString3);
  }
  
  public void b(String paramString1, String paramString2, ServiceConnection paramServiceConnection, String paramString3)
  {
    b(new ax(paramString1, paramString2), paramServiceConnection, paramString3);
  }
  
  public boolean handleMessage(Message arg1)
  {
    switch (???.what)
    {
    default: 
      return false;
    }
    ay localay = (ay)???.obj;
    synchronized (this.a)
    {
      if (localay.c())
      {
        if (localay.a()) {
          localay.b("GmsClientSupervisor");
        }
        this.a.remove(ay.a(localay));
      }
      return true;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
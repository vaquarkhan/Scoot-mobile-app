package com.facebook.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

public abstract class an
  implements ServiceConnection
{
  private final Context a;
  private final Handler b;
  private ap c;
  private boolean d;
  private Messenger e;
  private int f;
  private int g;
  private final String h;
  private final int i;
  
  public an(Context paramContext, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {
      paramContext = localContext;
    }
    this.a = paramContext;
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramString;
    this.i = paramInt3;
    this.b = new ao(this);
  }
  
  private void b(Bundle paramBundle)
  {
    if (!this.d) {}
    ap localap;
    do
    {
      return;
      this.d = false;
      localap = this.c;
    } while (localap == null);
    localap.a(paramBundle);
  }
  
  private void c()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
    a(localBundle);
    Message localMessage = Message.obtain(null, this.f);
    localMessage.arg1 = this.i;
    localMessage.setData(localBundle);
    localMessage.replyTo = new Messenger(this.b);
    try
    {
      this.e.send(localMessage);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      b(null);
    }
  }
  
  protected abstract void a(Bundle paramBundle);
  
  protected void a(Message paramMessage)
  {
    if (paramMessage.what == this.g)
    {
      paramMessage = paramMessage.getData();
      if (paramMessage.getString("com.facebook.platform.status.ERROR_TYPE") == null) {
        break label39;
      }
      b(null);
    }
    for (;;)
    {
      this.a.unbindService(this);
      return;
      label39:
      b(paramMessage);
    }
  }
  
  public void a(ap paramap)
  {
    this.c = paramap;
  }
  
  public boolean a()
  {
    if (this.d) {}
    Intent localIntent;
    do
    {
      do
      {
        return false;
      } while (ah.b(this.i) == -1);
      localIntent = ah.a(this.a);
    } while (localIntent == null);
    this.d = true;
    this.a.bindService(localIntent, this, 1);
    return true;
  }
  
  public void b()
  {
    this.d = false;
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.e = new Messenger(paramIBinder);
    c();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    this.e = null;
    try
    {
      this.a.unbindService(this);
      b(null);
      return;
    }
    catch (IllegalArgumentException paramComponentName)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
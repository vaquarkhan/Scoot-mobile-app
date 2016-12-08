package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class p
  extends bi
{
  private i a;
  private final int b;
  
  public p(i parami, int paramInt)
  {
    this.a = parami;
    this.b = paramInt;
  }
  
  private void a()
  {
    this.a = null;
  }
  
  public void a(int paramInt, Bundle paramBundle)
  {
    Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
  }
  
  public void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    b.a(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
    this.a.a(paramInt, paramIBinder, paramBundle, this.b);
    a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
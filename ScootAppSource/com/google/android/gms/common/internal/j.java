package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class j
  extends n<Boolean>
{
  public final int a;
  public final Bundle b;
  
  protected j(i parami, int paramInt, Bundle paramBundle)
  {
    super(parami, Boolean.valueOf(true));
    this.a = paramInt;
    this.b = paramBundle;
  }
  
  protected abstract void a(ConnectionResult paramConnectionResult);
  
  protected void a(Boolean paramBoolean)
  {
    Object localObject = null;
    if (paramBoolean == null) {
      i.a(this.c, 1, null);
    }
    do
    {
      return;
      switch (this.a)
      {
      default: 
        i.a(this.c, 1, null);
        paramBoolean = (Boolean)localObject;
        if (this.b != null) {
          paramBoolean = (PendingIntent)this.b.getParcelable("pendingIntent");
        }
        a(new ConnectionResult(this.a, paramBoolean));
        return;
      }
    } while (a());
    i.a(this.c, 1, null);
    a(new ConnectionResult(8, null));
    return;
    i.a(this.c, 1, null);
    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
  }
  
  protected abstract boolean a();
  
  protected void b() {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
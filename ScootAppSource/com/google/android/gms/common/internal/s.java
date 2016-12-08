package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class s
  extends j
{
  public final IBinder e;
  
  public s(i parami, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(parami, paramInt, paramBundle);
    this.e = paramIBinder;
  }
  
  protected void a(ConnectionResult paramConnectionResult)
  {
    if (i.e(this.f) != null) {
      i.e(this.f).a(paramConnectionResult);
    }
    this.f.a(paramConnectionResult);
  }
  
  protected boolean a()
  {
    do
    {
      try
      {
        String str1 = this.e.getInterfaceDescriptor();
        if (!this.f.b().equals(str1))
        {
          String str2 = String.valueOf(this.f.b());
          Log.e("GmsClient", String.valueOf(str2).length() + 34 + String.valueOf(str1).length() + "service descriptor mismatch: " + str2 + " vs. " + str1);
          return false;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Log.w("GmsClient", "service probably died");
        return false;
      }
      localObject = this.f.b(this.e);
    } while ((localObject == null) || (!i.a(this.f, 2, 3, (IInterface)localObject)));
    Object localObject = this.f.s();
    if (i.c(this.f) != null) {
      i.c(this.f).a((Bundle)localObject);
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
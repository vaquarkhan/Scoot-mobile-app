package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.r;

public final class a
  extends bc
{
  int a;
  
  public static Account a(bb parambb)
  {
    Account localAccount = null;
    long l;
    if (parambb != null) {
      l = Binder.clearCallingIdentity();
    }
    try
    {
      localAccount = parambb.a();
      return localAccount;
    }
    catch (RemoteException parambb)
    {
      Log.w("AccountAccessor", "Remote account accessor probably died");
      return null;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
  
  public Account a()
  {
    int i = Binder.getCallingUid();
    if (i == this.a) {
      return null;
    }
    if (r.zze(null, i))
    {
      this.a = i;
      return null;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    throw new NullPointerException();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
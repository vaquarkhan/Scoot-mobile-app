package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.maps.model.a.p;

public final class e
{
  private final p a;
  
  public e(p paramp)
  {
    this.a = ((p)b.a(paramp));
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof e)) {
      return false;
    }
    try
    {
      boolean bool = this.a.a(((e)paramObject).a);
      return bool;
    }
    catch (RemoteException paramObject)
    {
      throw new g((RemoteException)paramObject);
    }
  }
  
  public int hashCode()
  {
    try
    {
      int i = this.a.k();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      throw new g(localRemoteException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
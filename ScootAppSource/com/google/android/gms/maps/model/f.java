package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.maps.model.a.a;

public final class f
{
  private final a a;
  
  public f(a parama)
  {
    this.a = ((a)b.a(parama));
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof f)) {
      return false;
    }
    try
    {
      boolean bool = this.a.a(((f)paramObject).a);
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
      int i = this.a.i();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
      throw new g(localRemoteException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
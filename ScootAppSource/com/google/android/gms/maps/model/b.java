package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.maps.model.a.d;

public final class b
{
  private static d a;
  
  private static d a()
  {
    return (d)com.google.android.gms.common.internal.b.a(a, "IBitmapDescriptorFactory is not initialized");
  }
  
  public static a a(int paramInt)
  {
    try
    {
      a locala = new a(a().a(paramInt));
      return locala;
    }
    catch (RemoteException localRemoteException)
    {
      throw new g(localRemoteException);
    }
  }
  
  public static void a(d paramd)
  {
    if (a != null) {
      return;
    }
    a = (d)com.google.android.gms.common.internal.b.a(paramd);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
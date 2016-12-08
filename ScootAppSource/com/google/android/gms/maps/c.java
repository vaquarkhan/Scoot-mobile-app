package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.maps.a.d;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.e;
import com.google.android.gms.maps.model.f;
import com.google.android.gms.maps.model.g;

public final class c
{
  private final d a;
  
  protected c(d paramd)
  {
    this.a = ((d)b.a(paramd));
  }
  
  public final e a(MarkerOptions paramMarkerOptions)
  {
    try
    {
      paramMarkerOptions = this.a.a(paramMarkerOptions);
      if (paramMarkerOptions != null)
      {
        paramMarkerOptions = new e(paramMarkerOptions);
        return paramMarkerOptions;
      }
      return null;
    }
    catch (RemoteException paramMarkerOptions)
    {
      throw new g(paramMarkerOptions);
    }
  }
  
  public final f a(PolylineOptions paramPolylineOptions)
  {
    try
    {
      paramPolylineOptions = new f(this.a.a(paramPolylineOptions));
      return paramPolylineOptions;
    }
    catch (RemoteException paramPolylineOptions)
    {
      throw new g(paramPolylineOptions);
    }
  }
  
  public final void a()
  {
    try
    {
      this.a.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new g(localRemoteException);
    }
  }
  
  public final void a(a parama)
  {
    try
    {
      this.a.b(parama.a());
      return;
    }
    catch (RemoteException parama)
    {
      throw new g(parama);
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    try
    {
      this.a.c(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new g(localRemoteException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
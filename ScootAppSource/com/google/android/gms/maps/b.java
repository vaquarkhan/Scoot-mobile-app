package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.g;

public final class b
{
  private static com.google.android.gms.maps.a.a a;
  
  private static com.google.android.gms.maps.a.a a()
  {
    return (com.google.android.gms.maps.a.a)com.google.android.gms.common.internal.b.a(a, "CameraUpdateFactory is not initialized");
  }
  
  public static a a(LatLng paramLatLng)
  {
    try
    {
      paramLatLng = new a(a().a(paramLatLng));
      return paramLatLng;
    }
    catch (RemoteException paramLatLng)
    {
      throw new g(paramLatLng);
    }
  }
  
  public static a a(LatLngBounds paramLatLngBounds, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      paramLatLngBounds = new a(a().a(paramLatLngBounds, paramInt1, paramInt2, paramInt3));
      return paramLatLngBounds;
    }
    catch (RemoteException paramLatLngBounds)
    {
      throw new g(paramLatLngBounds);
    }
  }
  
  public static void a(com.google.android.gms.maps.a.a parama)
  {
    a = (com.google.android.gms.maps.a.a)com.google.android.gms.common.internal.b.a(parama);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
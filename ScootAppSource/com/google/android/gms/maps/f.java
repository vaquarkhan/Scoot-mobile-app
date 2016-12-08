package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.a.m;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.maps.a.ae;
import com.google.android.gms.maps.a.am;
import com.google.android.gms.maps.a.j;

final class f
  implements ae
{
  private final Fragment a;
  private final j b;
  
  public f(Fragment paramFragment, j paramj)
  {
    this.b = ((j)b.a(paramj));
    this.a = ((Fragment)b.a(paramFragment));
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    try
    {
      paramLayoutInflater = this.b.a(m.a(paramLayoutInflater), m.a(paramViewGroup), paramBundle);
      return (View)m.a(paramLayoutInflater);
    }
    catch (RemoteException paramLayoutInflater)
    {
      throw new com.google.android.gms.maps.model.g(paramLayoutInflater);
    }
  }
  
  public void a()
  {
    try
    {
      this.b.b();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new com.google.android.gms.maps.model.g(localRemoteException);
    }
  }
  
  public void a(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    paramBundle1 = (GoogleMapOptions)paramBundle1.getParcelable("MapOptions");
    try
    {
      this.b.a(m.a(paramActivity), paramBundle1, paramBundle2);
      return;
    }
    catch (RemoteException paramActivity)
    {
      throw new com.google.android.gms.maps.model.g(paramActivity);
    }
  }
  
  public void a(Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {}
    try
    {
      localBundle = new Bundle();
      paramBundle = this.a.j();
      if ((paramBundle != null) && (paramBundle.containsKey("MapOptions"))) {
        am.a(localBundle, "MapOptions", paramBundle.getParcelable("MapOptions"));
      }
      this.b.a(localBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      throw new com.google.android.gms.maps.model.g(paramBundle);
    }
  }
  
  public void a(e parame)
  {
    try
    {
      this.b.a(new g(this, parame));
      return;
    }
    catch (RemoteException parame)
    {
      throw new com.google.android.gms.maps.model.g(parame);
    }
  }
  
  public void b()
  {
    try
    {
      this.b.c();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new com.google.android.gms.maps.model.g(localRemoteException);
    }
  }
  
  public void b(Bundle paramBundle)
  {
    try
    {
      this.b.b(paramBundle);
      return;
    }
    catch (RemoteException paramBundle)
    {
      throw new com.google.android.gms.maps.model.g(paramBundle);
    }
  }
  
  public void c()
  {
    try
    {
      this.b.d();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new com.google.android.gms.maps.model.g(localRemoteException);
    }
  }
  
  public void d()
  {
    try
    {
      this.b.e();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new com.google.android.gms.maps.model.g(localRemoteException);
    }
  }
  
  public void e()
  {
    try
    {
      this.b.f();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new com.google.android.gms.maps.model.g(localRemoteException);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
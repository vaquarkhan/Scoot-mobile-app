package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.b;

public class SupportMapFragment
  extends Fragment
{
  private final h a = new h(this);
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = this.a.a(paramLayoutInflater, paramViewGroup, paramBundle);
    paramLayoutInflater.setClickable(true);
    return paramLayoutInflater;
  }
  
  public void a(Activity paramActivity)
  {
    super.a(paramActivity);
    h.a(this.a, paramActivity);
  }
  
  public void a(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    super.a(paramActivity, paramAttributeSet, paramBundle);
    h.a(this.a, paramActivity);
    paramAttributeSet = GoogleMapOptions.a(paramActivity, paramAttributeSet);
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("MapOptions", paramAttributeSet);
    this.a.a(paramActivity, localBundle, paramBundle);
  }
  
  public void a(e parame)
  {
    b.b("getMapAsync must be called on the main thread.");
    this.a.a(parame);
  }
  
  public void a_(Bundle paramBundle)
  {
    super.a_(paramBundle);
    this.a.a(paramBundle);
  }
  
  public void d(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(SupportMapFragment.class.getClassLoader());
    }
    super.d(paramBundle);
  }
  
  public void e(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(SupportMapFragment.class.getClassLoader());
    }
    super.e(paramBundle);
    this.a.b(paramBundle);
  }
  
  public void g(Bundle paramBundle)
  {
    super.g(paramBundle);
  }
  
  public void h()
  {
    this.a.d();
    super.h();
  }
  
  public void onLowMemory()
  {
    this.a.f();
    super.onLowMemory();
  }
  
  public void w()
  {
    super.w();
    this.a.b();
  }
  
  public void x()
  {
    this.a.c();
    super.x();
  }
  
  public void y()
  {
    this.a.e();
    super.y();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\SupportMapFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
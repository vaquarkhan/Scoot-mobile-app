package com.google.android.gms.location.places.internal;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;

public final class a
{
  private int a = 0;
  private String b;
  private String c;
  private LatLng d;
  private float e;
  private LatLngBounds f;
  private Uri g;
  private boolean h;
  private float i;
  private int j;
  private List<Integer> k;
  private String l;
  private String m;
  private List<String> n;
  
  public PlaceEntity a()
  {
    return new PlaceEntity(0, this.b, this.k, Collections.emptyList(), null, this.c, this.l, this.m, null, this.n, this.d, this.e, this.f, null, this.g, this.h, this.i, this.j, 0L, PlaceLocalization.a(this.c, this.l, this.m, null, this.n));
  }
  
  public a a(float paramFloat)
  {
    this.e = paramFloat;
    return this;
  }
  
  public a a(int paramInt)
  {
    this.j = paramInt;
    return this;
  }
  
  public a a(Uri paramUri)
  {
    this.g = paramUri;
    return this;
  }
  
  public a a(LatLng paramLatLng)
  {
    this.d = paramLatLng;
    return this;
  }
  
  public a a(LatLngBounds paramLatLngBounds)
  {
    this.f = paramLatLngBounds;
    return this;
  }
  
  public a a(String paramString)
  {
    this.b = paramString;
    return this;
  }
  
  public a a(List<Integer> paramList)
  {
    this.k = paramList;
    return this;
  }
  
  public a a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    return this;
  }
  
  public a b(float paramFloat)
  {
    this.i = paramFloat;
    return this;
  }
  
  public a b(String paramString)
  {
    this.c = paramString;
    return this;
  }
  
  public a b(List<String> paramList)
  {
    this.n = paramList;
    return this;
  }
  
  public a c(String paramString)
  {
    this.l = paramString;
    return this;
  }
  
  public a d(String paramString)
  {
    this.m = paramString;
    return this;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
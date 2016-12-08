package com.google.android.gms.location.internal;

import com.google.android.gms.b.bf;
import com.google.android.gms.common.api.Status;

final class h
  extends l
{
  private final bf<Status> a;
  
  public h(bf<Status> parambf)
  {
    this.a = parambf;
  }
  
  public void a(FusedLocationProviderResult paramFusedLocationProviderResult)
  {
    this.a.a(paramFusedLocationProviderResult.b());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
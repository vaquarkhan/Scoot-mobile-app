package com.google.android.gms.b;

import com.google.android.gms.common.api.Status;

final class ep
  extends ej
{
  private final bf<Status> a;
  
  public ep(bf<Status> parambf)
  {
    this.a = parambf;
  }
  
  public void a(int paramInt)
  {
    this.a.a(new Status(paramInt));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
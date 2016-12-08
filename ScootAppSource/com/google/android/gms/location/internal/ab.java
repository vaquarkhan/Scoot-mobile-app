package com.google.android.gms.location.internal;

import com.google.android.gms.b.bf;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.location.LocationSettingsResult;

final class ab
  extends u
{
  private bf<LocationSettingsResult> a;
  
  public ab(bf<LocationSettingsResult> parambf)
  {
    if (parambf != null) {}
    for (boolean bool = true;; bool = false)
    {
      b.b(bool, "listener can't be null.");
      this.a = parambf;
      return;
    }
  }
  
  public void a(LocationSettingsResult paramLocationSettingsResult)
  {
    this.a.a(paramLocationSettingsResult);
    this.a = null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
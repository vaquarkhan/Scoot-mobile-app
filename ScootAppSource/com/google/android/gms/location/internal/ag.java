package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.u;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.n;

public final class ag
  implements n
{
  public u<LocationSettingsResult> a(q paramq, LocationSettingsRequest paramLocationSettingsRequest)
  {
    return a(paramq, paramLocationSettingsRequest, null);
  }
  
  public u<LocationSettingsResult> a(q paramq, LocationSettingsRequest paramLocationSettingsRequest, String paramString)
  {
    return paramq.a(new ah(this, paramq, paramLocationSettingsRequest, paramString));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.location.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.k;

final class ah
  extends k<LocationSettingsResult>
{
  ah(ag paramag, q paramq, LocationSettingsRequest paramLocationSettingsRequest, String paramString)
  {
    super(paramq);
  }
  
  public LocationSettingsResult a(Status paramStatus)
  {
    return new LocationSettingsResult(paramStatus);
  }
  
  protected void a(aa paramaa)
  {
    paramaa.a(this.a, this, this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
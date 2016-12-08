package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.u;

public abstract interface d
{
  public abstract Location a(q paramq);
  
  public abstract u<Status> a(q paramq, LocationRequest paramLocationRequest, g paramg);
  
  public abstract u<Status> a(q paramq, g paramg);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
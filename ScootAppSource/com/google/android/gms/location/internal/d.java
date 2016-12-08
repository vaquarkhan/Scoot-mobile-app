package com.google.android.gms.location.internal;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.u;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.g;
import com.google.android.gms.location.i;

public final class d
  implements com.google.android.gms.location.d
{
  public Location a(q paramq)
  {
    paramq = i.a(paramq);
    try
    {
      paramq = paramq.f();
      return paramq;
    }
    catch (Exception paramq) {}
    return null;
  }
  
  public u<Status> a(q paramq, LocationRequest paramLocationRequest, g paramg)
  {
    return paramq.b(new e(this, paramq, paramLocationRequest, paramg));
  }
  
  public u<Status> a(q paramq, g paramg)
  {
    return paramq.b(new f(this, paramq, paramg));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\internal\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
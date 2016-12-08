package com.google.android.gms.common.api;

import android.support.v4.g.a;
import com.google.android.gms.b.az;
import com.google.android.gms.common.ConnectionResult;

public class ad
  implements x
{
  private final Status a;
  private final a<az<?>, ConnectionResult> b;
  
  public ad(Status paramStatus, a<az<?>, ConnectionResult> parama)
  {
    this.a = paramStatus;
    this.b = parama;
  }
  
  public Status b()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\api\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
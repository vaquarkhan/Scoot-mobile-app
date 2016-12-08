package com.google.android.gms.common.api;

import android.support.v4.g.a;
import com.google.android.gms.b.az;
import com.google.android.gms.common.ConnectionResult;

public final class ac
  extends ad
{
  private final ConnectionResult a;
  
  public ac(Status paramStatus, a<az<?>, ConnectionResult> parama)
  {
    super(paramStatus, parama);
    this.a = ((ConnectionResult)parama.get(parama.b(0)));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\api\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
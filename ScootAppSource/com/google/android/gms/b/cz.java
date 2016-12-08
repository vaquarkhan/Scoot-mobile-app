package com.google.android.gms.b;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.o;
import java.util.Collections;
import java.util.Map;

final class cz
  implements o
{
  private final k b;
  private final az<?> c;
  
  public cz(k paramk, az<?> paramaz)
  {
    this.b = paramaz;
    az localaz;
    this.c = localaz;
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    if (paramConnectionResult.b())
    {
      this.b.a(null, Collections.emptySet());
      return;
    }
    ((cy)cv.g(this.a).get(this.c)).a(paramConnectionResult);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
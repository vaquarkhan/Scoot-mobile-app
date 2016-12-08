package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

public final class r
  implements o
{
  public r(i parami) {}
  
  public void a(ConnectionResult paramConnectionResult)
  {
    if (paramConnectionResult.b()) {
      this.a.a(null, this.a.v());
    }
    while (i.e(this.a) == null) {
      return;
    }
    i.e(this.a).a(paramConnectionResult);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
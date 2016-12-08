package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.b;

public final class bo
  implements s, t
{
  public final a<?> a;
  private final int b;
  private cr c;
  
  public bo(a<?> parama, int paramInt)
  {
    this.a = parama;
    this.b = paramInt;
  }
  
  private void a()
  {
    b.a(this.c, "Callbacks must be attached to a GoogleApiClient instance before connecting the client.");
  }
  
  public void a(Bundle paramBundle)
  {
    a();
    this.c.a(paramBundle);
  }
  
  public void a(cr paramcr)
  {
    this.c = paramcr;
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    a();
    this.c.a(paramConnectionResult, this.a, this.b);
  }
  
  public void c_(int paramInt)
  {
    a();
    this.c.a(paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
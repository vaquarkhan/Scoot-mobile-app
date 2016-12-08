package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.x;
import java.util.Collections;
import java.util.Queue;

public final class ci
  implements cq
{
  private final cr a;
  
  public ci(cr paramcr)
  {
    this.a = paramcr;
  }
  
  public <A extends h, R extends x, T extends be<R, A>> T a(T paramT)
  {
    this.a.g.a.add(paramT);
    return paramT;
  }
  
  public void a()
  {
    this.a.i();
    this.a.g.d = Collections.emptySet();
  }
  
  public void a(int paramInt) {}
  
  public void a(Bundle paramBundle) {}
  
  public void a(ConnectionResult paramConnectionResult, a<?> parama, int paramInt) {}
  
  public <A extends h, T extends be<? extends x, A>> T b(T paramT)
  {
    throw new IllegalStateException("GoogleApiClient is not connected yet.");
  }
  
  public boolean b()
  {
    return true;
  }
  
  public void c()
  {
    this.a.e();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.b;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class br
  implements dg
{
  private br(bp parambp) {}
  
  public void a(int paramInt, boolean paramBoolean)
  {
    bp.a(this.a).lock();
    try
    {
      if ((bp.c(this.a)) || (bp.d(this.a) == null) || (!bp.d(this.a).b()))
      {
        bp.a(this.a, false);
        bp.a(this.a, paramInt, paramBoolean);
        return;
      }
      bp.a(this.a, true);
      bp.e(this.a).a(paramInt);
      return;
    }
    finally
    {
      bp.a(this.a).unlock();
    }
  }
  
  public void a(Bundle paramBundle)
  {
    bp.a(this.a).lock();
    try
    {
      bp.a(this.a, paramBundle);
      bp.a(this.a, ConnectionResult.a);
      bp.b(this.a);
      return;
    }
    finally
    {
      bp.a(this.a).unlock();
    }
  }
  
  public void a(ConnectionResult paramConnectionResult)
  {
    bp.a(this.a).lock();
    try
    {
      bp.a(this.a, paramConnectionResult);
      bp.b(this.a);
      return;
    }
    finally
    {
      bp.a(this.a).unlock();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
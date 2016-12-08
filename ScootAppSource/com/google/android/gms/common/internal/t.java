package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class t
  extends j
{
  public t(i parami, int paramInt, Bundle paramBundle)
  {
    super(parami, paramInt, paramBundle);
  }
  
  protected void a(ConnectionResult paramConnectionResult)
  {
    i.b(this.e).a(paramConnectionResult);
    this.e.a(paramConnectionResult);
  }
  
  protected boolean a()
  {
    i.b(this.e).a(ConnectionResult.a);
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
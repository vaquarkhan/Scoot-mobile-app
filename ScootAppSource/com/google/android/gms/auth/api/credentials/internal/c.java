package com.google.android.gms.auth.api.credentials.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.auth.api.f;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.aq;

public final class c
  extends aq<i>
{
  private final f d;
  
  public c(Context paramContext, Looper paramLooper, ai paramai, f paramf, s params, t paramt)
  {
    super(paramContext, paramLooper, 68, paramai, params, paramt);
    this.d = paramf;
  }
  
  protected i a(IBinder paramIBinder)
  {
    return j.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.gms.auth.api.credentials.service.START";
  }
  
  protected String b()
  {
    return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
  }
  
  protected Bundle c()
  {
    if (this.d == null) {
      return new Bundle();
    }
    return this.d.a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\credentials\internal\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
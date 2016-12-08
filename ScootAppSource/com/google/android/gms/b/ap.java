package com.google.android.gms.b;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.a;
import com.google.android.gms.auth.api.g;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.aq;
import java.util.Set;

public final class ap
  extends aq<at>
{
  private final Bundle d;
  
  public ap(Context paramContext, Looper paramLooper, ai paramai, g paramg, s params, t paramt)
  {
    super(paramContext, paramLooper, 16, paramai, params, paramt);
    if (paramg == null) {}
    for (paramContext = new Bundle();; paramContext = paramg.a())
    {
      this.d = paramContext;
      return;
    }
  }
  
  protected at a(IBinder paramIBinder)
  {
    return au.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.gms.auth.service.START";
  }
  
  protected String b()
  {
    return "com.google.android.gms.auth.api.internal.IAuthService";
  }
  
  protected Bundle c()
  {
    return this.d;
  }
  
  public boolean j()
  {
    ai localai = w();
    return (!TextUtils.isEmpty(localai.a())) && (!localai.a(a.e).isEmpty());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
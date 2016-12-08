package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.aq;

public final class es
  extends aq<ew>
{
  public es(Context paramContext, Looper paramLooper, ai paramai, s params, t paramt)
  {
    super(paramContext, paramLooper, 39, paramai, params, paramt);
  }
  
  protected ew a(IBinder paramIBinder)
  {
    return ex.a(paramIBinder);
  }
  
  public String a()
  {
    return "com.google.android.gms.common.service.START";
  }
  
  protected String b()
  {
    return "com.google.android.gms.common.internal.service.ICommonService";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
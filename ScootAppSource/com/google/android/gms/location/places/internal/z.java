package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.location.places.n;
import com.google.android.gms.location.places.p;

public final class z
  extends g<x, n>
{
  public x a(Context paramContext, Looper paramLooper, ai paramai, n paramn, s params, t paramt)
  {
    if (paramn == null) {
      paramn = new p().a();
    }
    for (;;)
    {
      String str = paramContext.getPackageName();
      if (paramn.a != null) {
        str = paramn.a;
      }
      return new x(paramContext, paramLooper, paramai, params, paramt, str, paramn, null);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
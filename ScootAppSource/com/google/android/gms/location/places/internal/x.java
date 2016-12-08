package com.google.android.gms.location.places.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.aq;
import com.google.android.gms.location.places.n;
import java.util.Locale;

public final class x
  extends aq<k>
{
  private final PlacesParams d;
  private final Locale e = Locale.getDefault();
  
  private x(Context paramContext, Looper paramLooper, ai paramai, s params, t paramt, String paramString, n paramn)
  {
    super(paramContext, paramLooper, 67, paramai, params, paramt);
    paramContext = null;
    if (paramai.b() != null) {
      paramContext = paramai.b().name;
    }
    this.d = new PlacesParams(paramString, this.e, paramContext, paramn.b, paramn.c);
  }
  
  protected k a(IBinder paramIBinder)
  {
    return l.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.gms.location.places.PlaceDetectionApi";
  }
  
  protected String b()
  {
    return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.location.places.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.internal.ai;
import com.google.android.gms.common.internal.aq;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.a;
import com.google.android.gms.location.places.ab;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

public final class h
  extends aq<n>
{
  private final PlacesParams d;
  private final Locale e = Locale.getDefault();
  
  private h(Context paramContext, Looper paramLooper, ai paramai, s params, t paramt, String paramString, com.google.android.gms.location.places.n paramn)
  {
    super(paramContext, paramLooper, 65, paramai, params, paramt);
    paramContext = null;
    if (paramai.b() != null) {
      paramContext = paramai.b().name;
    }
    this.d = new PlacesParams(paramString, this.e, paramContext, paramn.b, paramn.c);
  }
  
  protected n a(IBinder paramIBinder)
  {
    return o.a(paramIBinder);
  }
  
  protected String a()
  {
    return "com.google.android.gms.location.places.GeoDataApi";
  }
  
  public void a(ab paramab, String paramString, LatLngBounds paramLatLngBounds, AutocompleteFilter paramAutocompleteFilter)
  {
    b.a(paramab, "callback == null");
    if (paramString == null) {
      paramString = "";
    }
    for (;;)
    {
      if (paramAutocompleteFilter == null) {
        paramAutocompleteFilter = new a().a();
      }
      for (;;)
      {
        ((n)t()).a(paramString, paramLatLngBounds, paramAutocompleteFilter, this.d, paramab);
        return;
      }
    }
  }
  
  public void a(ab paramab, List<String> paramList)
  {
    ((n)t()).b(paramList, this.d, paramab);
  }
  
  protected String b()
  {
    return "com.google.android.gms.location.places.internal.IGooglePlacesService";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.c;
import com.google.android.gms.location.places.d;
import com.google.android.gms.location.places.m;
import com.google.android.gms.maps.model.LatLngBounds;

public final class e
  implements d
{
  public u<c> a(q paramq, String paramString, LatLngBounds paramLatLngBounds, AutocompleteFilter paramAutocompleteFilter)
  {
    return paramq.a(new g(this, m.c, paramq, paramString, paramLatLngBounds, paramAutocompleteFilter));
  }
  
  public u<com.google.android.gms.location.places.f> a(q paramq, String... paramVarArgs)
  {
    boolean bool = true;
    if ((paramVarArgs != null) && (paramVarArgs.length >= 1)) {}
    for (;;)
    {
      b.b(bool);
      return paramq.a(new f(this, m.c, paramq, paramVarArgs));
      bool = false;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
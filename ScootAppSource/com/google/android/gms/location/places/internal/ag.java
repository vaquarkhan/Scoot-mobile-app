package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class ag
  extends ai
  implements e
{
  private final String c = a("place_id", "");
  
  public ag(DataHolder paramDataHolder, int paramInt, Context paramContext)
  {
    super(paramDataHolder, paramInt);
  }
  
  private PlaceEntity p()
  {
    PlaceEntity localPlaceEntity = new a().c(c().toString()).b(q()).a(b()).a(o()).a(f()).a(g()).b(d().toString()).d(i().toString()).a(k()).b(l()).a(j()).a(m()).a(n()).a();
    localPlaceEntity.a(h());
    return localPlaceEntity;
  }
  
  private List<String> q()
  {
    return b("place_attributions", Collections.emptyList());
  }
  
  public String b()
  {
    return this.c;
  }
  
  public CharSequence c()
  {
    return a("place_address", "");
  }
  
  public CharSequence d()
  {
    return a("place_name", "");
  }
  
  public e e()
  {
    return p();
  }
  
  public LatLng f()
  {
    return (LatLng)a("place_lat_lng", LatLng.CREATOR);
  }
  
  public float g()
  {
    return a("place_level_number", 0.0F);
  }
  
  public Locale h()
  {
    String str = a("place_locale_language", "");
    if (!TextUtils.isEmpty(str)) {
      return new Locale(str, a("place_locale_country", ""));
    }
    str = a("place_locale", "");
    if (!TextUtils.isEmpty(str)) {
      return new Locale(str);
    }
    return Locale.getDefault();
  }
  
  public CharSequence i()
  {
    return a("place_phone_number", "");
  }
  
  public List<Integer> j()
  {
    return a("place_types", Collections.emptyList());
  }
  
  public int k()
  {
    return a("place_price_level", -1);
  }
  
  public float l()
  {
    return a("place_rating", -1.0F);
  }
  
  public LatLngBounds m()
  {
    return (LatLngBounds)a("place_viewport", LatLngBounds.CREATOR);
  }
  
  public Uri n()
  {
    String str = a("place_website_uri", null);
    if (str == null) {
      return null;
    }
    return Uri.parse(str);
  }
  
  public boolean o()
  {
    return a("place_is_permanently_closed", false);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class PlaceEntity
  implements SafeParcelable, e
{
  public static final aa CREATOR = new aa();
  final int a;
  private final String b;
  private final Bundle c;
  @Deprecated
  private final PlaceLocalization d;
  private final LatLng e;
  private final float f;
  private final LatLngBounds g;
  private final String h;
  private final Uri i;
  private final boolean j;
  private final float k;
  private final int l;
  private final long m;
  private final List<Integer> n;
  private final List<Integer> o;
  private final String p;
  private final String q;
  private final String r;
  private final String s;
  private final List<String> t;
  private final Map<Integer, String> u;
  private final TimeZone v;
  private Locale w;
  
  PlaceEntity(int paramInt1, String paramString1, List<Integer> paramList1, List<Integer> paramList2, Bundle paramBundle, String paramString2, String paramString3, String paramString4, String paramString5, List<String> paramList, LatLng paramLatLng, float paramFloat1, LatLngBounds paramLatLngBounds, String paramString6, Uri paramUri, boolean paramBoolean, float paramFloat2, int paramInt2, long paramLong, PlaceLocalization paramPlaceLocalization)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.o = Collections.unmodifiableList(paramList1);
    this.n = paramList2;
    if (paramBundle != null)
    {
      this.c = paramBundle;
      this.p = paramString2;
      this.q = paramString3;
      this.r = paramString4;
      this.s = paramString5;
      if (paramList == null) {
        break label176;
      }
      label68:
      this.t = paramList;
      this.e = paramLatLng;
      this.f = paramFloat1;
      this.g = paramLatLngBounds;
      if (paramString6 == null) {
        break label184;
      }
    }
    for (;;)
    {
      this.h = paramString6;
      this.i = paramUri;
      this.j = paramBoolean;
      this.k = paramFloat2;
      this.l = paramInt2;
      this.m = paramLong;
      this.u = Collections.unmodifiableMap(new HashMap());
      this.v = null;
      this.w = null;
      this.d = paramPlaceLocalization;
      return;
      paramBundle = new Bundle();
      break;
      label176:
      paramList = Collections.emptyList();
      break label68;
      label184:
      paramString6 = "UTC";
    }
  }
  
  public void a(Locale paramLocale)
  {
    this.w = paramLocale;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public List<Integer> e()
  {
    return this.o;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceEntity)) {
        return false;
      }
      paramObject = (PlaceEntity)paramObject;
    } while ((this.b.equals(((PlaceEntity)paramObject).b)) && (br.a(this.w, ((PlaceEntity)paramObject).w)) && (this.m == ((PlaceEntity)paramObject).m));
    return false;
  }
  
  public List<Integer> f()
  {
    return this.n;
  }
  
  public String g()
  {
    return this.p;
  }
  
  public String h()
  {
    return this.q;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.b, this.w, Long.valueOf(this.m) });
  }
  
  public LatLng i()
  {
    return this.e;
  }
  
  public float j()
  {
    return this.f;
  }
  
  public LatLngBounds k()
  {
    return this.g;
  }
  
  public Uri l()
  {
    return this.i;
  }
  
  public String m()
  {
    return this.r;
  }
  
  public String n()
  {
    return this.s;
  }
  
  public List<String> o()
  {
    return this.t;
  }
  
  public boolean p()
  {
    return this.j;
  }
  
  public float q()
  {
    return this.k;
  }
  
  public int r()
  {
    return this.l;
  }
  
  public long s()
  {
    return this.m;
  }
  
  public Bundle t()
  {
    return this.c;
  }
  
  @SuppressLint({"DefaultLocale"})
  public String toString()
  {
    return br.a(this).a("id", this.b).a("placeTypes", this.o).a("locale", this.w).a("name", this.p).a("address", this.q).a("phoneNumber", this.r).a("latlng", this.e).a("viewport", this.g).a("websiteUri", this.i).a("isPermanentlyClosed", Boolean.valueOf(this.j)).a("priceLevel", Integer.valueOf(this.l)).a("timestampSecs", Long.valueOf(this.m)).toString();
  }
  
  public String u()
  {
    return this.h;
  }
  
  @Deprecated
  public PlaceLocalization v()
  {
    return this.d;
  }
  
  public e w()
  {
    return this;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    aa.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\PlaceEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
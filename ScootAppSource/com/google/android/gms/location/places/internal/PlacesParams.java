package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.os.Parcel;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public class PlacesParams
  extends AbstractSafeParcelable
{
  public static final ah CREATOR = new ah();
  public static final PlacesParams a = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);
  public final int b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  public final int g;
  public final int h;
  
  public PlacesParams(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2, int paramInt3)
  {
    this.b = paramInt1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramInt2;
    this.h = paramInt3;
  }
  
  public PlacesParams(String paramString1, Locale paramLocale, String paramString2)
  {
    this(3, paramString1, paramLocale.toString(), paramString2, null, b.a, 0);
  }
  
  public PlacesParams(String paramString1, Locale paramLocale, String paramString2, String paramString3, int paramInt)
  {
    this(3, paramString1, paramLocale.toString(), paramString2, paramString3, b.a, paramInt);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (!(paramObject instanceof PlacesParams))) {
        return false;
      }
      paramObject = (PlacesParams)paramObject;
    } while ((this.g == ((PlacesParams)paramObject).g) && (this.h == ((PlacesParams)paramObject).h) && (this.d.equals(((PlacesParams)paramObject).d)) && (this.c.equals(((PlacesParams)paramObject).c)) && (br.a(this.e, ((PlacesParams)paramObject).e)) && (br.a(this.f, ((PlacesParams)paramObject).f)));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.c, this.d, this.e, this.f, Integer.valueOf(this.g), Integer.valueOf(this.h) });
  }
  
  @SuppressLint({"DefaultLocale"})
  public String toString()
  {
    return br.a(this).a("clientPackageName", this.c).a("locale", this.d).a("accountName", this.e).a("gCoreClientName", this.f).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ah.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\PlacesParams.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PlaceReport
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<PlaceReport> CREATOR = new z();
  final int a;
  private final String b;
  private final String c;
  private final String d;
  
  PlaceReport(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof PlaceReport)) {}
    do
    {
      return false;
      paramObject = (PlaceReport)paramObject;
    } while ((!br.a(this.b, ((PlaceReport)paramObject).b)) || (!br.a(this.c, ((PlaceReport)paramObject).c)) || (!br.a(this.d, ((PlaceReport)paramObject).d)));
    return true;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.b, this.c, this.d });
  }
  
  public String toString()
  {
    bt localbt = br.a(this);
    localbt.a("placeId", this.b);
    localbt.a("tag", this.c);
    if (!"unknown".equals(this.d)) {
      localbt.a("source", this.d);
    }
    return localbt.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    z.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\PlaceReport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
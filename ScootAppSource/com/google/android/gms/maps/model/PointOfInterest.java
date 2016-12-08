package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class PointOfInterest
  implements SafeParcelable
{
  public static final q CREATOR = new q();
  public final LatLng a;
  public final String b;
  public final String c;
  private final int d;
  
  PointOfInterest(int paramInt, LatLng paramLatLng, String paramString1, String paramString2)
  {
    this.d = paramInt;
    this.a = paramLatLng;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  int a()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    q.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\model\PointOfInterest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
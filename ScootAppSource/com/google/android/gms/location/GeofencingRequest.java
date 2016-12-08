package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.List;

public class GeofencingRequest
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<GeofencingRequest> CREATOR = new p();
  private final int a;
  private final List<ParcelableGeofence> b;
  private final int c;
  
  GeofencingRequest(int paramInt1, List<ParcelableGeofence> paramList, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramInt2;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public List<ParcelableGeofence> b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    p.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\GeofencingRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
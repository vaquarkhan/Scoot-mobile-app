package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class AliasedPlacesResult
  implements x, SafeParcelable
{
  public static final Parcelable.Creator<AliasedPlacesResult> CREATOR = new b();
  final int a;
  private final Status b;
  private final List<AliasedPlace> c;
  
  AliasedPlacesResult(int paramInt, Status paramStatus, List<AliasedPlace> paramList)
  {
    this.a = paramInt;
    this.b = paramStatus;
    this.c = paramList;
  }
  
  public List<AliasedPlace> a()
  {
    return this.c;
  }
  
  public Status b()
  {
    return this.b;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\personalized\AliasedPlacesResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PlacePhotoMetadataResult
  extends AbstractSafeParcelable
  implements com.google.android.gms.common.api.x
{
  public static final Parcelable.Creator<PlacePhotoMetadataResult> CREATOR = new x();
  final int a;
  final DataHolder b;
  private final Status c;
  private final l d;
  
  PlacePhotoMetadataResult(int paramInt, Status paramStatus, DataHolder paramDataHolder)
  {
    this.a = paramInt;
    this.c = paramStatus;
    this.b = paramDataHolder;
    if (paramDataHolder == null)
    {
      this.d = null;
      return;
    }
    this.d = new l(this.b);
  }
  
  public Status b()
  {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    x.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\PlacePhotoMetadataResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
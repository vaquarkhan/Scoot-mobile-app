package com.facebook;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GraphRequest$ParcelableResourceWithMimeType<RESOURCE extends Parcelable>
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableResourceWithMimeType> CREATOR = new am();
  private final String a;
  private final RESOURCE b;
  
  private GraphRequest$ParcelableResourceWithMimeType(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readParcelable(w.f().getClassLoader());
  }
  
  public String a()
  {
    return this.a;
  }
  
  public RESOURCE b()
  {
    return this.b;
  }
  
  public int describeContents()
  {
    return 1;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeParcelable(this.b, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\GraphRequest$ParcelableResourceWithMimeType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class am
  implements Parcelable.Creator<GraphRequest.ParcelableResourceWithMimeType>
{
  public GraphRequest.ParcelableResourceWithMimeType a(Parcel paramParcel)
  {
    return new GraphRequest.ParcelableResourceWithMimeType(paramParcel, null);
  }
  
  public GraphRequest.ParcelableResourceWithMimeType[] a(int paramInt)
  {
    return new GraphRequest.ParcelableResourceWithMimeType[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
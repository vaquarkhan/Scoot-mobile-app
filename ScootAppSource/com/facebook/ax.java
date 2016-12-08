package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ax
  implements Parcelable.Creator
{
  public Profile a(Parcel paramParcel)
  {
    return new Profile(paramParcel, null);
  }
  
  public Profile[] a(int paramInt)
  {
    return new Profile[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
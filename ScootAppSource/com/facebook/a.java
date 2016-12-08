package com.facebook;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class a
  implements Parcelable.Creator
{
  public AccessToken a(Parcel paramParcel)
  {
    return new AccessToken(paramParcel);
  }
  
  public AccessToken[] a(int paramInt)
  {
    return new AccessToken[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
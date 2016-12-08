package com.digits.sdk.android;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class h
  implements Parcelable.Creator<AuthConfig>
{
  public AuthConfig a(Parcel paramParcel)
  {
    return new AuthConfig(paramParcel);
  }
  
  public AuthConfig[] a(int paramInt)
  {
    return new AuthConfig[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class s
  implements Parcelable.Creator<TwitterAuthToken>
{
  public TwitterAuthToken a(Parcel paramParcel)
  {
    return new TwitterAuthToken(paramParcel, null);
  }
  
  public TwitterAuthToken[] a(int paramInt)
  {
    return new TwitterAuthToken[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
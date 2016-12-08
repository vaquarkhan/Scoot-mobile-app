package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class p
  implements Parcelable.Creator<TwitterAuthConfig>
{
  public TwitterAuthConfig a(Parcel paramParcel)
  {
    return new TwitterAuthConfig(paramParcel, null);
  }
  
  public TwitterAuthConfig[] a(int paramInt)
  {
    return new TwitterAuthConfig[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
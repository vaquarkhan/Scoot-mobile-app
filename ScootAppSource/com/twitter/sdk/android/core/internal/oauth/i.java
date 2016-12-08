package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class i
  implements Parcelable.Creator<OAuthResponse>
{
  public OAuthResponse a(Parcel paramParcel)
  {
    return new OAuthResponse(paramParcel, null);
  }
  
  public OAuthResponse[] a(int paramInt)
  {
    return new OAuthResponse[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
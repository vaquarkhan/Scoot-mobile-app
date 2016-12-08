package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class h
  implements Parcelable.Creator<OAuth2Token>
{
  public OAuth2Token a(Parcel paramParcel)
  {
    return new OAuth2Token(paramParcel, null);
  }
  
  public OAuth2Token[] a(int paramInt)
  {
    return new OAuth2Token[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
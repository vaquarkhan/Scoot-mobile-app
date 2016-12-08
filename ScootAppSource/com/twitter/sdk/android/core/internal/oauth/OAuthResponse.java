package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.twitter.sdk.android.core.TwitterAuthToken;

public class OAuthResponse
  implements Parcelable
{
  public static final Parcelable.Creator<OAuthResponse> CREATOR = new i();
  public final TwitterAuthToken a;
  public final String b;
  public final long c;
  
  private OAuthResponse(Parcel paramParcel)
  {
    this.a = ((TwitterAuthToken)paramParcel.readParcelable(TwitterAuthToken.class.getClassLoader()));
    this.b = paramParcel.readString();
    this.c = paramParcel.readLong();
  }
  
  public OAuthResponse(TwitterAuthToken paramTwitterAuthToken, String paramString, long paramLong)
  {
    this.a = paramTwitterAuthToken;
    this.b = paramString;
    this.c = paramLong;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "authToken=" + this.a + ",userName=" + this.b + ",userId=" + this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.a, paramInt);
    paramParcel.writeString(this.b);
    paramParcel.writeLong(this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\OAuthResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import java.util.HashMap;
import java.util.Map;

public class OAuth2Token
  extends com.twitter.sdk.android.core.c
  implements Parcelable
{
  public static final Parcelable.Creator<OAuth2Token> CREATOR = new h();
  @com.google.a.a.c(a="token_type")
  private final String b;
  @com.google.a.a.c(a="access_token")
  private final String c;
  
  private OAuth2Token(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
  }
  
  public OAuth2Token(String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public Map<String, String> a(TwitterAuthConfig paramTwitterAuthConfig, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    paramTwitterAuthConfig = new HashMap();
    paramTwitterAuthConfig.put("Authorization", OAuth2Service.a(this));
    return paramTwitterAuthConfig;
  }
  
  public boolean a()
  {
    return false;
  }
  
  public String c()
  {
    return this.b;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (OAuth2Token)paramObject;
      if (this.c != null)
      {
        if (this.c.equals(((OAuth2Token)paramObject).c)) {}
      }
      else {
        while (((OAuth2Token)paramObject).c != null) {
          return false;
        }
      }
      if (this.b == null) {
        break;
      }
    } while (this.b.equals(((OAuth2Token)paramObject).b));
    for (;;)
    {
      return false;
      if (((OAuth2Token)paramObject).b == null) {
        break;
      }
    }
  }
  
  public int hashCode()
  {
    int j = 0;
    if (this.b != null) {}
    for (int i = this.b.hashCode();; i = 0)
    {
      if (this.c != null) {
        j = this.c.hashCode();
      }
      return i * 31 + j;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\oauth\OAuth2Token.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
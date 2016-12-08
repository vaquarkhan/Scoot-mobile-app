package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;

public class TwitterAuthToken
  extends c
  implements Parcelable
{
  public static final Parcelable.Creator<TwitterAuthToken> CREATOR = new s();
  @com.google.a.a.c(a="token")
  public final String b;
  @com.google.a.a.c(a="secret")
  public final String c;
  
  private TwitterAuthToken(Parcel paramParcel)
  {
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
  }
  
  public TwitterAuthToken(String paramString1, String paramString2)
  {
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public Map<String, String> a(TwitterAuthConfig paramTwitterAuthConfig, String paramString1, String paramString2, Map<String, String> paramMap)
  {
    HashMap localHashMap = new HashMap(1);
    localHashMap.put("Authorization", new com.twitter.sdk.android.core.internal.oauth.c().a(paramTwitterAuthConfig, this, null, paramString1, paramString2, paramMap));
    return localHashMap;
  }
  
  public boolean a()
  {
    return false;
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
      if (!(paramObject instanceof TwitterAuthToken)) {
        return false;
      }
      paramObject = (TwitterAuthToken)paramObject;
      if (this.c != null)
      {
        if (this.c.equals(((TwitterAuthToken)paramObject).c)) {}
      }
      else {
        while (((TwitterAuthToken)paramObject).c != null) {
          return false;
        }
      }
      if (this.b == null) {
        break;
      }
    } while (this.b.equals(((TwitterAuthToken)paramObject).b));
    for (;;)
    {
      return false;
      if (((TwitterAuthToken)paramObject).b == null) {
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
  
  public String toString()
  {
    return "token=" + this.b + ",secret=" + this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\TwitterAuthToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
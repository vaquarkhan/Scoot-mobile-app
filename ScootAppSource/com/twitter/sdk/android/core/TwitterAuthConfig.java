package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class TwitterAuthConfig
  implements Parcelable
{
  public static final Parcelable.Creator<TwitterAuthConfig> CREATOR = new p();
  private final String a;
  private final String b;
  
  private TwitterAuthConfig(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
  }
  
  public TwitterAuthConfig(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {
      throw new IllegalArgumentException("TwitterAuthConfig must not be created with null consumer key or secret.");
    }
    this.a = a(paramString1);
    this.b = a(paramString2);
  }
  
  static String a(String paramString)
  {
    if (paramString != null) {
      return paramString.trim();
    }
    return null;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\TwitterAuthConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
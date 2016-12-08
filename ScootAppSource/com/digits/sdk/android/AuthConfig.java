package com.digits.sdk.android;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.a.a.c;
import java.io.Serializable;

class AuthConfig
  implements Parcelable, Serializable
{
  public static final Parcelable.Creator<AuthConfig> CREATOR = new h();
  @c(a="tos_update")
  public boolean a;
  @c(a="voice_enabled")
  public boolean b;
  @c(a="email_enabled")
  public boolean c;
  
  public AuthConfig() {}
  
  protected AuthConfig(Parcel paramParcel)
  {
    if (paramParcel.readInt() == 1)
    {
      bool1 = true;
      this.a = bool1;
      if (paramParcel.readInt() != 1) {
        break label57;
      }
      bool1 = true;
      label31:
      this.b = bool1;
      if (paramParcel.readInt() != 1) {
        break label62;
      }
    }
    label57:
    label62:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.c = bool1;
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label31;
    }
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
      paramObject = (AuthConfig)paramObject;
    } while ((this.a == ((AuthConfig)paramObject).a) && (this.b == ((AuthConfig)paramObject).b) && (this.c == ((AuthConfig)paramObject).c));
    return false;
  }
  
  public int hashCode()
  {
    int k = 1;
    int i;
    int j;
    if (this.a)
    {
      i = 1;
      if (!this.b) {
        break label44;
      }
      j = 1;
      label20:
      if (!this.c) {
        break label49;
      }
    }
    for (;;)
    {
      return (j + i * 31) * 31 + k;
      i = 0;
      break;
      label44:
      j = 0;
      break label20;
      label49:
      k = 0;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    if (this.a)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      if (!this.b) {
        break label50;
      }
      paramInt = 1;
      label25:
      paramParcel.writeInt(paramInt);
      if (!this.c) {
        break label55;
      }
    }
    label50:
    label55:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label25;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\android\AuthConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
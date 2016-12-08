package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class k
  implements Parcelable.Creator
{
  public LoginClient.Request a(Parcel paramParcel)
  {
    return new LoginClient.Request(paramParcel, null);
  }
  
  public LoginClient.Request[] a(int paramInt)
  {
    return new LoginClient.Request[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
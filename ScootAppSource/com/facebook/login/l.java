package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class l
  implements Parcelable.Creator
{
  public LoginClient.Result a(Parcel paramParcel)
  {
    return new LoginClient.Result(paramParcel, null);
  }
  
  public LoginClient.Result[] a(int paramInt)
  {
    return new LoginClient.Result[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
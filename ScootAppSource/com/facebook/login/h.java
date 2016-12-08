package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class h
  implements Parcelable.Creator
{
  public LoginClient a(Parcel paramParcel)
  {
    return new LoginClient(paramParcel);
  }
  
  public LoginClient[] a(int paramInt)
  {
    return new LoginClient[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
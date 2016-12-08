package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class f
  implements Parcelable.Creator
{
  public KatanaProxyLoginMethodHandler a(Parcel paramParcel)
  {
    return new KatanaProxyLoginMethodHandler(paramParcel);
  }
  
  public KatanaProxyLoginMethodHandler[] a(int paramInt)
  {
    return new KatanaProxyLoginMethodHandler[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
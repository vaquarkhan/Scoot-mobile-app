package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class e
  implements Parcelable.Creator
{
  public GetTokenLoginMethodHandler a(Parcel paramParcel)
  {
    return new GetTokenLoginMethodHandler(paramParcel);
  }
  
  public GetTokenLoginMethodHandler[] a(int paramInt)
  {
    return new GetTokenLoginMethodHandler[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
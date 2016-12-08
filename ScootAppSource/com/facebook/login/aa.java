package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class aa
  implements Parcelable.Creator
{
  public WebViewLoginMethodHandler a(Parcel paramParcel)
  {
    return new WebViewLoginMethodHandler(paramParcel);
  }
  
  public WebViewLoginMethodHandler[] a(int paramInt)
  {
    return new WebViewLoginMethodHandler[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
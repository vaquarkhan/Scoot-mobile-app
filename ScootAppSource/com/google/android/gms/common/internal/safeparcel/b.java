package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;

public final class b
  extends RuntimeException
{
  public b(String paramString, Parcel paramParcel)
  {
    super(String.valueOf(paramString).length() + 41 + paramString + " Parcel: pos=" + i + " size=" + j);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\safeparcel\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

public final class h
  implements Parcelable.Creator<BitmapTeleporter>
{
  static void a(BitmapTeleporter paramBitmapTeleporter, Parcel paramParcel, int paramInt)
  {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, paramBitmapTeleporter.a);
    c.a(paramParcel, 2, paramBitmapTeleporter.b, paramInt, false);
    c.a(paramParcel, 3, paramBitmapTeleporter.c);
    c.a(paramParcel, i);
  }
  
  public BitmapTeleporter a(Parcel paramParcel)
  {
    int i = 0;
    int k = a.b(paramParcel);
    ParcelFileDescriptor localParcelFileDescriptor = null;
    int j = 0;
    if (paramParcel.dataPosition() < k)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
      }
      for (;;)
      {
        break;
        j = a.f(paramParcel, m);
        continue;
        localParcelFileDescriptor = (ParcelFileDescriptor)a.a(paramParcel, m, ParcelFileDescriptor.CREATOR);
        continue;
        i = a.f(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new b(37 + "Overread allowed size end=" + k, paramParcel);
    }
    return new BitmapTeleporter(j, localParcelFileDescriptor, i);
  }
  
  public BitmapTeleporter[] a(int paramInt)
  {
    return new BitmapTeleporter[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\data\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
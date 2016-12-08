package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;

final class ey
  implements ew
{
  private IBinder a;
  
  ey(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public void a(et paramet)
  {
    IBinder localIBinder = null;
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
      if (paramet != null) {
        localIBinder = paramet.asBinder();
      }
      localParcel.writeStrongBinder(localIBinder);
      this.a.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
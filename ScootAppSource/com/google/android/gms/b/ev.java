package com.google.android.gms.b;

import android.os.IBinder;
import android.os.Parcel;

final class ev
  implements et
{
  private IBinder a;
  
  ev(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public void a(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonCallbacks");
      localParcel1.writeInt(paramInt);
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
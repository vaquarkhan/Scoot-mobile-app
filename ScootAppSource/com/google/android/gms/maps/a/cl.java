package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class cl
  extends Binder
  implements ck
{
  public static ck a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    if ((localIInterface != null) && ((localIInterface instanceof ck))) {
      return (ck)localIInterface;
    }
    return new cm(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    boolean bool = a();
    paramParcel2.writeNoException();
    if (bool) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      paramParcel2.writeInt(paramInt1);
      return true;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\a\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
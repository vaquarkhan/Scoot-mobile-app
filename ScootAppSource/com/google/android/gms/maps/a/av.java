package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.a.j;
import com.google.android.gms.maps.model.a.q;

public abstract class av
  extends Binder
  implements au
{
  public static au a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    if ((localIInterface != null) && ((localIInterface instanceof au))) {
      return (au)localIInterface;
    }
    return new aw(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    j localj2 = null;
    j localj1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
      localj2 = a(q.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramParcel1 = localj1;
      if (localj2 != null) {
        paramParcel1 = localj2.asBinder();
      }
      paramParcel2.writeStrongBinder(paramParcel1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    localj1 = b(q.a(paramParcel1.readStrongBinder()));
    paramParcel2.writeNoException();
    paramParcel1 = localj2;
    if (localj1 != null) {
      paramParcel1 = localj1.asBinder();
    }
    paramParcel2.writeStrongBinder(paramParcel1);
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\a\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
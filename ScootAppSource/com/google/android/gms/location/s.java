package com.google.android.gms.location;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class s
  extends Binder
  implements r
{
  public static r a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
    if ((localIInterface != null) && ((localIInterface instanceof r))) {
      return (r)localIInterface;
    }
    return new t(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.location.ILocationCallback");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.location.ILocationCallback");
      paramParcel2 = (Parcel)localObject1;
      if (paramParcel1.readInt() != 0) {
        paramParcel2 = (LocationResult)LocationResult.CREATOR.createFromParcel(paramParcel1);
      }
      a(paramParcel2);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.ILocationCallback");
    paramParcel2 = (Parcel)localObject2;
    if (paramParcel1.readInt() != 0) {
      paramParcel2 = (LocationAvailability)LocationAvailability.CREATOR.createFromParcel(paramParcel1);
    }
    a(paramParcel2);
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
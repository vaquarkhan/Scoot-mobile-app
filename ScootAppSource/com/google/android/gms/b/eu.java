package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class eu
  extends Binder
  implements et
{
  public eu()
  {
    attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
  }
  
  public static et a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof et))) {
      return (et)localIInterface;
    }
    return new ev(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.common.internal.service.ICommonCallbacks");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
    a(paramParcel1.readInt());
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\eu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
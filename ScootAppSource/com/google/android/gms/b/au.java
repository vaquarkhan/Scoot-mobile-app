package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public abstract class au
  extends Binder
  implements at
{
  public static at a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
    if ((localIInterface != null) && ((localIInterface instanceof at))) {
      return (at)localIInterface;
    }
    return new av(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    aq localaq1 = null;
    Object localObject = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.auth.api.internal.IAuthService");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
      localaq1 = ar.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {
        localObject = (ProxyRequest)ProxyRequest.CREATOR.createFromParcel(paramParcel1);
      }
      a(localaq1, (ProxyRequest)localObject);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
    aq localaq2 = ar.a(paramParcel1.readStrongBinder());
    localObject = localaq1;
    if (paramParcel1.readInt() != 0) {
      localObject = (ProxyGrpcRequest)ProxyGrpcRequest.CREATOR.createFromParcel(paramParcel1);
    }
    a(localaq2, (ProxyGrpcRequest)localObject);
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public abstract class q
  extends Binder
  implements p
{
  public static p a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
    if ((localIInterface != null) && ((localIInterface instanceof p))) {
      return (p)localIInterface;
    }
    return new r(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    m localm1 = null;
    m localm2 = null;
    Object localObject = null;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.auth.api.signin.internal.ISignInService");
      return true;
    case 101: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localm1 = n.a(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0) {
        localObject = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);
      }
      a(localm1, (GoogleSignInOptions)localObject);
      paramParcel2.writeNoException();
      return true;
    case 102: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
      localm2 = n.a(paramParcel1.readStrongBinder());
      localObject = localm1;
      if (paramParcel1.readInt() != 0) {
        localObject = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);
      }
      b(localm2, (GoogleSignInOptions)localObject);
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
    localm1 = n.a(paramParcel1.readStrongBinder());
    localObject = localm2;
    if (paramParcel1.readInt() != 0) {
      localObject = (GoogleSignInOptions)GoogleSignInOptions.CREATOR.createFromParcel(paramParcel1);
    }
    c(localm1, (GoogleSignInOptions)localObject);
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
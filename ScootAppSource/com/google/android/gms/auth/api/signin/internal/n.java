package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class n
  extends Binder
  implements m
{
  public n()
  {
    attachInterface(this, "com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
  }
  
  public static m a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    if ((localIInterface != null) && ((localIInterface instanceof m))) {
      return (m)localIInterface;
    }
    return new o(paramIBinder);
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
      paramParcel2.writeString("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      return true;
    case 101: 
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      GoogleSignInAccount localGoogleSignInAccount;
      if (paramParcel1.readInt() != 0)
      {
        localGoogleSignInAccount = (GoogleSignInAccount)GoogleSignInAccount.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label128;
        }
      }
      for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a(localGoogleSignInAccount, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localGoogleSignInAccount = null;
        break;
      }
    case 102: 
      label128:
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a(paramParcel1);
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      b(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
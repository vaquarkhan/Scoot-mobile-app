package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class l
  extends Binder
  implements k
{
  public l()
  {
    attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
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
      paramParcel2.writeString("com.google.android.gms.auth.api.signin.internal.IRevocationService");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    a();
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
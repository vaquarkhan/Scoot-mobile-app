package com.google.android.gms.b;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

final class ao
  implements am
{
  private IBinder a;
  
  ao(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public void a(Account paramAccount, int paramInt, aj paramaj)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.auth.api.accountactivationstate.internal.IAccountActivationStateService");
        if (paramAccount != null)
        {
          localParcel1.writeInt(1);
          paramAccount.writeToParcel(localParcel1, 0);
          localParcel1.writeInt(paramInt);
          if (paramaj != null)
          {
            paramAccount = paramaj.asBinder();
            localParcel1.writeStrongBinder(paramAccount);
            this.a.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramAccount = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
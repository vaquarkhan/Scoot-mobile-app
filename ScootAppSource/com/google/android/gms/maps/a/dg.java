package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.w;

public abstract class dg
  extends Binder
  implements df
{
  public static df a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
    if ((localIInterface != null) && ((localIInterface instanceof df))) {
      return (df)localIInterface;
    }
    return new dh(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnStreetViewPanoramaClickListener");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (StreetViewPanoramaOrientation)StreetViewPanoramaOrientation.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      a(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\maps\a\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
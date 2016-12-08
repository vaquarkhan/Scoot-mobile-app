package com.google.android.gms.location.places.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.AddPlaceRequest;
import com.google.android.gms.location.places.AutocompleteFilter;
import com.google.android.gms.location.places.NearbyAlertRequest;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlaceRequest;
import com.google.android.gms.location.places.UserDataType;
import com.google.android.gms.location.places.ai;
import com.google.android.gms.location.places.personalized.d;
import com.google.android.gms.location.places.t;
import com.google.android.gms.location.places.v;
import com.google.android.gms.location.places.w;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

public abstract class o
  extends Binder
  implements n
{
  public static n a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
    if ((localIInterface != null) && ((localIInterface instanceof n))) {
      return (n)localIInterface;
    }
    return new p(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject3 = null;
    Object localObject4;
    Object localObject2;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.location.places.internal.IGooglePlacesService");
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (LatLngBounds)LatLngBounds.CREATOR.createFromParcel(paramParcel1);
        paramInt1 = paramParcel1.readInt();
        localObject4 = paramParcel1.readString();
        if (paramParcel1.readInt() == 0) {
          break label324;
        }
      }
      for (localObject2 = (PlaceFilter)PlaceFilter.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        if (paramParcel1.readInt() != 0) {
          localObject3 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);
        }
        a((LatLngBounds)localObject1, paramInt1, (String)localObject4, (PlaceFilter)localObject2, (PlacesParams)localObject3, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (LatLng)LatLng.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label422;
        }
        localObject2 = (PlaceFilter)PlaceFilter.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label428;
        }
      }
      for (localObject3 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject3 = null)
      {
        a((LatLng)localObject1, (PlaceFilter)localObject2, (PlacesParams)localObject3, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label374;
      }
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (PlaceFilter)PlaceFilter.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label505;
        }
      }
      for (localObject2 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        a((PlaceFilter)localObject1, (PlacesParams)localObject2, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        a((String)localObject2, (PlacesParams)localObject1, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.createStringArrayList();
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        a((List)localObject2, (PlacesParams)localObject1, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.createStringArrayList();
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        b((List)localObject2, (PlacesParams)localObject1, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (UserDataType)UserDataType.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label785;
        }
        localObject2 = (LatLngBounds)LatLngBounds.CREATOR.createFromParcel(paramParcel1);
        localObject4 = paramParcel1.createStringArrayList();
        if (paramParcel1.readInt() == 0) {
          break label791;
        }
      }
      for (localObject3 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject3 = null)
      {
        a((UserDataType)localObject1, (LatLngBounds)localObject2, (List)localObject4, (PlacesParams)localObject3, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label729;
      }
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (PlaceRequest)PlaceRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label884;
        }
        localObject2 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label890;
        }
      }
      for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a((PlaceRequest)localObject1, (PlacesParams)localObject2, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label843;
      }
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label959;
        }
      }
      for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a((PlacesParams)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (NearbyAlertRequest)NearbyAlertRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1049;
        }
        localObject2 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1055;
        }
      }
      for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a((NearbyAlertRequest)localObject1, (PlacesParams)localObject2, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label1008;
      }
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1124;
        }
      }
      for (paramParcel1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        b((PlacesParams)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject4 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (LatLngBounds)LatLngBounds.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1229;
        }
        localObject2 = (AutocompleteFilter)AutocompleteFilter.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1235;
        }
      }
      for (localObject3 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject3 = null)
      {
        a((String)localObject4, (LatLngBounds)localObject1, (AutocompleteFilter)localObject2, (PlacesParams)localObject3, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
        localObject2 = null;
        break label1179;
      }
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (AddPlaceRequest)AddPlaceRequest.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1314;
        }
      }
      for (localObject2 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        a((AddPlaceRequest)localObject1, (PlacesParams)localObject2, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (PlaceReport)PlaceReport.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1384;
        }
      }
      for (paramParcel1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        a((PlaceReport)localObject1, paramParcel1);
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      localObject4 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        a((String)localObject2, (String)localObject3, (String)localObject4, (PlacesParams)localObject1, d.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 21: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.readString();
      localObject3 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        a((String)localObject2, (String)localObject3, (PlacesParams)localObject1, d.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        a((String)localObject2, paramInt1, (PlacesParams)localObject1, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.readString();
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        a((String)localObject2, (PlacesParams)localObject1, r.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 20: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      localObject2 = paramParcel1.readString();
      paramInt1 = paramParcel1.readInt();
      paramInt2 = paramParcel1.readInt();
      int i = paramParcel1.readInt();
      if (paramParcel1.readInt() != 0) {
        localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);
      }
      a((String)localObject2, paramInt1, paramInt2, i, (PlacesParams)localObject1, r.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 22: 
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0)
      {
        localObject1 = (LatLng)LatLng.CREATOR.createFromParcel(paramParcel1);
        if (paramParcel1.readInt() == 0) {
          break label1796;
        }
      }
      for (localObject2 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject2 = null)
      {
        a((LatLng)localObject1, (PlacesParams)localObject2, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
        localObject1 = null;
        break;
      }
    case 23: 
      label324:
      label374:
      label422:
      label428:
      label505:
      label729:
      label785:
      label791:
      label843:
      label884:
      label890:
      label959:
      label1008:
      label1049:
      label1055:
      label1124:
      label1179:
      label1229:
      label1235:
      label1314:
      label1384:
      label1796:
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
      if (paramParcel1.readInt() != 0) {}
      for (localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
      {
        a((PlacesParams)localObject1, u.a(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
    if (paramParcel1.readInt() != 0) {}
    for (localObject1 = (PlacesParams)PlacesParams.CREATOR.createFromParcel(paramParcel1);; localObject1 = null)
    {
      a((PlacesParams)localObject1, d.a(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
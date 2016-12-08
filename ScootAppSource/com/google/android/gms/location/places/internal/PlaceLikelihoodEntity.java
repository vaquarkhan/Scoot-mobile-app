package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.places.h;

public class PlaceLikelihoodEntity
  extends AbstractSafeParcelable
  implements h
{
  public static final Parcelable.Creator<PlaceLikelihoodEntity> CREATOR = new ab();
  final int a;
  final PlaceEntity b;
  final float c;
  
  PlaceLikelihoodEntity(int paramInt, PlaceEntity paramPlaceEntity, float paramFloat)
  {
    this.a = paramInt;
    this.b = paramPlaceEntity;
    this.c = paramFloat;
  }
  
  public static PlaceLikelihoodEntity a(PlaceEntity paramPlaceEntity, float paramFloat)
  {
    return new PlaceLikelihoodEntity(0, (PlaceEntity)b.a(paramPlaceEntity), paramFloat);
  }
  
  public h b()
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceLikelihoodEntity)) {
        return false;
      }
      paramObject = (PlaceLikelihoodEntity)paramObject;
    } while ((this.b.equals(((PlaceLikelihoodEntity)paramObject).b)) && (this.c == ((PlaceLikelihoodEntity)paramObject).c));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.b, Float.valueOf(this.c) });
  }
  
  public String toString()
  {
    return br.a(this).a("place", this.b).a("likelihood", Float.valueOf(this.c)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ab.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\PlaceLikelihoodEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
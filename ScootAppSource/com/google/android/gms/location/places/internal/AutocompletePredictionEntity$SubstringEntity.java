package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AutocompletePredictionEntity$SubstringEntity
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<SubstringEntity> CREATOR = new aj();
  final int a;
  final int b;
  final int c;
  
  public AutocompletePredictionEntity$SubstringEntity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof SubstringEntity)) {
        return false;
      }
      paramObject = (SubstringEntity)paramObject;
    } while ((br.a(Integer.valueOf(this.b), Integer.valueOf(((SubstringEntity)paramObject).b))) && (br.a(Integer.valueOf(this.c), Integer.valueOf(((SubstringEntity)paramObject).c))));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c) });
  }
  
  public String toString()
  {
    return br.a(this).a("offset", Integer.valueOf(this.b)).a("length", Integer.valueOf(this.c)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    aj.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\AutocompletePredictionEntity$SubstringEntity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
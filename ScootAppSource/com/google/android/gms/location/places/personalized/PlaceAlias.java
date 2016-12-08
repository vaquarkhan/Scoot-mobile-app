package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public class PlaceAlias
  extends AbstractSafeParcelable
{
  public static final f CREATOR = new f();
  public static final PlaceAlias a = new PlaceAlias(0, "Home");
  public static final PlaceAlias b = new PlaceAlias(0, "Work");
  final int c;
  private final String d;
  
  PlaceAlias(int paramInt, String paramString)
  {
    this.c = paramInt;
    this.d = paramString;
  }
  
  public String a()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof PlaceAlias)) {
      return false;
    }
    paramObject = (PlaceAlias)paramObject;
    return br.a(this.d, ((PlaceAlias)paramObject).d);
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.d });
  }
  
  public String toString()
  {
    return br.a(this).a("alias", this.d).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\personalized\PlaceAlias.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
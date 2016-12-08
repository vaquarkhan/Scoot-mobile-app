package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

@Deprecated
public class PlaceUserData
  extends AbstractSafeParcelable
{
  public static final h CREATOR = new h();
  final int a;
  private final String b;
  private final String c;
  private final List<PlaceAlias> d;
  
  PlaceUserData(int paramInt, String paramString1, String paramString2, List<PlaceAlias> paramList)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramList;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public List<PlaceAlias> c()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof PlaceUserData)) {
        return false;
      }
      paramObject = (PlaceUserData)paramObject;
    } while ((this.b.equals(((PlaceUserData)paramObject).b)) && (this.c.equals(((PlaceUserData)paramObject).c)) && (this.d.equals(((PlaceUserData)paramObject).d)));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.b, this.c, this.d });
  }
  
  public String toString()
  {
    return br.a(this).a("accountName", this.b).a("placeId", this.c).a("placeAliases", this.d).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\personalized\PlaceUserData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
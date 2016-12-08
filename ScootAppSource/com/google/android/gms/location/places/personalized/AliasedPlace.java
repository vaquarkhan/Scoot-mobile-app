package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class AliasedPlace
  implements SafeParcelable
{
  public static final a CREATOR = new a();
  final int a;
  private final String b;
  private final List<String> c;
  
  AliasedPlace(int paramInt, String paramString, List<String> paramList)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = paramList;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public List<String> b()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof AliasedPlace)) {
        return false;
      }
      paramObject = (AliasedPlace)paramObject;
    } while ((this.b.equals(((AliasedPlace)paramObject).b)) && (this.c.equals(((AliasedPlace)paramObject).c)));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.b, this.c });
  }
  
  public String toString()
  {
    return br.a(this).a("placeId", this.b).a("placeAliases", this.c).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\personalized\AliasedPlace.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
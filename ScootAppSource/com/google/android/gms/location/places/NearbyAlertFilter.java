package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class NearbyAlertFilter
  extends r
  implements SafeParcelable
{
  public static final u CREATOR = new u();
  final int a;
  final List<String> b;
  final List<Integer> c;
  final List<UserDataType> d;
  final String e;
  final boolean f;
  private final Set<String> g;
  private final Set<Integer> h;
  private final Set<UserDataType> i;
  
  NearbyAlertFilter(int paramInt, List<String> paramList, List<Integer> paramList1, List<UserDataType> paramList2, String paramString, boolean paramBoolean)
  {
    this.a = paramInt;
    if (paramList1 == null)
    {
      paramList1 = Collections.emptyList();
      this.c = paramList1;
      if (paramList2 != null) {
        break label103;
      }
      paramList1 = Collections.emptyList();
      label31:
      this.d = paramList1;
      if (paramList != null) {
        break label112;
      }
    }
    label103:
    label112:
    for (paramList = Collections.emptyList();; paramList = Collections.unmodifiableList(paramList))
    {
      this.b = paramList;
      this.h = a(this.c);
      this.i = a(this.d);
      this.g = a(this.b);
      this.e = paramString;
      this.f = paramBoolean;
      return;
      paramList1 = Collections.unmodifiableList(paramList1);
      break;
      paramList1 = Collections.unmodifiableList(paramList2);
      break label31;
    }
  }
  
  public static NearbyAlertFilter a(Collection<String> paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace ID to match results with.");
    }
    return new NearbyAlertFilter(0, c(paramCollection), null, null, null, false);
  }
  
  public static NearbyAlertFilter b(Collection<Integer> paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      throw new IllegalArgumentException("NearbyAlertFilters must contain at least oneplace type to match results with.");
    }
    return new NearbyAlertFilter(0, null, c(paramCollection), null, null, false);
  }
  
  public boolean a()
  {
    return this.f;
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
      if (!(paramObject instanceof NearbyAlertFilter)) {
        return false;
      }
      paramObject = (NearbyAlertFilter)paramObject;
      if ((this.e == null) && (((NearbyAlertFilter)paramObject).e != null)) {
        return false;
      }
    } while ((this.h.equals(((NearbyAlertFilter)paramObject).h)) && (this.i.equals(((NearbyAlertFilter)paramObject).i)) && (this.g.equals(((NearbyAlertFilter)paramObject).g)) && ((this.e == null) || (this.e.equals(((NearbyAlertFilter)paramObject).e))) && (this.f == ((NearbyAlertFilter)paramObject).a()));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.h, this.i, this.g, this.e, Boolean.valueOf(this.f) });
  }
  
  public String toString()
  {
    bt localbt = br.a(this);
    if (!this.h.isEmpty()) {
      localbt.a("types", this.h);
    }
    if (!this.g.isEmpty()) {
      localbt.a("placeIds", this.g);
    }
    if (!this.i.isEmpty()) {
      localbt.a("requestedUserDataTypes", this.i);
    }
    if (this.e != null) {
      localbt.a("chainName", this.e);
    }
    localbt.a("Beacon required: ", Boolean.valueOf(this.f));
    return localbt.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    u.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\NearbyAlertFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
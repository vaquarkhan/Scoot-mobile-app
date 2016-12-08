package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class PlaceFilter
  extends r
  implements SafeParcelable
{
  public static final w CREATOR = new w();
  private static final PlaceFilter f = new PlaceFilter();
  final int a;
  final List<Integer> b;
  final boolean c;
  final List<UserDataType> d;
  final List<String> e;
  private final Set<Integer> g;
  private final Set<UserDataType> h;
  private final Set<String> i;
  
  public PlaceFilter()
  {
    this(false, null);
  }
  
  PlaceFilter(int paramInt, List<Integer> paramList, boolean paramBoolean, List<String> paramList1, List<UserDataType> paramList2)
  {
    this.a = paramInt;
    if (paramList == null)
    {
      paramList = Collections.emptyList();
      this.b = paramList;
      this.c = paramBoolean;
      if (paramList2 != null) {
        break label97;
      }
      paramList = Collections.emptyList();
      label36:
      this.d = paramList;
      if (paramList1 != null) {
        break label106;
      }
    }
    label97:
    label106:
    for (paramList = Collections.emptyList();; paramList = Collections.unmodifiableList(paramList1))
    {
      this.e = paramList;
      this.g = a(this.b);
      this.h = a(this.d);
      this.i = a(this.e);
      return;
      paramList = Collections.unmodifiableList(paramList);
      break;
      paramList = Collections.unmodifiableList(paramList2);
      break label36;
    }
  }
  
  public PlaceFilter(Collection<Integer> paramCollection, boolean paramBoolean, Collection<String> paramCollection1, Collection<UserDataType> paramCollection2)
  {
    this(0, c(paramCollection), paramBoolean, c(paramCollection1), c(paramCollection2));
  }
  
  public PlaceFilter(boolean paramBoolean, Collection<String> paramCollection)
  {
    this(null, paramBoolean, paramCollection, null);
  }
  
  public Set<String> a()
  {
    return this.i;
  }
  
  public Set<Integer> b()
  {
    return this.g;
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
      if (!(paramObject instanceof PlaceFilter)) {
        return false;
      }
      paramObject = (PlaceFilter)paramObject;
    } while ((this.g.equals(((PlaceFilter)paramObject).g)) && (this.c == ((PlaceFilter)paramObject).c) && (this.h.equals(((PlaceFilter)paramObject).h)) && (this.i.equals(((PlaceFilter)paramObject).i)));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.g, Boolean.valueOf(this.c), this.h, this.i });
  }
  
  public String toString()
  {
    bt localbt = br.a(this);
    if (!this.g.isEmpty()) {
      localbt.a("types", this.g);
    }
    localbt.a("requireOpenNow", Boolean.valueOf(this.c));
    if (!this.i.isEmpty()) {
      localbt.a("placeIds", this.i);
    }
    if (!this.h.isEmpty()) {
      localbt.a("requestedUserDataTypes", this.h);
    }
    return localbt.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    w.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\PlaceFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
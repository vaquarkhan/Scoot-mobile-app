package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class AutocompleteFilter
  extends AbstractSafeParcelable
{
  public static final t CREATOR = new t();
  final int a;
  final boolean b;
  final List<Integer> c;
  final int d;
  
  AutocompleteFilter(int paramInt, boolean paramBoolean, List<Integer> paramList)
  {
    this.a = paramInt;
    this.c = paramList;
    this.d = a(paramList);
    if (this.a < 1)
    {
      if (!paramBoolean) {}
      for (paramBoolean = bool;; paramBoolean = false)
      {
        this.b = paramBoolean;
        return;
      }
    }
    this.b = paramBoolean;
  }
  
  private static int a(Collection<Integer> paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty())) {
      return 0;
    }
    return ((Integer)paramCollection.iterator().next()).intValue();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof AutocompleteFilter)) {
        return false;
      }
      paramObject = (AutocompleteFilter)paramObject;
    } while ((this.d == this.d) && (this.b == ((AutocompleteFilter)paramObject).b));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { Boolean.valueOf(this.b), Integer.valueOf(this.d) });
  }
  
  public String toString()
  {
    return br.a(this).a("includeQueryPredictions", Boolean.valueOf(this.b)).a("typeFilter", Integer.valueOf(this.d)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    t.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\AutocompleteFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
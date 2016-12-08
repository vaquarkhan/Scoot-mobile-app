package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class LocationResult
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<LocationResult> CREATOR = new x();
  static final List<Location> a = ;
  private final int b;
  private final List<Location> c;
  
  LocationResult(int paramInt, List<Location> paramList)
  {
    this.b = paramInt;
    this.c = paramList;
  }
  
  public List<Location> a()
  {
    return this.c;
  }
  
  int b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof LocationResult)) {
      return false;
    }
    paramObject = (LocationResult)paramObject;
    if (((LocationResult)paramObject).c.size() != this.c.size()) {
      return false;
    }
    paramObject = ((LocationResult)paramObject).c.iterator();
    Iterator localIterator = this.c.iterator();
    while (((Iterator)paramObject).hasNext())
    {
      Location localLocation1 = (Location)localIterator.next();
      Location localLocation2 = (Location)((Iterator)paramObject).next();
      if (localLocation1.getTime() != localLocation2.getTime()) {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    Iterator localIterator = this.c.iterator();
    long l;
    for (int i = 17; localIterator.hasNext(); i = (int)(l ^ l >>> 32) + i * 31) {
      l = ((Location)localIterator.next()).getTime();
    }
    return i;
  }
  
  public String toString()
  {
    String str = String.valueOf(this.c);
    return String.valueOf(str).length() + 27 + "LocationResult[locations: " + str + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    x.a(this, paramParcel, paramInt);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\LocationResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
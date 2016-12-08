package com.sagar.taxiapp.beans;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class n
  implements Parcelable.Creator
{
  public OlaBookingObject a(Parcel paramParcel)
  {
    return new OlaBookingObject(paramParcel);
  }
  
  public OlaBookingObject[] a(int paramInt)
  {
    return new OlaBookingObject[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\sagar\taxiapp\beans\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
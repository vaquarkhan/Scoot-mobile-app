package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b
  implements Parcelable.Creator<Emi>
{
  public Emi a(Parcel paramParcel)
  {
    return new Emi(paramParcel, null);
  }
  
  public Emi[] a(int paramInt)
  {
    return new Emi[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
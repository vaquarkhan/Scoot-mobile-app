package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class h
  implements Parcelable.Creator<PayuOffer>
{
  public PayuOffer a(Parcel paramParcel)
  {
    return new PayuOffer(paramParcel);
  }
  
  public PayuOffer[] a(int paramInt)
  {
    return new PayuOffer[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
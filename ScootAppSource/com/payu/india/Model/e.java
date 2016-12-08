package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class e
  implements Parcelable.Creator<PaymentParams>
{
  public PaymentParams a(Parcel paramParcel)
  {
    return new PaymentParams(paramParcel);
  }
  
  public PaymentParams[] a(int paramInt)
  {
    return new PaymentParams[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
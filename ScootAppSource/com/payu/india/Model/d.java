package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class d
  implements Parcelable.Creator<PaymentDetails>
{
  public PaymentDetails a(Parcel paramParcel)
  {
    return new PaymentDetails(paramParcel, null);
  }
  
  public PaymentDetails[] a(int paramInt)
  {
    return new PaymentDetails[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
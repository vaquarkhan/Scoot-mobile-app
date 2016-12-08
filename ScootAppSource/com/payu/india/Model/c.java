package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class c
  implements Parcelable.Creator<MerchantWebService>
{
  public MerchantWebService a(Parcel paramParcel)
  {
    return new MerchantWebService(paramParcel, null);
  }
  
  public MerchantWebService[] a(int paramInt)
  {
    return new MerchantWebService[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class i
  implements Parcelable.Creator<PayuResponse>
{
  public PayuResponse a(Parcel paramParcel)
  {
    return new PayuResponse(paramParcel);
  }
  
  public PayuResponse[] a(int paramInt)
  {
    return new PayuResponse[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
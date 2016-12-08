package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class f
  implements Parcelable.Creator<PayuConfig>
{
  public PayuConfig a(Parcel paramParcel)
  {
    return new PayuConfig(paramParcel);
  }
  
  public PayuConfig[] a(int paramInt)
  {
    return new PayuConfig[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
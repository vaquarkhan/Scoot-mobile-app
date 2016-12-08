package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class g
  implements Parcelable.Creator<PayuHashes>
{
  public PayuHashes a(Parcel paramParcel)
  {
    return new PayuHashes(paramParcel);
  }
  
  public PayuHashes[] a(int paramInt)
  {
    return new PayuHashes[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
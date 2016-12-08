package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class l
  implements Parcelable.Creator<TransactionDetails>
{
  public TransactionDetails a(Parcel paramParcel)
  {
    return new TransactionDetails(paramParcel);
  }
  
  public TransactionDetails[] a(int paramInt)
  {
    return new TransactionDetails[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
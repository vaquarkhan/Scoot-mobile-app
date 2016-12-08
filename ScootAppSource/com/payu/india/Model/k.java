package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class k
  implements Parcelable.Creator<StoredCard>
{
  public StoredCard a(Parcel paramParcel)
  {
    return new StoredCard(paramParcel);
  }
  
  public StoredCard[] a(int paramInt)
  {
    return new StoredCard[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
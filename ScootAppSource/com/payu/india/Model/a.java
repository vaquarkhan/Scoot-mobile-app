package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class a
  implements Parcelable.Creator<CardInformation>
{
  public CardInformation a(Parcel paramParcel)
  {
    return new CardInformation(paramParcel);
  }
  
  public CardInformation[] a(int paramInt)
  {
    return new CardInformation[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
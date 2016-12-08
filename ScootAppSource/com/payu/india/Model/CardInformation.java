package com.payu.india.Model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class CardInformation
  implements Parcelable
{
  public static final Parcelable.Creator<CardInformation> CREATOR = new a();
  
  public CardInformation() {}
  
  protected CardInformation(Parcel paramParcel) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\Model\CardInformation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
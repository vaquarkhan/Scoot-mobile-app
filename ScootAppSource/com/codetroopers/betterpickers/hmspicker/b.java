package com.codetroopers.betterpickers.hmspicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b
  implements Parcelable.Creator<HmsPicker.SavedState>
{
  public HmsPicker.SavedState a(Parcel paramParcel)
  {
    return new HmsPicker.SavedState(paramParcel, null);
  }
  
  public HmsPicker.SavedState[] a(int paramInt)
  {
    return new HmsPicker.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\hmspicker\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
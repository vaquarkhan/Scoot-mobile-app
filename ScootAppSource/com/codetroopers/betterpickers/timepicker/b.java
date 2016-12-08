package com.codetroopers.betterpickers.timepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b
  implements Parcelable.Creator<TimePicker.SavedState>
{
  public TimePicker.SavedState a(Parcel paramParcel)
  {
    return new TimePicker.SavedState(paramParcel, null);
  }
  
  public TimePicker.SavedState[] a(int paramInt)
  {
    return new TimePicker.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\timepicker\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
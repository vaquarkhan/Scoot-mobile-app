package com.codetroopers.betterpickers.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class c
  implements Parcelable.Creator<DatePicker.SavedState>
{
  public DatePicker.SavedState a(Parcel paramParcel)
  {
    return new DatePicker.SavedState(paramParcel, null);
  }
  
  public DatePicker.SavedState[] a(int paramInt)
  {
    return new DatePicker.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\datepicker\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.codetroopers.betterpickers.numberpicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class b
  implements Parcelable.Creator<NumberPicker.SavedState>
{
  public NumberPicker.SavedState a(Parcel paramParcel)
  {
    return new NumberPicker.SavedState(paramParcel, null);
  }
  
  public NumberPicker.SavedState[] a(int paramInt)
  {
    return new NumberPicker.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\numberpicker\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
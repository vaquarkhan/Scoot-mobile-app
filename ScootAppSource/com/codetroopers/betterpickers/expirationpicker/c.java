package com.codetroopers.betterpickers.expirationpicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class c
  implements Parcelable.Creator<ExpirationPicker.SavedState>
{
  public ExpirationPicker.SavedState a(Parcel paramParcel)
  {
    return new ExpirationPicker.SavedState(paramParcel, null);
  }
  
  public ExpirationPicker.SavedState[] a(int paramInt)
  {
    return new ExpirationPicker.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\expirationpicker\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
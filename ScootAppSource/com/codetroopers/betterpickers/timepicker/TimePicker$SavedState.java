package com.codetroopers.betterpickers.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class TimePicker$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new b();
  int a;
  int[] b;
  int c;
  
  private TimePicker$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readInt();
    paramParcel.readIntArray(this.b);
    this.c = paramParcel.readInt();
  }
  
  public TimePicker$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
    paramParcel.writeIntArray(this.b);
    paramParcel.writeInt(this.c);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\codetroopers\betterpickers\timepicker\TimePicker$SavedState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
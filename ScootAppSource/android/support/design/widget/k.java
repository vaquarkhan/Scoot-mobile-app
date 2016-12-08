package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class k
  implements Parcelable.Creator<BottomSheetBehavior.SavedState>
{
  public BottomSheetBehavior.SavedState a(Parcel paramParcel)
  {
    return new BottomSheetBehavior.SavedState(paramParcel);
  }
  
  public BottomSheetBehavior.SavedState[] a(int paramInt)
  {
    return new BottomSheetBehavior.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
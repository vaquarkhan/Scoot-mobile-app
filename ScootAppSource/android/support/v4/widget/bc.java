package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bc
  implements Parcelable.Creator<NestedScrollView.SavedState>
{
  public NestedScrollView.SavedState a(Parcel paramParcel)
  {
    return new NestedScrollView.SavedState(paramParcel);
  }
  
  public NestedScrollView.SavedState[] a(int paramInt)
  {
    return new NestedScrollView.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
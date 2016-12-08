package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class dc
  implements Parcelable.Creator<LinearLayoutManager.SavedState>
{
  public LinearLayoutManager.SavedState a(Parcel paramParcel)
  {
    return new LinearLayoutManager.SavedState(paramParcel);
  }
  
  public LinearLayoutManager.SavedState[] a(int paramInt)
  {
    return new LinearLayoutManager.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\dc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
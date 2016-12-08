package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class fv
  implements Parcelable.Creator<SearchView.SavedState>
{
  public SearchView.SavedState a(Parcel paramParcel)
  {
    return new SearchView.SavedState(paramParcel);
  }
  
  public SearchView.SavedState[] a(int paramInt)
  {
    return new SearchView.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\fv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
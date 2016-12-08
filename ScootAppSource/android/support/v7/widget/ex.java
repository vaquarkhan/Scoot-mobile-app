package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ex
  implements Parcelable.Creator<RecyclerView.SavedState>
{
  public RecyclerView.SavedState a(Parcel paramParcel)
  {
    return new RecyclerView.SavedState(paramParcel);
  }
  
  public RecyclerView.SavedState[] a(int paramInt)
  {
    return new RecyclerView.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
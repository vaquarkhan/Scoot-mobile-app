package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class gt
  implements Parcelable.Creator<Toolbar.SavedState>
{
  public Toolbar.SavedState a(Parcel paramParcel)
  {
    return new Toolbar.SavedState(paramParcel);
  }
  
  public Toolbar.SavedState[] a(int paramInt)
  {
    return new Toolbar.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\gt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
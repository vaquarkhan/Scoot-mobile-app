package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class z
  implements Parcelable.Creator<Fragment.SavedState>
{
  public Fragment.SavedState a(Parcel paramParcel)
  {
    return new Fragment.SavedState(paramParcel, null);
  }
  
  public Fragment.SavedState[] a(int paramInt)
  {
    return new Fragment.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
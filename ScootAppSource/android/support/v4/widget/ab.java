package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ab
  implements Parcelable.Creator<DrawerLayout.SavedState>
{
  public DrawerLayout.SavedState a(Parcel paramParcel)
  {
    return new DrawerLayout.SavedState(paramParcel);
  }
  
  public DrawerLayout.SavedState[] a(int paramInt)
  {
    return new DrawerLayout.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\widget\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
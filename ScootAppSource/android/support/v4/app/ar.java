package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ar
  implements Parcelable.Creator<FragmentManagerState>
{
  public FragmentManagerState a(Parcel paramParcel)
  {
    return new FragmentManagerState(paramParcel);
  }
  
  public FragmentManagerState[] a(int paramInt)
  {
    return new FragmentManagerState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
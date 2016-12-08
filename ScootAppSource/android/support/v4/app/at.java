package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class at
  implements Parcelable.Creator<FragmentState>
{
  public FragmentState a(Parcel paramParcel)
  {
    return new FragmentState(paramParcel);
  }
  
  public FragmentState[] a(int paramInt)
  {
    return new FragmentState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
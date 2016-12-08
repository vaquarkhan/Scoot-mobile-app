package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class cc
  implements Parcelable.Creator<TextInputLayout.SavedState>
{
  public TextInputLayout.SavedState a(Parcel paramParcel)
  {
    return new TextInputLayout.SavedState(paramParcel);
  }
  
  public TextInputLayout.SavedState[] a(int paramInt)
  {
    return new TextInputLayout.SavedState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\design\widget\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
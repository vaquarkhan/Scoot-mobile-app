package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bo
  implements Parcelable.Creator<UpdateDisplayState>
{
  public UpdateDisplayState a(Parcel paramParcel)
  {
    Bundle localBundle = new Bundle(UpdateDisplayState.class.getClassLoader());
    localBundle.readFromParcel(paramParcel);
    return new UpdateDisplayState(localBundle, null);
  }
  
  public UpdateDisplayState[] a(int paramInt)
  {
    return new UpdateDisplayState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
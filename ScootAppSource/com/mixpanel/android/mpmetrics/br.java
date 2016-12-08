package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class br
  implements Parcelable.Creator<UpdateDisplayState.DisplayState.InAppNotificationState>
{
  public UpdateDisplayState.DisplayState.InAppNotificationState a(Parcel paramParcel)
  {
    Bundle localBundle = new Bundle(UpdateDisplayState.DisplayState.InAppNotificationState.class.getClassLoader());
    localBundle.readFromParcel(paramParcel);
    return new UpdateDisplayState.DisplayState.InAppNotificationState(localBundle, null);
  }
  
  public UpdateDisplayState.DisplayState.InAppNotificationState[] a(int paramInt)
  {
    return new UpdateDisplayState.DisplayState.InAppNotificationState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\br.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
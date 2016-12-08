package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class w
  implements Parcelable.Creator<InAppNotification>
{
  public InAppNotification a(Parcel paramParcel)
  {
    return new InAppNotification(paramParcel);
  }
  
  public InAppNotification[] a(int paramInt)
  {
    return new InAppNotification[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
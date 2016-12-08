package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class UpdateDisplayState$DisplayState$InAppNotificationState
  extends UpdateDisplayState.DisplayState
{
  public static final Parcelable.Creator<InAppNotificationState> CREATOR = new br();
  private static String c = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY";
  private static String d = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY";
  private final InAppNotification a;
  private final int b;
  
  private UpdateDisplayState$DisplayState$InAppNotificationState(Bundle paramBundle)
  {
    super(null);
    this.a = ((InAppNotification)paramBundle.getParcelable(c));
    this.b = paramBundle.getInt(d);
  }
  
  public UpdateDisplayState$DisplayState$InAppNotificationState(InAppNotification paramInAppNotification, int paramInt)
  {
    super(null);
    this.a = paramInAppNotification;
    this.b = paramInt;
  }
  
  public String a()
  {
    return "InAppNotificationState";
  }
  
  public int b()
  {
    return this.b;
  }
  
  public InAppNotification c()
  {
    return this.a;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putParcelable(c, this.a);
    localBundle.putInt(d, this.b);
    paramParcel.writeBundle(localBundle);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\UpdateDisplayState$DisplayState$InAppNotificationState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
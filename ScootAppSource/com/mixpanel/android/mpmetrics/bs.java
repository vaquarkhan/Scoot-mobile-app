package com.mixpanel.android.mpmetrics;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

final class bs
  implements Parcelable.Creator<UpdateDisplayState.DisplayState.SurveyState>
{
  public UpdateDisplayState.DisplayState.SurveyState a(Parcel paramParcel)
  {
    Bundle localBundle = new Bundle(UpdateDisplayState.DisplayState.SurveyState.class.getClassLoader());
    localBundle.readFromParcel(paramParcel);
    return new UpdateDisplayState.DisplayState.SurveyState(localBundle, null);
  }
  
  public UpdateDisplayState.DisplayState.SurveyState[] a(int paramInt)
  {
    return new UpdateDisplayState.DisplayState.SurveyState[paramInt];
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class UpdateDisplayState$DisplayState$SurveyState
  extends UpdateDisplayState.DisplayState
{
  public static final Parcelable.Creator<SurveyState> CREATOR = new bs();
  private final Survey a;
  private final UpdateDisplayState.AnswerMap b;
  private Bitmap c;
  private int d;
  
  private UpdateDisplayState$DisplayState$SurveyState(Bundle paramBundle)
  {
    super(null);
    this.d = paramBundle.getInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY");
    this.b = ((UpdateDisplayState.AnswerMap)paramBundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY"));
    byte[] arrayOfByte = paramBundle.getByteArray("com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY");
    if (arrayOfByte != null) {}
    for (this.c = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);; this.c = null)
    {
      this.a = ((Survey)paramBundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY"));
      return;
    }
  }
  
  public UpdateDisplayState$DisplayState$SurveyState(Survey paramSurvey)
  {
    super(null);
    this.a = paramSurvey;
    this.b = new UpdateDisplayState.AnswerMap();
    this.d = -16777216;
    this.c = null;
  }
  
  public String a()
  {
    return "SurveyState";
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.c = paramBitmap;
  }
  
  public Bitmap b()
  {
    return this.c;
  }
  
  public UpdateDisplayState.AnswerMap c()
  {
    return this.b;
  }
  
  public Survey d()
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
    localBundle.putInt("com.mixpanel.android.mpmetrics.UpdateDisplayState.HIGHLIGHT_COLOR_BUNDLE_KEY", this.d);
    localBundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.ANSWERS_BUNDLE_KEY", this.b);
    Object localObject = null;
    if (this.c != null)
    {
      localObject = new ByteArrayOutputStream();
      this.c.compress(Bitmap.CompressFormat.PNG, 20, (OutputStream)localObject);
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
    }
    localBundle.putByteArray("com.mixpanel.android.mpmetrics.UpdateDisplayState.BACKGROUND_COMPRESSED_BUNDLE_KEY", (byte[])localObject);
    localBundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.SURVEY_BUNDLE_KEY", this.a);
    paramParcel.writeBundle(localBundle);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\UpdateDisplayState$DisplayState$SurveyState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
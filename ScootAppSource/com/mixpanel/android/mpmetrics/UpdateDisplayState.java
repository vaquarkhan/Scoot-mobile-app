package com.mixpanel.android.mpmetrics;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.util.concurrent.locks.ReentrantLock;

@TargetApi(16)
public class UpdateDisplayState
  implements Parcelable
{
  public static final Parcelable.Creator<UpdateDisplayState> CREATOR = new bo();
  private static final ReentrantLock d = new ReentrantLock();
  private static long e = -1L;
  private static UpdateDisplayState f = null;
  private static int g = 0;
  private static int h = -1;
  private final String a;
  private final String b;
  private final UpdateDisplayState.DisplayState c;
  
  private UpdateDisplayState(Bundle paramBundle)
  {
    this.a = paramBundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY");
    this.b = paramBundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY");
    this.c = ((UpdateDisplayState.DisplayState)paramBundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY"));
  }
  
  UpdateDisplayState(UpdateDisplayState.DisplayState paramDisplayState, String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramDisplayState;
  }
  
  static int a(UpdateDisplayState.DisplayState paramDisplayState, String paramString1, String paramString2)
  {
    int i = -1;
    if (!d.isHeldByCurrentThread()) {
      throw new AssertionError();
    }
    if (!b())
    {
      e = System.currentTimeMillis();
      f = new UpdateDisplayState(paramDisplayState, paramString1, paramString2);
      g += 1;
      i = g;
    }
    while (!ab.a) {
      return i;
    }
    Log.v("MixpanelAPI.UpDisplSt", "Already showing (or cooking) a Mixpanel update, declining to show another.");
    return -1;
  }
  
  static ReentrantLock a()
  {
    return d;
  }
  
  public static void a(int paramInt)
  {
    d.lock();
    try
    {
      if (paramInt == h)
      {
        h = -1;
        f = null;
      }
      return;
    }
    finally
    {
      d.unlock();
    }
  }
  
  public static UpdateDisplayState b(int paramInt)
  {
    d.lock();
    try
    {
      if (h > 0)
      {
        int i = h;
        if (i != paramInt) {
          return null;
        }
      }
      UpdateDisplayState localUpdateDisplayState = f;
      if (localUpdateDisplayState == null) {
        return null;
      }
      e = System.currentTimeMillis();
      h = paramInt;
      localUpdateDisplayState = f;
      return localUpdateDisplayState;
    }
    finally
    {
      d.unlock();
    }
  }
  
  static boolean b()
  {
    if (!d.isHeldByCurrentThread()) {
      throw new AssertionError();
    }
    long l1 = System.currentTimeMillis();
    long l2 = e;
    if ((g > 0) && (l1 - l2 > 43200000L))
    {
      Log.i("MixpanelAPI.UpDisplSt", "UpdateDisplayState set long, long ago, without showing. Update state will be cleared.");
      f = null;
    }
    return f != null;
  }
  
  public UpdateDisplayState.DisplayState c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.a;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String e()
  {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY", this.a);
    localBundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY", this.b);
    localBundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY", this.c);
    paramParcel.writeBundle(localBundle);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\UpdateDisplayState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
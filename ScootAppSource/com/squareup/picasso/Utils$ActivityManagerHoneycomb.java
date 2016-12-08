package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;

@TargetApi(11)
class Utils$ActivityManagerHoneycomb
{
  static int getLargeMemoryClass(ActivityManager paramActivityManager)
  {
    return paramActivityManager.getLargeMemoryClass();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\picasso\Utils$ActivityManagerHoneycomb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
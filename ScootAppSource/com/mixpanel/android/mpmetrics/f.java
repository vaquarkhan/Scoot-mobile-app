package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.graphics.Color;

final class f
{
  private static final int a = Color.argb(186, 28, 28, 28);
  
  public static void a(Activity paramActivity, i parami)
  {
    paramActivity.runOnUiThread(new g(paramActivity, parami));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
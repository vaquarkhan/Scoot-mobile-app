package com.mixpanel.android.mpmetrics;

import android.util.Log;

final class e
  implements aj
{
  e(d paramd, String paramString) {}
  
  public void a(af paramaf)
  {
    if (ab.a) {
      Log.v("MixpanelAPI.Messages", "Using existing pushId " + this.a);
    }
    paramaf.c().a(this.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
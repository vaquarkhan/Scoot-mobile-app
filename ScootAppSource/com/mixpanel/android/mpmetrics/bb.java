package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

final class bb
  implements Callable<SharedPreferences>
{
  private final Context a;
  private final String b;
  private final bc c;
  
  public bb(Context paramContext, String paramString, bc parambc)
  {
    this.a = paramContext;
    this.b = paramString;
    this.c = parambc;
  }
  
  public SharedPreferences a()
  {
    SharedPreferences localSharedPreferences = this.a.getSharedPreferences(this.b, 0);
    if (this.c != null) {
      this.c.a(localSharedPreferences);
    }
    return localSharedPreferences;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
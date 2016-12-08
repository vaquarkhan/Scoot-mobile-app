package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

final class ba
{
  private final Executor a = Executors.newSingleThreadExecutor();
  
  public Future<SharedPreferences> a(Context paramContext, String paramString, bc parambc)
  {
    paramContext = new FutureTask(new bb(paramContext, paramString, parambc));
    this.a.execute(paramContext);
    return paramContext;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

final class h
  extends e
{
  public h(Context paramContext, String paramString, ScheduledExecutorService paramScheduledExecutorService)
  {
    super(paramContext, paramString, paramScheduledExecutorService);
  }
  
  public String a()
  {
    return "https://api.appsflyer.com/install_data/v3/";
  }
  
  protected void a(String paramString, int paramInt)
  {
    c.b().a(paramString);
    if ((paramInt >= 400) && (paramInt < 500))
    {
      paramInt = ((Context)this.a.get()).getSharedPreferences("appsflyer-data", 0).getInt("appsflyerConversionDataRequestRetries", 0);
      c.a((Context)this.a.get(), "appsflyerConversionDataRequestRetries", paramInt + 1);
    }
  }
  
  protected void a(Map<String, String> paramMap)
  {
    c.b().a(paramMap);
    ((Context)this.a.get()).getSharedPreferences("appsflyer-data", 0);
    c.a((Context)this.a.get(), "appsflyerConversionDataRequestRetries", 0);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsflyer\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
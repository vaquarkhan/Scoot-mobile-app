package com.payu.custombrowser;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.Timer;

public final class ad
{
  private static ad b;
  private String a;
  private final Activity c;
  private String d = "https://info.payu.in/merchant/postservice.php?form=2";
  private boolean e = false;
  private ArrayList<String> f;
  private Timer g;
  
  private ad(Activity paramActivity, String paramString)
  {
    this.c = paramActivity;
    this.a = paramString;
    this.f = new ArrayList();
    Thread.setDefaultUncaughtExceptionHandler(new ae(this, Thread.getDefaultUncaughtExceptionHandler()));
  }
  
  public static ad a(Activity paramActivity, String paramString)
  {
    try
    {
      if (b == null) {
        b = new ad(paramActivity, paramString);
      }
      paramActivity = b;
      return paramActivity;
    }
    finally {}
  }
  
  private void a()
  {
    if (this.g != null) {
      this.g.cancel();
    }
    this.g = new Timer();
    this.g.schedule(new ag(this), 5000L);
  }
  
  private void b()
  {
    try
    {
      this.e = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void c()
  {
    try
    {
      this.e = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private boolean d()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.c.getSystemService("connectivity")).getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnectedOrConnecting());
  }
  
  public void a(String paramString)
  {
    a();
    if (this.e) {
      try
      {
        this.f.add(paramString);
        return;
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
        return;
      }
    }
    new af(this, paramString).execute(new Void[] { null, null, null });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
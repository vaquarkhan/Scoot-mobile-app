package com.appsee;

import android.view.View;
import java.util.Map;

public final class Appsee
{
  static final boolean A = false;
  static String B = "2.2";
  static String G = "https://api.appsee.com";
  static int M = 3;
  static final String l = "https://%s.api.appsee.com";
  
  public static void addAppseeListener(AppseeListener paramAppseeListener)
  {
    try
    {
      ei.C(paramAppseeListener);
      return;
    }
    catch (Exception paramAppseeListener)
    {
      ue.C(paramAppseeListener, "Fatal error in Appsee:addAppseeListener.");
    }
  }
  
  public static void addEvent(String paramString)
  {
    try
    {
      fc.C().C(paramString, null);
      return;
    }
    catch (Exception paramString)
    {
      ue.C(paramString, "Fatal error in Appsee:addEvent.");
    }
  }
  
  public static void addEvent(String paramString, Map<String, Object> paramMap)
  {
    try
    {
      fc.C().C(paramString, paramMap);
      return;
    }
    catch (Exception paramString)
    {
      ue.C(paramString, "Fatal error in Appsee:addEvent.");
    }
  }
  
  public static void appendSDKType(String paramString)
  {
    if ((bb.C(paramString)) || (B.endsWith(paramString))) {
      return;
    }
    B += paramString;
  }
  
  public static void forceNewSession()
  {
    try
    {
      ei.C(kj.M);
      return;
    }
    catch (Exception localException)
    {
      ue.C(localException, "Fatal error in Appsee:forceNewSession.");
    }
  }
  
  public static String generate3rdPartyId(String paramString, boolean paramBoolean)
  {
    try
    {
      paramString = fb.C().C(paramString, paramBoolean);
      return paramString;
    }
    catch (Exception paramString)
    {
      ue.C(paramString, "Fatal error in Appsee:generate3rdPartyId.");
    }
    return null;
  }
  
  public static boolean getOptOutStatus()
  {
    try
    {
      boolean bool = fd.C().a();
      return bool;
    }
    catch (Exception localException)
    {
      ue.C(localException, "Fatal error in Appsee:getOptOutStatus.");
    }
    return false;
  }
  
  public static void markViewAsSensitive(View paramView)
  {
    try
    {
      rc.C().H(paramView);
      return;
    }
    catch (Exception paramView)
    {
      ue.C(paramView, "Fatal error in Appsee:markViewAsSensitive.");
    }
  }
  
  public static void pause()
  {
    try
    {
      fd.C().c();
      return;
    }
    catch (Exception localException)
    {
      ue.C(localException, "Fatal error in Appsee:pause.");
    }
  }
  
  public static void removeAppseeListener(AppseeListener paramAppseeListener)
  {
    try
    {
      ei.H(paramAppseeListener);
      return;
    }
    catch (Exception paramAppseeListener)
    {
      ue.C(paramAppseeListener, "Fatal error in Appsee:removeAppseeListener.");
    }
  }
  
  public static void resume()
  {
    try
    {
      fd.C().i();
      return;
    }
    catch (Exception localException)
    {
      ue.C(localException, "Fatal error in Appsee:resume.");
    }
  }
  
  public static void set3rdPartyId(String paramString1, String paramString2, boolean paramBoolean)
  {
    try
    {
      fb.C().C(paramString1, paramString2, paramBoolean);
      return;
    }
    catch (Exception paramString1)
    {
      ue.C(paramString1, "Fatal error in Appsee:set3rdPartyId.");
    }
  }
  
  public static void setDebugToLogcat(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 2;; i = 3) {
      try
      {
        vd.C(i);
        return;
      }
      catch (Exception localException)
      {
        ue.C(localException, "Fatal error in Appsee:setDebugToLog.");
      }
    }
  }
  
  public static void setLocation(double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2)
  {
    try
    {
      fc.C().C(new od(paramDouble1, paramDouble2, paramFloat1, paramFloat2));
      return;
    }
    catch (Exception localException)
    {
      ue.C(localException, "Fatal error in Appsee:setLocation.");
    }
  }
  
  public static void setLocationDescription(String paramString)
  {
    try
    {
      fc.C().C(paramString);
      return;
    }
    catch (Exception paramString)
    {
      ue.C(paramString, "Fatal error in Appsee:setLocationDescription.");
    }
  }
  
  public static void setOptOutStatus(boolean paramBoolean)
  {
    try
    {
      fd.C().a(paramBoolean);
      return;
    }
    catch (Exception localException)
    {
      ue.C(localException, "Fatal error in Appsee:setOptOutStatus.");
    }
  }
  
  public static void setSkipStartValidation(boolean paramBoolean)
  {
    fd.C().K(paramBoolean);
  }
  
  public static void setUserId(String paramString)
  {
    try
    {
      fc.C().H(paramString);
      return;
    }
    catch (Exception paramString)
    {
      ue.C(paramString, "Fatal error in Appsee:setUserId.");
    }
  }
  
  public static void start(String paramString)
  {
    if (bb.C(paramString)) {
      throw new NullPointerException("apiKey cannot be null or empty");
    }
    try
    {
      G = String.format("https://%s.api.appsee.com", new Object[] { bb.a(paramString) });
      vd.C(2, "Starting Appsee v%s%s", new Object[] { B, "" });
      fd.C().H(paramString);
      return;
    }
    catch (Exception paramString)
    {
      ue.C(paramString, "Fatal error in Appsee:start.");
    }
  }
  
  public static void startScreen(String paramString)
  {
    try
    {
      zc.C().C(paramString, xc.l, false);
      return;
    }
    catch (Exception paramString)
    {
      ue.C(paramString, "Fatal error in Appsee:startScreen.");
    }
  }
  
  public static void stop()
  {
    try
    {
      fd.C().j();
      return;
    }
    catch (Exception localException)
    {
      ue.C(localException, "Fatal error in Appsee:stop.");
    }
  }
  
  public static void stopAndUpload()
  {
    try
    {
      fd.C().A(true);
      return;
    }
    catch (Exception localException)
    {
      ue.C(localException, "Fatal error in Appsee:stopAndUpload.");
    }
  }
  
  public static void unmarkViewAsSensitive(View paramView)
  {
    try
    {
      rc.C().C(paramView);
      return;
    }
    catch (Exception paramView)
    {
      ue.C(paramView, "Fatal error in Appsee:unmarkViewAsSensitive.");
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\appsee\Appsee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
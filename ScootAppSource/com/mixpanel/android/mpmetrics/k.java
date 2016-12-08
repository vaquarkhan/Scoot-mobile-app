package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.List;

final class k
{
  public static String a = "MixpanelAPI.ConfigurationChecker";
  
  public static boolean a(Context paramContext)
  {
    if (paramContext.getPackageManager().checkPermission("android.permission.INTERNET", paramContext.getPackageName()) != 0)
    {
      Log.w(a, "Package does not have permission android.permission.INTERNET - Mixpanel will not work at all!");
      Log.i(a, "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
      return false;
    }
    return true;
  }
  
  public static boolean b(Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 16) {
      return false;
    }
    Intent localIntent = new Intent(paramContext, com.mixpanel.android.surveys.k.class);
    localIntent.addFlags(268435456);
    localIntent.addFlags(131072);
    if (paramContext.getPackageManager().queryIntentActivities(localIntent, 0).size() == 0)
    {
      Log.w(a, com.mixpanel.android.surveys.k.class.getName() + " is not registered as an activity in your application, so surveys can't be shown.");
      Log.i(a, "Please add the child tag <activity android:name=\"com.mixpanel.android.surveys.SurveyActivity\" /> to your <application> tag.");
      return false;
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
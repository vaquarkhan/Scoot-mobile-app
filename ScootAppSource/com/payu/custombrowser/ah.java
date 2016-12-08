package com.payu.custombrowser;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public final class ah
{
  static Drawable a(Context paramContext, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21) {
      return paramContext.getResources().getDrawable(paramInt);
    }
    return paramContext.getResources().getDrawable(paramInt, paramContext.getTheme());
  }
  
  static String a(Activity paramActivity)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.densityDpi + "";
  }
  
  static String a(Activity paramActivity, String paramString)
  {
    return paramActivity.getSharedPreferences("com.payu.custombrowser", 0).getString(paramString, "");
  }
  
  static String a(String paramString)
  {
    try
    {
      if (!paramString.contains("||"))
      {
        if (paramString.length() > 128) {
          return paramString.substring(0, 127);
        }
      }
      else
      {
        paramString = new StringTokenizer(paramString, "||");
        Object localObject = paramString.nextToken();
        String str = paramString.nextToken();
        paramString = (String)localObject;
        if (((String)localObject).length() > 128) {
          paramString = ((String)localObject).substring(0, 125);
        }
        localObject = str;
        if (str.length() > 128) {
          localObject = str.substring(0, 125);
        }
        paramString = paramString + "||" + (String)localObject;
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      return "";
    }
    return "";
  }
  
  static void a(float paramFloat, View paramView)
  {
    if (Build.VERSION.SDK_INT < 11)
    {
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(paramFloat, paramFloat);
      localAlphaAnimation.setDuration(10L);
      localAlphaAnimation.setFillAfter(true);
      paramView.startAnimation(localAlphaAnimation);
      return;
    }
    paramView.setAlpha(paramFloat);
  }
  
  static void a(Activity paramActivity, String paramString1, String paramString2)
  {
    Object localObject = a(paramActivity, paramString1);
    if (((String)localObject).equalsIgnoreCase("")) {}
    for (;;)
    {
      paramActivity = paramActivity.getSharedPreferences("com.payu.custombrowser", 0).edit();
      paramActivity.putString(paramString1, paramString2);
      paramActivity.apply();
      return;
      if (!((String)localObject).contains("||"))
      {
        paramString2 = (String)localObject + "||" + paramString2;
      }
      else
      {
        localObject = new StringTokenizer((String)localObject, "||");
        ((StringTokenizer)localObject).nextToken();
        paramString2 = ((StringTokenizer)localObject).nextToken() + "||" + paramString2;
      }
    }
  }
  
  static void a(String paramString1, String paramString2, String paramString3)
  {
    if (paramString2 != null) {}
    try
    {
      if (!paramString2.trim().equals(""))
      {
        paramString1 = Class.forName(paramString1).getDeclaredField(paramString3);
        paramString1.setAccessible(true);
        paramString1.set(null, paramString2);
        paramString1.setAccessible(false);
      }
      return;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  static void a(String paramString, boolean paramBoolean, Activity paramActivity)
  {
    paramActivity = paramActivity.getSharedPreferences("com.payu", 0).edit();
    paramActivity.putBoolean(paramString, paramBoolean);
    paramActivity.apply();
  }
  
  static boolean a(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getAllNetworkInfo();
    int i1 = paramContext.length;
    int i = 0;
    int j = 0;
    int m = 0;
    while (i < i1)
    {
      Object localObject = paramContext[i];
      int k = m;
      if (((NetworkInfo)localObject).getTypeName().equalsIgnoreCase("WIFI"))
      {
        k = m;
        if (((NetworkInfo)localObject).isConnected()) {
          k = 1;
        }
      }
      int n = j;
      if (((NetworkInfo)localObject).getTypeName().equalsIgnoreCase("MOBILE"))
      {
        n = j;
        if (((NetworkInfo)localObject).isConnected()) {
          n = 1;
        }
      }
      i += 1;
      m = k;
      j = n;
    }
    return (m != 0) || (j != 0);
  }
  
  static boolean a(String paramString, Activity paramActivity)
  {
    return paramActivity.getSharedPreferences("com.payu", 0).getBoolean(paramString, false);
  }
  
  static int b(String paramString)
  {
    if (paramString.equalsIgnoreCase("pin")) {
      return 3;
    }
    if (paramString.equalsIgnoreCase("password")) {
      return 1;
    }
    if (paramString.equalsIgnoreCase("enter manually")) {
      return 4;
    }
    if (paramString.equalsIgnoreCase("approve")) {
      return 5;
    }
    if ((paramString.equalsIgnoreCase("otp")) || (paramString.equalsIgnoreCase("use sms otp"))) {
      return 6;
    }
    if (paramString.equalsIgnoreCase("sms otp")) {
      return 7;
    }
    if (paramString.equalsIgnoreCase("regenerate otp")) {
      return 2;
    }
    return 0;
  }
  
  static String b(Activity paramActivity)
  {
    if (paramActivity != null) {
      try
      {
        if (!paramActivity.isFinishing())
        {
          paramActivity = ((ConnectivityManager)paramActivity.getSystemService("connectivity")).getActiveNetworkInfo();
          if ((paramActivity == null) || (!paramActivity.isConnected())) {
            break label149;
          }
          if (paramActivity.getType() == 1) {
            return "WIFI";
          }
          if (paramActivity.getType() == 0) {
            switch (paramActivity.getSubtype())
            {
            case 13: 
              return "4G";
            }
          }
        }
      }
      catch (Exception paramActivity)
      {
        return "?";
      }
    }
    return "?";
    label149:
    return "Not connected";
    return "?";
    return "GPRS";
    return "EDGE";
    return "CDMA";
    return "2G";
    return "HSPA";
    return "3G";
  }
  
  static void b(Activity paramActivity, String paramString)
  {
    try
    {
      paramActivity = paramActivity.getSharedPreferences("com.payu.custombrowser", 0).edit();
      paramActivity.remove(paramString);
      paramActivity.apply();
      return;
    }
    catch (Exception paramActivity)
    {
      paramActivity.printStackTrace();
    }
  }
  
  static int c(Activity paramActivity)
  {
    label232:
    for (;;)
    {
      try
      {
        NetworkInfo[] arrayOfNetworkInfo = ((ConnectivityManager)paramActivity.getSystemService("connectivity")).getAllNetworkInfo();
        paramActivity = (TelephonyManager)paramActivity.getSystemService("phone");
        int m = arrayOfNetworkInfo.length;
        int j = 0;
        int i = 0;
        int k = i;
        if (j < m)
        {
          Object localObject = arrayOfNetworkInfo[j];
          k = i;
          if (Build.VERSION.SDK_INT >= 18)
          {
            k = i;
            if (((NetworkInfo)localObject).getTypeName().equalsIgnoreCase("MOBILE"))
            {
              k = i;
              if (((NetworkInfo)localObject).isConnected())
              {
                localObject = paramActivity.getAllCellInfo().iterator();
                k = i;
                if (((Iterator)localObject).hasNext())
                {
                  CellInfo localCellInfo = (CellInfo)((Iterator)localObject).next();
                  if (!localCellInfo.isRegistered()) {
                    break label232;
                  }
                  if ((localCellInfo instanceof CellInfoGsm))
                  {
                    i = ((CellInfoGsm)localCellInfo).getCellSignalStrength().getDbm();
                    break label232;
                  }
                  if ((localCellInfo instanceof CellInfoCdma))
                  {
                    i = ((CellInfoCdma)localCellInfo).getCellSignalStrength().getDbm();
                    break label232;
                  }
                  if ((localCellInfo instanceof CellInfoLte))
                  {
                    i = ((CellInfoLte)localCellInfo).getCellSignalStrength().getDbm();
                    break label232;
                  }
                  if (!(localCellInfo instanceof CellInfoWcdma)) {
                    break label232;
                  }
                  i = ((CellInfoWcdma)localCellInfo).getCellSignalStrength().getDbm();
                  break label232;
                }
              }
            }
          }
          j += 1;
          i = k;
        }
        else
        {
          return k;
        }
      }
      catch (Exception paramActivity)
      {
        k = 0;
      }
    }
  }
  
  String a(FileInputStream paramFileInputStream)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    for (;;)
    {
      try
      {
        int j = paramFileInputStream.read();
        if (j != -1) {
          if (i % 2 == 0) {
            localStringBuilder.append((char)(j - (i % 5 + 1)));
          } else {
            localStringBuilder.append((char)(j + (i % 5 + 1)));
          }
        }
      }
      catch (IOException paramFileInputStream)
      {
        paramFileInputStream.printStackTrace();
        return "";
        paramFileInputStream.close();
        return localStringBuilder.toString();
      }
      catch (Exception paramFileInputStream)
      {
        paramFileInputStream.printStackTrace();
        return "";
      }
      i += 1;
    }
  }
  
  void a(View paramView, Activity paramActivity)
  {
    if (paramActivity != null)
    {
      paramView.setFocusableInTouchMode(true);
      paramView.requestFocus();
      ((InputMethodManager)paramActivity.getSystemService("input_method")).showSoftInput(paramView, 2);
    }
  }
  
  void d(Activity paramActivity)
  {
    if (paramActivity != null)
    {
      View localView = paramActivity.getCurrentFocus();
      if (localView != null) {
        ((InputMethodManager)paramActivity.getSystemService("input_method")).hideSoftInputFromWindow(localView.getWindowToken(), 0);
      }
    }
  }
  
  void e(Activity paramActivity)
  {
    if (paramActivity != null) {
      paramActivity.getWindow().setSoftInputMode(3);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\custombrowser\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
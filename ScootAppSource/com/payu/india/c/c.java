package com.payu.india.c;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
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
import android.view.WindowManager;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PostData;
import com.payu.india.Model.StoredCard;
import com.payu.india.e.f;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public class c
{
  public static Set<String> a = new HashSet();
  private static String b;
  
  static
  {
    a.add("504435");
    a.add("504645");
    a.add("504775");
    a.add("504809");
    a.add("504993");
    a.add("600206");
    a.add("603845");
    a.add("622018");
    a.add("504774");
  }
  
  static String a(Activity paramActivity)
  {
    if (paramActivity != null) {
      try
      {
        if (!paramActivity.isFinishing())
        {
          paramActivity = ((ConnectivityManager)paramActivity.getSystemService("connectivity")).getActiveNetworkInfo();
          if ((paramActivity == null) || (!paramActivity.isConnected())) {
            break label146;
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
    label146:
    return "Not connected";
    return "?";
    return "GPRS";
    return "EDGE";
    return "CDMA";
    return "2G";
    return "HSPA";
    return "3G";
  }
  
  public static void a(PayuConfig paramPayuConfig)
  {
    f(b(paramPayuConfig));
  }
  
  private String b(Activity paramActivity)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.densityDpi + "";
  }
  
  private static String b(PayuConfig paramPayuConfig)
  {
    for (;;)
    {
      int i;
      int j;
      try
      {
        paramPayuConfig = paramPayuConfig.a().split("&");
        int k = paramPayuConfig.length;
        i = 0;
        if (i >= k) {
          break label95;
        }
        arrayOfString = paramPayuConfig[i].split("=");
        if (arrayOfString.length < 2) {
          break label116;
        }
        String str = arrayOfString[0];
        j = -1;
        switch (str.hashCode())
        {
        case 106079: 
          if (!str.equals("key")) {
            break label97;
          }
          j = 0;
        }
      }
      catch (Exception paramPayuConfig)
      {
        String[] arrayOfString;
        paramPayuConfig.printStackTrace();
      }
      paramPayuConfig = arrayOfString[1];
      return paramPayuConfig;
      label95:
      return null;
      label97:
      switch (j)
      {
      }
      label116:
      i += 1;
    }
  }
  
  private int c(Activity paramActivity)
  {
    label239:
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
                    break label239;
                  }
                  if ((localCellInfo instanceof CellInfoGsm))
                  {
                    i = ((CellInfoGsm)localCellInfo).getCellSignalStrength().getDbm();
                    break label239;
                  }
                  if ((localCellInfo instanceof CellInfoCdma))
                  {
                    i = ((CellInfoCdma)localCellInfo).getCellSignalStrength().getDbm();
                    break label239;
                  }
                  if ((localCellInfo instanceof CellInfoLte))
                  {
                    i = ((CellInfoLte)localCellInfo).getCellSignalStrength().getDbm();
                    break label239;
                  }
                  if (!(localCellInfo instanceof CellInfoWcdma)) {
                    break label239;
                  }
                  i = ((CellInfoWcdma)localCellInfo).getCellSignalStrength().getDbm();
                  break label239;
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
  
  public static void f(String paramString)
  {
    if (paramString != null) {}
    try
    {
      if (!paramString.trim().equals(""))
      {
        b = paramString;
        Field localField = Class.forName("com.payu.custombrowser.a").getDeclaredField("keyAnalytics");
        localField.setAccessible(true);
        localField.set(null, paramString);
        localField.setAccessible(false);
      }
      return;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
  }
  
  protected PostData a(int paramInt, String paramString)
  {
    return a(paramInt, "ERROR", paramString);
  }
  
  protected PostData a(int paramInt, String paramString1, String paramString2)
  {
    PostData localPostData = new PostData();
    localPostData.a(paramInt);
    localPostData.a(paramString1);
    localPostData.b(paramString2);
    return localPostData;
  }
  
  public Boolean a(String paramString)
  {
    if (paramString.length() < 12) {
      return Boolean.valueOf(false);
    }
    if ((c(paramString).contentEquals("RUPAY")) && (paramString.length() == 16)) {
      return b(paramString);
    }
    if ((c(paramString).contentEquals("VISA")) && (paramString.length() == 16)) {
      return b(paramString);
    }
    if ((c(paramString).contentEquals("MAST")) && (paramString.length() == 16)) {
      return b(paramString);
    }
    if (((c(paramString).contentEquals("MAES")) || (c(paramString).contentEquals("SMAE"))) && (paramString.length() >= 12) && (paramString.length() <= 19)) {
      return b(paramString);
    }
    if ((c(paramString).contentEquals("DINR")) && (paramString.length() == 14)) {
      return b(paramString);
    }
    if ((c(paramString).contentEquals("AMEX")) && (paramString.length() == 15)) {
      return b(paramString);
    }
    if ((c(paramString).contentEquals("JCB")) && (paramString.length() == 16)) {
      return b(paramString);
    }
    return Boolean.valueOf(false);
  }
  
  public String a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, "default");
  }
  
  public String a(Context paramContext, String paramString1, String paramString2)
  {
    return paramContext.getSharedPreferences("PayuPreference", 0).getString(paramString1, paramString2);
  }
  
  public HashMap<String, ArrayList<StoredCard>> a(Context paramContext, ArrayList<StoredCard> paramArrayList)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    HashMap localHashMap = new HashMap();
    paramContext = paramContext.getSharedPreferences("PayuPreference", 0);
    if (paramArrayList != null)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        StoredCard localStoredCard = (StoredCard)paramArrayList.next();
        if (((localStoredCard.h() == 1) && (!paramContext.getString(localStoredCard.e(), "default").contains("default"))) || (c(localStoredCard.g()).contentEquals("SMAE"))) {
          localArrayList1.add(localStoredCard);
        } else {
          localArrayList2.add(localStoredCard);
        }
      }
    }
    localHashMap.put("one_click_checkout", localArrayList1);
    localHashMap.put("store_card", localArrayList2);
    return localHashMap;
  }
  
  public HashMap<String, ArrayList<StoredCard>> a(ArrayList<StoredCard> paramArrayList, HashMap<String, String> paramHashMap)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    HashMap localHashMap = new HashMap();
    if (paramArrayList != null)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        StoredCard localStoredCard = (StoredCard)paramArrayList.next();
        if (((paramHashMap != null) && (localStoredCard.h() == 1) && (paramHashMap.containsKey(localStoredCard.e()))) || (c(localStoredCard.g()).contentEquals("SMAE"))) {
          localArrayList1.add(localStoredCard);
        } else {
          localArrayList2.add(localStoredCard);
        }
      }
    }
    localHashMap.put("one_click_checkout", localArrayList1);
    localHashMap.put("store_card", localArrayList2);
    return localHashMap;
  }
  
  public void a(Activity paramActivity, String paramString1, String paramString2, String paramString3)
  {
    JSONObject localJSONObject = new JSONObject();
    for (;;)
    {
      try
      {
        localJSONObject.put("resolution", b(paramActivity) + "");
        localJSONObject.put("device_manufacturer", Build.MANUFACTURER);
        localJSONObject.put("device_model", Build.MODEL);
        if ((b == null) || (b.trim().equals(""))) {
          continue;
        }
        localJSONObject.put("merchant_key", b);
        localJSONObject.put("txnid", paramString3);
        localJSONObject.put("sdk_version", "4.3.4");
        localJSONObject.put("cb_version", paramString1);
        localJSONObject.put("os_version", Build.VERSION.SDK_INT + "");
        localJSONObject.put("network_info", a(paramActivity) + "");
        localJSONObject.put("network_strength", c(paramActivity) + "");
      }
      catch (Exception paramString1)
      {
        paramString1.printStackTrace();
        continue;
      }
      new f(paramActivity, "sdk_local_cache_device").a(localJSONObject.toString());
      return;
      localJSONObject.put("merchant_key", paramString2);
    }
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    boolean bool2 = true;
    Calendar localCalendar = Calendar.getInstance();
    boolean bool1;
    if ((paramInt1 < 1) || (paramInt1 > 12) || (String.valueOf(paramInt2).length() != 4)) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        if (localCalendar.get(1) > paramInt2) {
          break;
        }
        bool1 = bool2;
      } while (localCalendar.get(1) != paramInt2);
      bool1 = bool2;
    } while (localCalendar.get(2) + 1 <= paramInt1);
    return false;
  }
  
  public boolean a(String paramString1, String paramString2)
  {
    paramString1 = c(paramString1);
    if (paramString1.contentEquals("SMAE")) {}
    for (;;)
    {
      return true;
      boolean bool2 = paramString1.contentEquals("AMEX");
      if (paramString2.length() == 4) {}
      for (boolean bool1 = true; (!(bool1 & bool2)) && ((paramString1.contentEquals("AMEX")) || (paramString2.length() != 3)); bool1 = false) {
        return false;
      }
    }
  }
  
  public Boolean b(String paramString)
  {
    int j = paramString.length() - 1;
    int k = 0;
    int m = 0;
    if (j >= 0)
    {
      int n = Integer.parseInt(paramString.substring(j, j + 1));
      int i = n;
      if (k != 0)
      {
        n *= 2;
        i = n;
        if (n > 9) {
          i = n % 10 + 1;
        }
      }
      m += i;
      if (k == 0) {}
      for (i = 1;; i = 0)
      {
        j -= 1;
        k = i;
        break;
      }
    }
    if (m % 10 == 0) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  protected String b(String paramString1, String paramString2)
  {
    return paramString1 + "=" + paramString2 + "&";
  }
  
  public String c(String paramString)
  {
    if (paramString.startsWith("4")) {
      return "VISA";
    }
    if (paramString.matches("^508[5-9][0-9][0-9]|60698[5-9]|60699[0-9]|607[0-8][0-9][0-9]|6079[0-7][0-9]|60798[0-4]|(?!608000)608[0-4][0-9][0-9]|608500|6521[5-9][0-9]|652[2-9][0-9][0-9]|6530[0-9][0-9]|6531[0-4][0-9]")) {
      return "RUPAY";
    }
    if (paramString.matches("^((6304)|(6706)|(6771)|(6709))[\\d]+")) {
      return "LASER";
    }
    if (paramString.matches("6(?:011|5[0-9]{2})[0-9]{12}[\\d]+")) {
      return "LASER";
    }
    if ((paramString.matches("(5[06-8]|6\\d)\\d{14}(\\d{2,3})?[\\d]+")) || (paramString.matches("(5[06-8]|6\\d)[\\d]+")) || (paramString.matches("((504([435|645|774|775|809|993]))|(60([0206]|[3845]))|(622[018])\\d)[\\d]+")))
    {
      if ((paramString.length() >= 6) && (a.contains(paramString.substring(0, 6)))) {
        return "SMAE";
      }
      return "MAES";
    }
    if (paramString.matches("^5[1-5][\\d]+")) {
      return "MAST";
    }
    if (paramString.matches("^3[47][\\d]+")) {
      return "AMEX";
    }
    if ((paramString.startsWith("36")) || (paramString.matches("^30[0-5][\\d]+")) || (paramString.matches("2(014|149)[\\d]+"))) {
      return "DINR";
    }
    if (paramString.matches("^35(2[89]|[3-8][0-9])[\\d]+")) {
      return "JCB";
    }
    return "";
  }
  
  protected PostData d(String paramString)
  {
    return a(5001, "ERROR", paramString);
  }
  
  protected String e(String paramString)
  {
    String str = paramString;
    if (paramString.charAt(paramString.length() - 1) == '&') {
      str = paramString.substring(0, paramString.length() - 1);
    }
    return str;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\payu\india\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
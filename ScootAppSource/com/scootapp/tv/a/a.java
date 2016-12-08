package com.scootapp.tv.a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.a.ah;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.gms.analytics.l;
import com.google.android.gms.analytics.r;
import com.parse.ParseCloud;
import com.payu.india.Model.PaymentParams;
import com.payu.india.Model.PayuConfig;
import com.payu.india.Model.PayuHashes;
import com.payu.payuui.PayUBaseActivity;
import com.sagar.taxiapp.ApplicationTaxi;
import com.sagar.taxiapp.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class a
{
  public static boolean a = false;
  public static String[] b = { "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION" };
  public static String[] c = { "android.permission.CALL_PHONE" };
  
  public static int a(Context paramContext, String paramString)
  {
    if (paramString == null) {
      return android.support.v4.b.c.c(paramContext, 2131689480);
    }
    if (paramString.toLowerCase(Locale.ENGLISH).contains("ola")) {
      return android.support.v4.b.c.c(paramContext, 2131689524);
    }
    if (paramString.toLowerCase(Locale.ENGLISH).contains("uber")) {
      return android.support.v4.b.c.c(paramContext, 2131689526);
    }
    if (paramString.toLowerCase(Locale.ENGLISH).contains("meru")) {
      return android.support.v4.b.c.c(paramContext, 2131689522);
    }
    if (paramString.toLowerCase(Locale.ENGLISH).contains("easycabs")) {
      return android.support.v4.b.c.c(paramContext, 2131689518);
    }
    if (paramString.toLowerCase(Locale.ENGLISH).contains("tfs")) {
      return android.support.v4.b.c.c(paramContext, 2131689525);
    }
    if (paramString.toLowerCase(Locale.ENGLISH).contains("jugnoo")) {
      return android.support.v4.b.c.c(paramContext, 2131689521);
    }
    if ((paramString.toLowerCase(Locale.ENGLISH).contains("watsons")) || (paramString.toLowerCase(Locale.ENGLISH).contains("puma"))) {
      return android.support.v4.b.c.c(paramContext, 2131689527);
    }
    return android.support.v4.b.c.c(paramContext, 2131689480);
  }
  
  public static int a(String paramString)
  {
    if (paramString == null) {}
    do
    {
      return 2130837907;
      if (paramString.toLowerCase().contains("ola")) {
        return 2130837870;
      }
      if (paramString.toLowerCase().contains("uber")) {
        return 2130837870;
      }
      if (paramString.toLowerCase().contains("meru")) {
        return 2130837870;
      }
      if (paramString.toLowerCase().contains("easycabs")) {
        return 2130837870;
      }
      if ((paramString.equalsIgnoreCase("clear car rental")) || (paramString.equalsIgnoreCase("ccr"))) {
        return 2130837620;
      }
      if (paramString.equalsIgnoreCase("makson")) {
        return 2130837852;
      }
      if ((paramString.equalsIgnoreCase("one way cabs")) || (paramString.equalsIgnoreCase("onewaycabs"))) {
        return 2130837871;
      }
      if (paramString.equalsIgnoreCase("roder")) {
        return 2130837815;
      }
    } while (!paramString.equalsIgnoreCase("savaari"));
    return 2130837898;
  }
  
  public static String a(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
  }
  
  public static void a(ah paramah, ProgressDialog paramProgressDialog, HashMap<String, Object> paramHashMap, com.sagar.taxiapp.beans.b paramb, String paramString)
  {
    ParseCloud.callFunctionInBackground("savaariCabsBooking", paramHashMap, new d(paramb, paramString, paramah, paramProgressDialog));
  }
  
  public static void a(ah paramah, PaymentParams paramPaymentParams, PayuHashes paramPayuHashes)
  {
    PayuConfig localPayuConfig = new PayuConfig();
    localPayuConfig.a(0);
    Intent localIntent = new Intent(paramah, PayUBaseActivity.class);
    localIntent.putExtra("payuConfig", localPayuConfig);
    localIntent.putExtra("payment_params", paramPaymentParams);
    localIntent.putExtra("payu_hashes", paramPayuHashes);
    localIntent.putExtra("key", "Key");
    paramah.startActivityForResult(localIntent, 100);
  }
  
  public static void a(ah paramah, HashMap<String, Object> paramHashMap, com.scootapp.tv.c.a parama)
  {
    String str3 = paramHashMap.get("email").toString();
    PaymentParams localPaymentParams = new PaymentParams();
    String str1 = paramah.getSharedPreferences("shareddata", 0).getString("Key", "");
    String str2 = paramah.getSharedPreferences("shareddata", 0).getString("Salt", "");
    localPaymentParams.a(str1);
    localPaymentParams.c(paramHashMap.get("totalAmount").toString());
    localPaymentParams.d("SCOOT CAB BOOKING");
    localPaymentParams.e(paramHashMap.get("firstName").toString());
    localPaymentParams.f(paramHashMap.get("email").toString());
    localPaymentParams.b(paramHashMap.get("tripId").toString());
    localPaymentParams.g("https://scoot-payments.herokuapp.com/payu_success.php");
    localPaymentParams.h("https://scoot-payments.herokuapp.com/payu_failure.php");
    localPaymentParams.o(String.format("%s:%s", new Object[] { str1, str3 }));
    localPaymentParams.j("");
    localPaymentParams.k("");
    localPaymentParams.l("");
    localPaymentParams.m("");
    localPaymentParams.n("");
    Log.v("Scoot", "User Credentials " + localPaymentParams.L());
    paramHashMap = new HashMap();
    paramHashMap.put("payhashStr", String.format("%s|%s|%s|%s|%s|%s|%s|%s|%s|%s|%s||||||%s", new Object[] { str1, localPaymentParams.b(), localPaymentParams.c(), "SCOOT CAB BOOKING", localPaymentParams.e(), localPaymentParams.f(), "", "", "", "", "", str2 }));
    paramHashMap.put("merchantCodesHashStr", String.format("%s|%s|%s|%s", new Object[] { str1, "get_merchant_ibibo_codes", "default", str2 }));
    paramHashMap.put("mobileSdkStr", String.format("%s|%s|%s|%s", new Object[] { str1, "vas_for_mobile_sdk", "default", str2 }));
    paramHashMap.put("detailsForMobileSdkStr", String.format("%s|%s|%s|%s", new Object[] { str1, "payment_related_details_for_mobile_sdk", localPaymentParams.L(), str2 }));
    paramHashMap.put("deleteHashStr", String.format("%s|%s|%s|%s", new Object[] { str1, "delete_user_card", localPaymentParams.L(), str2 }));
    paramHashMap.put("getUserCardHashStr", String.format("%s|%s|%s|%s", new Object[] { str1, "get_user_cards", localPaymentParams.L(), str2 }));
    paramHashMap.put("editUserCardHashStr", String.format("%s|%s|%s|%s", new Object[] { str1, "edit_user_card", localPaymentParams.L(), str2 }));
    paramHashMap.put("saveUserCardHashStr", String.format("%s|%s|%s|%s", new Object[] { str1, "save_user_card", localPaymentParams.L(), str2 }));
    ParseCloud.callFunctionInBackground("payuHash", paramHashMap, new b(parama, paramah, localPaymentParams));
  }
  
  public static void a(ah paramah, HashMap<String, Object> paramHashMap, String paramString1, com.sagar.taxiapp.beans.b paramb, String paramString2)
  {
    ((ApplicationTaxi)paramah.getApplication()).a(ab.a).a(new l().a("USER_EVENTS").b("INTERCITY/RENTAL").c(paramString1 + " " + paramString2 + " payment successful").a());
    ProgressDialog localProgressDialog = new ProgressDialog(paramah);
    localProgressDialog.setTitle("Confirming Booking");
    localProgressDialog.setMessage("Please wait while we confirm your Cab");
    localProgressDialog.setCancelable(false);
    localProgressDialog.setIndeterminate(true);
    localProgressDialog.show();
    new Handler().postDelayed(new c(paramString1, paramah, localProgressDialog, paramHashMap, paramb, paramString2), 2000L);
  }
  
  public static void b(ah paramah, ProgressDialog paramProgressDialog, HashMap<String, Object> paramHashMap, com.sagar.taxiapp.beans.b paramb, String paramString)
  {
    ParseCloud.callFunctionInBackground("roderBooking", paramHashMap, new i(paramb, paramah, paramProgressDialog));
  }
  
  public static void b(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("email", paramString);
    ParseCloud.callFunctionInBackground("rideHistory", localHashMap, new y());
  }
  
  public static boolean b(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (paramContext != null) && (paramContext.isConnectedOrConnecting());
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
    while (paramContext.hasNext()) {
      if (paramString.equals(((ActivityManager.RunningServiceInfo)paramContext.next()).service.getClassName())) {
        return true;
      }
    }
    return false;
  }
  
  public static void c(ah paramah, ProgressDialog paramProgressDialog, HashMap<String, Object> paramHashMap, com.sagar.taxiapp.beans.b paramb, String paramString)
  {
    ParseCloud.callFunctionInBackground("OneWayCabBooking", paramHashMap, new m(paramb, paramah, paramProgressDialog));
  }
  
  public static void d(ah paramah, ProgressDialog paramProgressDialog, HashMap<String, Object> paramHashMap, com.sagar.taxiapp.beans.b paramb, String paramString)
  {
    ParseCloud.callFunctionInBackground("CCRBookingConfirm", paramHashMap, new q(paramString, paramb, paramah, paramProgressDialog));
  }
  
  public static void e(ah paramah, ProgressDialog paramProgressDialog, HashMap<String, Object> paramHashMap, com.sagar.taxiapp.beans.b paramb, String paramString)
  {
    ParseCloud.callFunctionInBackground("MaksonBooking", paramHashMap, new u(paramb, paramString, paramah, paramProgressDialog));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\scootapp\tv\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

final class q
{
  private final com.facebook.a.a a;
  private String b;
  private String c;
  
  q(Context paramContext, String paramString)
  {
    this.b = paramString;
    this.a = com.facebook.a.a.a(paramContext, paramString);
    try
    {
      paramContext = paramContext.getPackageManager();
      if (paramContext != null)
      {
        paramContext = paramContext.getPackageInfo("com.facebook.katana", 0);
        if (paramContext != null) {
          this.c = paramContext.versionName;
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
  }
  
  static Bundle a(String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
    localBundle.putString("0_auth_logger_id", paramString);
    localBundle.putString("3_method", "");
    localBundle.putString("2_result", "");
    localBundle.putString("5_error_message", "");
    localBundle.putString("4_error_code", "");
    localBundle.putString("6_extras", "");
    return localBundle;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public void a(LoginClient.Request paramRequest)
  {
    Bundle localBundle = a(paramRequest.e());
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("login_behavior", paramRequest.b().toString());
      localJSONObject.put("request_code", LoginClient.d());
      localJSONObject.put("permissions", TextUtils.join(",", paramRequest.a()));
      localJSONObject.put("default_audience", paramRequest.c().toString());
      localJSONObject.put("isReauthorize", paramRequest.f());
      if (this.c != null) {
        localJSONObject.put("facebookVersion", this.c);
      }
      localBundle.putString("6_extras", localJSONObject.toString());
    }
    catch (JSONException paramRequest)
    {
      for (;;) {}
    }
    this.a.a("fb_mobile_login_start", null, localBundle);
  }
  
  public void a(String paramString1, String paramString2)
  {
    paramString1 = a(paramString1);
    paramString1.putString("3_method", paramString2);
    this.a.a("fb_mobile_login_method_start", null, paramString1);
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    Bundle localBundle = a("");
    localBundle.putString("2_result", m.c.a());
    localBundle.putString("5_error_message", paramString2);
    localBundle.putString("3_method", paramString3);
    this.a.a(paramString1, null, localBundle);
  }
  
  public void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Map<String, String> paramMap)
  {
    paramString1 = a(paramString1);
    if (paramString3 != null) {
      paramString1.putString("2_result", paramString3);
    }
    if (paramString4 != null) {
      paramString1.putString("5_error_message", paramString4);
    }
    if (paramString5 != null) {
      paramString1.putString("4_error_code", paramString5);
    }
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      paramString1.putString("6_extras", new JSONObject(paramMap).toString());
    }
    paramString1.putString("3_method", paramString2);
    this.a.a("fb_mobile_login_method_complete", null, paramString1);
  }
  
  public void a(String paramString, Map<String, String> paramMap1, m paramm, Map<String, String> paramMap2, Exception paramException)
  {
    Bundle localBundle = a(paramString);
    if (paramm != null) {
      localBundle.putString("2_result", paramm.a());
    }
    if ((paramException != null) && (paramException.getMessage() != null)) {
      localBundle.putString("5_error_message", paramException.getMessage());
    }
    if (!paramMap1.isEmpty()) {}
    for (paramString = new JSONObject(paramMap1);; paramString = null)
    {
      paramMap1 = paramString;
      if (paramMap2 != null)
      {
        if (paramString != null) {
          break label174;
        }
        paramString = new JSONObject();
      }
      label174:
      for (;;)
      {
        try
        {
          paramMap1 = paramMap2.entrySet().iterator();
          if (paramMap1.hasNext())
          {
            paramm = (Map.Entry)paramMap1.next();
            paramString.put((String)paramm.getKey(), paramm.getValue());
            continue;
            if (paramMap1 == null) {}
          }
        }
        catch (JSONException paramMap1)
        {
          paramMap1 = paramString;
        }
        for (;;)
        {
          localBundle.putString("6_extras", paramMap1.toString());
          this.a.a("fb_mobile_login_complete", null, localBundle);
          return;
          paramMap1 = paramString;
        }
      }
    }
  }
  
  public void b(String paramString1, String paramString2)
  {
    a(paramString1, paramString2, "");
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\login\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
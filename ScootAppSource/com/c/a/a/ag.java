package com.c.a.a;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import b.a.a.a.a.d.c;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

final class ag
  implements c<ab>
{
  public byte[] a(ab paramab)
  {
    return b(paramab).toString().getBytes("UTF-8");
  }
  
  @TargetApi(9)
  public JSONObject b(ab paramab)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      af localaf = paramab.a;
      localJSONObject.put("appBundleId", localaf.a);
      localJSONObject.put("executionId", localaf.b);
      localJSONObject.put("installationId", localaf.c);
      localJSONObject.put("androidId", localaf.d);
      localJSONObject.put("advertisingId", localaf.e);
      localJSONObject.put("limitAdTrackingEnabled", localaf.f);
      localJSONObject.put("betaDeviceToken", localaf.g);
      localJSONObject.put("buildId", localaf.h);
      localJSONObject.put("osVersion", localaf.i);
      localJSONObject.put("deviceModel", localaf.j);
      localJSONObject.put("appVersionCode", localaf.k);
      localJSONObject.put("appVersionName", localaf.l);
      localJSONObject.put("timestamp", paramab.b);
      localJSONObject.put("type", paramab.c.toString());
      if (paramab.d != null) {
        localJSONObject.put("details", new JSONObject(paramab.d));
      }
      localJSONObject.put("customType", paramab.e);
      if (paramab.f != null) {
        localJSONObject.put("customAttributes", new JSONObject(paramab.f));
      }
      localJSONObject.put("predefinedType", paramab.g);
      if (paramab.h != null) {
        localJSONObject.put("predefinedAttributes", new JSONObject(paramab.h));
      }
      return localJSONObject;
    }
    catch (JSONException paramab)
    {
      if (Build.VERSION.SDK_INT >= 9) {
        throw new IOException(paramab.getMessage(), paramab);
      }
      throw new IOException(paramab.getMessage());
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\a\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
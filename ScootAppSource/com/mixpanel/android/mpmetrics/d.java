package com.mixpanel.android.mpmetrics;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.mixpanel.android.b.g;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

final class d
  extends Handler
{
  private ac b = null;
  private final l c = a();
  private final long d;
  private final boolean e;
  private long f;
  
  public d(c paramc, Looper paramLooper)
  {
    super(paramLooper);
    this.e = paramc.a.b.d();
    this.d = paramc.a.b.b(paramc.a.a);
    c.a(paramc, new bk(paramc.a.a));
    this.f = -1L;
  }
  
  private JSONObject a(b paramb)
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = paramb.b();
    JSONObject localJSONObject3 = b();
    localJSONObject3.put("token", paramb.c());
    if (localJSONObject2 != null)
    {
      Iterator localIterator = localJSONObject2.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localJSONObject3.put(str, localJSONObject2.get(str));
      }
    }
    localJSONObject1.put("event", paramb.a());
    localJSONObject1.put("properties", localJSONObject3);
    return localJSONObject1;
  }
  
  private void a(ac paramac)
  {
    if (!this.a.a.c().a(this.a.a.a))
    {
      a.a(this.a.a, "Not flushing data to Mixpanel because the device is not connected to the internet.");
      return;
    }
    a.a(this.a.a, "Sending records to Mixpanel");
    if (this.e)
    {
      a(paramac, ae.a, new String[] { this.a.a.b.i() });
      a(paramac, ae.b, new String[] { this.a.a.b.j() });
      return;
    }
    a(paramac, ae.a, new String[] { this.a.a.b.i(), this.a.a.b.l() });
    a(paramac, ae.b, new String[] { this.a.a.b.j(), this.a.a.b.m() });
  }
  
  private void a(ac paramac, ae paramae, String[] paramArrayOfString)
  {
    g localg = this.a.a.c();
    Object localObject1 = paramac.a(paramae);
    String str1;
    String str2;
    ArrayList localArrayList;
    int i;
    int k;
    int j;
    if (localObject1 != null)
    {
      str1 = localObject1[0];
      str2 = localObject1[1];
      localObject1 = com.mixpanel.android.b.b.a(str2);
      localArrayList = new ArrayList(1);
      localArrayList.add(new BasicNameValuePair("data", (String)localObject1));
      if (ab.a) {
        localArrayList.add(new BasicNameValuePair("verbose", "1"));
      }
      i = 1;
      int i2 = paramArrayOfString.length;
      k = 0;
      j = i;
      if (k < i2)
      {
        localObject1 = paramArrayOfString[k];
        j = i;
      }
    }
    try
    {
      localObject2 = localg.a((String)localObject1, localArrayList, this.a.a.b.r());
      n = 1;
      i1 = 1;
      m = 1;
      if (localObject2 != null) {
        break label240;
      }
      j = n;
      i = i1;
      a.a(this.a.a, "Response was null, unexpected failure posting to " + (String)localObject1 + ".");
      j = m;
    }
    catch (OutOfMemoryError paramArrayOfString)
    {
      for (;;)
      {
        try
        {
          int m;
          Object localObject2 = new String((byte[])localObject2, "UTF-8");
          j = n;
          i = i1;
          a.a(this.a.a, "Successfully posted to " + (String)localObject1 + ": \n" + str2);
          j = n;
          i = i1;
          a.a(this.a.a, "Response was " + (String)localObject2);
          j = m;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          int n;
          int i1;
          j = n;
          i = i1;
          throw new RuntimeException("UTF not supported on this platform?", localUnsupportedEncodingException);
        }
        paramArrayOfString = paramArrayOfString;
        Log.e("MixpanelAPI.Messages", "Out of memory when posting to " + (String)localObject1 + ".", paramArrayOfString);
      }
    }
    catch (MalformedURLException paramArrayOfString)
    {
      for (;;)
      {
        Log.e("MixpanelAPI.Messages", "Cannot interpret " + (String)localObject1 + " as a URL.", paramArrayOfString);
        j = i;
      }
    }
    catch (IOException localIOException)
    {
      a.a(this.a.a, "Cannot post message to " + (String)localObject1 + ".", localIOException);
      i = 0;
      k += 1;
    }
    if (j != 0)
    {
      a.a(this.a.a, "Not retrying this batch of events, deleting them from DB.");
      paramac.a(str1, paramae);
    }
    label240:
    do
    {
      return;
      j = n;
      i = i1;
      break;
      a.a(this.a.a, "Retrying this batch of events.");
    } while (hasMessages(2));
    sendEmptyMessageDelayed(2, this.d);
  }
  
  private void a(String paramString)
  {
    try
    {
      if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.a.a.a) != 0)
      {
        Log.i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play Services are not installed.");
        return;
      }
    }
    catch (RuntimeException paramString)
    {
      Log.i("MixpanelAPI.Messages", "Can't register for push notifications, Google Play services are not configured.");
      return;
    }
    catch (IOException paramString)
    {
      Log.i("MixpanelAPI.Messages", "Exception when trying to register for GCM", paramString);
      return;
      paramString = GoogleCloudMessaging.getInstance(this.a.a.a).register(new String[] { paramString });
      af.a(new e(this, paramString));
      return;
    }
    catch (NoClassDefFoundError paramString)
    {
      Log.w("MixpanelAPI.Messages", "Google play services were not part of this build, push notifications cannot be registered or delivered");
    }
  }
  
  private JSONObject b()
  {
    localJSONObject = new JSONObject();
    localJSONObject.put("mp_lib", "android");
    localJSONObject.put("$lib_version", "4.6.4");
    localJSONObject.put("$os", "Android");
    Object localObject;
    if (Build.VERSION.RELEASE == null)
    {
      localObject = "UNKNOWN";
      localJSONObject.put("$os_version", localObject);
      if (Build.MANUFACTURER != null) {
        break label427;
      }
      localObject = "UNKNOWN";
      label70:
      localJSONObject.put("$manufacturer", localObject);
      if (Build.BRAND != null) {
        break label434;
      }
      localObject = "UNKNOWN";
      label89:
      localJSONObject.put("$brand", localObject);
      if (Build.MODEL != null) {
        break label441;
      }
      localObject = "UNKNOWN";
      label108:
      localJSONObject.put("$model", localObject);
    }
    for (;;)
    {
      try
      {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.a.a.a);
        switch (i)
        {
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        localJSONObject.put("$google_play_services", "not configured");
        continue;
      }
      catch (NoClassDefFoundError localNoClassDefFoundError)
      {
        label427:
        label434:
        label441:
        localJSONObject.put("$google_play_services", "not included");
        continue;
        localJSONObject.put("$google_play_services", "missing");
        continue;
        localJSONObject.put("$google_play_services", "out of date");
        continue;
        localJSONObject.put("$google_play_services", "disabled");
        continue;
        localJSONObject.put("$google_play_services", "invalid");
        continue;
      }
      localObject = c.c(this.a).d();
      localJSONObject.put("$screen_dpi", ((DisplayMetrics)localObject).densityDpi);
      localJSONObject.put("$screen_height", ((DisplayMetrics)localObject).heightPixels);
      localJSONObject.put("$screen_width", ((DisplayMetrics)localObject).widthPixels);
      localObject = c.c(this.a).a();
      if (localObject != null) {
        localJSONObject.put("$app_version", localObject);
      }
      localObject = Boolean.valueOf(c.c(this.a).b());
      if (localObject != null) {
        localJSONObject.put("$has_nfc", ((Boolean)localObject).booleanValue());
      }
      localObject = Boolean.valueOf(c.c(this.a).c());
      if (localObject != null) {
        localJSONObject.put("$has_telephone", ((Boolean)localObject).booleanValue());
      }
      localObject = c.c(this.a).e();
      if (localObject != null) {
        localJSONObject.put("$carrier", localObject);
      }
      localObject = c.c(this.a).f();
      if (localObject != null) {
        localJSONObject.put("$wifi", ((Boolean)localObject).booleanValue());
      }
      localObject = c.c(this.a).g();
      if (localObject != null) {
        localJSONObject.put("$bluetooth_enabled", localObject);
      }
      localObject = c.c(this.a).h();
      if (localObject != null) {
        localJSONObject.put("$bluetooth_version", localObject);
      }
      return localJSONObject;
      localObject = Build.VERSION.RELEASE;
      break;
      localObject = Build.MANUFACTURER;
      break label70;
      localObject = Build.BRAND;
      break label89;
      localObject = Build.MODEL;
      break label108;
      localJSONObject.put("$google_play_services", "available");
    }
  }
  
  protected l a()
  {
    return new l(this.a.a.a, this.a.a.b);
  }
  
  /* Error */
  public void handleMessage(android.os.Message arg1)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	com/mixpanel/android/mpmetrics/d:b	Lcom/mixpanel/android/mpmetrics/ac;
    //   4: ifnonnull +83 -> 87
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   12: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   15: aload_0
    //   16: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   19: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   22: getfield 49	com/mixpanel/android/mpmetrics/a:a	Landroid/content/Context;
    //   25: invokevirtual 449	com/mixpanel/android/mpmetrics/a:b	(Landroid/content/Context;)Lcom/mixpanel/android/mpmetrics/ac;
    //   28: putfield 24	com/mixpanel/android/mpmetrics/d:b	Lcom/mixpanel/android/mpmetrics/ac;
    //   31: aload_0
    //   32: getfield 24	com/mixpanel/android/mpmetrics/d:b	Lcom/mixpanel/android/mpmetrics/ac;
    //   35: invokestatic 455	java/lang/System:currentTimeMillis	()J
    //   38: aload_0
    //   39: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   42: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   45: getfield 39	com/mixpanel/android/mpmetrics/a:b	Lcom/mixpanel/android/mpmetrics/ab;
    //   48: invokevirtual 458	com/mixpanel/android/mpmetrics/ab:b	()I
    //   51: i2l
    //   52: lsub
    //   53: getstatic 134	com/mixpanel/android/mpmetrics/ae:a	Lcom/mixpanel/android/mpmetrics/ae;
    //   56: invokevirtual 461	com/mixpanel/android/mpmetrics/ac:a	(JLcom/mixpanel/android/mpmetrics/ae;)V
    //   59: aload_0
    //   60: getfield 24	com/mixpanel/android/mpmetrics/d:b	Lcom/mixpanel/android/mpmetrics/ac;
    //   63: invokestatic 455	java/lang/System:currentTimeMillis	()J
    //   66: aload_0
    //   67: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   70: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   73: getfield 39	com/mixpanel/android/mpmetrics/a:b	Lcom/mixpanel/android/mpmetrics/ab;
    //   76: invokevirtual 458	com/mixpanel/android/mpmetrics/ab:b	()I
    //   79: i2l
    //   80: lsub
    //   81: getstatic 142	com/mixpanel/android/mpmetrics/ae:b	Lcom/mixpanel/android/mpmetrics/ae;
    //   84: invokevirtual 461	com/mixpanel/android/mpmetrics/ac:a	(JLcom/mixpanel/android/mpmetrics/ae;)V
    //   87: bipush -3
    //   89: istore_3
    //   90: aload_1
    //   91: getfield 466	android/os/Message:what	I
    //   94: ifne +149 -> 243
    //   97: aload_1
    //   98: getfield 470	android/os/Message:obj	Ljava/lang/Object;
    //   101: checkcast 70	org/json/JSONObject
    //   104: astore_1
    //   105: aload_0
    //   106: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   109: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   112: ldc_w 472
    //   115: invokestatic 127	com/mixpanel/android/mpmetrics/a:a	(Lcom/mixpanel/android/mpmetrics/a;Ljava/lang/String;)V
    //   118: aload_0
    //   119: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   122: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   125: new 202	java/lang/StringBuilder
    //   128: dup
    //   129: invokespecial 203	java/lang/StringBuilder:<init>	()V
    //   132: ldc_w 474
    //   135: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: aload_1
    //   139: invokevirtual 475	org/json/JSONObject:toString	()Ljava/lang/String;
    //   142: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   148: invokestatic 127	com/mixpanel/android/mpmetrics/a:a	(Lcom/mixpanel/android/mpmetrics/a;Ljava/lang/String;)V
    //   151: aload_0
    //   152: getfield 24	com/mixpanel/android/mpmetrics/d:b	Lcom/mixpanel/android/mpmetrics/ac;
    //   155: aload_1
    //   156: getstatic 142	com/mixpanel/android/mpmetrics/ae:b	Lcom/mixpanel/android/mpmetrics/ae;
    //   159: invokevirtual 478	com/mixpanel/android/mpmetrics/ac:a	(Lorg/json/JSONObject;Lcom/mixpanel/android/mpmetrics/ae;)I
    //   162: istore_2
    //   163: iload_2
    //   164: aload_0
    //   165: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   168: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   171: getfield 39	com/mixpanel/android/mpmetrics/a:b	Lcom/mixpanel/android/mpmetrics/ab;
    //   174: invokevirtual 480	com/mixpanel/android/mpmetrics/ab:a	()I
    //   177: if_icmpge +9 -> 186
    //   180: iload_2
    //   181: bipush -2
    //   183: if_icmpne +614 -> 797
    //   186: invokestatic 485	android/os/SystemClock:elapsedRealtime	()J
    //   189: aload_0
    //   190: getfield 66	com/mixpanel/android/mpmetrics/d:f	J
    //   193: lcmp
    //   194: iflt +603 -> 797
    //   197: aload_0
    //   198: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   201: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   204: ldc_w 487
    //   207: invokestatic 127	com/mixpanel/android/mpmetrics/a:a	(Lcom/mixpanel/android/mpmetrics/a;Ljava/lang/String;)V
    //   210: aload_0
    //   211: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   214: invokestatic 490	com/mixpanel/android/mpmetrics/c:a	(Lcom/mixpanel/android/mpmetrics/c;)V
    //   217: aload_0
    //   218: aload_0
    //   219: getfield 24	com/mixpanel/android/mpmetrics/d:b	Lcom/mixpanel/android/mpmetrics/ac;
    //   222: invokespecial 492	com/mixpanel/android/mpmetrics/d:a	(Lcom/mixpanel/android/mpmetrics/ac;)V
    //   225: aload_0
    //   226: getfield 29	com/mixpanel/android/mpmetrics/d:c	Lcom/mixpanel/android/mpmetrics/l;
    //   229: aload_0
    //   230: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   233: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   236: invokevirtual 117	com/mixpanel/android/mpmetrics/a:c	()Lcom/mixpanel/android/b/g;
    //   239: invokevirtual 495	com/mixpanel/android/mpmetrics/l:a	(Lcom/mixpanel/android/b/g;)V
    //   242: return
    //   243: aload_1
    //   244: getfield 466	android/os/Message:what	I
    //   247: iconst_1
    //   248: if_icmpne +120 -> 368
    //   251: aload_1
    //   252: getfield 470	android/os/Message:obj	Ljava/lang/Object;
    //   255: checkcast 75	com/mixpanel/android/mpmetrics/b
    //   258: astore_1
    //   259: aload_0
    //   260: aload_1
    //   261: invokespecial 497	com/mixpanel/android/mpmetrics/d:a	(Lcom/mixpanel/android/mpmetrics/b;)Lorg/json/JSONObject;
    //   264: astore 8
    //   266: aload_0
    //   267: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   270: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   273: ldc_w 499
    //   276: invokestatic 127	com/mixpanel/android/mpmetrics/a:a	(Lcom/mixpanel/android/mpmetrics/a;Ljava/lang/String;)V
    //   279: aload_0
    //   280: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   283: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   286: new 202	java/lang/StringBuilder
    //   289: dup
    //   290: invokespecial 203	java/lang/StringBuilder:<init>	()V
    //   293: ldc_w 474
    //   296: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: aload 8
    //   301: invokevirtual 475	org/json/JSONObject:toString	()Ljava/lang/String;
    //   304: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: invokestatic 127	com/mixpanel/android/mpmetrics/a:a	(Lcom/mixpanel/android/mpmetrics/a;Ljava/lang/String;)V
    //   313: aload_0
    //   314: getfield 24	com/mixpanel/android/mpmetrics/d:b	Lcom/mixpanel/android/mpmetrics/ac;
    //   317: aload 8
    //   319: getstatic 134	com/mixpanel/android/mpmetrics/ae:a	Lcom/mixpanel/android/mpmetrics/ae;
    //   322: invokevirtual 478	com/mixpanel/android/mpmetrics/ac:a	(Lorg/json/JSONObject;Lcom/mixpanel/android/mpmetrics/ae;)I
    //   325: istore_2
    //   326: goto -163 -> 163
    //   329: astore 8
    //   331: ldc -24
    //   333: new 202	java/lang/StringBuilder
    //   336: dup
    //   337: invokespecial 203	java/lang/StringBuilder:<init>	()V
    //   340: ldc_w 501
    //   343: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: aload_1
    //   347: invokevirtual 111	com/mixpanel/android/mpmetrics/b:a	()Ljava/lang/String;
    //   350: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   356: aload 8
    //   358: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   361: pop
    //   362: bipush -3
    //   364: istore_2
    //   365: goto -39 -> 326
    //   368: aload_1
    //   369: getfield 466	android/os/Message:what	I
    //   372: iconst_2
    //   373: if_icmpne +156 -> 529
    //   376: aload_0
    //   377: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   380: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   383: ldc_w 503
    //   386: invokestatic 127	com/mixpanel/android/mpmetrics/a:a	(Lcom/mixpanel/android/mpmetrics/a;Ljava/lang/String;)V
    //   389: aload_0
    //   390: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   393: invokestatic 490	com/mixpanel/android/mpmetrics/c:a	(Lcom/mixpanel/android/mpmetrics/c;)V
    //   396: invokestatic 485	android/os/SystemClock:elapsedRealtime	()J
    //   399: lstore 4
    //   401: aload_0
    //   402: getfield 66	com/mixpanel/android/mpmetrics/d:f	J
    //   405: lstore 6
    //   407: iload_3
    //   408: istore_2
    //   409: lload 4
    //   411: lload 6
    //   413: lcmp
    //   414: iflt -251 -> 163
    //   417: aload_0
    //   418: aload_0
    //   419: getfield 24	com/mixpanel/android/mpmetrics/d:b	Lcom/mixpanel/android/mpmetrics/ac;
    //   422: invokespecial 492	com/mixpanel/android/mpmetrics/d:a	(Lcom/mixpanel/android/mpmetrics/ac;)V
    //   425: aload_0
    //   426: getfield 29	com/mixpanel/android/mpmetrics/d:c	Lcom/mixpanel/android/mpmetrics/l;
    //   429: aload_0
    //   430: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   433: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   436: invokevirtual 117	com/mixpanel/android/mpmetrics/a:c	()Lcom/mixpanel/android/b/g;
    //   439: invokevirtual 495	com/mixpanel/android/mpmetrics/l:a	(Lcom/mixpanel/android/b/g;)V
    //   442: iload_3
    //   443: istore_2
    //   444: goto -281 -> 163
    //   447: astore_1
    //   448: aload_0
    //   449: invokestatic 485	android/os/SystemClock:elapsedRealtime	()J
    //   452: aload_1
    //   453: invokevirtual 504	com/mixpanel/android/b/h:a	()I
    //   456: sipush 1000
    //   459: imul
    //   460: i2l
    //   461: ladd
    //   462: putfield 66	com/mixpanel/android/mpmetrics/d:f	J
    //   465: iload_3
    //   466: istore_2
    //   467: goto -304 -> 163
    //   470: astore 8
    //   472: ldc -24
    //   474: ldc_w 506
    //   477: aload 8
    //   479: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   482: pop
    //   483: aload_0
    //   484: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   487: invokestatic 509	com/mixpanel/android/mpmetrics/c:b	(Lcom/mixpanel/android/mpmetrics/c;)Ljava/lang/Object;
    //   490: astore_1
    //   491: aload_1
    //   492: monitorenter
    //   493: aload_0
    //   494: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   497: aconst_null
    //   498: invokestatic 512	com/mixpanel/android/mpmetrics/c:a	(Lcom/mixpanel/android/mpmetrics/c;Landroid/os/Handler;)Landroid/os/Handler;
    //   501: pop
    //   502: invokestatic 518	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   505: invokevirtual 521	android/os/Looper:quit	()V
    //   508: ldc -24
    //   510: ldc_w 523
    //   513: aload 8
    //   515: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   518: pop
    //   519: aload_1
    //   520: monitorexit
    //   521: return
    //   522: astore 8
    //   524: aload_1
    //   525: monitorexit
    //   526: aload 8
    //   528: athrow
    //   529: aload_1
    //   530: getfield 466	android/os/Message:what	I
    //   533: bipush 12
    //   535: if_icmpne +98 -> 633
    //   538: aload_0
    //   539: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   542: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   545: ldc_w 525
    //   548: invokestatic 127	com/mixpanel/android/mpmetrics/a:a	(Lcom/mixpanel/android/mpmetrics/a;Ljava/lang/String;)V
    //   551: aload_1
    //   552: getfield 470	android/os/Message:obj	Ljava/lang/Object;
    //   555: checkcast 527	com/mixpanel/android/mpmetrics/o
    //   558: astore_1
    //   559: aload_0
    //   560: getfield 29	com/mixpanel/android/mpmetrics/d:c	Lcom/mixpanel/android/mpmetrics/l;
    //   563: aload_1
    //   564: invokevirtual 530	com/mixpanel/android/mpmetrics/l:a	(Lcom/mixpanel/android/mpmetrics/o;)V
    //   567: invokestatic 485	android/os/SystemClock:elapsedRealtime	()J
    //   570: lstore 4
    //   572: aload_0
    //   573: getfield 66	com/mixpanel/android/mpmetrics/d:f	J
    //   576: lstore 6
    //   578: iload_3
    //   579: istore_2
    //   580: lload 4
    //   582: lload 6
    //   584: lcmp
    //   585: iflt -422 -> 163
    //   588: aload_0
    //   589: getfield 29	com/mixpanel/android/mpmetrics/d:c	Lcom/mixpanel/android/mpmetrics/l;
    //   592: aload_0
    //   593: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   596: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   599: invokevirtual 117	com/mixpanel/android/mpmetrics/a:c	()Lcom/mixpanel/android/b/g;
    //   602: invokevirtual 495	com/mixpanel/android/mpmetrics/l:a	(Lcom/mixpanel/android/b/g;)V
    //   605: iload_3
    //   606: istore_2
    //   607: goto -444 -> 163
    //   610: astore_1
    //   611: aload_0
    //   612: invokestatic 485	android/os/SystemClock:elapsedRealtime	()J
    //   615: aload_1
    //   616: invokevirtual 504	com/mixpanel/android/b/h:a	()I
    //   619: sipush 1000
    //   622: imul
    //   623: i2l
    //   624: ladd
    //   625: putfield 66	com/mixpanel/android/mpmetrics/d:f	J
    //   628: iload_3
    //   629: istore_2
    //   630: goto -467 -> 163
    //   633: aload_1
    //   634: getfield 466	android/os/Message:what	I
    //   637: bipush 13
    //   639: if_icmpne +19 -> 658
    //   642: aload_0
    //   643: aload_1
    //   644: getfield 470	android/os/Message:obj	Ljava/lang/Object;
    //   647: checkcast 103	java/lang/String
    //   650: invokespecial 532	com/mixpanel/android/mpmetrics/d:a	(Ljava/lang/String;)V
    //   653: iload_3
    //   654: istore_2
    //   655: goto -492 -> 163
    //   658: aload_1
    //   659: getfield 466	android/os/Message:what	I
    //   662: iconst_5
    //   663: if_icmpne +80 -> 743
    //   666: ldc -24
    //   668: new 202	java/lang/StringBuilder
    //   671: dup
    //   672: invokespecial 203	java/lang/StringBuilder:<init>	()V
    //   675: ldc_w 534
    //   678: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   681: invokestatic 540	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   684: invokevirtual 543	java/lang/Thread:getId	()J
    //   687: invokevirtual 546	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   690: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   693: invokestatic 309	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   696: pop
    //   697: aload_0
    //   698: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   701: invokestatic 509	com/mixpanel/android/mpmetrics/c:b	(Lcom/mixpanel/android/mpmetrics/c;)Ljava/lang/Object;
    //   704: astore_1
    //   705: aload_1
    //   706: monitorenter
    //   707: aload_0
    //   708: getfield 24	com/mixpanel/android/mpmetrics/d:b	Lcom/mixpanel/android/mpmetrics/ac;
    //   711: invokevirtual 548	com/mixpanel/android/mpmetrics/ac:a	()V
    //   714: aload_0
    //   715: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   718: aconst_null
    //   719: invokestatic 512	com/mixpanel/android/mpmetrics/c:a	(Lcom/mixpanel/android/mpmetrics/c;Landroid/os/Handler;)Landroid/os/Handler;
    //   722: pop
    //   723: invokestatic 518	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   726: invokevirtual 521	android/os/Looper:quit	()V
    //   729: aload_1
    //   730: monitorexit
    //   731: iload_3
    //   732: istore_2
    //   733: goto -570 -> 163
    //   736: astore 8
    //   738: aload_1
    //   739: monitorexit
    //   740: aload 8
    //   742: athrow
    //   743: ldc -24
    //   745: new 202	java/lang/StringBuilder
    //   748: dup
    //   749: invokespecial 203	java/lang/StringBuilder:<init>	()V
    //   752: ldc_w 550
    //   755: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   758: aload_1
    //   759: invokevirtual 553	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   762: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   765: invokestatic 555	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   768: pop
    //   769: iload_3
    //   770: istore_2
    //   771: goto -608 -> 163
    //   774: astore_1
    //   775: invokestatic 485	android/os/SystemClock:elapsedRealtime	()J
    //   778: lstore 4
    //   780: aload_0
    //   781: aload_1
    //   782: invokevirtual 504	com/mixpanel/android/b/h:a	()I
    //   785: sipush 1000
    //   788: imul
    //   789: i2l
    //   790: lload 4
    //   792: ladd
    //   793: putfield 66	com/mixpanel/android/mpmetrics/d:f	J
    //   796: return
    //   797: iload_2
    //   798: ifle -556 -> 242
    //   801: aload_0
    //   802: iconst_2
    //   803: invokevirtual 261	com/mixpanel/android/mpmetrics/d:hasMessages	(I)Z
    //   806: ifne -564 -> 242
    //   809: aload_0
    //   810: getfield 19	com/mixpanel/android/mpmetrics/d:a	Lcom/mixpanel/android/mpmetrics/c;
    //   813: getfield 34	com/mixpanel/android/mpmetrics/c:a	Lcom/mixpanel/android/mpmetrics/a;
    //   816: new 202	java/lang/StringBuilder
    //   819: dup
    //   820: invokespecial 203	java/lang/StringBuilder:<init>	()V
    //   823: ldc_w 557
    //   826: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   829: iload_2
    //   830: invokevirtual 560	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   833: ldc_w 562
    //   836: invokevirtual 209	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   839: aload_0
    //   840: getfield 54	com/mixpanel/android/mpmetrics/d:d	J
    //   843: invokevirtual 546	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   846: invokevirtual 214	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   849: invokestatic 127	com/mixpanel/android/mpmetrics/a:a	(Lcom/mixpanel/android/mpmetrics/a;Ljava/lang/String;)V
    //   852: aload_0
    //   853: getfield 54	com/mixpanel/android/mpmetrics/d:d	J
    //   856: lconst_0
    //   857: lcmp
    //   858: iflt -616 -> 242
    //   861: aload_0
    //   862: iconst_2
    //   863: aload_0
    //   864: getfield 54	com/mixpanel/android/mpmetrics/d:d	J
    //   867: invokevirtual 265	com/mixpanel/android/mpmetrics/d:sendEmptyMessageDelayed	(IJ)Z
    //   870: pop
    //   871: return
    //   872: astore 8
    //   874: ldc -24
    //   876: ldc_w 564
    //   879: aload 8
    //   881: invokestatic 239	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   884: pop
    //   885: goto -366 -> 519
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	888	0	this	d
    //   162	668	2	i	int
    //   89	681	3	j	int
    //   399	392	4	l1	long
    //   405	178	6	l2	long
    //   264	54	8	localJSONObject	JSONObject
    //   329	28	8	localJSONException	org.json.JSONException
    //   470	44	8	localRuntimeException	RuntimeException
    //   522	5	8	localObject1	Object
    //   736	5	8	localObject2	Object
    //   872	8	8	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   259	326	329	org/json/JSONException
    //   417	442	447	com/mixpanel/android/b/h
    //   90	163	470	java/lang/RuntimeException
    //   163	180	470	java/lang/RuntimeException
    //   186	217	470	java/lang/RuntimeException
    //   217	242	470	java/lang/RuntimeException
    //   243	259	470	java/lang/RuntimeException
    //   259	326	470	java/lang/RuntimeException
    //   331	362	470	java/lang/RuntimeException
    //   368	407	470	java/lang/RuntimeException
    //   417	442	470	java/lang/RuntimeException
    //   448	465	470	java/lang/RuntimeException
    //   529	578	470	java/lang/RuntimeException
    //   588	605	470	java/lang/RuntimeException
    //   611	628	470	java/lang/RuntimeException
    //   633	653	470	java/lang/RuntimeException
    //   658	707	470	java/lang/RuntimeException
    //   740	743	470	java/lang/RuntimeException
    //   743	769	470	java/lang/RuntimeException
    //   775	796	470	java/lang/RuntimeException
    //   801	871	470	java/lang/RuntimeException
    //   493	502	522	finally
    //   502	519	522	finally
    //   519	521	522	finally
    //   524	526	522	finally
    //   874	885	522	finally
    //   588	605	610	com/mixpanel/android/b/h
    //   707	731	736	finally
    //   738	740	736	finally
    //   217	242	774	com/mixpanel/android/b/h
    //   502	519	872	java/lang/Exception
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
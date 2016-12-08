package com.mixpanel.android.mpmetrics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.mixpanel.android.b.d;
import com.mixpanel.android.b.e;
import com.mixpanel.android.b.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;

final class l
{
  private static final JSONArray e = new JSONArray();
  private final ab a;
  private final Context b;
  private final List<o> c;
  private final d d;
  
  public l(Context paramContext, ab paramab)
  {
    this.b = paramContext;
    this.a = paramab;
    this.c = new LinkedList();
    this.d = a(paramContext);
  }
  
  @SuppressLint({"NewApi"})
  private static int a(Display paramDisplay)
  {
    if (Build.VERSION.SDK_INT < 13) {
      return paramDisplay.getWidth();
    }
    Point localPoint = new Point();
    paramDisplay.getSize(localPoint);
    return localPoint.x;
  }
  
  private Bitmap a(InAppNotification paramInAppNotification, Context paramContext, g paramg)
  {
    int i = 0;
    paramg = paramInAppNotification.h();
    String str = paramInAppNotification.g();
    int j = a(((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay());
    if ((paramInAppNotification.d() == x.c) && (j >= 720))
    {
      paramContext = new String[3];
      paramContext[0] = paramInAppNotification.i();
      paramContext[1] = paramInAppNotification.h();
      paramContext[2] = paramInAppNotification.g();
    }
    for (paramInAppNotification = paramContext;; paramInAppNotification = new String[] { paramg, str })
    {
      j = paramInAppNotification.length;
      while (i < j)
      {
        paramContext = paramInAppNotification[i];
        try
        {
          paramg = this.d.a(paramContext);
          return paramg;
        }
        catch (e paramg)
        {
          Log.v("MixpanelAPI.DChecker", "Can't load image " + paramContext + " for a notification", paramg);
          i += 1;
        }
      }
      return null;
    }
  }
  
  /* Error */
  static m a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: iconst_0
    //   4: istore_2
    //   5: new 145	com/mixpanel/android/mpmetrics/m
    //   8: dup
    //   9: invokespecial 146	com/mixpanel/android/mpmetrics/m:<init>	()V
    //   12: astore 5
    //   14: new 148	org/json/JSONObject
    //   17: dup
    //   18: aload_0
    //   19: invokespecial 151	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   22: astore 6
    //   24: aload 6
    //   26: ldc -103
    //   28: invokevirtual 157	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   31: ifeq +117 -> 148
    //   34: aload 6
    //   36: ldc -103
    //   38: invokevirtual 161	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   41: astore_0
    //   42: aload_0
    //   43: ifnull +176 -> 219
    //   46: iconst_0
    //   47: istore_1
    //   48: iload_1
    //   49: aload_0
    //   50: invokevirtual 164	org/json/JSONArray:length	()I
    //   53: if_icmpge +166 -> 219
    //   56: new 166	com/mixpanel/android/mpmetrics/Survey
    //   59: dup
    //   60: aload_0
    //   61: iload_1
    //   62: invokevirtual 170	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   65: invokespecial 173	com/mixpanel/android/mpmetrics/Survey:<init>	(Lorg/json/JSONObject;)V
    //   68: astore 7
    //   70: aload 5
    //   72: getfield 175	com/mixpanel/android/mpmetrics/m:a	Ljava/util/List;
    //   75: aload 7
    //   77: invokeinterface 181 2 0
    //   82: pop
    //   83: iload_1
    //   84: iconst_1
    //   85: iadd
    //   86: istore_1
    //   87: goto -39 -> 48
    //   90: astore 4
    //   92: new 183	com/mixpanel/android/mpmetrics/n
    //   95: dup
    //   96: new 118	java/lang/StringBuilder
    //   99: dup
    //   100: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   103: ldc -71
    //   105: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: aload_0
    //   109: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: aload 4
    //   117: invokespecial 188	com/mixpanel/android/mpmetrics/n:<init>	(Ljava/lang/String;Lorg/json/JSONException;)V
    //   120: athrow
    //   121: astore_0
    //   122: ldc 116
    //   124: new 118	java/lang/StringBuilder
    //   127: dup
    //   128: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   131: ldc -66
    //   133: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: aload 6
    //   138: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: invokestatic 196	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   147: pop
    //   148: aconst_null
    //   149: astore_0
    //   150: goto -108 -> 42
    //   153: astore 7
    //   155: ldc 116
    //   157: new 118	java/lang/StringBuilder
    //   160: dup
    //   161: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   164: ldc -58
    //   166: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: aload_0
    //   170: invokevirtual 199	org/json/JSONArray:toString	()Ljava/lang/String;
    //   173: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   179: invokestatic 196	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   182: pop
    //   183: goto -100 -> 83
    //   186: astore 7
    //   188: ldc 116
    //   190: new 118	java/lang/StringBuilder
    //   193: dup
    //   194: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   197: ldc -58
    //   199: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: aload_0
    //   203: invokevirtual 199	org/json/JSONArray:toString	()Ljava/lang/String;
    //   206: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokestatic 196	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   215: pop
    //   216: goto -133 -> 83
    //   219: aload 4
    //   221: astore_0
    //   222: aload 6
    //   224: ldc -55
    //   226: invokevirtual 157	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   229: ifeq +11 -> 240
    //   232: aload 6
    //   234: ldc -55
    //   236: invokevirtual 161	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   239: astore_0
    //   240: aload_0
    //   241: ifnull +191 -> 432
    //   244: aload_0
    //   245: invokevirtual 164	org/json/JSONArray:length	()I
    //   248: iconst_2
    //   249: invokestatic 207	java/lang/Math:min	(II)I
    //   252: istore_3
    //   253: iload_2
    //   254: istore_1
    //   255: iload_1
    //   256: iload_3
    //   257: if_icmpge +175 -> 432
    //   260: new 73	com/mixpanel/android/mpmetrics/InAppNotification
    //   263: dup
    //   264: aload_0
    //   265: iload_1
    //   266: invokevirtual 170	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   269: invokespecial 208	com/mixpanel/android/mpmetrics/InAppNotification:<init>	(Lorg/json/JSONObject;)V
    //   272: astore 4
    //   274: aload 5
    //   276: getfield 210	com/mixpanel/android/mpmetrics/m:b	Ljava/util/List;
    //   279: aload 4
    //   281: invokeinterface 181 2 0
    //   286: pop
    //   287: iload_1
    //   288: iconst_1
    //   289: iadd
    //   290: istore_1
    //   291: goto -36 -> 255
    //   294: astore_0
    //   295: ldc 116
    //   297: new 118	java/lang/StringBuilder
    //   300: dup
    //   301: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   304: ldc -44
    //   306: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: aload 6
    //   311: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   314: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   317: invokestatic 196	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   320: pop
    //   321: aload 4
    //   323: astore_0
    //   324: goto -84 -> 240
    //   327: astore 4
    //   329: ldc 116
    //   331: new 118	java/lang/StringBuilder
    //   334: dup
    //   335: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   338: ldc -42
    //   340: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: aload_0
    //   344: invokevirtual 199	org/json/JSONArray:toString	()Ljava/lang/String;
    //   347: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: aload 4
    //   355: invokestatic 216	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   358: pop
    //   359: goto -72 -> 287
    //   362: astore 4
    //   364: ldc 116
    //   366: new 118	java/lang/StringBuilder
    //   369: dup
    //   370: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   373: ldc -42
    //   375: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: aload_0
    //   379: invokevirtual 199	org/json/JSONArray:toString	()Ljava/lang/String;
    //   382: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   388: aload 4
    //   390: invokestatic 216	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   393: pop
    //   394: goto -107 -> 287
    //   397: astore 4
    //   399: ldc 116
    //   401: new 118	java/lang/StringBuilder
    //   404: dup
    //   405: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   408: ldc -38
    //   410: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: aload_0
    //   414: invokevirtual 199	org/json/JSONArray:toString	()Ljava/lang/String;
    //   417: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   423: aload 4
    //   425: invokestatic 216	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   428: pop
    //   429: goto -142 -> 287
    //   432: aload 6
    //   434: ldc -36
    //   436: invokevirtual 157	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   439: ifeq +15 -> 454
    //   442: aload 5
    //   444: aload 6
    //   446: ldc -36
    //   448: invokevirtual 161	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   451: putfield 222	com/mixpanel/android/mpmetrics/m:c	Lorg/json/JSONArray;
    //   454: aload 6
    //   456: ldc -32
    //   458: invokevirtual 157	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   461: ifeq +15 -> 476
    //   464: aload 5
    //   466: aload 6
    //   468: ldc -32
    //   470: invokevirtual 161	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   473: putfield 226	com/mixpanel/android/mpmetrics/m:d	Lorg/json/JSONArray;
    //   476: aload 5
    //   478: areturn
    //   479: astore_0
    //   480: ldc 116
    //   482: new 118	java/lang/StringBuilder
    //   485: dup
    //   486: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   489: ldc -28
    //   491: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   494: aload 6
    //   496: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   499: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   502: invokestatic 196	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   505: pop
    //   506: goto -52 -> 454
    //   509: astore_0
    //   510: ldc 116
    //   512: new 118	java/lang/StringBuilder
    //   515: dup
    //   516: invokespecial 119	java/lang/StringBuilder:<init>	()V
    //   519: ldc -26
    //   521: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: aload 6
    //   526: invokevirtual 193	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   529: invokevirtual 130	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   532: invokestatic 196	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   535: pop
    //   536: aload 5
    //   538: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	539	0	paramString	String
    //   47	244	1	i	int
    //   4	250	2	j	int
    //   252	6	3	k	int
    //   1	1	4	localObject	Object
    //   90	130	4	localJSONException1	org.json.JSONException
    //   272	50	4	localInAppNotification	InAppNotification
    //   327	27	4	localJSONException2	org.json.JSONException
    //   362	27	4	localj1	j
    //   397	27	4	localOutOfMemoryError	OutOfMemoryError
    //   12	525	5	localm	m
    //   22	503	6	localJSONObject	org.json.JSONObject
    //   68	8	7	localSurvey	Survey
    //   153	1	7	localJSONException3	org.json.JSONException
    //   186	1	7	localj2	j
    // Exception table:
    //   from	to	target	type
    //   14	24	90	org/json/JSONException
    //   34	42	121	org/json/JSONException
    //   56	83	153	org/json/JSONException
    //   56	83	186	com/mixpanel/android/mpmetrics/j
    //   232	240	294	org/json/JSONException
    //   260	287	327	org/json/JSONException
    //   260	287	362	com/mixpanel/android/mpmetrics/j
    //   260	287	397	java/lang/OutOfMemoryError
    //   442	454	479	org/json/JSONException
    //   464	476	509	org/json/JSONException
  }
  
  private m a(String paramString1, String paramString2, g paramg)
  {
    paramString2 = b(paramString1, paramString2, paramg);
    if (ab.a) {
      Log.v("MixpanelAPI.DChecker", "Mixpanel decide server response was:\n" + paramString2);
    }
    paramString1 = new m();
    if (paramString2 != null) {
      paramString1 = a(paramString2);
    }
    for (;;)
    {
      paramString2 = paramString1.b.iterator();
      while (paramString2.hasNext())
      {
        InAppNotification localInAppNotification = (InAppNotification)paramString2.next();
        Bitmap localBitmap = a(localInAppNotification, this.b, paramg);
        if (localBitmap == null)
        {
          Log.i("MixpanelAPI.DChecker", "Could not retrieve image for notification " + localInAppNotification.b() + ", will not show the notification.");
          paramString2.remove();
        }
        else
        {
          localInAppNotification.a(localBitmap);
        }
      }
      return paramString1;
    }
  }
  
  private static byte[] a(g paramg, Context paramContext, String[] paramArrayOfString)
  {
    if (!paramg.a(paramContext)) {
      return null;
    }
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = paramArrayOfString[i];
      try
      {
        byte[] arrayOfByte = paramg.a(str, null, ab.a(paramContext).r());
        return arrayOfByte;
      }
      catch (MalformedURLException localMalformedURLException)
      {
        Log.e("MixpanelAPI.DChecker", "Cannot interpret " + str + " as a URL.", localMalformedURLException);
        i += 1;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        for (;;)
        {
          if (ab.a) {
            Log.v("MixpanelAPI.DChecker", "Cannot get " + str + ", file not found.", localFileNotFoundException);
          }
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          if (ab.a) {
            Log.v("MixpanelAPI.DChecker", "Cannot get " + str + ".", localIOException);
          }
        }
      }
      catch (OutOfMemoryError paramg)
      {
        Log.e("MixpanelAPI.DChecker", "Out of memory when getting to " + str + ".", paramg);
      }
    }
    return null;
  }
  
  private String b(String paramString1, String paramString2, g paramg)
  {
    int i = 0;
    for (;;)
    {
      try
      {
        String str = URLEncoder.encode(paramString1, "utf-8");
        if (paramString2 != null)
        {
          paramString1 = URLEncoder.encode(paramString2, "utf-8");
          paramString2 = new StringBuilder().append("?version=1&lib=android&token=").append(str);
          if (paramString1 != null) {
            paramString2.append("&distinct_id=").append(paramString1);
          }
          paramString2 = paramString2.toString();
          if (this.a.d())
          {
            paramString1 = new String[1];
            paramString1[0] = (this.a.k() + paramString2);
            if (!ab.a) {
              break;
            }
            Log.v("MixpanelAPI.DChecker", "Querying decide server, urls:");
            if (i >= paramString1.length) {
              break;
            }
            Log.v("MixpanelAPI.DChecker", "    >> " + paramString1[i]);
            i += 1;
            continue;
          }
        }
        else
        {
          paramString1 = null;
          continue;
        }
        paramString1 = new String[2];
      }
      catch (UnsupportedEncodingException paramString1)
      {
        throw new RuntimeException("Mixpanel library requires utf-8 string encoding to be available", paramString1);
      }
      paramString1[0] = (this.a.k() + paramString2);
      paramString1[1] = (this.a.n() + paramString2);
    }
    paramString1 = a(paramg, this.b, paramString1);
    if (paramString1 == null) {
      return null;
    }
    try
    {
      paramString1 = new String(paramString1, "UTF-8");
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      throw new RuntimeException("UTF not supported on this platform?", paramString1);
    }
  }
  
  protected d a(Context paramContext)
  {
    return new d(paramContext, "DecideChecker");
  }
  
  public void a(g paramg)
  {
    Iterator localIterator = this.c.iterator();
    while (localIterator.hasNext())
    {
      o localo = (o)localIterator.next();
      Object localObject = localo.b();
      try
      {
        localObject = a(localo.a(), (String)localObject, paramg);
        localo.a(((m)localObject).a, ((m)localObject).b, ((m)localObject).c, ((m)localObject).d);
      }
      catch (n localn)
      {
        Log.e("MixpanelAPI.DChecker", localn.getMessage(), localn);
      }
    }
  }
  
  public void a(o paramo)
  {
    this.c.add(paramo);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
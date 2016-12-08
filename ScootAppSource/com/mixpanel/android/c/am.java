package com.mixpanel.android.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.JsonWriter;
import android.util.Log;
import android.util.Pair;
import com.mixpanel.android.b.d;
import com.mixpanel.android.b.f;
import com.mixpanel.android.mpmetrics.ab;
import com.mixpanel.android.mpmetrics.az;
import com.mixpanel.android.mpmetrics.bl;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class am
  extends Handler
{
  private p b;
  private ao c;
  private final Context d;
  private final String e;
  private final Lock f;
  private final g g;
  private final d h;
  private final Map<String, Pair<String, JSONObject>> i;
  private final List<JSONObject> j;
  private final List<String> k;
  private final List<Pair<String, JSONObject>> l;
  private final List<ak> m;
  private final List<al> n;
  private final List<Pair<String, JSONObject>> o;
  private final Set<Pair<Integer, Integer>> p;
  
  public am(af paramaf, Context paramContext, String paramString, Looper paramLooper, bg parambg)
  {
    super(paramLooper);
    this.d = paramContext;
    this.e = paramString;
    this.c = null;
    paramString = af.c(paramaf).q();
    paramaf = paramString;
    if (paramString == null) {
      paramaf = paramContext.getPackageName();
    }
    paramaf = new az(paramaf, paramContext);
    this.h = new d(paramContext, "ViewCrawler");
    this.g = new g(paramaf, this.h, parambg);
    this.i = new HashMap();
    this.j = new ArrayList();
    this.k = new ArrayList();
    this.l = new ArrayList();
    this.m = new ArrayList();
    this.n = new ArrayList();
    this.o = new ArrayList();
    this.p = new HashSet();
    this.f = new ReentrantLock();
    this.f.lock();
  }
  
  private void a(bb parambb)
  {
    if (this.b == null) {
      return;
    }
    localJsonWriter = new JsonWriter(new OutputStreamWriter(this.b.b()));
    try
    {
      localJsonWriter.beginObject();
      localJsonWriter.name("type").value("layout_error");
      localJsonWriter.name("exception_type").value(parambb.a());
      localJsonWriter.name("cid").value(parambb.b());
      localJsonWriter.endObject();
      try
      {
        localJsonWriter.close();
        return;
      }
      catch (IOException parambb)
      {
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", parambb);
        return;
      }
      try
      {
        localJsonWriter.close();
        throw parambb;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", localIOException);
        }
      }
    }
    catch (IOException parambb)
    {
      parambb = parambb;
      Log.e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", parambb);
      try
      {
        localJsonWriter.close();
        return;
      }
      catch (IOException parambb)
      {
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", parambb);
        return;
      }
    }
    finally {}
  }
  
  private void a(String paramString)
  {
    if (this.b == null) {
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("error_message", paramString);
      paramString = new OutputStreamWriter(this.b.b());
    }
    catch (JSONException paramString)
    {
      try
      {
        for (;;)
        {
          paramString.write("{\"type\": \"error\", ");
          paramString.write("\"payload\": ");
          paramString.write(localJSONObject.toString());
          paramString.write("}");
          try
          {
            paramString.close();
            return;
          }
          catch (IOException paramString)
          {
            Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", paramString);
            return;
          }
          paramString = paramString;
          Log.e("MixpanelAPI.ViewCrawler", "Apparently impossible JSONException", paramString);
        }
      }
      catch (IOException localIOException)
      {
        localIOException = localIOException;
        Log.e("MixpanelAPI.ViewCrawler", "Can't write error message to editor", localIOException);
        try
        {
          paramString.close();
          return;
        }
        catch (IOException paramString)
        {
          Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", paramString);
          return;
        }
      }
      finally {}
    }
    try
    {
      paramString.close();
      throw ((Throwable)localObject);
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", paramString);
      }
    }
  }
  
  private void a(JSONArray paramJSONArray)
  {
    SharedPreferences.Editor localEditor = h().edit();
    localEditor.putString("mixpanel.viewcrawler.changes", paramJSONArray.toString());
    localEditor.apply();
    c();
  }
  
  private void a(JSONObject paramJSONObject)
  {
    long l1 = System.currentTimeMillis();
    try
    {
      paramJSONObject = paramJSONObject.getJSONObject("payload");
      if (paramJSONObject.has("config"))
      {
        this.c = this.g.b(paramJSONObject);
        if (ab.a) {
          Log.v("MixpanelAPI.ViewCrawler", "Initializing snapshot with configuration");
        }
      }
      if (this.c == null)
      {
        a("No snapshot configuration (or a malformed snapshot configuration) was sent.");
        Log.w("MixpanelAPI.ViewCrawler", "Mixpanel editor is misconfigured, sent a snapshot request without a valid configuration.");
        return;
      }
    }
    catch (JSONException paramJSONObject)
    {
      Log.e("MixpanelAPI.ViewCrawler", "Payload with snapshot config required with snapshot request", paramJSONObject);
      a("Payload with snapshot config required with snapshot request");
      return;
    }
    catch (i paramJSONObject)
    {
      Log.e("MixpanelAPI.ViewCrawler", "Editor sent malformed message with snapshot request", paramJSONObject);
      a(paramJSONObject.getMessage());
      return;
    }
    BufferedOutputStream localBufferedOutputStream = this.b.b();
    paramJSONObject = new OutputStreamWriter(localBufferedOutputStream);
    try
    {
      paramJSONObject.write("{");
      paramJSONObject.write("\"type\": \"snapshot_response\",");
      paramJSONObject.write("\"payload\": {");
      paramJSONObject.write("\"activities\":");
      paramJSONObject.flush();
      this.c.a(af.b(this.a), localBufferedOutputStream);
      long l2 = System.currentTimeMillis();
      paramJSONObject.write(",\"snapshot_time_millis\": ");
      paramJSONObject.write(Long.toString(l2 - l1));
      paramJSONObject.write("}");
      paramJSONObject.write("}");
      try
      {
        paramJSONObject.close();
        return;
      }
      catch (IOException paramJSONObject)
      {
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", paramJSONObject);
        return;
      }
      try
      {
        paramJSONObject.close();
        throw ((Throwable)localObject);
      }
      catch (IOException paramJSONObject)
      {
        for (;;)
        {
          Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", paramJSONObject);
        }
      }
    }
    catch (IOException localIOException)
    {
      localIOException = localIOException;
      Log.e("MixpanelAPI.ViewCrawler", "Can't write snapshot request to server", localIOException);
      try
      {
        paramJSONObject.close();
        return;
      }
      catch (IOException paramJSONObject)
      {
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", paramJSONObject);
        return;
      }
    }
    finally {}
  }
  
  private void b()
  {
    Object localObject1 = h();
    Object localObject2 = ((SharedPreferences)localObject1).getString("mixpanel.viewcrawler.changes", null);
    if (localObject2 != null) {
      try
      {
        localObject2 = new JSONArray((String)localObject2);
        int i2 = ((JSONArray)localObject2).length();
        int i1 = 0;
        while (i1 < i2)
        {
          Object localObject3 = ((JSONArray)localObject2).getJSONObject(i1);
          int i3 = ((JSONObject)localObject3).getInt("id");
          localObject3 = new Pair(Integer.valueOf(((JSONObject)localObject3).getInt("experiment_id")), Integer.valueOf(i3));
          this.p.add(localObject3);
          i1 += 1;
        }
        return;
      }
      catch (JSONException localJSONException)
      {
        Log.e("MixpanelAPI.ViewCrawler", "Malformed variants found in persistent storage, clearing all variants", localJSONException);
        localObject1 = ((SharedPreferences)localObject1).edit();
        ((SharedPreferences.Editor)localObject1).remove("mixpanel.viewcrawler.changes");
        ((SharedPreferences.Editor)localObject1).remove("mixpanel.viewcrawler.bindings");
        ((SharedPreferences.Editor)localObject1).apply();
      }
    }
  }
  
  private void b(String paramString)
  {
    if (this.b == null) {
      return;
    }
    localJsonWriter = new JsonWriter(new OutputStreamWriter(this.b.b()));
    try
    {
      localJsonWriter.beginObject();
      localJsonWriter.name("type").value("track_message");
      localJsonWriter.name("payload");
      localJsonWriter.beginObject();
      localJsonWriter.name("event_name").value(paramString);
      localJsonWriter.endObject();
      localJsonWriter.endObject();
      localJsonWriter.flush();
      try
      {
        localJsonWriter.close();
        return;
      }
      catch (IOException paramString)
      {
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", paramString);
        return;
      }
      try
      {
        localJsonWriter.close();
        throw paramString;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", localIOException);
        }
      }
    }
    catch (IOException paramString)
    {
      paramString = paramString;
      Log.e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", paramString);
      try
      {
        localJsonWriter.close();
        return;
      }
      catch (IOException paramString)
      {
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", paramString);
        return;
      }
    }
    finally {}
  }
  
  private void b(JSONArray paramJSONArray)
  {
    SharedPreferences.Editor localEditor = h().edit();
    localEditor.putString("mixpanel.viewcrawler.bindings", paramJSONArray.toString());
    localEditor.apply();
    c();
  }
  
  private void b(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = paramJSONObject.getJSONObject("payload").getJSONArray("actions");
      int i1 = 0;
      while (i1 < paramJSONObject.length())
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i1);
        String str1 = f.a(localJSONObject, "target_activity");
        String str2 = localJSONObject.getString("name");
        this.i.put(str2, new Pair(str1, localJSONObject));
        i1 += 1;
      }
      g();
      return;
    }
    catch (JSONException paramJSONObject)
    {
      Log.e("MixpanelAPI.ViewCrawler", "Bad change request received", paramJSONObject);
    }
  }
  
  private void c()
  {
    int i3 = 0;
    Object localObject1 = h();
    Object localObject3 = ((SharedPreferences)localObject1).getString("mixpanel.viewcrawler.changes", null);
    Object localObject2 = ((SharedPreferences)localObject1).getString("mixpanel.viewcrawler.bindings", null);
    if (localObject3 != null) {}
    for (;;)
    {
      try
      {
        this.m.clear();
        this.n.clear();
        localObject3 = new JSONArray((String)localObject3);
        int i4 = ((JSONArray)localObject3).length();
        int i1 = 0;
        Object localObject4;
        if (i1 < i4)
        {
          Object localObject5 = ((JSONArray)localObject3).getJSONObject(i1);
          int i2 = ((JSONObject)localObject5).getInt("id");
          localObject4 = new Pair(Integer.valueOf(((JSONObject)localObject5).getInt("experiment_id")), Integer.valueOf(i2));
          Object localObject6 = ((JSONObject)localObject5).getJSONArray("actions");
          i2 = 0;
          if (i2 < ((JSONArray)localObject6).length())
          {
            Object localObject7 = ((JSONArray)localObject6).getJSONObject(i2);
            localObject7 = new ak(f.a((JSONObject)localObject7, "target_activity"), (JSONObject)localObject7, (Pair)localObject4);
            this.m.add(localObject7);
            i2 += 1;
            continue;
          }
          localObject5 = ((JSONObject)localObject5).getJSONArray("tweaks");
          int i5 = ((JSONArray)localObject5).length();
          i2 = 0;
          if (i2 < i5)
          {
            localObject6 = new al(((JSONArray)localObject5).getJSONObject(i2), (Pair)localObject4);
            this.n.add(localObject6);
            i2 += 1;
            continue;
          }
        }
        else if (localObject2 != null)
        {
          localObject2 = new JSONArray((String)localObject2);
          this.o.clear();
          i1 = i3;
          if (i1 < ((JSONArray)localObject2).length())
          {
            localObject3 = ((JSONArray)localObject2).getJSONObject(i1);
            localObject4 = f.a((JSONObject)localObject3, "target_activity");
            this.o.add(new Pair(localObject4, localObject3));
            i1 += 1;
            continue;
          }
        }
        i1 += 1;
      }
      catch (JSONException localJSONException)
      {
        Log.i("MixpanelAPI.ViewCrawler", "JSON error when initializing saved changes, clearing persistent memory", localJSONException);
        localObject1 = ((SharedPreferences)localObject1).edit();
        ((SharedPreferences.Editor)localObject1).remove("mixpanel.viewcrawler.changes");
        ((SharedPreferences.Editor)localObject1).remove("mixpanel.viewcrawler.bindings");
        ((SharedPreferences.Editor)localObject1).apply();
        g();
        return;
      }
    }
  }
  
  private void c(JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject = paramJSONObject.getJSONObject("payload").getJSONArray("actions");
      int i1 = 0;
      while (i1 < paramJSONObject.length())
      {
        String str = paramJSONObject.getString(i1);
        this.i.remove(str);
        i1 += 1;
      }
      return;
    }
    catch (JSONException paramJSONObject)
    {
      Log.e("MixpanelAPI.ViewCrawler", "Bad clear request received", paramJSONObject);
      g();
    }
  }
  
  private void d()
  {
    if (ab.a) {
      Log.v("MixpanelAPI.ViewCrawler", "connecting to editor");
    }
    if ((this.b != null) && (this.b.a())) {
      if (ab.a) {
        Log.v("MixpanelAPI.ViewCrawler", "There is already a valid connection to an events editor.");
      }
    }
    Object localObject;
    do
    {
      return;
      localObject = af.c(this.a).r();
      if (localObject != null) {
        break;
      }
    } while (!ab.a);
    Log.v("MixpanelAPI.ViewCrawler", "SSL is not available on this device, no connection will be attempted to the events editor.");
    return;
    String str = ab.a(this.d).p() + this.e;
    try
    {
      localObject = ((SSLSocketFactory)localObject).createSocket();
      this.b = new p(new URI(str), new ah(this.a, null), (Socket)localObject);
      return;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      Log.e("MixpanelAPI.ViewCrawler", "Error parsing URI " + str + " for editor websocket", localURISyntaxException);
      return;
    }
    catch (t localt)
    {
      Log.e("MixpanelAPI.ViewCrawler", "Error connecting to URI " + str, localt);
      return;
    }
    catch (IOException localIOException)
    {
      Log.i("MixpanelAPI.ViewCrawler", "Can't create SSL Socket to connect to editor service", localIOException);
    }
  }
  
  private void d(JSONObject paramJSONObject)
  {
    try
    {
      this.j.clear();
      paramJSONObject = paramJSONObject.getJSONObject("payload").getJSONArray("tweaks");
      int i2 = paramJSONObject.length();
      int i1 = 0;
      while (i1 < i2)
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject(i1);
        this.j.add(localJSONObject);
        i1 += 1;
      }
      return;
    }
    catch (JSONException paramJSONObject)
    {
      Log.e("MixpanelAPI.ViewCrawler", "Bad tweaks received", paramJSONObject);
      g();
    }
  }
  
  /* Error */
  private void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 131	com/mixpanel/android/c/am:b	Lcom/mixpanel/android/c/p;
    //   4: ifnonnull +4 -> 8
    //   7: return
    //   8: new 133	android/util/JsonWriter
    //   11: dup
    //   12: new 135	java/io/OutputStreamWriter
    //   15: dup
    //   16: aload_0
    //   17: getfield 131	com/mixpanel/android/c/am:b	Lcom/mixpanel/android/c/p;
    //   20: invokevirtual 140	com/mixpanel/android/c/p:b	()Ljava/io/BufferedOutputStream;
    //   23: invokespecial 143	java/io/OutputStreamWriter:<init>	(Ljava/io/OutputStream;)V
    //   26: invokespecial 146	android/util/JsonWriter:<init>	(Ljava/io/Writer;)V
    //   29: astore_1
    //   30: aload_1
    //   31: invokevirtual 150	android/util/JsonWriter:beginObject	()Landroid/util/JsonWriter;
    //   34: pop
    //   35: aload_1
    //   36: ldc -104
    //   38: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   41: ldc_w 488
    //   44: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   47: pop
    //   48: aload_1
    //   49: ldc_w 256
    //   52: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   55: invokevirtual 150	android/util/JsonWriter:beginObject	()Landroid/util/JsonWriter;
    //   58: pop
    //   59: aload_1
    //   60: ldc_w 490
    //   63: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   66: ldc_w 492
    //   69: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   72: pop
    //   73: aload_1
    //   74: ldc_w 494
    //   77: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   80: new 448	java/lang/StringBuilder
    //   83: dup
    //   84: invokespecial 449	java/lang/StringBuilder:<init>	()V
    //   87: getstatic 499	android/os/Build:BRAND	Ljava/lang/String;
    //   90: invokevirtual 458	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: ldc_w 501
    //   96: invokevirtual 458	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: getstatic 504	android/os/Build:MODEL	Ljava/lang/String;
    //   102: invokevirtual 458	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: invokevirtual 459	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   111: pop
    //   112: aload_1
    //   113: ldc_w 506
    //   116: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   119: aload_0
    //   120: getfield 42	com/mixpanel/android/c/am:a	Lcom/mixpanel/android/c/af;
    //   123: invokestatic 509	com/mixpanel/android/c/af:d	(Lcom/mixpanel/android/c/af;)F
    //   126: f2d
    //   127: invokevirtual 512	android/util/JsonWriter:value	(D)Landroid/util/JsonWriter;
    //   130: pop
    //   131: aload_0
    //   132: getfield 42	com/mixpanel/android/c/am:a	Lcom/mixpanel/android/c/af;
    //   135: invokestatic 515	com/mixpanel/android/c/af:e	(Lcom/mixpanel/android/c/af;)Ljava/util/Map;
    //   138: invokeinterface 519 1 0
    //   143: invokeinterface 523 1 0
    //   148: astore_2
    //   149: aload_2
    //   150: invokeinterface 528 1 0
    //   155: ifeq +70 -> 225
    //   158: aload_2
    //   159: invokeinterface 532 1 0
    //   164: checkcast 534	java/util/Map$Entry
    //   167: astore_3
    //   168: aload_1
    //   169: aload_3
    //   170: invokeinterface 537 1 0
    //   175: checkcast 539	java/lang/String
    //   178: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   181: aload_3
    //   182: invokeinterface 542 1 0
    //   187: checkcast 539	java/lang/String
    //   190: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   193: pop
    //   194: goto -45 -> 149
    //   197: astore_2
    //   198: ldc -77
    //   200: ldc_w 544
    //   203: aload_2
    //   204: invokestatic 186	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   207: pop
    //   208: aload_1
    //   209: invokevirtual 177	android/util/JsonWriter:close	()V
    //   212: return
    //   213: astore_1
    //   214: ldc -77
    //   216: ldc_w 546
    //   219: aload_1
    //   220: invokestatic 186	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   223: pop
    //   224: return
    //   225: aload_0
    //   226: getfield 42	com/mixpanel/android/c/am:a	Lcom/mixpanel/android/c/af;
    //   229: invokestatic 549	com/mixpanel/android/c/af:f	(Lcom/mixpanel/android/c/af;)Lcom/mixpanel/android/mpmetrics/bl;
    //   232: invokevirtual 554	com/mixpanel/android/mpmetrics/bl:a	()Ljava/util/Map;
    //   235: astore_2
    //   236: aload_1
    //   237: ldc_w 412
    //   240: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   243: invokevirtual 557	android/util/JsonWriter:beginArray	()Landroid/util/JsonWriter;
    //   246: pop
    //   247: aload_2
    //   248: invokeinterface 519 1 0
    //   253: invokeinterface 523 1 0
    //   258: astore_2
    //   259: aload_2
    //   260: invokeinterface 528 1 0
    //   265: ifeq +330 -> 595
    //   268: aload_2
    //   269: invokeinterface 532 1 0
    //   274: checkcast 534	java/util/Map$Entry
    //   277: astore 4
    //   279: aload 4
    //   281: invokeinterface 542 1 0
    //   286: checkcast 559	com/mixpanel/android/mpmetrics/bn
    //   289: astore_3
    //   290: aload 4
    //   292: invokeinterface 537 1 0
    //   297: checkcast 539	java/lang/String
    //   300: astore 4
    //   302: aload_1
    //   303: invokevirtual 150	android/util/JsonWriter:beginObject	()Landroid/util/JsonWriter;
    //   306: pop
    //   307: aload_1
    //   308: ldc_w 387
    //   311: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   314: aload 4
    //   316: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   319: pop
    //   320: aload_1
    //   321: ldc_w 561
    //   324: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   327: aconst_null
    //   328: checkcast 563	java/lang/Number
    //   331: invokevirtual 566	android/util/JsonWriter:value	(Ljava/lang/Number;)Landroid/util/JsonWriter;
    //   334: pop
    //   335: aload_1
    //   336: ldc_w 568
    //   339: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   342: aconst_null
    //   343: checkcast 563	java/lang/Number
    //   346: invokevirtual 566	android/util/JsonWriter:value	(Ljava/lang/Number;)Landroid/util/JsonWriter;
    //   349: pop
    //   350: aload_3
    //   351: getfield 571	com/mixpanel/android/mpmetrics/bn:a	I
    //   354: tableswitch	default:+287->641, 1:+80->434, 2:+114->468, 3:+162->516, 4:+210->564
    //   384: ldc -77
    //   386: new 448	java/lang/StringBuilder
    //   389: dup
    //   390: invokespecial 449	java/lang/StringBuilder:<init>	()V
    //   393: ldc_w 573
    //   396: invokevirtual 458	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: aload_3
    //   400: getfield 571	com/mixpanel/android/mpmetrics/bn:a	I
    //   403: invokevirtual 576	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   406: ldc_w 578
    //   409: invokevirtual 458	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   412: invokevirtual 459	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   415: invokestatic 581	android/util/Log:wtf	(Ljava/lang/String;Ljava/lang/String;)I
    //   418: pop
    //   419: aload_1
    //   420: invokevirtual 174	android/util/JsonWriter:endObject	()Landroid/util/JsonWriter;
    //   423: pop
    //   424: goto -165 -> 259
    //   427: astore_2
    //   428: aload_1
    //   429: invokevirtual 177	android/util/JsonWriter:close	()V
    //   432: aload_2
    //   433: athrow
    //   434: aload_1
    //   435: ldc -104
    //   437: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   440: ldc_w 583
    //   443: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   446: pop
    //   447: aload_1
    //   448: ldc_w 584
    //   451: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   454: aload_3
    //   455: invokevirtual 587	com/mixpanel/android/mpmetrics/bn:c	()Ljava/lang/Boolean;
    //   458: invokevirtual 592	java/lang/Boolean:booleanValue	()Z
    //   461: invokevirtual 595	android/util/JsonWriter:value	(Z)Landroid/util/JsonWriter;
    //   464: pop
    //   465: goto -46 -> 419
    //   468: aload_1
    //   469: ldc -104
    //   471: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   474: ldc_w 597
    //   477: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   480: pop
    //   481: aload_1
    //   482: ldc_w 599
    //   485: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   488: ldc_w 600
    //   491: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   494: pop
    //   495: aload_1
    //   496: ldc_w 584
    //   499: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   502: aload_3
    //   503: invokevirtual 603	com/mixpanel/android/mpmetrics/bn:b	()Ljava/lang/Number;
    //   506: invokevirtual 607	java/lang/Number:doubleValue	()D
    //   509: invokevirtual 512	android/util/JsonWriter:value	(D)Landroid/util/JsonWriter;
    //   512: pop
    //   513: goto -94 -> 419
    //   516: aload_1
    //   517: ldc -104
    //   519: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   522: ldc_w 597
    //   525: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   528: pop
    //   529: aload_1
    //   530: ldc_w 599
    //   533: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   536: ldc_w 608
    //   539: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   542: pop
    //   543: aload_1
    //   544: ldc_w 584
    //   547: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   550: aload_3
    //   551: invokevirtual 603	com/mixpanel/android/mpmetrics/bn:b	()Ljava/lang/Number;
    //   554: invokevirtual 611	java/lang/Number:longValue	()J
    //   557: invokevirtual 614	android/util/JsonWriter:value	(J)Landroid/util/JsonWriter;
    //   560: pop
    //   561: goto -142 -> 419
    //   564: aload_1
    //   565: ldc -104
    //   567: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   570: ldc_w 616
    //   573: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   576: pop
    //   577: aload_1
    //   578: ldc_w 584
    //   581: invokevirtual 156	android/util/JsonWriter:name	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   584: aload_3
    //   585: invokevirtual 617	com/mixpanel/android/mpmetrics/bn:a	()Ljava/lang/String;
    //   588: invokevirtual 161	android/util/JsonWriter:value	(Ljava/lang/String;)Landroid/util/JsonWriter;
    //   591: pop
    //   592: goto -173 -> 419
    //   595: aload_1
    //   596: invokevirtual 620	android/util/JsonWriter:endArray	()Landroid/util/JsonWriter;
    //   599: pop
    //   600: aload_1
    //   601: invokevirtual 174	android/util/JsonWriter:endObject	()Landroid/util/JsonWriter;
    //   604: pop
    //   605: aload_1
    //   606: invokevirtual 174	android/util/JsonWriter:endObject	()Landroid/util/JsonWriter;
    //   609: pop
    //   610: aload_1
    //   611: invokevirtual 177	android/util/JsonWriter:close	()V
    //   614: return
    //   615: astore_1
    //   616: ldc -77
    //   618: ldc_w 546
    //   621: aload_1
    //   622: invokestatic 186	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   625: pop
    //   626: return
    //   627: astore_1
    //   628: ldc -77
    //   630: ldc_w 546
    //   633: aload_1
    //   634: invokestatic 186	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   637: pop
    //   638: goto -206 -> 432
    //   641: goto -257 -> 384
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	644	0	this	am
    //   29	180	1	localJsonWriter	JsonWriter
    //   213	398	1	localIOException1	IOException
    //   615	7	1	localIOException2	IOException
    //   627	7	1	localIOException3	IOException
    //   148	11	2	localIterator	Iterator
    //   197	7	2	localIOException4	IOException
    //   235	34	2	localObject1	Object
    //   427	6	2	localObject2	Object
    //   167	418	3	localObject3	Object
    //   277	38	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   30	149	197	java/io/IOException
    //   149	194	197	java/io/IOException
    //   225	259	197	java/io/IOException
    //   259	384	197	java/io/IOException
    //   384	419	197	java/io/IOException
    //   419	424	197	java/io/IOException
    //   434	465	197	java/io/IOException
    //   468	513	197	java/io/IOException
    //   516	561	197	java/io/IOException
    //   564	592	197	java/io/IOException
    //   595	610	197	java/io/IOException
    //   208	212	213	java/io/IOException
    //   30	149	427	finally
    //   149	194	427	finally
    //   198	208	427	finally
    //   225	259	427	finally
    //   259	384	427	finally
    //   384	419	427	finally
    //   419	424	427	finally
    //   434	465	427	finally
    //   468	513	427	finally
    //   516	561	427	finally
    //   564	592	427	finally
    //   595	610	427	finally
    //   610	614	615	java/io/IOException
    //   428	432	627	java/io/IOException
  }
  
  /* Error */
  private void e(JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 256
    //   4: invokevirtual 260	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   7: ldc_w 622
    //   10: invokevirtual 379	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   13: astore_1
    //   14: aload_1
    //   15: invokevirtual 332	org/json/JSONArray:length	()I
    //   18: istore_3
    //   19: aload_0
    //   20: getfield 104	com/mixpanel/android/c/am:l	Ljava/util/List;
    //   23: invokeinterface 404 1 0
    //   28: iconst_0
    //   29: istore_2
    //   30: iload_2
    //   31: iload_3
    //   32: if_icmpge +96 -> 128
    //   35: aload_1
    //   36: iload_2
    //   37: invokevirtual 335	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   40: astore 4
    //   42: aload 4
    //   44: ldc_w 381
    //   47: invokestatic 386	com/mixpanel/android/b/f:a	(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    //   50: astore 5
    //   52: aload_0
    //   53: getfield 104	com/mixpanel/android/c/am:l	Ljava/util/List;
    //   56: new 343	android/util/Pair
    //   59: dup
    //   60: aload 5
    //   62: aload 4
    //   64: invokespecial 354	android/util/Pair:<init>	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   67: invokeinterface 410 2 0
    //   72: pop
    //   73: iload_2
    //   74: iconst_1
    //   75: iadd
    //   76: istore_2
    //   77: goto -47 -> 30
    //   80: astore_1
    //   81: ldc -77
    //   83: ldc_w 624
    //   86: aload_1
    //   87: invokestatic 186	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   90: pop
    //   91: return
    //   92: astore 4
    //   94: ldc -77
    //   96: new 448	java/lang/StringBuilder
    //   99: dup
    //   100: invokespecial 449	java/lang/StringBuilder:<init>	()V
    //   103: ldc_w 626
    //   106: invokevirtual 458	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   109: aload_1
    //   110: invokevirtual 234	org/json/JSONArray:toString	()Ljava/lang/String;
    //   113: invokevirtual 458	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: invokevirtual 459	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   119: aload 4
    //   121: invokestatic 186	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   124: pop
    //   125: goto -52 -> 73
    //   128: aload_0
    //   129: invokespecial 397	com/mixpanel/android/c/am:g	()V
    //   132: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	am
    //   0	133	1	paramJSONObject	JSONObject
    //   29	48	2	i1	int
    //   18	15	3	i2	int
    //   40	23	4	localJSONObject	JSONObject
    //   92	28	4	localJSONException	JSONException
    //   50	11	5	str	String
    // Exception table:
    //   from	to	target	type
    //   0	14	80	org/json/JSONException
    //   35	73	92	org/json/JSONException
  }
  
  private void f()
  {
    this.i.clear();
    this.l.clear();
    this.c = null;
    if (ab.a) {
      Log.v("MixpanelAPI.ViewCrawler", "Editor closed- freeing snapshot");
    }
    g();
    Iterator localIterator = this.k.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.h.b(str);
    }
  }
  
  private void g()
  {
    int i2 = 0;
    Object localObject4 = new ArrayList();
    Object localObject3 = new HashSet();
    int i3 = this.m.size();
    int i1 = 0;
    Object localObject5;
    for (;;)
    {
      if (i1 < i3)
      {
        ak localak = (ak)this.m.get(i1);
        try
        {
          localObject5 = this.g.a(localak.b);
          ((List)localObject4).add(new Pair(localak.a, ((k)localObject5).a));
          if (!this.p.contains(localak.c)) {
            ((Set)localObject3).add(localak.c);
          }
          i1 += 1;
        }
        catch (j localj1)
        {
          for (;;)
          {
            Log.v("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", localj1);
          }
        }
        catch (l locall1)
        {
          for (;;)
          {
            Log.i("MixpanelAPI.ViewCrawler", locall1.getMessage());
          }
        }
        catch (i locali1)
        {
          for (;;)
          {
            Log.e("MixpanelAPI.ViewCrawler", "Bad persistent change request cannot be applied.", locali1);
          }
        }
      }
    }
    i3 = this.n.size();
    i1 = 0;
    for (;;)
    {
      if (i1 < i3)
      {
        al localal = (al)this.n.get(i1);
        try
        {
          localObject5 = this.g.c(localal.a);
          af.f(this.a).a((String)((Pair)localObject5).first, ((Pair)localObject5).second);
          if (!this.p.contains(localal.b)) {
            ((Set)localObject3).add(localal.b);
          }
          i1 += 1;
        }
        catch (i locali2)
        {
          for (;;)
          {
            Log.e("MixpanelAPI.ViewCrawler", "Bad editor tweak cannot be applied.", locali2);
          }
        }
      }
    }
    Object localObject1 = this.i.values().iterator();
    Object localObject7;
    while (((Iterator)localObject1).hasNext())
    {
      localObject5 = (Pair)((Iterator)localObject1).next();
      try
      {
        localObject7 = this.g.a((JSONObject)((Pair)localObject5).second);
        ((List)localObject4).add(new Pair(((Pair)localObject5).first, ((k)localObject7).a));
        this.k.addAll(((k)localObject7).b);
      }
      catch (j localj2)
      {
        Log.v("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", localj2);
      }
      catch (l locall4)
      {
        Log.i("MixpanelAPI.ViewCrawler", locall4.getMessage());
      }
      catch (i locali6)
      {
        Log.e("MixpanelAPI.ViewCrawler", "Bad editor change request cannot be applied.", locali6);
      }
    }
    i3 = this.j.size();
    i1 = 0;
    for (;;)
    {
      if (i1 < i3)
      {
        localObject1 = (JSONObject)this.j.get(i1);
        try
        {
          localObject1 = this.g.c((JSONObject)localObject1);
          af.f(this.a).a((String)((Pair)localObject1).first, ((Pair)localObject1).second);
          i1 += 1;
        }
        catch (i locali3)
        {
          for (;;)
          {
            Log.e("MixpanelAPI.ViewCrawler", "Strange tweaks received", locali3);
          }
        }
      }
    }
    i3 = this.o.size();
    i1 = 0;
    for (;;)
    {
      if (i1 < i3)
      {
        Pair localPair1 = (Pair)this.o.get(i1);
        try
        {
          localObject6 = this.g.a((JSONObject)localPair1.second, af.g(this.a));
          ((List)localObject4).add(new Pair(localPair1.first, localObject6));
          i1 += 1;
        }
        catch (l locall2)
        {
          for (;;)
          {
            Log.i("MixpanelAPI.ViewCrawler", locall2.getMessage());
          }
        }
        catch (i locali4)
        {
          for (;;)
          {
            Log.e("MixpanelAPI.ViewCrawler", "Bad persistent event binding cannot be applied.", locali4);
          }
        }
      }
    }
    i3 = this.l.size();
    i1 = 0;
    for (;;)
    {
      if (i1 < i3)
      {
        Pair localPair2 = (Pair)this.l.get(i1);
        try
        {
          localObject6 = this.g.a((JSONObject)localPair2.second, af.g(this.a));
          ((List)localObject4).add(new Pair(localPair2.first, localObject6));
          i1 += 1;
        }
        catch (l locall3)
        {
          for (;;)
          {
            Log.i("MixpanelAPI.ViewCrawler", locall3.getMessage());
          }
        }
        catch (i locali5)
        {
          for (;;)
          {
            Log.e("MixpanelAPI.ViewCrawler", "Bad editor event binding cannot be applied.", locali5);
          }
        }
      }
    }
    Object localObject6 = new HashMap();
    i3 = ((List)localObject4).size();
    i1 = i2;
    Object localObject2;
    if (i1 < i3)
    {
      localObject7 = (Pair)((List)localObject4).get(i1);
      if (((Map)localObject6).containsKey(((Pair)localObject7).first)) {
        localObject2 = (List)((Map)localObject6).get(((Pair)localObject7).first);
      }
      for (;;)
      {
        ((List)localObject2).add(((Pair)localObject7).second);
        i1 += 1;
        break;
        localObject2 = new ArrayList();
        ((Map)localObject6).put(((Pair)localObject7).first, localObject2);
      }
    }
    af.b(this.a).a((Map)localObject6);
    this.p.addAll((Collection)localObject3);
    if (((Set)localObject3).size() > 0)
    {
      localObject2 = new JSONObject();
      try
      {
        localObject3 = ((Set)localObject3).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (Pair)((Iterator)localObject3).next();
          i1 = ((Integer)((Pair)localObject4).first).intValue();
          i2 = ((Integer)((Pair)localObject4).second).intValue();
          localObject4 = new JSONObject();
          ((JSONObject)localObject4).put("$experiment_id", i1);
          ((JSONObject)localObject4).put("$variant_id", i2);
          af.h(this.a).a("$experiment_started", (JSONObject)localObject4);
          ((JSONObject)localObject2).put(Integer.toString(i1), i2);
        }
        return;
      }
      catch (JSONException localJSONException)
      {
        Log.wtf("MixpanelAPI.ViewCrawler", "Could not build JSON for reporting experiment start", localJSONException);
        af.h(this.a).c().a("$experiments", (JSONObject)localObject2);
        af.h(this.a).a(new an(this, (JSONObject)localObject2));
      }
    }
  }
  
  private SharedPreferences h()
  {
    String str = "mixpanel.viewcrawler.changes" + this.e;
    return this.d.getSharedPreferences(str, 0);
  }
  
  public void a()
  {
    this.f.unlock();
  }
  
  public void handleMessage(Message paramMessage)
  {
    this.f.lock();
    for (;;)
    {
      try
      {
        int i1 = paramMessage.what;
        switch (i1)
        {
        default: 
          return;
        }
      }
      finally
      {
        this.f.unlock();
      }
      b();
      c();
      continue;
      d();
      continue;
      e();
      continue;
      a((JSONObject)paramMessage.obj);
      continue;
      b((String)paramMessage.obj);
      continue;
      a((bb)paramMessage.obj);
      continue;
      a((JSONArray)paramMessage.obj);
      continue;
      b((JSONObject)paramMessage.obj);
      continue;
      b((JSONArray)paramMessage.obj);
      continue;
      e((JSONObject)paramMessage.obj);
      continue;
      c((JSONObject)paramMessage.obj);
      continue;
      d((JSONObject)paramMessage.obj);
      continue;
      f();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\c\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
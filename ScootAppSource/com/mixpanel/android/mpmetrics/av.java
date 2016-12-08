package com.mixpanel.android.mpmetrics;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"CommitPrefEdits"})
final class av
{
  private static boolean j = true;
  private static final Object k = new Object();
  private final Future<SharedPreferences> a;
  private final Future<SharedPreferences> b;
  private final SharedPreferences.OnSharedPreferenceChangeListener c;
  private JSONObject d;
  private Map<String, String> e;
  private boolean f;
  private String g;
  private String h;
  private JSONArray i;
  
  public av(Future<SharedPreferences> paramFuture1, Future<SharedPreferences> paramFuture2)
  {
    this.b = paramFuture1;
    this.a = paramFuture2;
    this.d = null;
    this.e = null;
    this.f = false;
    this.c = new aw(this);
  }
  
  /* Error */
  public static JSONArray a(SharedPreferences paramSharedPreferences)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 63
    //   3: aconst_null
    //   4: invokeinterface 69 3 0
    //   9: astore_2
    //   10: aload_0
    //   11: ldc 71
    //   13: aconst_null
    //   14: invokeinterface 69 3 0
    //   19: astore_3
    //   20: aload_3
    //   21: ifnull +76 -> 97
    //   24: aload_2
    //   25: ifnull +72 -> 97
    //   28: new 73	org/json/JSONArray
    //   31: dup
    //   32: aload_3
    //   33: invokespecial 76	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   36: astore 4
    //   38: new 73	org/json/JSONArray
    //   41: dup
    //   42: invokespecial 77	org/json/JSONArray:<init>	()V
    //   45: astore_3
    //   46: iconst_0
    //   47: istore_1
    //   48: iload_1
    //   49: aload 4
    //   51: invokevirtual 81	org/json/JSONArray:length	()I
    //   54: if_icmpge +60 -> 114
    //   57: aload 4
    //   59: iload_1
    //   60: invokevirtual 85	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   63: astore 5
    //   65: aload 5
    //   67: ldc 87
    //   69: aload_2
    //   70: invokevirtual 93	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   73: pop
    //   74: aload_3
    //   75: aload 5
    //   77: invokevirtual 96	org/json/JSONArray:put	(Ljava/lang/Object;)Lorg/json/JSONArray;
    //   80: pop
    //   81: iload_1
    //   82: iconst_1
    //   83: iadd
    //   84: istore_1
    //   85: goto -37 -> 48
    //   88: astore_0
    //   89: ldc 98
    //   91: ldc 100
    //   93: invokestatic 105	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   96: pop
    //   97: aconst_null
    //   98: areturn
    //   99: astore 5
    //   101: ldc 98
    //   103: ldc 107
    //   105: aload 5
    //   107: invokestatic 110	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   110: pop
    //   111: goto -30 -> 81
    //   114: aload_0
    //   115: invokeinterface 114 1 0
    //   120: astore_0
    //   121: aload_0
    //   122: ldc 71
    //   124: invokeinterface 120 2 0
    //   129: pop
    //   130: aload_0
    //   131: invokestatic 123	com/mixpanel/android/mpmetrics/av:a	(Landroid/content/SharedPreferences$Editor;)V
    //   134: aload_3
    //   135: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	paramSharedPreferences	SharedPreferences
    //   47	38	1	m	int
    //   9	61	2	str	String
    //   19	116	3	localObject	Object
    //   36	22	4	localJSONArray	JSONArray
    //   63	13	5	localJSONObject	JSONObject
    //   99	7	5	localJSONException	JSONException
    // Exception table:
    //   from	to	target	type
    //   28	38	88	org/json/JSONException
    //   57	81	99	org/json/JSONException
  }
  
  @TargetApi(9)
  private static void a(SharedPreferences.Editor paramEditor)
  {
    if (Build.VERSION.SDK_INT >= 9)
    {
      paramEditor.apply();
      return;
    }
    paramEditor.commit();
  }
  
  private JSONObject e()
  {
    if (this.d == null) {
      f();
    }
    return this.d;
  }
  
  private void f()
  {
    try
    {
      String str = ((SharedPreferences)this.a.get()).getString("super_properties", "{}");
      if (ab.a) {
        Log.v("MixpanelAPI.PIdentity", "Loading Super Properties " + str);
      }
      this.d = new JSONObject(str);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", localExecutionException.getCause());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", localInterruptedException);
      return;
    }
    catch (JSONException localJSONException)
    {
      Log.e("MixpanelAPI.PIdentity", "Cannot parse stored superProperties");
      h();
      return;
    }
    finally
    {
      if (this.d == null) {
        this.d = new JSONObject();
      }
    }
  }
  
  private void g()
  {
    this.e = new HashMap();
    try
    {
      Object localObject1 = (SharedPreferences)this.b.get();
      ((SharedPreferences)localObject1).unregisterOnSharedPreferenceChangeListener(this.c);
      ((SharedPreferences)localObject1).registerOnSharedPreferenceChangeListener(this.c);
      localObject1 = ((SharedPreferences)localObject1).getAll().entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        String str = (String)((Map.Entry)localObject2).getKey();
        localObject2 = ((Map.Entry)localObject2).getValue();
        this.e.put(str, localObject2.toString());
      }
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", localExecutionException.getCause());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", localInterruptedException);
    }
  }
  
  private void h()
  {
    if (this.d == null)
    {
      Log.e("MixpanelAPI.PIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
      return;
    }
    String str = this.d.toString();
    if (ab.a) {
      Log.v("MixpanelAPI.PIdentity", "Storing Super Properties " + str);
    }
    try
    {
      SharedPreferences.Editor localEditor = ((SharedPreferences)this.a.get()).edit();
      localEditor.putString("super_properties", str);
      a(localEditor);
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", localExecutionException.getCause());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", localInterruptedException);
    }
  }
  
  private void i()
  {
    String str;
    try
    {
      SharedPreferences localSharedPreferences = (SharedPreferences)this.a.get();
      if (localSharedPreferences == null) {
        return;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;)
      {
        Log.e("MixpanelAPI.PIdentity", "Cannot read distinct ids from sharedPreferences.", localExecutionException.getCause());
        Object localObject = null;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        Log.e("MixpanelAPI.PIdentity", "Cannot read distinct ids from sharedPreferences.", localInterruptedException);
        str = null;
      }
      this.g = str.getString("events_distinct_id", null);
      this.h = str.getString("people_distinct_id", null);
      this.i = null;
      str = str.getString("waiting_array", null);
      if (str == null) {}
    }
    try
    {
      this.i = new JSONArray(str);
      if (this.g == null)
      {
        this.g = UUID.randomUUID().toString();
        j();
      }
      this.f = true;
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Log.e("MixpanelAPI.PIdentity", "Could not interpret waiting people JSON record " + str);
      }
    }
  }
  
  private void j()
  {
    try
    {
      SharedPreferences.Editor localEditor = ((SharedPreferences)this.a.get()).edit();
      localEditor.putString("events_distinct_id", this.g);
      localEditor.putString("people_distinct_id", this.h);
      if (this.i == null) {
        localEditor.remove("waiting_array");
      }
      for (;;)
      {
        a(localEditor);
        return;
        localEditor.putString("waiting_array", this.i.toString());
      }
      return;
    }
    catch (ExecutionException localExecutionException)
    {
      Log.e("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", localExecutionException.getCause());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      Log.e("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", localInterruptedException);
    }
  }
  
  public Map<String, String> a()
  {
    synchronized (k)
    {
      if ((j) || (this.e == null))
      {
        g();
        j = false;
      }
      return this.e;
    }
  }
  
  public void a(bd parambd)
  {
    for (;;)
    {
      JSONObject localJSONObject2;
      try
      {
        JSONObject localJSONObject1 = e();
        localJSONObject2 = new JSONObject();
        try
        {
          Iterator localIterator = localJSONObject1.keys();
          if (!localIterator.hasNext()) {
            continue;
          }
          String str = (String)localIterator.next();
          localJSONObject2.put(str, localJSONObject1.get(str));
          continue;
        }
        catch (JSONException parambd)
        {
          Log.wtf("MixpanelAPI.PIdentity", "Can't copy from one JSONObject to another", parambd);
        }
        return;
      }
      finally {}
      parambd = parambd.a(localJSONObject2);
      if (parambd == null)
      {
        Log.w("MixpanelAPI.PIdentity", "An update to Mixpanel's super properties returned null, and will have no effect.");
      }
      else
      {
        this.d = parambd;
        h();
      }
    }
  }
  
  /* Error */
  public void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 43	com/mixpanel/android/mpmetrics/av:a	Ljava/util/concurrent/Future;
    //   6: invokeinterface 155 1 0
    //   11: checkcast 65	android/content/SharedPreferences
    //   14: invokeinterface 114 1 0
    //   19: astore_2
    //   20: aload_2
    //   21: ldc_w 303
    //   24: aload_1
    //   25: invokeinterface 250 3 0
    //   30: pop
    //   31: aload_2
    //   32: invokestatic 123	com/mixpanel/android/mpmetrics/av:a	(Landroid/content/SharedPreferences$Editor;)V
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: astore_1
    //   39: ldc 98
    //   41: ldc_w 305
    //   44: aload_1
    //   45: invokevirtual 187	java/util/concurrent/ExecutionException:getCause	()Ljava/lang/Throwable;
    //   48: invokestatic 110	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   51: pop
    //   52: goto -17 -> 35
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: athrow
    //   60: astore_1
    //   61: ldc 98
    //   63: ldc_w 305
    //   66: aload_1
    //   67: invokestatic 110	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   70: pop
    //   71: goto -36 -> 35
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	av
    //   0	74	1	paramString	String
    //   19	13	2	localEditor	SharedPreferences.Editor
    // Exception table:
    //   from	to	target	type
    //   2	35	38	java/util/concurrent/ExecutionException
    //   2	35	55	finally
    //   39	52	55	finally
    //   61	71	55	finally
    //   2	35	60	java/lang/InterruptedException
  }
  
  public void a(JSONObject paramJSONObject)
  {
    try
    {
      JSONObject localJSONObject = e();
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          paramJSONObject.put(str, localJSONObject.get(str));
        }
        catch (JSONException localJSONException)
        {
          Log.wtf("MixpanelAPI.PIdentity", "Object read from one JSON Object cannot be written to another", localJSONException);
        }
      }
    }
    finally {}
  }
  
  public String b()
  {
    try
    {
      if (!this.f) {
        i();
      }
      String str = this.g;
      return str;
    }
    finally {}
  }
  
  public void b(JSONObject paramJSONObject)
  {
    try
    {
      if (!this.f) {
        i();
      }
      if (this.i == null) {
        this.i = new JSONArray();
      }
      this.i.put(paramJSONObject);
      j();
      return;
    }
    finally {}
  }
  
  public String c()
  {
    try
    {
      if (!this.f) {
        i();
      }
      String str = this.h;
      return str;
    }
    finally {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\mpmetrics\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
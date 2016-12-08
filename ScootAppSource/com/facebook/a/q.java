package com.facebook.a;

import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.b.as;
import com.facebook.b.c;
import com.facebook.b.d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class q
{
  private List<i> a = new ArrayList();
  private List<i> b = new ArrayList();
  private int c;
  private d d;
  private String e;
  private String f;
  private final int g = 1000;
  
  public q(d paramd, String paramString1, String paramString2)
  {
    this.d = paramd;
    this.e = paramString1;
    this.f = paramString2;
  }
  
  private void a(GraphRequest paramGraphRequest, int paramInt, JSONArray paramJSONArray, boolean paramBoolean)
  {
    try
    {
      localObject2 = com.facebook.b.a.a(c.b, this.d, this.f, paramBoolean, a.e());
      localObject1 = localObject2;
      if (this.c > 0)
      {
        ((JSONObject)localObject2).put("num_skipped_events", paramInt);
        localObject1 = localObject2;
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject1;
        JSONObject localJSONObject = new JSONObject();
      }
    }
    paramGraphRequest.a((JSONObject)localObject1);
    localObject2 = paramGraphRequest.e();
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new Bundle();
    }
    paramJSONArray = paramJSONArray.toString();
    if (paramJSONArray != null)
    {
      ((Bundle)localObject1).putByteArray("custom_events_file", a(paramJSONArray));
      paramGraphRequest.a(paramJSONArray);
    }
    paramGraphRequest.a((Bundle)localObject1);
  }
  
  private byte[] a(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("UTF-8");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      as.a("Encoding exception: ", paramString);
    }
    return null;
  }
  
  public int a()
  {
    try
    {
      int i = this.a.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int a(GraphRequest paramGraphRequest, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    JSONArray localJSONArray;
    try
    {
      i = this.c;
      this.b.addAll(this.a);
      this.a.clear();
      localJSONArray = new JSONArray();
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        i locali = (i)localIterator.next();
        if ((paramBoolean1) || (!locali.b())) {
          localJSONArray.put(locali.c());
        }
      }
      if (localJSONArray.length() != 0) {
        break label116;
      }
    }
    finally {}
    return 0;
    label116:
    a(paramGraphRequest, i, localJSONArray, paramBoolean2);
    return localJSONArray.length();
  }
  
  /* Error */
  public void a(i parami)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 26	com/facebook/a/q:a	Ljava/util/List;
    //   6: invokeinterface 120 1 0
    //   11: aload_0
    //   12: getfield 28	com/facebook/a/q:b	Ljava/util/List;
    //   15: invokeinterface 120 1 0
    //   20: iadd
    //   21: sipush 1000
    //   24: if_icmplt +16 -> 40
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 57	com/facebook/a/q:c	I
    //   32: iconst_1
    //   33: iadd
    //   34: putfield 57	com/facebook/a/q:c	I
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: aload_0
    //   41: getfield 26	com/facebook/a/q:a	Ljava/util/List;
    //   44: aload_1
    //   45: invokeinterface 163 2 0
    //   50: pop
    //   51: goto -14 -> 37
    //   54: astore_1
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	q
    //   0	59	1	parami	i
    // Exception table:
    //   from	to	target	type
    //   2	37	54	finally
    //   40	51	54	finally
  }
  
  public void a(List<i> paramList)
  {
    try
    {
      this.a.addAll(paramList);
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      this.a.addAll(this.b);
      this.b.clear();
      this.c = 0;
      return;
    }
    finally {}
  }
  
  public List<i> b()
  {
    try
    {
      List localList = this.a;
      this.a = new ArrayList();
      return localList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
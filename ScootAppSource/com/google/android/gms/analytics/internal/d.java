package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class d
{
  private final Map<String, String> a;
  private final List<Command> b;
  private final long c;
  private final long d;
  private final int e;
  private final boolean f;
  private final String g;
  
  public d(ae paramae, Map<String, String> paramMap, long paramLong, boolean paramBoolean)
  {
    this(paramae, paramMap, paramLong, paramBoolean, 0L, 0, null);
  }
  
  public d(ae paramae, Map<String, String> paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt)
  {
    this(paramae, paramMap, paramLong1, paramBoolean, paramLong2, paramInt, null);
  }
  
  public d(ae paramae, Map<String, String> paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt, List<Command> paramList)
  {
    b.a(paramae);
    b.a(paramMap);
    this.d = paramLong1;
    this.f = paramBoolean;
    this.c = paramLong2;
    this.e = paramInt;
    if (paramList != null) {}
    Object localObject2;
    for (Object localObject1 = paramList;; localObject1 = Collections.emptyList())
    {
      this.b = ((List)localObject1);
      this.g = a(paramList);
      paramList = new HashMap();
      localObject1 = paramMap.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Map.Entry)((Iterator)localObject1).next();
        if (a(((Map.Entry)localObject2).getKey()))
        {
          String str = a(paramae, ((Map.Entry)localObject2).getKey());
          if (str != null) {
            paramList.put(str, b(paramae, ((Map.Entry)localObject2).getValue()));
          }
        }
      }
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject1 = (Map.Entry)paramMap.next();
      if (!a(((Map.Entry)localObject1).getKey()))
      {
        localObject2 = a(paramae, ((Map.Entry)localObject1).getKey());
        if (localObject2 != null) {
          paramList.put(localObject2, b(paramae, ((Map.Entry)localObject1).getValue()));
        }
      }
    }
    if (!TextUtils.isEmpty(this.g))
    {
      w.a(paramList, "_v", this.g);
      if ((this.g.equals("ma4.0.0")) || (this.g.equals("ma4.0.1"))) {
        paramList.remove("adid");
      }
    }
    this.a = Collections.unmodifiableMap(paramList);
  }
  
  public static d a(ae paramae, d paramd, Map<String, String> paramMap)
  {
    return new d(paramae, paramMap, paramd.d(), paramd.f(), paramd.c(), paramd.a(), paramd.e());
  }
  
  private static String a(ae paramae, Object paramObject)
  {
    if (paramObject == null) {
      paramae = null;
    }
    Object localObject;
    do
    {
      return paramae;
      localObject = paramObject.toString();
      paramObject = localObject;
      if (((String)localObject).startsWith("&")) {
        paramObject = ((String)localObject).substring(1);
      }
      int i = ((String)paramObject).length();
      localObject = paramObject;
      if (i > 256)
      {
        localObject = ((String)paramObject).substring(0, 256);
        paramae.c("Hit param name is too long and will be trimmed", Integer.valueOf(i), localObject);
      }
      paramae = (ae)localObject;
    } while (!TextUtils.isEmpty((CharSequence)localObject));
    return null;
  }
  
  private String a(String paramString1, String paramString2)
  {
    b.a(paramString1);
    if (!paramString1.startsWith("&")) {}
    for (boolean bool = true;; bool = false)
    {
      b.b(bool, "Short param name required");
      paramString1 = (String)this.a.get(paramString1);
      if (paramString1 == null) {
        break;
      }
      return paramString1;
    }
    return paramString2;
  }
  
  private static String a(List<Command> paramList)
  {
    Command localCommand;
    if (paramList != null)
    {
      paramList = paramList.iterator();
      do
      {
        if (!paramList.hasNext()) {
          break;
        }
        localCommand = (Command)paramList.next();
      } while (!"appendVersion".equals(localCommand.a()));
    }
    for (paramList = localCommand.b();; paramList = null)
    {
      if (TextUtils.isEmpty(paramList)) {
        return null;
      }
      return paramList;
    }
  }
  
  private static boolean a(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    return paramObject.toString().startsWith("&");
  }
  
  private static String b(ae paramae, Object paramObject)
  {
    if (paramObject == null) {}
    for (paramObject = "";; paramObject = paramObject.toString())
    {
      int i = ((String)paramObject).length();
      Object localObject = paramObject;
      if (i > 8192)
      {
        localObject = ((String)paramObject).substring(0, 8192);
        paramae.c("Hit param value is too long and will be trimmed", Integer.valueOf(i), localObject);
      }
      return (String)localObject;
    }
  }
  
  public int a()
  {
    return this.e;
  }
  
  public Map<String, String> b()
  {
    return this.a;
  }
  
  public long c()
  {
    return this.c;
  }
  
  public long d()
  {
    return this.d;
  }
  
  public List<Command> e()
  {
    return this.b;
  }
  
  public boolean f()
  {
    return this.f;
  }
  
  public long g()
  {
    return w.a(a("_s", "0"));
  }
  
  public String h()
  {
    return a("_m", "");
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("ht=").append(this.d);
    if (this.c != 0L) {
      localStringBuffer.append(", dbId=").append(this.c);
    }
    if (this.e != 0) {
      localStringBuffer.append(", appUID=").append(this.e);
    }
    Object localObject = new ArrayList(this.a.keySet());
    Collections.sort((List)localObject);
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      localStringBuffer.append(", ");
      localStringBuffer.append(str);
      localStringBuffer.append("=");
      localStringBuffer.append((String)this.a.get(str));
    }
    return localStringBuffer.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
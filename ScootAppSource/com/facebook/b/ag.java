package com.facebook.b;

import android.util.Log;
import com.facebook.av;
import com.facebook.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class ag
{
  private static final HashMap<String, String> a = new HashMap();
  private final av b;
  private final String c;
  private StringBuilder d;
  private int e = 3;
  
  public ag(av paramav, String paramString)
  {
    az.a(paramString, "tag");
    this.b = paramav;
    this.c = ("FacebookSDK." + paramString);
    this.d = new StringBuilder();
  }
  
  public static void a(av paramav, int paramInt, String paramString1, String paramString2)
  {
    if (w.a(paramav))
    {
      String str = d(paramString2);
      paramString2 = paramString1;
      if (!paramString1.startsWith("FacebookSDK.")) {
        paramString2 = "FacebookSDK." + paramString1;
      }
      Log.println(paramInt, paramString2, str);
      if (paramav == av.f) {
        new Exception().printStackTrace();
      }
    }
  }
  
  public static void a(av paramav, int paramInt, String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (w.a(paramav)) {
      a(paramav, paramInt, paramString1, String.format(paramString2, paramVarArgs));
    }
  }
  
  public static void a(av paramav, String paramString1, String paramString2)
  {
    a(paramav, 3, paramString1, paramString2);
  }
  
  public static void a(av paramav, String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (w.a(paramav)) {
      a(paramav, 3, paramString1, String.format(paramString2, paramVarArgs));
    }
  }
  
  public static void a(String paramString)
  {
    try
    {
      if (!w.a(av.b)) {
        a(paramString, "ACCESS_TOKEN_REMOVED");
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public static void a(String paramString1, String paramString2)
  {
    try
    {
      a.put(paramString1, paramString2);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  private boolean b()
  {
    return w.a(this.b);
  }
  
  private static String d(String paramString)
  {
    try
    {
      Iterator localIterator = a.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        paramString = paramString.replace((CharSequence)localEntry.getKey(), (CharSequence)localEntry.getValue());
      }
      return paramString;
    }
    finally {}
  }
  
  public void a()
  {
    b(this.d.toString());
    this.d = new StringBuilder();
  }
  
  public void a(String paramString, Object paramObject)
  {
    a("  %s:\t%s\n", new Object[] { paramString, paramObject });
  }
  
  public void a(String paramString, Object... paramVarArgs)
  {
    if (b()) {
      this.d.append(String.format(paramString, paramVarArgs));
    }
  }
  
  public void b(String paramString)
  {
    a(this.b, this.e, this.c, paramString);
  }
  
  public void c(String paramString)
  {
    if (b()) {
      this.d.append(paramString);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\b\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
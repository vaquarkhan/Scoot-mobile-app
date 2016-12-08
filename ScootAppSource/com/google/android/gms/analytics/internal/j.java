package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class j
  extends af
{
  private static String a = "3";
  private static String b = "01VDIWEA?";
  private static j c;
  
  public j(ah paramah)
  {
    super(paramah);
  }
  
  public static j b()
  {
    return c;
  }
  
  protected String a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof Integer)) {
      paramObject = new Long(((Integer)paramObject).intValue());
    }
    for (;;)
    {
      if ((paramObject instanceof Long))
      {
        if (Math.abs(((Long)paramObject).longValue()) < 100L) {
          return String.valueOf(paramObject);
        }
        if (String.valueOf(paramObject).charAt(0) == '-') {}
        for (String str = "-";; str = "")
        {
          paramObject = String.valueOf(Math.abs(((Long)paramObject).longValue()));
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(str);
          localStringBuilder.append(Math.round(Math.pow(10.0D, ((String)paramObject).length() - 1)));
          localStringBuilder.append("...");
          localStringBuilder.append(str);
          localStringBuilder.append(Math.round(Math.pow(10.0D, ((String)paramObject).length()) - 1.0D));
          return localStringBuilder.toString();
        }
      }
      if ((paramObject instanceof Boolean)) {
        return String.valueOf(paramObject);
      }
      if ((paramObject instanceof Throwable)) {
        return paramObject.getClass().getCanonicalName();
      }
      return "-";
    }
  }
  
  protected void a()
  {
    try
    {
      c = this;
      return;
    }
    finally {}
  }
  
  public void a(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str = (String)bp.c.a();
    if (Log.isLoggable(str, paramInt)) {
      Log.println(paramInt, str, c(paramString, paramObject1, paramObject2, paramObject3));
    }
    if (paramInt >= 5) {
      b(paramInt, paramString, paramObject1, paramObject2, paramObject3);
    }
  }
  
  public void a(d paramd, String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "no reason provided";
    }
    if (paramd != null)
    {
      paramd = paramd.toString();
      paramString = String.valueOf(str);
      if (paramString.length() == 0) {
        break label50;
      }
    }
    label50:
    for (paramString = "Discarding hit. ".concat(paramString);; paramString = new String("Discarding hit. "))
    {
      d(paramString, paramd);
      return;
      paramd = "no hit data";
      break;
    }
  }
  
  public void a(Map<String, String> paramMap, String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "no reason provided";
    }
    if (paramMap != null)
    {
      paramString = new StringBuilder();
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        if (paramString.length() > 0) {
          paramString.append(',');
        }
        paramString.append((String)localEntry.getKey());
        paramString.append('=');
        paramString.append((String)localEntry.getValue());
      }
      paramMap = paramString.toString();
      paramString = String.valueOf(str);
      if (paramString.length() == 0) {
        break label144;
      }
    }
    label144:
    for (paramString = "Discarding hit. ".concat(paramString);; paramString = new String("Discarding hit. "))
    {
      d(paramString, paramMap);
      return;
      paramMap = "no hit data";
      break;
    }
  }
  
  public void b(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    int i = 0;
    for (;;)
    {
      try
      {
        b.a(paramString);
        if (paramInt < 0)
        {
          paramInt = i;
          if (paramInt >= b.length())
          {
            paramInt = b.length() - 1;
            if (q().b())
            {
              if (q().a())
              {
                c1 = 'P';
                String str1 = a;
                char c2 = b.charAt(paramInt);
                String str2 = ag.a;
                paramString = String.valueOf(c(paramString, a(paramObject1), a(paramObject2), a(paramObject3)));
                paramObject1 = String.valueOf(str1).length() + 3 + String.valueOf(str2).length() + String.valueOf(paramString).length() + str1 + c2 + c1 + str2 + ":" + paramString;
                paramString = (String)paramObject1;
                if (((String)paramObject1).length() > 1024) {
                  paramString = ((String)paramObject1).substring(0, 1024);
                }
                paramObject1 = k().n();
                if (paramObject1 != null) {
                  ((n)paramObject1).g().a(paramString);
                }
                return;
              }
              c1 = 'C';
              continue;
            }
            boolean bool = q().a();
            if (bool)
            {
              c1 = 'p';
              continue;
            }
            char c1 = 'c';
            continue;
          }
        }
      }
      finally {}
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
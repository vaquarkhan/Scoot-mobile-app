package com.c.a.c;

import b.a.a.a.t;
import com.c.a.c.a.a.a;
import com.c.a.c.a.a.c;
import com.c.a.c.a.a.d;
import com.c.a.c.a.a.e;
import com.c.a.c.a.a.g;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

final class bd
{
  private static final e a = new e("", "", 0L);
  private static final bn[] b = new bn[0];
  private static final bq[] c = new bq[0];
  private static final bk[] d = new bk[0];
  private static final bf[] e = new bf[0];
  private static final bg[] f = new bg[0];
  
  private static bh a(c paramc)
  {
    return new bh(paramc.f / 100.0F, paramc.g, paramc.h, paramc.a, paramc.b - paramc.d, paramc.c - paramc.e);
  }
  
  private static bi a(d paramd, ay paramay, Map<String, String> paramMap)
  {
    Object localObject;
    b localb;
    if (paramd.b != null)
    {
      localObject = paramd.b;
      paramMap = new be(new bj(new bp((e)localObject), a(paramd.c), a(paramd.d)), a(a(paramd.e, paramMap)));
      localObject = a(paramd.f);
      localb = paramay.a();
      if (localb == null) {
        b.a.a.a.f.h().a("CrashlyticsCore", "No log data to include with this event.");
      }
      paramay.b();
      if (localb == null) {
        break label147;
      }
    }
    label147:
    for (paramay = new bl(localb);; paramay = new bm())
    {
      return new bi(paramd.a, "ndk-crash", new bn[] { paramMap, localObject, paramay });
      localObject = a;
      break;
    }
  }
  
  private static bo a(a[] paramArrayOfa)
  {
    if (paramArrayOfa != null) {}
    for (bf[] arrayOfbf = new bf[paramArrayOfa.length];; arrayOfbf = e)
    {
      int i = 0;
      while (i < arrayOfbf.length)
      {
        arrayOfbf[i] = new bf(paramArrayOfa[i]);
        i += 1;
      }
    }
    return new bo(arrayOfbf);
  }
  
  private static bo a(com.c.a.c.a.a.b[] paramArrayOfb)
  {
    if (paramArrayOfb != null) {}
    for (bg[] arrayOfbg = new bg[paramArrayOfb.length];; arrayOfbg = f)
    {
      int i = 0;
      while (i < arrayOfbg.length)
      {
        arrayOfbg[i] = new bg(paramArrayOfb[i]);
        i += 1;
      }
    }
    return new bo(arrayOfbg);
  }
  
  private static bo a(com.c.a.c.a.a.f[] paramArrayOff)
  {
    if (paramArrayOff != null) {}
    for (bq[] arrayOfbq = new bq[paramArrayOff.length];; arrayOfbq = c)
    {
      int i = 0;
      while (i < arrayOfbq.length)
      {
        com.c.a.c.a.a.f localf = paramArrayOff[i];
        arrayOfbq[i] = new bq(localf, a(localf.c));
        i += 1;
      }
    }
    return new bo(arrayOfbq);
  }
  
  private static bo a(g[] paramArrayOfg)
  {
    if (paramArrayOfg != null) {}
    for (bk[] arrayOfbk = new bk[paramArrayOfg.length];; arrayOfbk = d)
    {
      int i = 0;
      while (i < arrayOfbk.length)
      {
        arrayOfbk[i] = new bk(paramArrayOfg[i]);
        i += 1;
      }
    }
    return new bo(arrayOfbk);
  }
  
  public static void a(d paramd, ay paramay, Map<String, String> paramMap, f paramf)
  {
    a(paramd, paramay, paramMap).b(paramf);
  }
  
  private static com.c.a.c.a.a.b[] a(com.c.a.c.a.a.b[] paramArrayOfb, Map<String, String> paramMap)
  {
    paramMap = new TreeMap(paramMap);
    if (paramArrayOfb != null)
    {
      int j = paramArrayOfb.length;
      i = 0;
      while (i < j)
      {
        com.c.a.c.a.a.b localb = paramArrayOfb[i];
        paramMap.put(localb.a, localb.b);
        i += 1;
      }
    }
    paramArrayOfb = (Map.Entry[])paramMap.entrySet().toArray(new Map.Entry[paramMap.size()]);
    paramMap = new com.c.a.c.a.a.b[paramArrayOfb.length];
    int i = 0;
    while (i < paramMap.length)
    {
      paramMap[i] = new com.c.a.c.a.a.b((String)paramArrayOfb[i].getKey(), (String)paramArrayOfb[i].getValue());
      i += 1;
    }
    return paramMap;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
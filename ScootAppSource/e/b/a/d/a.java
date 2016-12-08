package e.b.a.d;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class a
{
  private static final ConcurrentHashMap<String, b> a = new ConcurrentHashMap();
  private static final AtomicReferenceArray<b> b = new AtomicReferenceArray(25);
  
  public static b a(String paramString)
  {
    return c(paramString);
  }
  
  private static String a(String paramString, int[] paramArrayOfInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramArrayOfInt[0];
    int m = paramString.length();
    char c = paramString.charAt(i);
    if (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z')))
    {
      localStringBuilder.append(c);
      for (;;)
      {
        j = i;
        if (i + 1 >= m) {
          break;
        }
        j = i;
        if (paramString.charAt(i + 1) != c) {
          break;
        }
        localStringBuilder.append(c);
        i += 1;
      }
    }
    localStringBuilder.append('\'');
    int k = 0;
    int j = i;
    if (i < m)
    {
      c = paramString.charAt(i);
      if (c == '\'') {
        if ((i + 1 < m) && (paramString.charAt(i + 1) == '\''))
        {
          i += 1;
          localStringBuilder.append(c);
          j = k;
        }
      }
    }
    for (;;)
    {
      i += 1;
      k = j;
      break;
      if (k == 0)
      {
        j = 1;
      }
      else
      {
        j = 0;
        continue;
        if ((k == 0) && (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'))))
        {
          j = i - 1;
          paramArrayOfInt[0] = j;
          return localStringBuilder.toString();
        }
        localStringBuilder.append(c);
        j = k;
      }
    }
  }
  
  private static void a(c paramc, String paramString)
  {
    int m = paramString.length();
    int[] arrayOfInt = new int[1];
    int i = 0;
    String str;
    int n;
    int k;
    if (i < m)
    {
      arrayOfInt[0] = i;
      str = a(paramString, arrayOfInt);
      n = arrayOfInt[0];
      k = str.length();
      if (k != 0) {}
    }
    else
    {
      return;
    }
    int i1 = str.charAt(0);
    switch (i1)
    {
    default: 
      throw new IllegalArgumentException("Illegal pattern component: " + str);
    case 71: 
      paramc.h();
    }
    for (;;)
    {
      i = n + 1;
      break;
      paramc.g(k, k);
      continue;
      if (k == 2)
      {
        boolean bool1 = true;
        boolean bool2 = true;
        if (n + 1 < m)
        {
          arrayOfInt[0] += 1;
          bool1 = bool2;
          if (b(a(paramString, arrayOfInt))) {
            bool1 = false;
          }
          arrayOfInt[0] -= 1;
        }
        switch (i1)
        {
        default: 
          paramc.a(new e.b.a.b().c() - 30, bool1);
          break;
        case 120: 
          paramc.b(new e.b.a.b().d() - 30, bool1);
          break;
        }
      }
      else
      {
        i = 9;
        int j = i;
        if (n + 1 < m)
        {
          arrayOfInt[0] += 1;
          if (b(a(paramString, arrayOfInt))) {
            i = k;
          }
          arrayOfInt[0] -= 1;
          j = i;
        }
        switch (i1)
        {
        default: 
          break;
        case 89: 
          paramc.f(k, j);
          break;
        case 120: 
          paramc.d(k, j);
          break;
        case 121: 
          paramc.e(k, j);
          continue;
          if (k >= 3)
          {
            if (k >= 4) {
              paramc.f();
            } else {
              paramc.g();
            }
          }
          else
          {
            paramc.k(k);
            continue;
            paramc.h(k);
            continue;
            paramc.c();
            continue;
            paramc.f(k);
            continue;
            paramc.c(k);
            continue;
            paramc.d(k);
            continue;
            paramc.e(k);
            continue;
            paramc.b(k);
            continue;
            paramc.a(k);
            continue;
            paramc.a(k, k);
            continue;
            paramc.g(k);
            continue;
            if (k >= 4)
            {
              paramc.d();
            }
            else
            {
              paramc.e();
              continue;
              paramc.i(k);
              continue;
              paramc.j(k);
              continue;
              if (k >= 4)
              {
                paramc.i();
              }
              else
              {
                paramc.a(null);
                continue;
                if (k == 1)
                {
                  paramc.a(null, "Z", false, 2, 2);
                }
                else if (k == 2)
                {
                  paramc.a(null, "Z", true, 2, 2);
                }
                else
                {
                  paramc.j();
                  continue;
                  str = str.substring(1);
                  if (str.length() == 1) {
                    paramc.a(str.charAt(0));
                  } else {
                    paramc.a(new String(str));
                  }
                }
              }
            }
          }
          break;
        }
      }
    }
  }
  
  private static boolean b(String paramString)
  {
    boolean bool = true;
    int i = paramString.length();
    if (i > 0) {
      switch (paramString.charAt(0))
      {
      }
    }
    do
    {
      bool = false;
      return bool;
    } while (i > 2);
    return true;
  }
  
  private static b c(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      throw new IllegalArgumentException("Invalid pattern specification");
    }
    b localb = (b)a.get(paramString);
    Object localObject = localb;
    if (localb == null)
    {
      localObject = new c();
      a((c)localObject, paramString);
      localb = ((c)localObject).a();
      if (a.size() < 500)
      {
        localObject = (b)a.putIfAbsent(paramString, localb);
        if (localObject == null) {}
      }
    }
    else
    {
      return (b)localObject;
    }
    return localb;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
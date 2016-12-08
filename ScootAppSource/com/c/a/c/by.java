package com.c.a.c;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.os.Build.VERSION;
import b.a.a.a.a.b.z;
import b.a.a.a.t;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class by
{
  private static final b a = b.a("0");
  private static final b b = b.a("Unity");
  
  private static int a()
  {
    return 0 + f.b(1, a) + f.b(2, a) + f.b(3, 0L);
  }
  
  private static int a(float paramFloat, int paramInt1, boolean paramBoolean, int paramInt2, long paramLong1, long paramLong2)
  {
    return 0 + f.b(1, paramFloat) + f.f(2, paramInt1) + f.b(3, paramBoolean) + f.d(4, paramInt2) + f.b(5, paramLong1) + f.b(6, paramLong2);
  }
  
  private static int a(int paramInt1, b paramb1, b paramb2, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, Map<z, String> paramMap, int paramInt3, b paramb3, b paramb4)
  {
    int i = f.b(1, paramb1);
    int j = f.e(3, paramInt1);
    if (paramb2 == null) {}
    for (paramInt1 = 0;; paramInt1 = f.b(4, paramb2))
    {
      paramInt1 = paramInt1 + (j + (0 + i)) + f.d(5, paramInt2) + f.b(6, paramLong1) + f.b(7, paramLong2) + f.b(10, paramBoolean);
      if (paramMap == null) {
        break;
      }
      paramb1 = paramMap.entrySet().iterator();
      for (;;)
      {
        paramInt2 = paramInt1;
        if (!paramb1.hasNext()) {
          break;
        }
        paramb2 = (Map.Entry)paramb1.next();
        paramInt2 = a((z)paramb2.getKey(), (String)paramb2.getValue());
        paramInt1 = paramInt2 + (f.j(11) + f.l(paramInt2)) + paramInt1;
      }
    }
    paramInt2 = paramInt1;
    i = f.d(12, paramInt3);
    if (paramb3 == null)
    {
      paramInt1 = 0;
      if (paramb4 != null) {
        break label195;
      }
    }
    label195:
    for (paramInt3 = 0;; paramInt3 = f.b(14, paramb4))
    {
      return paramInt3 + (paramInt2 + i + paramInt1);
      paramInt1 = f.b(13, paramb3);
      break;
    }
  }
  
  private static int a(long paramLong1, String paramString, Throwable paramThrowable, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, int paramInt1, Map<String, String> paramMap, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt2, b paramb1, b paramb2, float paramFloat, int paramInt3, boolean paramBoolean, long paramLong2, long paramLong3, b paramb3)
  {
    int i = f.b(1, paramLong1);
    int j = f.b(2, b.a(paramString));
    paramInt1 = a(paramThrowable, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramb1, paramb2, paramMap, paramRunningAppProcessInfo, paramInt2);
    int k = f.j(3);
    int m = f.l(paramInt1);
    paramInt2 = a(paramFloat, paramInt3, paramBoolean, paramInt2, paramLong2, paramLong3);
    paramInt2 = paramInt2 + (f.j(5) + f.l(paramInt2)) + (0 + i + j + (paramInt1 + (k + m)));
    paramInt1 = paramInt2;
    if (paramb3 != null)
    {
      paramInt1 = b(paramb3);
      paramInt1 = paramInt2 + (paramInt1 + (f.j(6) + f.l(paramInt1)));
    }
    return paramInt1;
  }
  
  private static int a(z paramz, String paramString)
  {
    return f.e(1, paramz.h) + f.b(2, b.a(paramString));
  }
  
  private static int a(b paramb)
  {
    return 0 + f.b(1, paramb);
  }
  
  private static int a(b paramb1, b paramb2)
  {
    int j = 0 + f.b(1, 0L) + f.b(2, 0L) + f.b(3, paramb1);
    int i = j;
    if (paramb2 != null) {
      i = j + f.b(4, paramb2);
    }
    return i;
  }
  
  private static int a(b paramb1, b paramb2, b paramb3, b paramb4, b paramb5, int paramInt, b paramb6)
  {
    int i = f.b(1, paramb1);
    int j = f.b(2, paramb3);
    int k = f.b(3, paramb4);
    int m = a(paramb2);
    j = 0 + i + j + k + (m + (f.j(5) + f.l(m))) + f.b(6, paramb5);
    i = j;
    if (paramb6 != null) {
      i = j + f.b(8, b) + f.b(9, paramb6);
    }
    return i + f.e(10, paramInt);
  }
  
  private static int a(b paramb1, b paramb2, boolean paramBoolean)
  {
    return 0 + f.e(1, 3) + f.b(2, paramb1) + f.b(3, paramb2) + f.b(4, paramBoolean);
  }
  
  private static int a(StackTraceElement paramStackTraceElement, boolean paramBoolean)
  {
    int i;
    int j;
    if (paramStackTraceElement.isNativeMethod())
    {
      i = f.b(1, Math.max(paramStackTraceElement.getLineNumber(), 0)) + 0;
      j = i + f.b(2, b.a(paramStackTraceElement.getClassName() + "." + paramStackTraceElement.getMethodName()));
      i = j;
      if (paramStackTraceElement.getFileName() != null) {
        i = j + f.b(3, b.a(paramStackTraceElement.getFileName()));
      }
      if ((paramStackTraceElement.isNativeMethod()) || (paramStackTraceElement.getLineNumber() <= 0)) {
        break label141;
      }
      i += f.b(4, paramStackTraceElement.getLineNumber());
    }
    label141:
    for (;;)
    {
      if (paramBoolean) {}
      for (j = 2;; j = 0)
      {
        return f.d(5, j) + i;
        i = f.b(1, 0L) + 0;
        break;
      }
    }
  }
  
  private static int a(String paramString1, String paramString2)
  {
    int i = f.b(1, b.a(paramString1));
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    return i + f.b(2, b.a(paramString1));
  }
  
  private static int a(Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, int paramInt, boolean paramBoolean)
  {
    int i = f.b(1, b.a(paramThread.getName()));
    i = f.d(2, paramInt) + i;
    int j = paramArrayOfStackTraceElement.length;
    paramInt = 0;
    while (paramInt < j)
    {
      int k = a(paramArrayOfStackTraceElement[paramInt], paramBoolean);
      i += k + (f.j(3) + f.l(k));
      paramInt += 1;
    }
    return i;
  }
  
  private static int a(Throwable paramThrowable, int paramInt1, int paramInt2)
  {
    int k = 0;
    int j = f.b(1, b.a(paramThrowable.getClass().getName())) + 0;
    Object localObject = paramThrowable.getLocalizedMessage();
    int i = j;
    if (localObject != null) {
      i = j + f.b(3, b.a((String)localObject));
    }
    localObject = paramThrowable.getStackTrace();
    int m = localObject.length;
    j = 0;
    while (j < m)
    {
      int n = a(localObject[j], true);
      int i1 = f.j(4);
      int i2 = f.l(n);
      j += 1;
      i = n + (i1 + i2) + i;
    }
    localObject = paramThrowable.getCause();
    j = i;
    if (localObject != null)
    {
      j = k;
      paramThrowable = (Throwable)localObject;
      if (paramInt1 < paramInt2)
      {
        paramInt1 = a((Throwable)localObject, paramInt1 + 1, paramInt2);
        j = i + (paramInt1 + (f.j(6) + f.l(paramInt1)));
      }
    }
    else
    {
      return j;
    }
    while (paramThrowable != null)
    {
      paramThrowable = paramThrowable.getCause();
      j += 1;
    }
    return i + f.d(7, j);
  }
  
  private static int a(Throwable paramThrowable, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, int paramInt, b paramb1, b paramb2)
  {
    int i = a(paramThread, paramArrayOfStackTraceElement, 4, true);
    int j = f.j(1);
    int m = f.l(i);
    int k = paramArrayOfThread.length;
    i = i + (j + m) + 0;
    j = 0;
    while (j < k)
    {
      m = a(paramArrayOfThread[j], (StackTraceElement[])paramList.get(j), 0, false);
      i += m + (f.j(1) + f.l(m));
      j += 1;
    }
    paramInt = a(paramThrowable, 1, paramInt);
    j = f.j(2);
    k = f.l(paramInt);
    m = a();
    int n = f.j(3);
    int i1 = f.l(m);
    int i2 = a(paramb1, paramb2);
    return paramInt + (j + k) + i + (m + (n + i1)) + (i2 + (f.j(3) + f.l(i2)));
  }
  
  private static int a(Throwable paramThrowable, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, int paramInt1, b paramb1, b paramb2, Map<String, String> paramMap, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt2)
  {
    paramInt1 = a(paramThrowable, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramb1, paramb2);
    paramInt1 = 0 + (paramInt1 + (f.j(1) + f.l(paramInt1)));
    if (paramMap != null)
    {
      paramThrowable = paramMap.entrySet().iterator();
      while (paramThrowable.hasNext())
      {
        paramThread = (Map.Entry)paramThrowable.next();
        int i = a((String)paramThread.getKey(), (String)paramThread.getValue());
        paramInt1 = i + (f.j(2) + f.l(i)) + paramInt1;
      }
    }
    for (;;)
    {
      boolean bool;
      if (paramRunningAppProcessInfo != null) {
        if (paramRunningAppProcessInfo.importance != 100)
        {
          bool = true;
          paramInt1 = f.b(3, bool) + paramInt1;
        }
      }
      for (;;)
      {
        return paramInt1 + f.d(4, paramInt2);
        bool = false;
        break;
      }
    }
  }
  
  private static b a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return b.a(paramString);
  }
  
  private static void a(f paramf, float paramFloat, int paramInt1, boolean paramBoolean, int paramInt2, long paramLong1, long paramLong2)
  {
    paramf.g(5, 2);
    paramf.k(a(paramFloat, paramInt1, paramBoolean, paramInt2, paramLong1, paramLong2));
    paramf.a(1, paramFloat);
    paramf.c(2, paramInt1);
    paramf.a(3, paramBoolean);
    paramf.a(4, paramInt2);
    paramf.a(5, paramLong1);
    paramf.a(6, paramLong2);
  }
  
  private static void a(f paramf, int paramInt, StackTraceElement paramStackTraceElement, boolean paramBoolean)
  {
    int i = 4;
    paramf.g(paramInt, 2);
    paramf.k(a(paramStackTraceElement, paramBoolean));
    if (paramStackTraceElement.isNativeMethod())
    {
      paramf.a(1, Math.max(paramStackTraceElement.getLineNumber(), 0));
      paramf.a(2, b.a(paramStackTraceElement.getClassName() + "." + paramStackTraceElement.getMethodName()));
      if (paramStackTraceElement.getFileName() != null) {
        paramf.a(3, b.a(paramStackTraceElement.getFileName()));
      }
      if ((!paramStackTraceElement.isNativeMethod()) && (paramStackTraceElement.getLineNumber() > 0)) {
        paramf.a(4, paramStackTraceElement.getLineNumber());
      }
      if (!paramBoolean) {
        break label142;
      }
    }
    label142:
    for (paramInt = i;; paramInt = 0)
    {
      paramf.a(5, paramInt);
      return;
      paramf.a(1, 0L);
      break;
    }
  }
  
  public static void a(f paramf, long paramLong1, String paramString1, Throwable paramThrowable, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, Map<String, String> paramMap, ay paramay, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt1, String paramString2, String paramString3, float paramFloat, int paramInt2, boolean paramBoolean, long paramLong2, long paramLong3)
  {
    b localb = b.a(paramString2);
    if (paramString3 == null) {}
    for (paramString2 = null;; paramString2 = b.a(paramString3.replace("-", "")))
    {
      paramString3 = paramay.a();
      if (paramString3 == null) {
        b.a.a.a.f.h().a("CrashlyticsCore", "No log data to include with this event.");
      }
      paramay.b();
      paramf.g(10, 2);
      paramf.k(a(paramLong1, paramString1, paramThrowable, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, 8, paramMap, paramRunningAppProcessInfo, paramInt1, localb, paramString2, paramFloat, paramInt2, paramBoolean, paramLong2, paramLong3, paramString3));
      paramf.a(1, paramLong1);
      paramf.a(2, b.a(paramString1));
      a(paramf, paramThrowable, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, 8, localb, paramString2, paramMap, paramRunningAppProcessInfo, paramInt1);
      a(paramf, paramFloat, paramInt2, paramBoolean, paramInt1, paramLong2, paramLong3);
      a(paramf, paramString3);
      return;
    }
  }
  
  private static void a(f paramf, b paramb)
  {
    if (paramb != null)
    {
      paramf.g(6, 2);
      paramf.k(b(paramb));
      paramf.a(1, paramb);
    }
  }
  
  public static void a(f paramf, String paramString1, int paramInt1, String paramString2, int paramInt2, long paramLong1, long paramLong2, boolean paramBoolean, Map<z, String> paramMap, int paramInt3, String paramString3, String paramString4)
  {
    paramString1 = b.a(paramString1);
    b localb = a(paramString2);
    paramString2 = a(paramString4);
    paramString3 = a(paramString3);
    paramf.g(9, 2);
    paramf.k(a(paramInt1, paramString1, localb, paramInt2, paramLong1, paramLong2, paramBoolean, paramMap, paramInt3, paramString3, paramString2));
    paramf.a(1, paramString1);
    paramf.b(3, paramInt1);
    paramf.a(4, localb);
    paramf.a(5, paramInt2);
    paramf.a(6, paramLong1);
    paramf.a(7, paramLong2);
    paramf.a(10, paramBoolean);
    paramString1 = paramMap.entrySet().iterator();
    while (paramString1.hasNext())
    {
      paramMap = (Map.Entry)paramString1.next();
      paramf.g(11, 2);
      paramf.k(a((z)paramMap.getKey(), (String)paramMap.getValue()));
      paramf.b(1, ((z)paramMap.getKey()).h);
      paramf.a(2, b.a((String)paramMap.getValue()));
    }
    paramf.a(12, paramInt3);
    if (paramString3 != null) {
      paramf.a(13, paramString3);
    }
    if (paramString2 != null) {
      paramf.a(14, paramString2);
    }
  }
  
  public static void a(f paramf, String paramString1, String paramString2, long paramLong)
  {
    paramf.a(1, b.a(paramString2));
    paramf.a(2, b.a(paramString1));
    paramf.a(3, paramLong);
  }
  
  public static void a(f paramf, String paramString1, String paramString2, String paramString3)
  {
    Object localObject = paramString1;
    if (paramString1 == null) {
      localObject = "";
    }
    paramString1 = b.a((String)localObject);
    localObject = a(paramString2);
    b localb = a(paramString3);
    int j = 0 + f.b(1, paramString1);
    int i = j;
    if (paramString2 != null) {
      i = j + f.b(2, (b)localObject);
    }
    j = i;
    if (paramString3 != null) {
      j = i + f.b(3, localb);
    }
    paramf.g(6, 2);
    paramf.k(j);
    paramf.a(1, paramString1);
    if (paramString2 != null) {
      paramf.a(2, (b)localObject);
    }
    if (paramString3 != null) {
      paramf.a(3, localb);
    }
  }
  
  public static void a(f paramf, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt, String paramString6)
  {
    b localb = b.a(paramString1);
    paramString2 = b.a(paramString2);
    paramString3 = b.a(paramString3);
    paramString4 = b.a(paramString4);
    paramString5 = b.a(paramString5);
    if (paramString6 != null) {}
    for (paramString1 = b.a(paramString6);; paramString1 = null)
    {
      paramf.g(7, 2);
      paramf.k(a(localb, paramString2, paramString3, paramString4, paramString5, paramInt, paramString1));
      paramf.a(1, localb);
      paramf.a(2, paramString3);
      paramf.a(3, paramString4);
      paramf.g(5, 2);
      paramf.k(a(paramString2));
      paramf.a(1, paramString2);
      paramf.a(6, paramString5);
      if (paramString1 != null)
      {
        paramf.a(8, b);
        paramf.a(9, paramString1);
      }
      paramf.b(10, paramInt);
      return;
    }
  }
  
  private static void a(f paramf, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, int paramInt, boolean paramBoolean)
  {
    paramf.g(1, 2);
    paramf.k(a(paramThread, paramArrayOfStackTraceElement, paramInt, paramBoolean));
    paramf.a(1, b.a(paramThread.getName()));
    paramf.a(2, paramInt);
    int i = paramArrayOfStackTraceElement.length;
    paramInt = 0;
    while (paramInt < i)
    {
      a(paramf, 3, paramArrayOfStackTraceElement[paramInt], paramBoolean);
      paramInt += 1;
    }
  }
  
  private static void a(f paramf, Throwable paramThrowable, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    paramf.g(paramInt3, 2);
    paramf.k(a(paramThrowable, 1, paramInt2));
    paramf.a(1, b.a(paramThrowable.getClass().getName()));
    Object localObject = paramThrowable.getLocalizedMessage();
    if (localObject != null) {
      paramf.a(3, b.a((String)localObject));
    }
    localObject = paramThrowable.getStackTrace();
    int j = localObject.length;
    paramInt3 = 0;
    while (paramInt3 < j)
    {
      a(paramf, 4, localObject[paramInt3], true);
      paramInt3 += 1;
    }
    localObject = paramThrowable.getCause();
    if (localObject != null)
    {
      paramInt3 = i;
      paramThrowable = (Throwable)localObject;
      if (paramInt1 < paramInt2) {
        a(paramf, (Throwable)localObject, paramInt1 + 1, paramInt2, 6);
      }
    }
    else
    {
      return;
    }
    while (paramThrowable != null)
    {
      paramThrowable = paramThrowable.getCause();
      paramInt3 += 1;
    }
    paramf.a(7, paramInt3);
  }
  
  private static void a(f paramf, Throwable paramThrowable, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, int paramInt, b paramb1, b paramb2)
  {
    paramf.g(1, 2);
    paramf.k(a(paramThrowable, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt, paramb1, paramb2));
    a(paramf, paramThread, paramArrayOfStackTraceElement, 4, true);
    int j = paramArrayOfThread.length;
    int i = 0;
    while (i < j)
    {
      a(paramf, paramArrayOfThread[i], (StackTraceElement[])paramList.get(i), 0, false);
      i += 1;
    }
    a(paramf, paramThrowable, 1, paramInt, 2);
    paramf.g(3, 2);
    paramf.k(a());
    paramf.a(1, a);
    paramf.a(2, a);
    paramf.a(3, 0L);
    paramf.g(4, 2);
    paramf.k(a(paramb1, paramb2));
    paramf.a(1, 0L);
    paramf.a(2, 0L);
    paramf.a(3, paramb1);
    if (paramb2 != null) {
      paramf.a(4, paramb2);
    }
  }
  
  private static void a(f paramf, Throwable paramThrowable, Thread paramThread, StackTraceElement[] paramArrayOfStackTraceElement, Thread[] paramArrayOfThread, List<StackTraceElement[]> paramList, int paramInt1, b paramb1, b paramb2, Map<String, String> paramMap, ActivityManager.RunningAppProcessInfo paramRunningAppProcessInfo, int paramInt2)
  {
    paramf.g(3, 2);
    paramf.k(a(paramThrowable, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramb1, paramb2, paramMap, paramRunningAppProcessInfo, paramInt2));
    a(paramf, paramThrowable, paramThread, paramArrayOfStackTraceElement, paramArrayOfThread, paramList, paramInt1, paramb1, paramb2);
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      a(paramf, paramMap);
    }
    if (paramRunningAppProcessInfo != null) {
      if (paramRunningAppProcessInfo.importance == 100) {
        break label103;
      }
    }
    label103:
    for (boolean bool = true;; bool = false)
    {
      paramf.a(3, bool);
      paramf.a(4, paramInt2);
      return;
    }
  }
  
  private static void a(f paramf, Map<String, String> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      paramf.g(2, 2);
      paramf.k(a((String)paramMap.getKey(), (String)paramMap.getValue()));
      paramf.a(1, b.a((String)paramMap.getKey()));
      String str = (String)paramMap.getValue();
      paramMap = str;
      if (str == null) {
        paramMap = "";
      }
      paramf.a(2, b.a(paramMap));
    }
  }
  
  public static void a(f paramf, boolean paramBoolean)
  {
    b localb1 = b.a(Build.VERSION.RELEASE);
    b localb2 = b.a(Build.VERSION.CODENAME);
    paramf.g(8, 2);
    paramf.k(a(localb1, localb2, paramBoolean));
    paramf.b(1, 3);
    paramf.a(2, localb1);
    paramf.a(3, localb2);
    paramf.a(4, paramBoolean);
  }
  
  private static int b(b paramb)
  {
    return f.b(1, paramb);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\by.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
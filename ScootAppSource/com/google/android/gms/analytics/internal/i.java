package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.p;

@Deprecated
public final class i
{
  private static volatile p a;
  
  static
  {
    a(new bi());
  }
  
  public static p a()
  {
    return a;
  }
  
  public static void a(p paramp)
  {
    a = paramp;
  }
  
  public static void a(String paramString)
  {
    Object localObject = j.b();
    if (localObject != null) {
      ((j)localObject).d(paramString);
    }
    for (;;)
    {
      localObject = a;
      if (localObject != null) {
        ((p)localObject).b(paramString);
      }
      return;
      if (a(1)) {
        Log.i((String)bp.c.a(), paramString);
      }
    }
  }
  
  public static void a(String paramString, Object paramObject)
  {
    j localj = j.b();
    if (localj != null) {
      localj.e(paramString, paramObject);
    }
    while (!a(3))
    {
      paramObject = a;
      if (paramObject != null) {
        ((p)paramObject).d(paramString);
      }
      return;
    }
    if (paramObject != null) {
      paramObject = String.valueOf(paramObject);
    }
    for (paramObject = String.valueOf(paramString).length() + 1 + String.valueOf(paramObject).length() + paramString + ":" + (String)paramObject;; paramObject = paramString)
    {
      Log.e((String)bp.c.a(), (String)paramObject);
      break;
    }
  }
  
  public static boolean a(int paramInt)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (a() != null)
    {
      bool1 = bool2;
      if (a().a() <= paramInt) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public static void b(String paramString)
  {
    Object localObject = j.b();
    if (localObject != null) {
      ((j)localObject).b(paramString);
    }
    for (;;)
    {
      localObject = a;
      if (localObject != null) {
        ((p)localObject).a(paramString);
      }
      return;
      if (a(0)) {
        Log.v((String)bp.c.a(), paramString);
      }
    }
  }
  
  public static void c(String paramString)
  {
    Object localObject = j.b();
    if (localObject != null) {
      ((j)localObject).e(paramString);
    }
    for (;;)
    {
      localObject = a;
      if (localObject != null) {
        ((p)localObject).c(paramString);
      }
      return;
      if (a(2)) {
        Log.w((String)bp.c.a(), paramString);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\analytics\internal\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
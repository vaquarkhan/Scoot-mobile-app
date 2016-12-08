package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.b.ec;
import com.google.android.gms.common.a.k;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private static final Object a = new Object();
  private static b b;
  private static Integer h;
  private final List<String> c;
  private final List<String> d;
  private final List<String> e;
  private final List<String> f;
  private g g;
  private g i;
  
  private b()
  {
    if (c() == f.b)
    {
      this.c = Collections.EMPTY_LIST;
      this.d = Collections.EMPTY_LIST;
      this.e = Collections.EMPTY_LIST;
      this.f = Collections.EMPTY_LIST;
      return;
    }
    Object localObject = (String)d.b.a();
    if (localObject == null)
    {
      localObject = Collections.EMPTY_LIST;
      this.c = ((List)localObject);
      localObject = (String)d.c.a();
      if (localObject != null) {
        break label200;
      }
      localObject = Collections.EMPTY_LIST;
      label83:
      this.d = ((List)localObject);
      localObject = (String)d.d.a();
      if (localObject != null) {
        break label213;
      }
      localObject = Collections.EMPTY_LIST;
      label106:
      this.e = ((List)localObject);
      localObject = (String)d.e.a();
      if (localObject != null) {
        break label226;
      }
    }
    label200:
    label213:
    label226:
    for (localObject = Collections.EMPTY_LIST;; localObject = Arrays.asList(((String)localObject).split(",")))
    {
      this.f = ((List)localObject);
      this.g = new g(1024, ((Long)d.f.a()).longValue());
      this.i = new g(1024, ((Long)d.f.a()).longValue());
      return;
      localObject = Arrays.asList(((String)localObject).split(","));
      break;
      localObject = Arrays.asList(((String)localObject).split(","));
      break label83;
      localObject = Arrays.asList(((String)localObject).split(","));
      break label106;
    }
  }
  
  public static b a()
  {
    synchronized (a)
    {
      if (b == null) {
        b = new b();
      }
      return b;
    }
  }
  
  private static String a(int paramInt1, int paramInt2)
  {
    StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
    StringBuffer localStringBuffer = new StringBuffer();
    int j = paramInt1;
    while (j < paramInt2 + paramInt1)
    {
      localStringBuffer.append(a(arrayOfStackTraceElement, j)).append(" ");
      j += 1;
    }
    return localStringBuffer.toString();
  }
  
  private String a(ServiceConnection paramServiceConnection)
  {
    return String.valueOf(Process.myPid() << 32 | System.identityHashCode(paramServiceConnection));
  }
  
  private static String a(StackTraceElement[] paramArrayOfStackTraceElement, int paramInt)
  {
    if (paramInt + 4 >= paramArrayOfStackTraceElement.length) {
      return "<bottom of call stack>";
    }
    paramArrayOfStackTraceElement = paramArrayOfStackTraceElement[(paramInt + 4)];
    String str1 = String.valueOf(paramArrayOfStackTraceElement.getClassName());
    String str2 = String.valueOf(paramArrayOfStackTraceElement.getMethodName());
    paramInt = paramArrayOfStackTraceElement.getLineNumber();
    return String.valueOf(str1).length() + 13 + String.valueOf(str2).length() + str1 + "." + str2 + ":" + paramInt;
  }
  
  private void a(Context paramContext, String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    long l2 = System.currentTimeMillis();
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if ((c() & f.f) != 0)
    {
      localObject1 = localObject2;
      if (paramInt != 13) {
        localObject1 = a(3, 5);
      }
    }
    long l1 = 0L;
    if ((c() & f.h) != 0) {
      l1 = Debug.getNativeHeapAllocatedSize();
    }
    if ((paramInt == 1) || (paramInt == 4) || (paramInt == 14)) {}
    for (paramString1 = new ConnectionEvent(l2, paramInt, null, null, null, null, (String)localObject1, paramString1, SystemClock.elapsedRealtime(), l1);; paramString1 = new ConnectionEvent(l2, paramInt, paramString2, paramString3, paramString4, paramString5, (String)localObject1, paramString1, SystemClock.elapsedRealtime(), l1))
    {
      paramContext.startService(new Intent().setComponent(f.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", paramString1));
      return;
    }
  }
  
  private void a(Context paramContext, String paramString1, String paramString2, Intent paramIntent, int paramInt)
  {
    Object localObject2 = null;
    if ((!b()) || (this.g == null)) {}
    do
    {
      return;
      if ((paramInt != 4) && (paramInt != 1)) {
        break;
      }
    } while (!this.g.b(paramString1));
    Object localObject1 = null;
    String str = null;
    paramIntent = (Intent)localObject2;
    for (;;)
    {
      a(paramContext, paramString1, paramInt, paramIntent, paramString2, str, (String)localObject1);
      return;
      localObject1 = b(paramContext, paramIntent);
      if (localObject1 == null)
      {
        Log.w("ConnectionTracker", String.format("Client %s made an invalid request %s", new Object[] { paramString2, paramIntent.toUri(0) }));
        return;
      }
      str = ((ServiceInfo)localObject1).processName;
      localObject1 = ((ServiceInfo)localObject1).name;
      paramIntent = k.a();
      if (!a(paramIntent, paramString2, str, (String)localObject1)) {
        break;
      }
      this.g.a(paramString1);
    }
  }
  
  private boolean a(Context paramContext, Intent paramIntent)
  {
    paramIntent = paramIntent.getComponent();
    if (paramIntent != null) {
      return com.google.android.gms.common.a.b.a(paramContext, paramIntent.getPackageName());
    }
    return false;
  }
  
  private boolean a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    int j = c();
    return (!this.c.contains(paramString1)) && (!this.d.contains(paramString2)) && (!this.e.contains(paramString3)) && (!this.f.contains(paramString4)) && ((!paramString3.equals(paramString1)) || ((j & f.g) == 0));
  }
  
  private static ServiceInfo b(Context paramContext, Intent paramIntent)
  {
    paramContext = paramContext.getPackageManager().queryIntentServices(paramIntent, 128);
    if ((paramContext == null) || (paramContext.size() == 0))
    {
      Log.w("ConnectionTracker", String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] { paramIntent.toUri(0), a(3, 20) }));
      return null;
    }
    if (paramContext.size() > 1)
    {
      Log.w("ConnectionTracker", String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] { paramIntent.toUri(0), a(3, 20) }));
      paramContext = paramContext.iterator();
      while (paramContext.hasNext()) {
        Log.w("ConnectionTracker", ((ResolveInfo)paramContext.next()).serviceInfo.name);
      }
      return null;
    }
    return ((ResolveInfo)paramContext.get(0)).serviceInfo;
  }
  
  private boolean b()
  {
    return false;
  }
  
  private static int c()
  {
    if (h == null) {}
    for (;;)
    {
      try
      {
        if (!com.google.android.gms.common.a.b.a()) {
          continue;
        }
        j = ((Integer)d.a.a()).intValue();
        h = Integer.valueOf(j);
      }
      catch (SecurityException localSecurityException)
      {
        int j;
        h = Integer.valueOf(f.b);
        continue;
      }
      return h.intValue();
      j = f.b;
    }
  }
  
  @SuppressLint({"UntrackedBindService"})
  public void a(Context paramContext, ServiceConnection paramServiceConnection)
  {
    paramContext.unbindService(paramServiceConnection);
    a(paramContext, a(paramServiceConnection), null, null, 1);
  }
  
  public void a(Context paramContext, ServiceConnection paramServiceConnection, String paramString, Intent paramIntent)
  {
    a(paramContext, a(paramServiceConnection), paramString, paramIntent, 3);
  }
  
  public boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    return a(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt);
  }
  
  @SuppressLint({"UntrackedBindService"})
  public boolean a(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt)
  {
    if (a(paramContext, paramIntent))
    {
      Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
      return false;
    }
    boolean bool = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
    if (bool) {
      a(paramContext, a(paramServiceConnection), paramString, paramIntent, 2);
    }
    return bool;
  }
  
  public void b(Context paramContext, ServiceConnection paramServiceConnection)
  {
    a(paramContext, a(paramServiceConnection), null, null, 4);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\stats\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
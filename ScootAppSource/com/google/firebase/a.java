package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.a.j;
import com.google.android.gms.common.internal.br;
import com.google.android.gms.common.internal.bt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class a
{
  static final Map<String, a> a = new android.support.v4.g.a();
  private static final List<String> b = Arrays.asList(new String[] { "com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId" });
  private static final List<String> c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
  private static final List<String> d = Arrays.asList(new String[] { "com.google.android.gms.measurement.AppMeasurement" });
  private static final Set<String> e = Collections.emptySet();
  private static final Object f = new Object();
  private final Context g;
  private final String h;
  private final c i;
  private final AtomicBoolean j = new AtomicBoolean(true);
  private final AtomicBoolean k = new AtomicBoolean();
  private final List<Object> l = new CopyOnWriteArrayList();
  private final List<b> m = new CopyOnWriteArrayList();
  private final List<Object> n = new CopyOnWriteArrayList();
  
  protected a(Context paramContext, String paramString, c paramc)
  {
    this.g = ((Context)com.google.android.gms.common.internal.b.a(paramContext));
    this.h = com.google.android.gms.common.internal.b.a(paramString);
    this.i = ((c)com.google.android.gms.common.internal.b.a(paramc));
  }
  
  public static a a(Context paramContext)
  {
    c localc = c.a(paramContext);
    if (localc == null) {
      return null;
    }
    return a(paramContext, localc);
  }
  
  public static a a(Context paramContext, c paramc)
  {
    return a(paramContext, paramc, "[DEFAULT]");
  }
  
  public static a a(Context arg0, c paramc, String paramString)
  {
    com.google.android.gms.b.c localc = com.google.android.gms.b.c.a(???);
    b(???);
    paramString = a(paramString);
    Context localContext = ???.getApplicationContext();
    synchronized (f)
    {
      if (!a.containsKey(paramString))
      {
        bool = true;
        com.google.android.gms.common.internal.b.a(bool, String.valueOf(paramString).length() + 33 + "FirebaseApp name " + paramString + " already exists!");
        com.google.android.gms.common.internal.b.a(localContext, "Application context cannot be null.");
        paramc = new a(localContext, paramString, paramc);
        a.put(paramString, paramc);
        localc.a(paramc);
        a(a.class, paramc, b);
        if (paramc.c())
        {
          a(a.class, paramc, c);
          a(Context.class, paramc.a(), d);
        }
        return paramc;
      }
      boolean bool = false;
    }
  }
  
  private static String a(String paramString)
  {
    return paramString.trim();
  }
  
  private static <T> void a(Class<T> paramClass, T paramT, Iterable<String> paramIterable)
  {
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        paramIterable = (String)localIterator.next();
        try
        {
          Object localObject = Class.forName(paramIterable);
          Method localMethod = ((Class)localObject).getMethod("getInstance", new Class[] { paramClass });
          if ((localMethod.getModifiers() & 0x9) == 9) {
            localMethod.invoke(null, new Object[] { paramT });
          }
          localObject = String.valueOf(localObject);
          Log.d("FirebaseApp", String.valueOf(localObject).length() + 13 + "Initialized " + (String)localObject + ".");
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          if (e.contains(paramIterable)) {
            throw new IllegalStateException(String.valueOf(paramIterable).concat(" is missing, but is required. Check if it has been removed by Proguard."));
          }
          Log.d("FirebaseApp", String.valueOf(paramIterable).concat(" is not linked. Skipping initialization."));
        }
        catch (NoSuchMethodException paramClass)
        {
          throw new IllegalStateException(String.valueOf(paramIterable).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
        }
        catch (InvocationTargetException paramIterable)
        {
          Log.wtf("FirebaseApp", "Firebase API initialization failure.", paramIterable);
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          paramIterable = String.valueOf(paramIterable);
          if (paramIterable.length() != 0) {}
          for (paramIterable = "Failed to initialize ".concat(paramIterable);; paramIterable = new String("Failed to initialize "))
          {
            Log.wtf("FirebaseApp", paramIterable, localIllegalAccessException);
            break;
          }
        }
      }
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    synchronized (f)
    {
      Iterator localIterator = new ArrayList(a.values()).iterator();
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (locala.j.get()) {
          locala.b(paramBoolean);
        }
      }
    }
  }
  
  @TargetApi(14)
  private static void b(Context paramContext)
  {
    if ((j.c()) && ((paramContext.getApplicationContext() instanceof Application))) {
      com.google.android.gms.b.b.a((Application)paramContext.getApplicationContext());
    }
  }
  
  private void b(boolean paramBoolean)
  {
    Log.d("FirebaseApp", "Notifying background state change listeners.");
    Iterator localIterator = this.m.iterator();
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).a(paramBoolean);
    }
  }
  
  private void d()
  {
    if (!this.k.get()) {}
    for (boolean bool = true;; bool = false)
    {
      com.google.android.gms.common.internal.b.a(bool, "FirebaseApp was deleted");
      return;
    }
  }
  
  public Context a()
  {
    d();
    return this.g;
  }
  
  public String b()
  {
    d();
    return this.h;
  }
  
  public boolean c()
  {
    return "[DEFAULT]".equals(b());
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    return this.h.equals(((a)paramObject).b());
  }
  
  public int hashCode()
  {
    return this.h.hashCode();
  }
  
  public String toString()
  {
    return br.a(this).a("name", this.h).a("options", this.i).toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\firebase\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package b.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import b.a.a.a.a.b.y;
import b.a.a.a.a.c.n;
import b.a.a.a.a.c.w;
import b.a.a.a.a.c.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public class f
{
  static volatile f a;
  static final t b = new e();
  final t c;
  final boolean d;
  private final Context e;
  private final Map<Class<? extends q>, q> f;
  private final ExecutorService g;
  private final Handler h;
  private final l<f> i;
  private final l<?> j;
  private final y k;
  private a l;
  private WeakReference<Activity> m;
  private AtomicBoolean n;
  
  f(Context paramContext, Map<Class<? extends q>, q> paramMap, w paramw, Handler paramHandler, t paramt, boolean paramBoolean, l paraml, y paramy)
  {
    this.e = paramContext;
    this.f = paramMap;
    this.g = paramw;
    this.h = paramHandler;
    this.c = paramt;
    this.d = paramBoolean;
    this.i = paraml;
    this.n = new AtomicBoolean(false);
    this.j = a(paramMap.size());
    this.k = paramy;
  }
  
  static f a()
  {
    if (a == null) {
      throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }
    return a;
  }
  
  public static f a(Context paramContext, q... paramVarArgs)
  {
    if (a == null) {}
    try
    {
      if (a == null) {
        c(new i(paramContext).a(paramVarArgs).a());
      }
      return a;
    }
    finally {}
  }
  
  public static <T extends q> T a(Class<T> paramClass)
  {
    return (q)a().f.get(paramClass);
  }
  
  private static void a(Map<Class<? extends q>, q> paramMap, Collection<? extends q> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      q localq = (q)paramCollection.next();
      paramMap.put(localq.getClass(), localq);
      if ((localq instanceof r)) {
        a(paramMap, ((r)localq).c());
      }
    }
  }
  
  private static Map<Class<? extends q>, q> b(Collection<? extends q> paramCollection)
  {
    HashMap localHashMap = new HashMap(paramCollection.size());
    a(localHashMap, paramCollection);
    return localHashMap;
  }
  
  private Activity c(Context paramContext)
  {
    if ((paramContext instanceof Activity)) {
      return (Activity)paramContext;
    }
    return null;
  }
  
  private static void c(f paramf)
  {
    a = paramf;
    paramf.j();
  }
  
  public static t h()
  {
    if (a == null) {
      return b;
    }
    return a.c;
  }
  
  public static boolean i()
  {
    if (a == null) {
      return false;
    }
    return a.d;
  }
  
  private void j()
  {
    a(c(this.e));
    this.l = new a(this.e);
    this.l.a(new g(this));
    a(this.e);
  }
  
  public f a(Activity paramActivity)
  {
    this.m = new WeakReference(paramActivity);
    return this;
  }
  
  l<?> a(int paramInt)
  {
    return new h(this, paramInt);
  }
  
  void a(Context paramContext)
  {
    Object localObject1 = b(paramContext);
    Object localObject2 = g();
    localObject1 = new u((Future)localObject1, (Collection)localObject2);
    localObject2 = new ArrayList((Collection)localObject2);
    Collections.sort((List)localObject2);
    ((u)localObject1).a(paramContext, this, l.d, this.k);
    Object localObject3 = ((List)localObject2).iterator();
    while (((Iterator)localObject3).hasNext()) {
      ((q)((Iterator)localObject3).next()).a(paramContext, this, this.j, this.k);
    }
    ((u)localObject1).C();
    if (h().a("Fabric", 3)) {}
    for (paramContext = new StringBuilder("Initializing ").append(d()).append(" [Version: ").append(c()).append("], with the following kits:\n");; paramContext = null)
    {
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (q)((Iterator)localObject2).next();
        ((q)localObject3).f.a(((u)localObject1).f);
        a(this.f, (q)localObject3);
        ((q)localObject3).C();
        if (paramContext != null) {
          paramContext.append(((q)localObject3).b()).append(" [Version: ").append(((q)localObject3).a()).append("]\n");
        }
      }
    }
    if (paramContext != null) {
      h().a("Fabric", paramContext.toString());
    }
  }
  
  void a(Map<Class<? extends q>, q> paramMap, q paramq)
  {
    Object localObject1 = paramq.j;
    if (localObject1 != null)
    {
      localObject1 = ((n)localObject1).a();
      int i2 = localObject1.length;
      int i1 = 0;
      while (i1 < i2)
      {
        Object localObject2 = localObject1[i1];
        if (((Class)localObject2).isInterface())
        {
          Iterator localIterator = paramMap.values().iterator();
          while (localIterator.hasNext())
          {
            q localq = (q)localIterator.next();
            if (((Class)localObject2).isAssignableFrom(localq.getClass())) {
              paramq.f.a(localq.f);
            }
          }
        }
        if ((q)paramMap.get(localObject2) == null) {
          throw new z("Referenced Kit was null, does the kit exist?");
        }
        paramq.f.a(((q)paramMap.get(localObject2)).f);
        i1 += 1;
      }
    }
  }
  
  public Activity b()
  {
    if (this.m != null) {
      return (Activity)this.m.get();
    }
    return null;
  }
  
  Future<Map<String, s>> b(Context paramContext)
  {
    paramContext = new k(paramContext.getPackageCodePath());
    return f().submit(paramContext);
  }
  
  public String c()
  {
    return "1.3.12.127";
  }
  
  public String d()
  {
    return "io.fabric.sdk.android:fabric";
  }
  
  public a e()
  {
    return this.l;
  }
  
  public ExecutorService f()
  {
    return this.g;
  }
  
  public Collection<q> g()
  {
    return this.f.values();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class o<TResult>
{
  public static final ExecutorService a = ;
  public static final Executor b = b.b();
  private static final Executor c = f.b();
  private static volatile ab d;
  private static o<?> m = new o(null);
  private static o<Boolean> n = new o(Boolean.valueOf(true));
  private static o<Boolean> o = new o(Boolean.valueOf(false));
  private static o<?> p = new o(true);
  private final Object e = new Object();
  private boolean f;
  private boolean g;
  private TResult h;
  private Exception i;
  private boolean j;
  private ad k;
  private List<m<TResult, Void>> l = new ArrayList();
  
  o() {}
  
  private o(TResult paramTResult)
  {
    b(paramTResult);
  }
  
  private o(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      l();
      return;
    }
    b(null);
  }
  
  public static ab a()
  {
    return d;
  }
  
  public static <TResult> o<TResult> a(Exception paramException)
  {
    ac localac = new ac();
    localac.b(paramException);
    return localac.a();
  }
  
  public static <TResult> o<TResult> a(TResult paramTResult)
  {
    if (paramTResult == null) {
      return m;
    }
    if ((paramTResult instanceof Boolean))
    {
      if (((Boolean)paramTResult).booleanValue()) {
        return n;
      }
      return o;
    }
    ac localac = new ac();
    localac.b(paramTResult);
    return localac.a();
  }
  
  public static o<Void> a(Collection<? extends o<?>> paramCollection)
  {
    if (paramCollection.size() == 0) {
      return a(null);
    }
    ac localac = new ac();
    ArrayList localArrayList = new ArrayList();
    Object localObject = new Object();
    AtomicInteger localAtomicInteger = new AtomicInteger(paramCollection.size());
    AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      ((o)paramCollection.next()).a(new y(localObject, localArrayList, localAtomicBoolean, localAtomicInteger, localac));
    }
    return localac.a();
  }
  
  public static <TResult> o<TResult> a(Callable<TResult> paramCallable)
  {
    return a(paramCallable, a, null);
  }
  
  public static <TResult> o<TResult> a(Callable<TResult> paramCallable, Executor paramExecutor)
  {
    return a(paramCallable, paramExecutor, null);
  }
  
  public static <TResult> o<TResult> a(Callable<TResult> paramCallable, Executor paramExecutor, i parami)
  {
    ac localac = new ac();
    try
    {
      paramExecutor.execute(new x(parami, localac, paramCallable));
      return localac.a();
    }
    catch (Exception paramCallable)
    {
      for (;;)
      {
        localac.b(new n(paramCallable));
      }
    }
  }
  
  public static <TResult> o<TResult>.aa b()
  {
    o localo = new o();
    localo.getClass();
    return new aa(localo);
  }
  
  private static <TContinuationResult, TResult> void c(ac<TContinuationResult> paramac, m<TResult, TContinuationResult> paramm, o<TResult> paramo, Executor paramExecutor, i parami)
  {
    try
    {
      paramExecutor.execute(new t(parami, paramac, paramm, paramo));
      return;
    }
    catch (Exception paramm)
    {
      paramac.b(new n(paramm));
    }
  }
  
  private static <TContinuationResult, TResult> void d(ac<TContinuationResult> paramac, m<TResult, o<TContinuationResult>> paramm, o<TResult> paramo, Executor paramExecutor, i parami)
  {
    try
    {
      paramExecutor.execute(new u(parami, paramac, paramm, paramo));
      return;
    }
    catch (Exception paramm)
    {
      paramac.b(new n(paramm));
    }
  }
  
  public static <TResult> o<TResult> i()
  {
    return p;
  }
  
  private void m()
  {
    for (;;)
    {
      m localm;
      synchronized (this.e)
      {
        Iterator localIterator = this.l.iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        localm = (m)localIterator.next();
      }
      try
      {
        localm.then(this);
      }
      catch (RuntimeException localRuntimeException)
      {
        throw localRuntimeException;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      catch (Exception localException)
      {
        throw new RuntimeException(localException);
      }
    }
    this.l = null;
  }
  
  public <TContinuationResult> o<TContinuationResult> a(m<TResult, TContinuationResult> paramm)
  {
    return a(paramm, c, null);
  }
  
  public <TContinuationResult> o<TContinuationResult> a(m<TResult, TContinuationResult> paramm, Executor paramExecutor)
  {
    return a(paramm, paramExecutor, null);
  }
  
  public <TContinuationResult> o<TContinuationResult> a(m<TResult, TContinuationResult> paramm, Executor paramExecutor, i parami)
  {
    ac localac = new ac();
    synchronized (this.e)
    {
      boolean bool = c();
      if (!bool) {
        this.l.add(new p(this, localac, paramm, paramExecutor, parami));
      }
      if (bool) {
        c(localac, paramm, this, paramExecutor, parami);
      }
      return localac.a();
    }
  }
  
  public o<Void> a(Callable<Boolean> paramCallable, m<Void, o<Void>> paramm)
  {
    return a(paramCallable, paramm, c, null);
  }
  
  public o<Void> a(Callable<Boolean> paramCallable, m<Void, o<Void>> paramm, Executor paramExecutor, i parami)
  {
    l locall = new l();
    locall.a(new z(this, parami, paramCallable, paramm, paramExecutor, locall));
    return k().b((m)locall.a(), paramExecutor);
  }
  
  public <TContinuationResult> o<TContinuationResult> b(m<TResult, o<TContinuationResult>> paramm)
  {
    return b(paramm, c, null);
  }
  
  public <TContinuationResult> o<TContinuationResult> b(m<TResult, o<TContinuationResult>> paramm, Executor paramExecutor)
  {
    return b(paramm, paramExecutor, null);
  }
  
  public <TContinuationResult> o<TContinuationResult> b(m<TResult, o<TContinuationResult>> paramm, Executor paramExecutor, i parami)
  {
    ac localac = new ac();
    synchronized (this.e)
    {
      boolean bool = c();
      if (!bool) {
        this.l.add(new q(this, localac, paramm, paramExecutor, parami));
      }
      if (bool) {
        d(localac, paramm, this, paramExecutor, parami);
      }
      return localac.a();
    }
  }
  
  boolean b(Exception paramException)
  {
    synchronized (this.e)
    {
      if (this.f) {
        return false;
      }
      this.f = true;
      this.i = paramException;
      this.j = false;
      this.e.notifyAll();
      m();
      if ((!this.j) && (a() != null)) {
        this.k = new ad(this);
      }
      return true;
    }
  }
  
  boolean b(TResult paramTResult)
  {
    synchronized (this.e)
    {
      if (this.f) {
        return false;
      }
      this.f = true;
      this.h = paramTResult;
      this.e.notifyAll();
      m();
      return true;
    }
  }
  
  public <TContinuationResult> o<TContinuationResult> c(m<TResult, TContinuationResult> paramm)
  {
    return c(paramm, c, null);
  }
  
  public <TContinuationResult> o<TContinuationResult> c(m<TResult, TContinuationResult> paramm, Executor paramExecutor)
  {
    return c(paramm, paramExecutor, null);
  }
  
  public <TContinuationResult> o<TContinuationResult> c(m<TResult, TContinuationResult> paramm, Executor paramExecutor, i parami)
  {
    return b(new r(this, parami, paramm), paramExecutor);
  }
  
  public boolean c()
  {
    synchronized (this.e)
    {
      boolean bool = this.f;
      return bool;
    }
  }
  
  public <TContinuationResult> o<TContinuationResult> d(m<TResult, o<TContinuationResult>> paramm)
  {
    return d(paramm, c);
  }
  
  public <TContinuationResult> o<TContinuationResult> d(m<TResult, o<TContinuationResult>> paramm, Executor paramExecutor)
  {
    return d(paramm, paramExecutor, null);
  }
  
  public <TContinuationResult> o<TContinuationResult> d(m<TResult, o<TContinuationResult>> paramm, Executor paramExecutor, i parami)
  {
    return b(new s(this, parami, paramm), paramExecutor);
  }
  
  public boolean d()
  {
    synchronized (this.e)
    {
      boolean bool = this.g;
      return bool;
    }
  }
  
  public boolean e()
  {
    for (;;)
    {
      synchronized (this.e)
      {
        if (g() != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public TResult f()
  {
    synchronized (this.e)
    {
      Object localObject2 = this.h;
      return (TResult)localObject2;
    }
  }
  
  public Exception g()
  {
    synchronized (this.e)
    {
      if (this.i != null)
      {
        this.j = true;
        if (this.k != null)
        {
          this.k.a();
          this.k = null;
        }
      }
      Exception localException = this.i;
      return localException;
    }
  }
  
  public void h()
  {
    synchronized (this.e)
    {
      if (!c()) {
        this.e.wait();
      }
      return;
    }
  }
  
  public <TOut> o<TOut> j()
  {
    return this;
  }
  
  public o<Void> k()
  {
    return b(new w(this));
  }
  
  boolean l()
  {
    synchronized (this.e)
    {
      if (this.f) {
        return false;
      }
      this.f = true;
      this.g = true;
      this.e.notifyAll();
      m();
      return true;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
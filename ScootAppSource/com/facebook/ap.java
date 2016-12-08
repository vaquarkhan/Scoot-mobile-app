package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class ap
  extends AbstractList<GraphRequest>
{
  private static AtomicInteger a = new AtomicInteger();
  private Handler b;
  private List<GraphRequest> c = new ArrayList();
  private int d = 0;
  private final String e = Integer.valueOf(a.incrementAndGet()).toString();
  private List<aq> f = new ArrayList();
  private String g;
  
  public ap()
  {
    this.c = new ArrayList();
  }
  
  public ap(Collection<GraphRequest> paramCollection)
  {
    this.c = new ArrayList(paramCollection);
  }
  
  public ap(GraphRequest... paramVarArgs)
  {
    this.c = Arrays.asList(paramVarArgs);
  }
  
  public int a()
  {
    return this.d;
  }
  
  public final GraphRequest a(int paramInt)
  {
    return (GraphRequest)this.c.get(paramInt);
  }
  
  public final void a(int paramInt, GraphRequest paramGraphRequest)
  {
    this.c.add(paramInt, paramGraphRequest);
  }
  
  final void a(Handler paramHandler)
  {
    this.b = paramHandler;
  }
  
  public void a(aq paramaq)
  {
    if (!this.f.contains(paramaq)) {
      this.f.add(paramaq);
    }
  }
  
  public final boolean a(GraphRequest paramGraphRequest)
  {
    return this.c.add(paramGraphRequest);
  }
  
  public final GraphRequest b(int paramInt)
  {
    return (GraphRequest)this.c.remove(paramInt);
  }
  
  public final GraphRequest b(int paramInt, GraphRequest paramGraphRequest)
  {
    return (GraphRequest)this.c.set(paramInt, paramGraphRequest);
  }
  
  final String b()
  {
    return this.e;
  }
  
  final Handler c()
  {
    return this.b;
  }
  
  public final void clear()
  {
    this.c.clear();
  }
  
  final List<GraphRequest> d()
  {
    return this.c;
  }
  
  final List<aq> e()
  {
    return this.f;
  }
  
  public final String f()
  {
    return this.g;
  }
  
  public final List<as> g()
  {
    return i();
  }
  
  public final ao h()
  {
    return j();
  }
  
  List<as> i()
  {
    return GraphRequest.b(this);
  }
  
  ao j()
  {
    return GraphRequest.c(this);
  }
  
  public final int size()
  {
    return this.c.size();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
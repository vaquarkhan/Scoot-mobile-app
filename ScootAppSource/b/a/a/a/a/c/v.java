package b.a.a.a.a.c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class v
  implements l<y>, u, y
{
  private final List<y> a = new ArrayList();
  private final AtomicBoolean b = new AtomicBoolean(false);
  private final AtomicReference<Throwable> c = new AtomicReference(null);
  
  public static boolean a(Object paramObject)
  {
    try
    {
      l locall = (l)paramObject;
      y localy = (y)paramObject;
      paramObject = (u)paramObject;
      return (locall != null) && (localy != null) && (paramObject != null);
    }
    catch (ClassCastException paramObject) {}
    return false;
  }
  
  public void a(y paramy)
  {
    try
    {
      this.a.add(paramy);
      return;
    }
    finally
    {
      paramy = finally;
      throw paramy;
    }
  }
  
  public void a(Throwable paramThrowable)
  {
    this.c.set(paramThrowable);
  }
  
  public int b()
  {
    return o.b;
  }
  
  public void b(boolean paramBoolean)
  {
    try
    {
      this.b.set(paramBoolean);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public Collection<y> c()
  {
    try
    {
      Collection localCollection = Collections.unmodifiableCollection(this.a);
      return localCollection;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int compareTo(Object paramObject)
  {
    return o.a(this, paramObject);
  }
  
  public boolean d()
  {
    Iterator localIterator = c().iterator();
    while (localIterator.hasNext()) {
      if (!((y)localIterator.next()).f()) {
        return false;
      }
    }
    return true;
  }
  
  public boolean f()
  {
    return this.b.get();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\c\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
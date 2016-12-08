package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.m;
import b.a.a.a.a.b.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class d<T>
{
  protected final Context a;
  protected final c<T> b;
  protected final r c;
  protected final k d;
  protected volatile long e;
  protected final List<l> f = new CopyOnWriteArrayList();
  private final int g;
  
  public d(Context paramContext, c<T> paramc, r paramr, k paramk, int paramInt)
  {
    this.a = paramContext.getApplicationContext();
    this.b = paramc;
    this.d = paramk;
    this.c = paramr;
    this.e = this.c.a();
    this.g = paramInt;
  }
  
  private void a(int paramInt)
  {
    if (!this.d.a(paramInt, c()))
    {
      String str = String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[] { Integer.valueOf(this.d.a()), Integer.valueOf(paramInt), Integer.valueOf(c()) });
      m.a(this.a, 4, "Fabric", str);
      d();
    }
  }
  
  private void b(String paramString)
  {
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
    {
      l locall = (l)localIterator.next();
      try
      {
        locall.a(paramString);
      }
      catch (Exception localException)
      {
        m.a(this.a, "One of the roll over listeners threw an exception", localException);
      }
    }
  }
  
  public long a(String paramString)
  {
    paramString = paramString.split("_");
    if (paramString.length != 3) {
      return 0L;
    }
    try
    {
      long l = Long.valueOf(paramString[2]).longValue();
      return l;
    }
    catch (NumberFormatException paramString) {}
    return 0L;
  }
  
  protected abstract String a();
  
  public void a(l paraml)
  {
    if (paraml != null) {
      this.f.add(paraml);
    }
  }
  
  public void a(T paramT)
  {
    paramT = this.b.a(paramT);
    a(paramT.length);
    this.d.a(paramT);
  }
  
  public void a(List<File> paramList)
  {
    this.d.a(paramList);
  }
  
  protected int b()
  {
    return this.g;
  }
  
  protected int c()
  {
    return 8000;
  }
  
  public boolean d()
  {
    boolean bool = true;
    String str = null;
    if (!this.d.b())
    {
      str = a();
      this.d.a(str);
      m.a(this.a, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[] { str }));
      this.e = this.c.a();
    }
    for (;;)
    {
      b(str);
      return bool;
      bool = false;
    }
  }
  
  public List<File> e()
  {
    return this.d.a(1);
  }
  
  public void f()
  {
    this.d.a(this.d.c());
    this.d.d();
  }
  
  public void g()
  {
    Object localObject2 = this.d.c();
    int i = b();
    if (((List)localObject2).size() <= i) {
      return;
    }
    int j = ((List)localObject2).size() - i;
    m.a(this.a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[] { Integer.valueOf(((List)localObject2).size()), Integer.valueOf(i), Integer.valueOf(j) }));
    Object localObject1 = new TreeSet(new e(this));
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      File localFile = (File)((Iterator)localObject2).next();
      ((TreeSet)localObject1).add(new f(localFile, a(localFile.getName())));
    }
    localObject2 = new ArrayList();
    localObject1 = ((TreeSet)localObject1).iterator();
    do
    {
      if (!((Iterator)localObject1).hasNext()) {
        break;
      }
      ((ArrayList)localObject2).add(((f)((Iterator)localObject1).next()).a);
    } while (((ArrayList)localObject2).size() != j);
    this.d.a((List)localObject2);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
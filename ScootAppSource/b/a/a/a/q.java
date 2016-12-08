package b.a.a.a;

import android.content.Context;
import b.a.a.a.a.c.n;
import java.io.File;
import java.util.Collection;

public abstract class q<Result>
  implements Comparable<q>
{
  f e;
  p<Result> f = new p(this);
  Context g;
  l<Result> h;
  b.a.a.a.a.b.y i;
  final n j = (n)getClass().getAnnotation(n.class);
  
  final void C()
  {
    this.f.a(this.e.f(), new Void[] { (Void)null });
  }
  
  protected b.a.a.a.a.b.y D()
  {
    return this.i;
  }
  
  public Context E()
  {
    return this.g;
  }
  
  public f F()
  {
    return this.e;
  }
  
  public String G()
  {
    return ".Fabric" + File.separator + b();
  }
  
  boolean H()
  {
    return this.j != null;
  }
  
  protected Collection<b.a.a.a.a.c.y> I()
  {
    return this.f.c();
  }
  
  public int a(q paramq)
  {
    if (b(paramq)) {}
    do
    {
      return 1;
      if (paramq.b(this)) {
        return -1;
      }
    } while ((H()) && (!paramq.H()));
    if ((!H()) && (paramq.H())) {
      return -1;
    }
    return 0;
  }
  
  public abstract String a();
  
  void a(Context paramContext, f paramf, l<Result> paraml, b.a.a.a.a.b.y paramy)
  {
    this.e = paramf;
    this.g = new j(paramContext, b(), G());
    this.h = paraml;
    this.i = paramy;
  }
  
  protected void a(Result paramResult) {}
  
  public abstract String b();
  
  protected void b(Result paramResult) {}
  
  boolean b(q paramq)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    Class[] arrayOfClass;
    int m;
    int k;
    if (H())
    {
      arrayOfClass = this.j.a();
      m = arrayOfClass.length;
      k = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (k < m)
      {
        if (arrayOfClass[k].isAssignableFrom(paramq.getClass())) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      k += 1;
    }
  }
  
  protected abstract Result e();
  
  protected boolean h_()
  {
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
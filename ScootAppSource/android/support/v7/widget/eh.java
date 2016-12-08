package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

public abstract class eh
{
  private ej a = null;
  private ArrayList<ei> b = new ArrayList();
  private long c = 120L;
  private long d = 120L;
  private long e = 250L;
  private long f = 250L;
  
  static int d(fd paramfd)
  {
    int j = fd.f(paramfd) & 0xE;
    int i;
    if (paramfd.n()) {
      i = 4;
    }
    int k;
    int m;
    do
    {
      do
      {
        do
        {
          do
          {
            return i;
            i = j;
          } while ((j & 0x4) != 0);
          k = paramfd.f();
          m = paramfd.e();
          i = j;
        } while (k == -1);
        i = j;
      } while (m == -1);
      i = j;
    } while (k == m);
    return j | 0x800;
  }
  
  public ek a(fa paramfa, fd paramfd)
  {
    return i().a(paramfd);
  }
  
  public ek a(fa paramfa, fd paramfd, int paramInt, List<Object> paramList)
  {
    return i().a(paramfd);
  }
  
  public abstract void a();
  
  void a(ej paramej)
  {
    this.a = paramej;
  }
  
  public abstract boolean a(fd paramfd, ek paramek1, ek paramek2);
  
  public abstract boolean a(fd paramfd1, fd paramfd2, ek paramek1, ek paramek2);
  
  public boolean a(fd paramfd, List<Object> paramList)
  {
    return g(paramfd);
  }
  
  public abstract boolean b();
  
  public abstract boolean b(fd paramfd, ek paramek1, ek paramek2);
  
  public abstract void c();
  
  public abstract void c(fd paramfd);
  
  public abstract boolean c(fd paramfd, ek paramek1, ek paramek2);
  
  public long d()
  {
    return this.e;
  }
  
  public long e()
  {
    return this.c;
  }
  
  public final void e(fd paramfd)
  {
    f(paramfd);
    if (this.a != null) {
      this.a.a(paramfd);
    }
  }
  
  public long f()
  {
    return this.d;
  }
  
  public void f(fd paramfd) {}
  
  public long g()
  {
    return this.f;
  }
  
  public boolean g(fd paramfd)
  {
    return true;
  }
  
  public final void h()
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      ((ei)this.b.get(i)).a();
      i += 1;
    }
    this.b.clear();
  }
  
  public ek i()
  {
    return new ek();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\eh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
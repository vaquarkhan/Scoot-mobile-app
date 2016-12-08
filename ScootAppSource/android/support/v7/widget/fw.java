package android.support.v7.widget;

import android.view.View;

public abstract class fw
  extends eh
{
  boolean a = true;
  
  public final void a(fd paramfd, boolean paramBoolean)
  {
    d(paramfd, paramBoolean);
    e(paramfd);
  }
  
  public abstract boolean a(fd paramfd);
  
  public abstract boolean a(fd paramfd, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean a(fd paramfd, ek paramek1, ek paramek2)
  {
    int k = paramek1.a;
    int m = paramek1.b;
    paramek1 = paramfd.a;
    int i;
    if (paramek2 == null)
    {
      i = paramek1.getLeft();
      if (paramek2 != null) {
        break label103;
      }
    }
    label103:
    for (int j = paramek1.getTop();; j = paramek2.b)
    {
      if ((paramfd.q()) || ((k == i) && (m == j))) {
        break label112;
      }
      paramek1.layout(i, j, paramek1.getWidth() + i, paramek1.getHeight() + j);
      return a(paramfd, k, m, i, j);
      i = paramek2.a;
      break;
    }
    label112:
    return a(paramfd);
  }
  
  public abstract boolean a(fd paramfd1, fd paramfd2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean a(fd paramfd1, fd paramfd2, ek paramek1, ek paramek2)
  {
    int k = paramek1.a;
    int m = paramek1.b;
    int i;
    if (paramfd2.c()) {
      i = paramek1.a;
    }
    for (int j = paramek1.b;; j = paramek2.b)
    {
      return a(paramfd1, paramfd2, k, m, i, j);
      i = paramek2.a;
    }
  }
  
  public final void b(fd paramfd, boolean paramBoolean)
  {
    c(paramfd, paramBoolean);
  }
  
  public abstract boolean b(fd paramfd);
  
  public boolean b(fd paramfd, ek paramek1, ek paramek2)
  {
    if ((paramek1 != null) && ((paramek1.a != paramek2.a) || (paramek1.b != paramek2.b))) {
      return a(paramfd, paramek1.a, paramek1.b, paramek2.a, paramek2.b);
    }
    return b(paramfd);
  }
  
  public void c(fd paramfd, boolean paramBoolean) {}
  
  public boolean c(fd paramfd, ek paramek1, ek paramek2)
  {
    if ((paramek1.a != paramek2.a) || (paramek1.b != paramek2.b)) {
      return a(paramfd, paramek1.a, paramek1.b, paramek2.a, paramek2.b);
    }
    i(paramfd);
    return false;
  }
  
  public void d(fd paramfd, boolean paramBoolean) {}
  
  public boolean g(fd paramfd)
  {
    return (!this.a) || (paramfd.n());
  }
  
  public final void h(fd paramfd)
  {
    o(paramfd);
    e(paramfd);
  }
  
  public final void i(fd paramfd)
  {
    s(paramfd);
    e(paramfd);
  }
  
  public final void j(fd paramfd)
  {
    q(paramfd);
    e(paramfd);
  }
  
  public final void k(fd paramfd)
  {
    n(paramfd);
  }
  
  public final void l(fd paramfd)
  {
    r(paramfd);
  }
  
  public final void m(fd paramfd)
  {
    p(paramfd);
  }
  
  public void n(fd paramfd) {}
  
  public void o(fd paramfd) {}
  
  public void p(fd paramfd) {}
  
  public void q(fd paramfd) {}
  
  public void r(fd paramfd) {}
  
  public void s(fd paramfd) {}
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\fw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
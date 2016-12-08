package e.b.a.b;

import e.b.a.c.b;
import e.b.a.c.g;
import e.b.a.c.r;
import e.b.a.l;
import e.b.a.m;
import java.util.Locale;

final class o
  extends b
{
  private final d a;
  
  o(d paramd)
  {
    super(e.b.a.d.w());
    this.a = paramd;
  }
  
  public int a(long paramLong)
  {
    if (this.a.a(paramLong) <= 0) {
      return 0;
    }
    return 1;
  }
  
  public int a(Locale paramLocale)
  {
    return p.a(paramLocale).a();
  }
  
  public long a(long paramLong, String paramString, Locale paramLocale)
  {
    return b(paramLong, p.a(paramLocale).a(paramString));
  }
  
  public String a(int paramInt, Locale paramLocale)
  {
    return p.a(paramLocale).a(paramInt);
  }
  
  public long b(long paramLong, int paramInt)
  {
    g.a(this, paramInt, 0, 1);
    long l = paramLong;
    if (a(paramLong) != paramInt)
    {
      paramInt = this.a.a(paramLong);
      l = this.a.f(paramLong, -paramInt);
    }
    return l;
  }
  
  public long d(long paramLong)
  {
    if (a(paramLong) == 1) {
      return this.a.f(0L, 1);
    }
    return Long.MIN_VALUE;
  }
  
  public l d()
  {
    return r.a(m.l());
  }
  
  public long e(long paramLong)
  {
    if (a(paramLong) == 0) {
      return this.a.f(0L, 1);
    }
    return Long.MAX_VALUE;
  }
  
  public l e()
  {
    return null;
  }
  
  public long f(long paramLong)
  {
    return d(paramLong);
  }
  
  public int g()
  {
    return 0;
  }
  
  public long g(long paramLong)
  {
    return d(paramLong);
  }
  
  public int h()
  {
    return 1;
  }
  
  public long h(long paramLong)
  {
    return d(paramLong);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
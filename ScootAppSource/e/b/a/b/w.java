package e.b.a.b;

import e.b.a.c;
import e.b.a.c.b;
import e.b.a.i;
import e.b.a.l;
import e.b.a.o;
import e.b.a.p;
import java.util.Locale;

final class w
  extends b
{
  final c a;
  final i b;
  final l c;
  final boolean d;
  final l e;
  final l f;
  
  w(c paramc, i parami, l paraml1, l paraml2, l paraml3)
  {
    super(paramc.a());
    if (!paramc.c()) {
      throw new IllegalArgumentException();
    }
    this.a = paramc;
    this.b = parami;
    this.c = paraml1;
    this.d = v.a(paraml1);
    this.e = paraml2;
    this.f = paraml3;
  }
  
  private int j(long paramLong)
  {
    int i = this.b.b(paramLong);
    if (((i + paramLong ^ paramLong) < 0L) && ((i ^ paramLong) >= 0L)) {
      throw new ArithmeticException("Adding time zone offset caused overflow");
    }
    return i;
  }
  
  public int a(long paramLong)
  {
    paramLong = this.b.f(paramLong);
    return this.a.a(paramLong);
  }
  
  public int a(Locale paramLocale)
  {
    return this.a.a(paramLocale);
  }
  
  public long a(long paramLong, int paramInt)
  {
    if (this.d)
    {
      int i = j(paramLong);
      return this.a.a(i + paramLong, paramInt) - i;
    }
    long l = this.b.f(paramLong);
    l = this.a.a(l, paramInt);
    return this.b.a(l, false, paramLong);
  }
  
  public long a(long paramLong1, long paramLong2)
  {
    if (this.d)
    {
      int i = j(paramLong1);
      return this.a.a(i + paramLong1, paramLong2) - i;
    }
    long l = this.b.f(paramLong1);
    paramLong2 = this.a.a(l, paramLong2);
    return this.b.a(paramLong2, false, paramLong1);
  }
  
  public long a(long paramLong, String paramString, Locale paramLocale)
  {
    long l = this.b.f(paramLong);
    l = this.a.a(l, paramString, paramLocale);
    return this.b.a(l, false, paramLong);
  }
  
  public String a(int paramInt, Locale paramLocale)
  {
    return this.a.a(paramInt, paramLocale);
  }
  
  public String a(long paramLong, Locale paramLocale)
  {
    paramLong = this.b.f(paramLong);
    return this.a.a(paramLong, paramLocale);
  }
  
  public long b(long paramLong, int paramInt)
  {
    long l = this.b.f(paramLong);
    l = this.a.b(l, paramInt);
    paramLong = this.b.a(l, false, paramLong);
    if (a(paramLong) != paramInt)
    {
      p localp = new p(l, this.b.e());
      o localo = new o(this.a.a(), Integer.valueOf(paramInt), localp.getMessage());
      localo.initCause(localp);
      throw localo;
    }
    return paramLong;
  }
  
  public String b(int paramInt, Locale paramLocale)
  {
    return this.a.b(paramInt, paramLocale);
  }
  
  public String b(long paramLong, Locale paramLocale)
  {
    paramLong = this.b.f(paramLong);
    return this.a.b(paramLong, paramLocale);
  }
  
  public boolean b(long paramLong)
  {
    paramLong = this.b.f(paramLong);
    return this.a.b(paramLong);
  }
  
  public int c(long paramLong)
  {
    paramLong = this.b.f(paramLong);
    return this.a.c(paramLong);
  }
  
  public long d(long paramLong)
  {
    if (this.d)
    {
      int i = j(paramLong);
      return this.a.d(i + paramLong) - i;
    }
    long l = this.b.f(paramLong);
    l = this.a.d(l);
    return this.b.a(l, false, paramLong);
  }
  
  public final l d()
  {
    return this.c;
  }
  
  public long e(long paramLong)
  {
    if (this.d)
    {
      int i = j(paramLong);
      return this.a.e(i + paramLong) - i;
    }
    long l = this.b.f(paramLong);
    l = this.a.e(l);
    return this.b.a(l, false, paramLong);
  }
  
  public final l e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof w)) {
        break;
      }
      paramObject = (w)paramObject;
    } while ((this.a.equals(((w)paramObject).a)) && (this.b.equals(((w)paramObject).b)) && (this.c.equals(((w)paramObject).c)) && (this.e.equals(((w)paramObject).e)));
    return false;
    return false;
  }
  
  public final l f()
  {
    return this.f;
  }
  
  public int g()
  {
    return this.a.g();
  }
  
  public int h()
  {
    return this.a.h();
  }
  
  public int hashCode()
  {
    return this.a.hashCode() ^ this.b.hashCode();
  }
  
  public long i(long paramLong)
  {
    paramLong = this.b.f(paramLong);
    return this.a.i(paramLong);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
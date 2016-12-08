package e.b.a.b;

import e.b.a.c;
import e.b.a.c.j;
import e.b.a.c.s;
import e.b.a.i;

abstract class d
  extends a
{
  private static final e.b.a.l a = j.a;
  private static final e.b.a.l b = new e.b.a.c.n(e.b.a.m.b(), 1000L);
  private static final e.b.a.l c = new e.b.a.c.n(e.b.a.m.c(), 60000L);
  private static final e.b.a.l d = new e.b.a.c.n(e.b.a.m.d(), 3600000L);
  private static final e.b.a.l e = new e.b.a.c.n(e.b.a.m.e(), 43200000L);
  private static final e.b.a.l f = new e.b.a.c.n(e.b.a.m.f(), 86400000L);
  private static final e.b.a.l g = new e.b.a.c.n(e.b.a.m.g(), 604800000L);
  private static final c h = new e.b.a.c.l(e.b.a.d.a(), a, b);
  private static final c i = new e.b.a.c.l(e.b.a.d.b(), a, f);
  private static final c j = new e.b.a.c.l(e.b.a.d.c(), b, c);
  private static final c k = new e.b.a.c.l(e.b.a.d.d(), b, f);
  private static final c l = new e.b.a.c.l(e.b.a.d.e(), c, d);
  private static final c m = new e.b.a.c.l(e.b.a.d.f(), c, f);
  private static final c n = new e.b.a.c.l(e.b.a.d.g(), d, f);
  private static final c o = new e.b.a.c.l(e.b.a.d.i(), d, e);
  private static final c p = new s(n, e.b.a.d.h());
  private static final c q = new s(o, e.b.a.d.j());
  private static final c r = new e();
  private final transient f[] s = new f['Ѐ'];
  private final int t;
  
  d(e.b.a.a parama, Object paramObject, int paramInt)
  {
    super(parama, paramObject);
    if ((paramInt < 1) || (paramInt > 7)) {
      throw new IllegalArgumentException("Invalid min days in first week: " + paramInt);
    }
    this.t = paramInt;
  }
  
  private f g(int paramInt)
  {
    f localf2 = this.s[(paramInt & 0x3FF)];
    f localf1;
    if (localf2 != null)
    {
      localf1 = localf2;
      if (localf2.a == paramInt) {}
    }
    else
    {
      localf1 = new f(paramInt, f(paramInt));
      this.s[(paramInt & 0x3FF)] = localf1;
    }
    return localf1;
  }
  
  public int N()
  {
    return this.t;
  }
  
  int O()
  {
    return 366;
  }
  
  int P()
  {
    return 31;
  }
  
  abstract int Q();
  
  abstract int R();
  
  int S()
  {
    return 12;
  }
  
  abstract long T();
  
  abstract long U();
  
  abstract long V();
  
  abstract long W();
  
  int a(int paramInt)
  {
    if (e(paramInt)) {
      return 366;
    }
    return 365;
  }
  
  int a(long paramLong)
  {
    long l2 = 31536000000L;
    long l4 = U();
    long l3 = (paramLong >> 1) + W();
    long l1 = l3;
    if (l3 < 0L) {
      l1 = l3 - l4 + 1L;
    }
    int i2 = (int)(l1 / l4);
    l3 = d(i2);
    l1 = paramLong - l3;
    int i1;
    if (l1 < 0L) {
      i1 = i2 - 1;
    }
    do
    {
      do
      {
        return i1;
        i1 = i2;
      } while (l1 < 31536000000L);
      l1 = l2;
      if (e(i2)) {
        l1 = 31622400000L;
      }
      i1 = i2;
    } while (l1 + l3 > paramLong);
    return i2 + 1;
  }
  
  abstract int a(long paramLong, int paramInt);
  
  int a(long paramLong, int paramInt1, int paramInt2)
  {
    return (int)((paramLong - (d(paramInt1) + c(paramInt1, paramInt2))) / 86400000L) + 1;
  }
  
  long a(int paramInt1, int paramInt2)
  {
    return d(paramInt1) + c(paramInt1, paramInt2);
  }
  
  long a(int paramInt1, int paramInt2, int paramInt3)
  {
    return d(paramInt1) + c(paramInt1, paramInt2) + (paramInt3 - 1) * 86400000L;
  }
  
  public i a()
  {
    e.b.a.a locala = L();
    if (locala != null) {
      return locala.a();
    }
    return i.a;
  }
  
  protected void a(b paramb)
  {
    paramb.a = a;
    paramb.b = b;
    paramb.c = c;
    paramb.d = d;
    paramb.e = e;
    paramb.f = f;
    paramb.g = g;
    paramb.m = h;
    paramb.n = i;
    paramb.o = j;
    paramb.p = k;
    paramb.q = l;
    paramb.r = m;
    paramb.s = n;
    paramb.u = o;
    paramb.t = p;
    paramb.v = q;
    paramb.w = r;
    paramb.E = new m(this);
    paramb.F = new r(paramb.E, this);
    paramb.H = new e.b.a.c.f(new e.b.a.c.k(paramb.F, 99), e.b.a.d.v(), 100);
    paramb.k = paramb.H.d();
    paramb.G = new e.b.a.c.k(new e.b.a.c.o((e.b.a.c.f)paramb.H), e.b.a.d.u(), 1);
    paramb.I = new o(this);
    paramb.x = new n(this, paramb.f);
    paramb.y = new g(this, paramb.f);
    paramb.z = new h(this, paramb.f);
    paramb.D = new q(this);
    paramb.B = new l(this);
    paramb.A = new k(this, paramb.g);
    paramb.C = new e.b.a.c.k(new e.b.a.c.o(paramb.B, paramb.k, e.b.a.d.q(), 100), e.b.a.d.q(), 1);
    paramb.j = paramb.E.d();
    paramb.i = paramb.D.d();
    paramb.h = paramb.B.d();
  }
  
  int b(int paramInt)
  {
    long l1 = c(paramInt);
    return (int)((c(paramInt + 1) - l1) / 604800000L);
  }
  
  abstract int b(int paramInt1, int paramInt2);
  
  int b(long paramLong)
  {
    return a(paramLong, a(paramLong));
  }
  
  int b(long paramLong, int paramInt)
  {
    return a(paramLong, paramInt, a(paramLong, paramInt));
  }
  
  int c(long paramLong)
  {
    int i1 = a(paramLong);
    return a(paramLong, i1, a(paramLong, i1));
  }
  
  int c(long paramLong, int paramInt)
  {
    return (int)((paramLong - d(paramInt)) / 86400000L) + 1;
  }
  
  long c(int paramInt)
  {
    long l1 = d(paramInt);
    paramInt = g(l1);
    if (paramInt > 8 - this.t) {
      return l1 + (8 - paramInt) * 86400000L;
    }
    return l1 - (paramInt - 1) * 86400000L;
  }
  
  abstract long c(int paramInt1, int paramInt2);
  
  int d(long paramLong)
  {
    return c(paramLong, a(paramLong));
  }
  
  int d(long paramLong, int paramInt)
  {
    long l1 = c(paramInt);
    if (paramLong < l1) {
      return b(paramInt - 1);
    }
    if (paramLong >= c(paramInt + 1)) {
      return 1;
    }
    return (int)((paramLong - l1) / 604800000L) + 1;
  }
  
  long d(int paramInt)
  {
    return g(paramInt).b;
  }
  
  int e(long paramLong)
  {
    int i1 = a(paramLong);
    int i2 = d(paramLong, i1);
    if (i2 == 1) {
      i1 = a(604800000L + paramLong);
    }
    while (i2 <= 51) {
      return i1;
    }
    return a(paramLong - 1209600000L);
  }
  
  int e(long paramLong, int paramInt)
  {
    return i(paramLong);
  }
  
  abstract boolean e(int paramInt);
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        break;
      }
      paramObject = (d)paramObject;
    } while ((N() == ((d)paramObject).N()) && (a().equals(((d)paramObject).a())));
    return false;
    return false;
  }
  
  int f(long paramLong)
  {
    return d(paramLong, a(paramLong));
  }
  
  abstract long f(int paramInt);
  
  abstract long f(long paramLong, int paramInt);
  
  int g(long paramLong)
  {
    if (paramLong >= 0L) {
      paramLong /= 86400000L;
    }
    long l1;
    do
    {
      return (int)((paramLong + 3L) % 7L) + 1;
      l1 = (paramLong - 86399999L) / 86400000L;
      paramLong = l1;
    } while (l1 >= -3L);
    return (int)((l1 + 4L) % 7L) + 7;
  }
  
  int h(long paramLong)
  {
    if (paramLong >= 0L) {
      return (int)(paramLong % 86400000L);
    }
    return 86399999 + (int)((1L + paramLong) % 86400000L);
  }
  
  public int hashCode()
  {
    return getClass().getName().hashCode() * 11 + a().hashCode() + N();
  }
  
  int i(long paramLong)
  {
    int i1 = a(paramLong);
    return b(i1, a(paramLong, i1));
  }
  
  boolean j(long paramLong)
  {
    return false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(60);
    String str = getClass().getName();
    int i1 = str.lastIndexOf('.');
    Object localObject = str;
    if (i1 >= 0) {
      localObject = str.substring(i1 + 1);
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append('[');
    localObject = a();
    if (localObject != null) {
      localStringBuilder.append(((i)localObject).e());
    }
    if (N() != 4)
    {
      localStringBuilder.append(",mdfw=");
      localStringBuilder.append(N());
    }
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
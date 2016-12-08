package e.b.a.b;

import e.b.a.c;
import e.b.a.c.f;
import e.b.a.c.o;
import e.b.a.d;
import e.b.a.i;
import java.util.concurrent.ConcurrentHashMap;

public final class t
  extends a
{
  private static final t a;
  private static final ConcurrentHashMap<i, t> b = new ConcurrentHashMap();
  
  static
  {
    a = new t(s.Z());
    b.put(i.a, a);
  }
  
  private t(e.b.a.a parama)
  {
    super(parama, null);
  }
  
  public static t N()
  {
    return a;
  }
  
  public static t O()
  {
    return b(i.a());
  }
  
  public static t b(i parami)
  {
    i locali = parami;
    if (parami == null) {
      locali = i.a();
    }
    t localt = (t)b.get(locali);
    parami = localt;
    if (localt == null)
    {
      localt = new t(v.a(a, locali));
      parami = (t)b.putIfAbsent(locali, localt);
      if (parami == null) {}
    }
    else
    {
      return parami;
    }
    return localt;
  }
  
  public e.b.a.a a(i parami)
  {
    i locali = parami;
    if (parami == null) {
      locali = i.a();
    }
    if (locali == a()) {
      return this;
    }
    return b(locali);
  }
  
  protected void a(b paramb)
  {
    if (L().a() == i.a)
    {
      paramb.H = new f(u.a, d.v(), 100);
      paramb.k = paramb.H.d();
      paramb.G = new o((f)paramb.H, d.u());
      paramb.C = new o((f)paramb.H, paramb.h, d.q());
    }
  }
  
  public e.b.a.a b()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof t))
    {
      paramObject = (t)paramObject;
      return a().equals(((t)paramObject).a());
    }
    return false;
  }
  
  public int hashCode()
  {
    return "ISO".hashCode() * 11 + a().hashCode();
  }
  
  public String toString()
  {
    String str = "ISOChronology";
    i locali = a();
    if (locali != null) {
      str = "ISOChronology" + '[' + locali.e() + ']';
    }
    return str;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
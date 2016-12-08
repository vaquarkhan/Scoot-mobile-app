package e.b.a.b;

import e.b.a.c;
import e.b.a.i;
import e.b.a.l;
import java.util.HashMap;

public final class v
  extends a
{
  private v(e.b.a.a parama, i parami)
  {
    super(parama, parami);
  }
  
  public static v a(e.b.a.a parama, i parami)
  {
    if (parama == null) {
      throw new IllegalArgumentException("Must supply a chronology");
    }
    parama = parama.b();
    if (parama == null) {
      throw new IllegalArgumentException("UTC chronology must not be null");
    }
    if (parami == null) {
      throw new IllegalArgumentException("DateTimeZone must not be null");
    }
    return new v(parama, parami);
  }
  
  private c a(c paramc, HashMap<Object, Object> paramHashMap)
  {
    if ((paramc == null) || (!paramc.c())) {
      return paramc;
    }
    if (paramHashMap.containsKey(paramc)) {
      return (c)paramHashMap.get(paramc);
    }
    w localw = new w(paramc, a(), a(paramc.d(), paramHashMap), a(paramc.e(), paramHashMap), a(paramc.f(), paramHashMap));
    paramHashMap.put(paramc, localw);
    return localw;
  }
  
  private l a(l paraml, HashMap<Object, Object> paramHashMap)
  {
    if ((paraml == null) || (!paraml.b())) {
      return paraml;
    }
    if (paramHashMap.containsKey(paraml)) {
      return (l)paramHashMap.get(paraml);
    }
    x localx = new x(paraml, a());
    paramHashMap.put(paraml, localx);
    return localx;
  }
  
  static boolean a(l paraml)
  {
    return (paraml != null) && (paraml.d() < 43200000L);
  }
  
  public e.b.a.a a(i parami)
  {
    i locali = parami;
    if (parami == null) {
      locali = i.a();
    }
    if (locali == M()) {
      return this;
    }
    if (locali == i.a) {
      return L();
    }
    return new v(L(), locali);
  }
  
  public i a()
  {
    return (i)M();
  }
  
  protected void a(b paramb)
  {
    HashMap localHashMap = new HashMap();
    paramb.l = a(paramb.l, localHashMap);
    paramb.k = a(paramb.k, localHashMap);
    paramb.j = a(paramb.j, localHashMap);
    paramb.i = a(paramb.i, localHashMap);
    paramb.h = a(paramb.h, localHashMap);
    paramb.g = a(paramb.g, localHashMap);
    paramb.f = a(paramb.f, localHashMap);
    paramb.e = a(paramb.e, localHashMap);
    paramb.d = a(paramb.d, localHashMap);
    paramb.c = a(paramb.c, localHashMap);
    paramb.b = a(paramb.b, localHashMap);
    paramb.a = a(paramb.a, localHashMap);
    paramb.E = a(paramb.E, localHashMap);
    paramb.F = a(paramb.F, localHashMap);
    paramb.G = a(paramb.G, localHashMap);
    paramb.H = a(paramb.H, localHashMap);
    paramb.I = a(paramb.I, localHashMap);
    paramb.x = a(paramb.x, localHashMap);
    paramb.y = a(paramb.y, localHashMap);
    paramb.z = a(paramb.z, localHashMap);
    paramb.D = a(paramb.D, localHashMap);
    paramb.A = a(paramb.A, localHashMap);
    paramb.B = a(paramb.B, localHashMap);
    paramb.C = a(paramb.C, localHashMap);
    paramb.m = a(paramb.m, localHashMap);
    paramb.n = a(paramb.n, localHashMap);
    paramb.o = a(paramb.o, localHashMap);
    paramb.p = a(paramb.p, localHashMap);
    paramb.q = a(paramb.q, localHashMap);
    paramb.r = a(paramb.r, localHashMap);
    paramb.s = a(paramb.s, localHashMap);
    paramb.u = a(paramb.u, localHashMap);
    paramb.t = a(paramb.t, localHashMap);
    paramb.v = a(paramb.v, localHashMap);
    paramb.w = a(paramb.w, localHashMap);
  }
  
  public e.b.a.a b()
  {
    return L();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof v)) {
        return false;
      }
      paramObject = (v)paramObject;
    } while ((L().equals(((v)paramObject).L())) && (a().equals(((v)paramObject).a())));
    return false;
  }
  
  public int hashCode()
  {
    return 326565 + a().hashCode() * 11 + L().hashCode() * 7;
  }
  
  public String toString()
  {
    return "ZonedChronology[" + L() + ", " + a().e() + ']';
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package e.b.a.b;

import e.b.a.a;
import java.util.concurrent.ConcurrentHashMap;

public final class s
  extends i
{
  private static final s a = b(e.b.a.i.a);
  private static final ConcurrentHashMap<e.b.a.i, s[]> b = new ConcurrentHashMap();
  
  private s(a parama, Object paramObject, int paramInt)
  {
    super(parama, paramObject, paramInt);
  }
  
  public static s Z()
  {
    return a;
  }
  
  public static s a(e.b.a.i parami, int paramInt)
  {
    e.b.a.i locali = parami;
    if (parami == null) {
      locali = e.b.a.i.a();
    }
    parami = (s[])b.get(locali);
    Object localObject1;
    if (parami == null)
    {
      parami = new s[7];
      localObject1 = (s[])b.putIfAbsent(locali, parami);
      if (localObject1 != null) {
        parami = (e.b.a.i)localObject1;
      }
      Object localObject3 = parami[(paramInt - 1)];
      localObject1 = localObject3;
      if (localObject3 == null)
      {
        localObject3 = parami[(paramInt - 1)];
        localObject1 = localObject3;
        if (localObject3 != null) {}
      }
    }
    for (;;)
    {
      try
      {
        if (locali == e.b.a.i.a)
        {
          localObject1 = new s(null, null, paramInt);
          break label138;
          return (s)localObject1;
        }
        else
        {
          localObject1 = new s(v.a(a(e.b.a.i.a, paramInt), locali), null, paramInt);
        }
      }
      finally {}
      break;
      label138:
      parami[(paramInt - 1)] = localObject2;
    }
  }
  
  public static s b(e.b.a.i parami)
  {
    return a(parami, 4);
  }
  
  int Q()
  {
    return -292275054;
  }
  
  int R()
  {
    return 292278993;
  }
  
  long T()
  {
    return 31556952000L;
  }
  
  long U()
  {
    return 15778476000L;
  }
  
  long V()
  {
    return 2629746000L;
  }
  
  long W()
  {
    return 31083597720000L;
  }
  
  public a a(e.b.a.i parami)
  {
    e.b.a.i locali = parami;
    if (parami == null) {
      locali = e.b.a.i.a();
    }
    if (locali == a()) {
      return this;
    }
    return b(locali);
  }
  
  protected void a(b paramb)
  {
    if (L() == null) {
      super.a(paramb);
    }
  }
  
  public a b()
  {
    return a;
  }
  
  boolean e(int paramInt)
  {
    return ((paramInt & 0x3) == 0) && ((paramInt % 100 != 0) || (paramInt % 400 == 0));
  }
  
  long f(int paramInt)
  {
    int i = paramInt / 100;
    if (paramInt < 0) {
      i = (i + 3 >> 2) + ((paramInt + 3 >> 2) - i) - 1;
    }
    for (;;)
    {
      long l = paramInt;
      return (i - 719527 + l * 365L) * 86400000L;
      int j = (i >> 2) + ((paramInt >> 2) - i);
      i = j;
      if (e(paramInt)) {
        i = j - 1;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\b\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
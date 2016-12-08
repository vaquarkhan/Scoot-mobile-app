package e.b.a.d;

import e.b.a.a;
import e.b.a.c;
import e.b.a.d;
import e.b.a.f;
import e.b.a.i;
import e.b.a.l;
import e.b.a.m;
import e.b.a.o;
import e.b.a.p;
import java.util.Arrays;
import java.util.Locale;

public final class s
{
  private final a a;
  private final long b;
  private final Locale c;
  private final int d;
  private final i e;
  private final Integer f;
  private i g;
  private Integer h;
  private Integer i;
  private t[] j;
  private int k;
  private boolean l;
  private Object m;
  
  public s(long paramLong, a parama, Locale paramLocale, Integer paramInteger, int paramInt)
  {
    parama = f.a(parama);
    this.b = paramLong;
    this.e = parama.a();
    this.a = parama.b();
    parama = paramLocale;
    if (paramLocale == null) {
      parama = Locale.getDefault();
    }
    this.c = parama;
    this.d = paramInt;
    this.f = paramInteger;
    this.g = this.e;
    this.i = this.f;
    this.j = new t[8];
  }
  
  static int a(l paraml1, l paraml2)
  {
    if ((paraml1 == null) || (!paraml1.b()))
    {
      if ((paraml2 == null) || (!paraml2.b())) {
        return 0;
      }
      return -1;
    }
    if ((paraml2 == null) || (!paraml2.b())) {
      return 1;
    }
    return -paraml1.compareTo(paraml2);
  }
  
  private static void a(t[] paramArrayOft, int paramInt)
  {
    int n = 0;
    if (paramInt > 10)
    {
      Arrays.sort(paramArrayOft, 0, paramInt);
      return;
    }
    for (;;)
    {
      n += 1;
      if (n >= paramInt) {
        break;
      }
      int i1 = n;
      while ((i1 > 0) && (paramArrayOft[(i1 - 1)].a(paramArrayOft[i1]) > 0))
      {
        t localt = paramArrayOft[i1];
        paramArrayOft[i1] = paramArrayOft[(i1 - 1)];
        paramArrayOft[(i1 - 1)] = localt;
        i1 -= 1;
      }
    }
  }
  
  private t e()
  {
    Object localObject1 = this.j;
    int i1 = this.k;
    int n;
    Object localObject2;
    if ((i1 == localObject1.length) || (this.l)) {
      if (i1 == localObject1.length)
      {
        n = i1 * 2;
        localObject2 = new t[n];
        System.arraycopy(localObject1, 0, localObject2, 0, i1);
        this.j = ((t[])localObject2);
        this.l = false;
        localObject1 = localObject2;
      }
    }
    for (;;)
    {
      this.m = null;
      localObject2 = localObject1[i1];
      if (localObject2 == null)
      {
        localObject2 = new t();
        localObject1[i1] = localObject2;
      }
      for (localObject1 = localObject2;; localObject1 = localObject2)
      {
        this.k = (i1 + 1);
        return (t)localObject1;
        n = localObject1.length;
        break;
      }
    }
  }
  
  long a(ab paramab, CharSequence paramCharSequence)
  {
    int i1 = paramab.a(this, paramCharSequence, 0);
    int n;
    if (i1 >= 0)
    {
      n = i1;
      if (i1 >= paramCharSequence.length()) {
        return a(true, paramCharSequence);
      }
    }
    else
    {
      n = i1 ^ 0xFFFFFFFF;
    }
    throw new IllegalArgumentException(y.a(paramCharSequence.toString(), n));
  }
  
  public long a(boolean paramBoolean, CharSequence paramCharSequence)
  {
    t[] arrayOft = this.j;
    int i1 = this.k;
    if (this.l)
    {
      arrayOft = (t[])this.j.clone();
      this.j = arrayOft;
      this.l = false;
    }
    a(arrayOft, i1);
    Object localObject3;
    if (i1 > 0)
    {
      localObject3 = m.i().a(this.a);
      l locall1 = m.f().a(this.a);
      l locall2 = arrayOft[0].a.d();
      if ((a(locall2, (l)localObject3) >= 0) && (a(locall2, locall1) <= 0))
      {
        a(d.s(), this.d);
        l1 = a(paramBoolean, paramCharSequence);
        return l1;
      }
    }
    long l1 = this.b;
    int n = 0;
    if (n < i1) {}
    for (;;)
    {
      try
      {
        l1 = arrayOft[n].a(l1, paramBoolean);
        n += 1;
      }
      catch (o localo)
      {
        if (paramCharSequence == null) {
          continue;
        }
        localo.a("Cannot parse \"" + paramCharSequence + '"');
        throw localo;
      }
      l1 = ((t)localObject3).a(l1, paramBoolean);
      n += 1;
      break label380;
      paramBoolean = false;
      continue;
      Object localObject2;
      label380:
      do
      {
        do
        {
          Object localObject1;
          if (this.h != null) {
            return localObject1 - this.h.intValue();
          }
          l1 = localObject1;
          if (this.g == null) {
            break;
          }
          n = this.g.e(localObject1);
          localObject1 -= n;
          l1 = l2;
          if (n == this.g.b(l2)) {
            break;
          }
          localObject3 = "Illegal instant due to time zone offset transition (" + this.g + ')';
          localObject2 = localObject3;
          if (paramCharSequence != null) {
            localObject2 = "Cannot parse \"" + paramCharSequence + "\": " + (String)localObject3;
          }
          throw new p((String)localObject2);
          l2 = l1;
        } while (!paramBoolean);
        n = 0;
        long l2 = l1;
      } while (n >= i1);
      localObject3 = localObject2[n];
      if (n == i1 - 1) {
        paramBoolean = true;
      }
    }
  }
  
  public a a()
  {
    return this.a;
  }
  
  public void a(c paramc, int paramInt)
  {
    e().a(paramc, paramInt);
  }
  
  public void a(d paramd, int paramInt)
  {
    e().a(paramd.a(this.a), paramInt);
  }
  
  public void a(d paramd, String paramString, Locale paramLocale)
  {
    e().a(paramd.a(this.a), paramString, paramLocale);
  }
  
  public void a(i parami)
  {
    this.m = null;
    this.g = parami;
  }
  
  public void a(Integer paramInteger)
  {
    this.m = null;
    this.h = paramInteger;
  }
  
  public boolean a(Object paramObject)
  {
    if (((paramObject instanceof u)) && (((u)paramObject).a(this)))
    {
      this.m = paramObject;
      return true;
    }
    return false;
  }
  
  public Locale b()
  {
    return this.c;
  }
  
  public Integer c()
  {
    return this.i;
  }
  
  public Object d()
  {
    if (this.m == null) {
      this.m = new u(this);
    }
    return this.m;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
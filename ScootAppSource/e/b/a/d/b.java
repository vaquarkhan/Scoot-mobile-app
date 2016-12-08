package e.b.a.d;

import e.b.a.a;
import e.b.a.f;
import e.b.a.i;
import e.b.a.x;
import java.io.IOException;
import java.util.Locale;

public final class b
{
  private final ad a;
  private final ab b;
  private final Locale c;
  private final boolean d;
  private final a e;
  private final i f;
  private final Integer g;
  private final int h;
  
  b(ad paramad, ab paramab)
  {
    this.a = paramad;
    this.b = paramab;
    this.c = null;
    this.d = false;
    this.e = null;
    this.f = null;
    this.g = null;
    this.h = 2000;
  }
  
  private b(ad paramad, ab paramab, Locale paramLocale, boolean paramBoolean, a parama, i parami, Integer paramInteger, int paramInt)
  {
    this.a = paramad;
    this.b = paramab;
    this.c = paramLocale;
    this.d = paramBoolean;
    this.e = parama;
    this.f = parami;
    this.g = paramInteger;
    this.h = paramInt;
  }
  
  private void a(Appendable paramAppendable, long paramLong, a parama)
  {
    ad localad = e();
    a locala = b(parama);
    i locali = locala.a();
    int j = locali.b(paramLong);
    long l2 = j + paramLong;
    long l1 = l2;
    int i = j;
    parama = locali;
    if ((paramLong ^ l2) < 0L)
    {
      l1 = l2;
      i = j;
      parama = locali;
      if ((j ^ paramLong) >= 0L)
      {
        parama = i.a;
        i = 0;
        l1 = paramLong;
      }
    }
    localad.a(paramAppendable, l1, locala.b(), i, parama, this.c);
  }
  
  private a b(a parama)
  {
    parama = f.a(parama);
    if (this.e != null) {
      parama = this.e;
    }
    a locala = parama;
    if (this.f != null) {
      locala = parama.a(this.f);
    }
    return locala;
  }
  
  private ad e()
  {
    ad localad = this.a;
    if (localad == null) {
      throw new UnsupportedOperationException("Printing not supported");
    }
    return localad;
  }
  
  private ab f()
  {
    ab localab = this.b;
    if (localab == null) {
      throw new UnsupportedOperationException("Parsing not supported");
    }
    return localab;
  }
  
  public long a(String paramString)
  {
    ab localab = f();
    return new s(0L, b(this.e), this.c, this.g, this.h).a(localab, paramString);
  }
  
  ad a()
  {
    return this.a;
  }
  
  public b a(a parama)
  {
    if (this.e == parama) {
      return this;
    }
    return new b(this.a, this.b, this.c, this.d, parama, this.f, this.g, this.h);
  }
  
  public b a(i parami)
  {
    if (this.f == parami) {
      return this;
    }
    return new b(this.a, this.b, this.c, false, this.e, parami, this.g, this.h);
  }
  
  public String a(x paramx)
  {
    StringBuilder localStringBuilder = new StringBuilder(e().a());
    try
    {
      a(localStringBuilder, paramx);
      return localStringBuilder.toString();
    }
    catch (IOException paramx)
    {
      for (;;) {}
    }
  }
  
  public void a(Appendable paramAppendable, x paramx)
  {
    a(paramAppendable, f.a(paramx), f.b(paramx));
  }
  
  public r b()
  {
    return ac.a(this.b);
  }
  
  ab c()
  {
    return this.b;
  }
  
  public b d()
  {
    return a(i.a);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
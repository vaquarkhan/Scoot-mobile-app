package e.b.a.d;

import e.b.a.a;
import e.b.a.c.j;
import e.b.a.d;
import e.b.a.i;
import java.util.Locale;

final class g
  implements ab, ad
{
  protected int a;
  protected int b;
  private final d c;
  
  protected g(d paramd, int paramInt1, int paramInt2)
  {
    this.c = paramd;
    int i = paramInt2;
    if (paramInt2 > 18) {
      i = 18;
    }
    this.a = paramInt1;
    this.b = i;
  }
  
  private long[] a(long paramLong, e.b.a.c paramc)
  {
    long l2 = paramc.d().d();
    int i = this.b;
    for (;;)
    {
      long l1;
      switch (i)
      {
      default: 
        l1 = 1L;
      }
      while (l2 * l1 / l1 == l2)
      {
        return new long[] { l1 * paramLong / l2, i };
        l1 = 10L;
        continue;
        l1 = 100L;
        continue;
        l1 = 1000L;
        continue;
        l1 = 10000L;
        continue;
        l1 = 100000L;
        continue;
        l1 = 1000000L;
        continue;
        l1 = 10000000L;
        continue;
        l1 = 100000000L;
        continue;
        l1 = 1000000000L;
        continue;
        l1 = 10000000000L;
        continue;
        l1 = 100000000000L;
        continue;
        l1 = 1000000000000L;
        continue;
        l1 = 10000000000000L;
        continue;
        l1 = 100000000000000L;
        continue;
        l1 = 1000000000000000L;
        continue;
        l1 = 10000000000000000L;
        continue;
        l1 = 100000000000000000L;
        continue;
        l1 = 1000000000000000000L;
      }
      i -= 1;
    }
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    e.b.a.c localc = this.c.a(params.a());
    int j = Math.min(this.b, paramCharSequence.length() - paramInt);
    long l1 = 0L;
    long l2 = localc.d().d() * 10L;
    int i = 0;
    for (;;)
    {
      int k;
      if (i < j)
      {
        k = paramCharSequence.charAt(paramInt + i);
        if ((k >= 48) && (k <= 57)) {}
      }
      else
      {
        l1 /= 10L;
        if (i != 0) {
          break;
        }
        return paramInt ^ 0xFFFFFFFF;
      }
      i += 1;
      l2 /= 10L;
      l1 += (k - 48) * l2;
    }
    if (l1 > 2147483647L) {
      return paramInt ^ 0xFFFFFFFF;
    }
    params.a(new e.b.a.c.l(d.a(), j.a, localc.d()), (int)l1);
    return i + paramInt;
  }
  
  protected void a(Appendable paramAppendable, long paramLong, a parama)
  {
    parama = this.c.a(parama);
    int j = this.a;
    try
    {
      paramLong = parama.i(paramLong);
      if (paramLong == 0L)
      {
        for (;;)
        {
          j -= 1;
          if (j < 0) {
            break;
          }
          paramAppendable.append('0');
        }
        return;
      }
    }
    catch (RuntimeException parama)
    {
      c.a(paramAppendable, j);
    }
    parama = a(paramLong, parama);
    paramLong = parama[0];
    int i = (int)parama[1];
    if ((0x7FFFFFFF & paramLong) == paramLong) {}
    int k;
    for (parama = Integer.toString((int)paramLong);; parama = Long.toString(paramLong))
    {
      k = parama.length();
      while (k < i)
      {
        paramAppendable.append('0');
        j -= 1;
        i -= 1;
      }
    }
    if (j < i) {
      for (;;)
      {
        if ((j >= i) || (k <= 1) || (parama.charAt(k - 1) != '0'))
        {
          if (k >= parama.length()) {
            break label239;
          }
          i = 0;
          while (i < k)
          {
            paramAppendable.append(parama.charAt(i));
            i += 1;
          }
          break;
        }
        i -= 1;
        k -= 1;
      }
    }
    label239:
    paramAppendable.append(parama);
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    a(paramAppendable, paramLong, parama);
  }
  
  public int b()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
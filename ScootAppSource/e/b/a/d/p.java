package e.b.a.d;

import e.b.a.a;
import e.b.a.c;
import e.b.a.d;
import e.b.a.i;
import java.util.Locale;

final class p
  implements ab, ad
{
  private final d a;
  private final int b;
  private final boolean c;
  
  p(d paramd, int paramInt, boolean paramBoolean)
  {
    this.a = paramd;
    this.b = paramInt;
    this.c = paramBoolean;
  }
  
  private int a(long paramLong, a parama)
  {
    try
    {
      int j = this.a.a(parama).a(paramLong);
      int i = j;
      if (j < 0) {
        i = -j;
      }
      return i % 100;
    }
    catch (RuntimeException parama) {}
    return -1;
  }
  
  public int a()
  {
    return 2;
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    int n = 0;
    int m = paramCharSequence.length() - paramInt;
    int j;
    int i;
    if (!this.c)
    {
      k = paramInt;
      if (Math.min(2, m) < 2) {
        return paramInt ^ 0xFFFFFFFF;
      }
    }
    else
    {
      j = 0;
      i = 0;
      k = 0;
      for (;;)
      {
        if (j < m)
        {
          int i1 = paramCharSequence.charAt(paramInt + j);
          if ((j == 0) && ((i1 == 45) || (i1 == 43)))
          {
            if (i1 == 45) {}
            for (i = 1;; i = 0)
            {
              if (i == 0) {
                break label117;
              }
              j += 1;
              k = 1;
              break;
            }
            label117:
            paramInt += 1;
            k = 1;
            m -= 1;
            continue;
          }
          if ((i1 >= 48) && (i1 <= 57)) {}
        }
        else
        {
          if (j != 0) {
            break;
          }
          return paramInt ^ 0xFFFFFFFF;
        }
        j += 1;
      }
      if (k == 0)
      {
        k = paramInt;
        if (j == 2) {}
      }
      else
      {
        if (j >= 9)
        {
          k = paramInt + j;
          j = Integer.parseInt(paramCharSequence.subSequence(paramInt, k).toString());
          params.a(this.a, j);
          return k;
        }
        if (i == 0) {
          break label489;
        }
      }
    }
    label489:
    for (int k = paramInt + 1;; k = paramInt)
    {
      try
      {
        n = paramCharSequence.charAt(k);
        m = paramInt + j;
        paramInt = n - 48;
        j = k + 1;
        while (j < m)
        {
          paramInt = paramCharSequence.charAt(j) + ((paramInt << 3) + (paramInt << 1)) - 48;
          j += 1;
        }
        j = paramInt;
      }
      catch (StringIndexOutOfBoundsException params)
      {
        return paramInt ^ 0xFFFFFFFF;
      }
      k = m;
      if (i == 0) {
        break;
      }
      j = -paramInt;
      k = m;
      break;
      paramInt = paramCharSequence.charAt(k);
      if ((paramInt < 48) || (paramInt > 57)) {
        return k ^ 0xFFFFFFFF;
      }
      paramInt -= 48;
      i = paramCharSequence.charAt(k + 1);
      if ((i < 48) || (i > 57)) {
        return k ^ 0xFFFFFFFF;
      }
      j = (paramInt << 1) + (paramInt << 3) + i - 48;
      paramInt = this.b;
      if (params.c() != null) {
        paramInt = params.c().intValue();
      }
      m = paramInt - 50;
      if (m >= 0) {}
      for (paramInt = m % 100;; paramInt = (m + 1) % 100 + 99)
      {
        i = n;
        if (j < paramInt) {
          i = 100;
        }
        params.a(this.a, i + m - paramInt + j);
        return k + 2;
      }
    }
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    paramInt = a(paramLong, parama);
    if (paramInt < 0)
    {
      paramAppendable.append(65533);
      paramAppendable.append(65533);
      return;
    }
    y.a(paramAppendable, paramInt, 2);
  }
  
  public int b()
  {
    if (this.c) {
      return 4;
    }
    return 2;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
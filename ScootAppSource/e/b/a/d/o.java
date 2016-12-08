package e.b.a.d;

import e.b.a.a;
import e.b.a.i;
import java.util.Locale;

final class o
  implements ab, ad
{
  private final String a;
  private final String b;
  private final boolean c;
  private final int d;
  private final int e;
  
  o(String paramString1, String paramString2, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramBoolean;
    if ((paramInt1 <= 0) || (paramInt2 < paramInt1)) {
      throw new IllegalArgumentException();
    }
    if (paramInt1 > 4)
    {
      paramInt2 = 4;
      paramInt1 = i;
    }
    for (;;)
    {
      this.d = paramInt1;
      this.e = paramInt2;
      return;
    }
  }
  
  private int a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    paramInt2 = Math.min(paramCharSequence.length() - paramInt1, paramInt2);
    int i = 0;
    for (;;)
    {
      if (paramInt2 > 0)
      {
        int j = paramCharSequence.charAt(paramInt1 + i);
        if ((j >= 48) && (j <= 57)) {}
      }
      else
      {
        return i;
      }
      i += 1;
      paramInt2 -= 1;
    }
  }
  
  public int a()
  {
    int j = this.d + 1 << 1;
    int i = j;
    if (this.c) {
      i = j + (this.d - 1);
    }
    j = i;
    if (this.a != null)
    {
      j = i;
      if (this.a.length() > i) {
        j = this.a.length();
      }
    }
    return j;
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    int m = 0;
    int i = paramCharSequence.length() - paramInt;
    if (this.b != null)
    {
      if (this.b.length() != 0) {
        break label78;
      }
      if (i <= 0) {
        break label68;
      }
      j = paramCharSequence.charAt(paramInt);
      if ((j != 45) && (j != 43)) {
        break label68;
      }
    }
    while (i <= 1)
    {
      return paramInt ^ 0xFFFFFFFF;
      label68:
      params.a(Integer.valueOf(0));
      return paramInt;
      label78:
      if (c.c(paramCharSequence, paramInt, this.b))
      {
        params.a(Integer.valueOf(0));
        return paramInt + this.b.length();
      }
    }
    int j = paramCharSequence.charAt(paramInt);
    if (j == 45) {}
    for (int k = 1;; k = 0)
    {
      j = paramInt + 1;
      if (a(paramCharSequence, j, 2) >= 2) {
        break label166;
      }
      return j ^ 0xFFFFFFFF;
      if (j != 43) {
        break;
      }
    }
    return paramInt ^ 0xFFFFFFFF;
    label166:
    paramInt = y.a(paramCharSequence, j);
    if (paramInt > 23) {
      return j ^ 0xFFFFFFFF;
    }
    paramInt *= 3600000;
    int n = i - 1 - 2;
    j += 2;
    if (n <= 0) {
      i = j;
    }
    for (;;)
    {
      if (k != 0) {
        paramInt = -paramInt;
      }
      for (;;)
      {
        params.a(Integer.valueOf(paramInt));
        return i;
        int i1 = paramCharSequence.charAt(j);
        if (i1 == 58)
        {
          i = j + 1;
          n -= 1;
          m = 1;
        }
        do
        {
          j = a(paramCharSequence, i, 2);
          if ((j != 0) || (m != 0)) {
            break label311;
          }
          break;
          if (i1 < 48) {
            break label304;
          }
          i = j;
        } while (i1 <= 57);
        label304:
        i = j;
        break;
        label311:
        if (j < 2) {
          return i ^ 0xFFFFFFFF;
        }
        j = y.a(paramCharSequence, i);
        if (j > 59) {
          return i ^ 0xFFFFFFFF;
        }
        paramInt += j * 60000;
        i1 = n - 2;
        j = i + 2;
        if (i1 <= 0)
        {
          i = j;
          break;
        }
        n = i1;
        i = j;
        if (m != 0)
        {
          if (paramCharSequence.charAt(j) != ':')
          {
            i = j;
            break;
          }
          n = i1 - 1;
          i = j + 1;
        }
        j = a(paramCharSequence, i, 2);
        if ((j == 0) && (m == 0)) {
          break;
        }
        if (j < 2) {
          return i ^ 0xFFFFFFFF;
        }
        j = y.a(paramCharSequence, i);
        if (j > 59) {
          return i ^ 0xFFFFFFFF;
        }
        paramInt += j * 1000;
        j = n - 2;
        i += 2;
        if (j <= 0) {
          break;
        }
        j = i;
        if (m != 0)
        {
          if ((paramCharSequence.charAt(i) != '.') && (paramCharSequence.charAt(i) != ',')) {
            break;
          }
          j = i + 1;
        }
        n = a(paramCharSequence, j, 3);
        if ((n == 0) && (m == 0))
        {
          i = j;
          break;
        }
        if (n < 1) {
          return j ^ 0xFFFFFFFF;
        }
        i = j + 1;
        j = (paramCharSequence.charAt(j) - '0') * 100 + paramInt;
        if (n <= 1) {
          break label686;
        }
        paramInt = i + 1;
        j = (paramCharSequence.charAt(i) - '0') * 10 + j;
        if (n <= 2) {
          break label677;
        }
        i = j + (paramCharSequence.charAt(paramInt) - '0');
        j = paramInt + 1;
        paramInt = i;
        i = j;
        break;
      }
      label677:
      i = paramInt;
      paramInt = j;
      continue;
      label686:
      paramInt = j;
    }
  }
  
  public void a(Appendable paramAppendable, long paramLong, a parama, int paramInt, i parami, Locale paramLocale)
  {
    if (parami == null) {
      return;
    }
    if ((paramInt == 0) && (this.a != null))
    {
      paramAppendable.append(this.a);
      return;
    }
    if (paramInt >= 0) {
      paramAppendable.append('+');
    }
    for (;;)
    {
      int i = paramInt / 3600000;
      y.a(paramAppendable, i, 2);
      if (this.e == 1) {
        break;
      }
      paramInt -= i * 3600000;
      if ((paramInt == 0) && (this.d <= 1)) {
        break;
      }
      i = paramInt / 60000;
      if (this.c) {
        paramAppendable.append(':');
      }
      y.a(paramAppendable, i, 2);
      if (this.e == 2) {
        break;
      }
      paramInt -= i * 60000;
      if ((paramInt == 0) && (this.d <= 2)) {
        break;
      }
      i = paramInt / 1000;
      if (this.c) {
        paramAppendable.append(':');
      }
      y.a(paramAppendable, i, 2);
      if (this.e == 3) {
        break;
      }
      paramInt -= i * 1000;
      if ((paramInt == 0) && (this.d <= 3)) {
        break;
      }
      if (this.c) {
        paramAppendable.append('.');
      }
      y.a(paramAppendable, paramInt, 3);
      return;
      paramAppendable.append('-');
      paramInt = -paramInt;
    }
  }
  
  public int b()
  {
    return a();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
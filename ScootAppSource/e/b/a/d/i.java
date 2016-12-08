package e.b.a.d;

import e.b.a.d;

abstract class i
  implements ab, ad
{
  protected final d a;
  protected final int b;
  protected final boolean c;
  
  i(d paramd, int paramInt, boolean paramBoolean)
  {
    this.a = paramd;
    this.b = paramInt;
    this.c = paramBoolean;
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    int i1 = Math.min(this.b, paramCharSequence.length() - paramInt);
    int k = 0;
    int i = 0;
    int j = 0;
    int m = j;
    int n = i;
    int i2;
    if (k < i1)
    {
      i2 = paramCharSequence.charAt(paramInt + k);
      if ((k == 0) && ((i2 == 45) || (i2 == 43)) && (this.c)) {
        if (i2 == 45)
        {
          i = 1;
          label89:
          if (i2 != 43) {
            break label167;
          }
          j = 1;
          label99:
          m = j;
          n = i;
          if (k + 1 >= i1) {
            break label422;
          }
          i2 = paramCharSequence.charAt(paramInt + k + 1);
          m = j;
          n = i;
          if (i2 < 48) {
            break label422;
          }
          if (i2 <= 57) {
            break label173;
          }
        }
      }
    }
    for (;;)
    {
      if (k == 0)
      {
        return paramInt ^ 0xFFFFFFFF;
        i = 0;
        break label89;
        label167:
        j = 0;
        break label99;
        label173:
        k += 1;
        i1 = Math.min(i1 + 1, paramCharSequence.length() - paramInt);
        break;
        m = j;
        n = i;
        if (i2 < 48) {
          break label422;
        }
        if (i2 > 57) {
          continue;
        }
        k += 1;
        break;
      }
      if (k >= 9)
      {
        if (j != 0) {
          k = paramInt + k;
        }
        for (paramInt = Integer.parseInt(paramCharSequence.subSequence(paramInt + 1, k).toString());; paramInt = Integer.parseInt(paramCharSequence.subSequence(paramInt, k).toString()))
        {
          params.a(this.a, paramInt);
          return k;
          k = paramInt + k;
        }
      }
      if ((i != 0) || (j != 0)) {}
      for (j = paramInt + 1;; j = paramInt)
      {
        try
        {
          n = paramCharSequence.charAt(j);
          m = paramInt + k;
          k = n - 48;
          paramInt = j + 1;
          j = k;
          while (paramInt < m)
          {
            j = paramCharSequence.charAt(paramInt) + ((j << 3) + (j << 1)) - 48;
            paramInt += 1;
          }
          paramInt = j;
        }
        catch (StringIndexOutOfBoundsException params)
        {
          return paramInt ^ 0xFFFFFFFF;
        }
        k = m;
        if (i == 0) {
          break;
        }
        paramInt = -j;
        k = m;
        break;
      }
      label422:
      i = n;
      j = m;
    }
  }
  
  public int b()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
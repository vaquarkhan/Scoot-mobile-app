package e.b.a.d;

final class h
  implements ab
{
  private final ab[] a;
  private final int b;
  
  h(ab[] paramArrayOfab)
  {
    this.a = paramArrayOfab;
    int i = 0;
    int j = paramArrayOfab.length;
    j -= 1;
    if (j >= 0)
    {
      ab localab = paramArrayOfab[j];
      if (localab == null) {
        break label59;
      }
      int k = localab.b();
      if (k <= i) {
        break label59;
      }
      i = k;
    }
    label59:
    for (;;)
    {
      break;
      this.b = i;
      return;
    }
  }
  
  public int a(s params, CharSequence paramCharSequence, int paramInt)
  {
    ab[] arrayOfab = this.a;
    int n = arrayOfab.length;
    Object localObject2 = params.d();
    Object localObject1 = null;
    int k = 0;
    int j = paramInt;
    int i = paramInt;
    ab localab;
    if (k < n)
    {
      localab = arrayOfab[k];
      if (localab == null) {
        if (i <= paramInt) {
          return paramInt;
        }
      }
    }
    for (k = 1;; k = 0)
    {
      int m;
      if ((i > paramInt) || ((i == paramInt) && (k != 0)))
      {
        if (localObject1 != null) {
          params.a(localObject1);
        }
        return i;
        m = localab.a(params, paramCharSequence, paramInt);
        if (m >= paramInt)
        {
          if (m <= i) {
            break label205;
          }
          if ((m >= paramCharSequence.length()) || (k + 1 >= n) || (arrayOfab[(k + 1)] == null)) {
            return m;
          }
          localObject1 = params.d();
          i = m;
        }
      }
      label205:
      for (;;)
      {
        params.a(localObject2);
        k += 1;
        break;
        if (m < 0)
        {
          m ^= 0xFFFFFFFF;
          if (m > j)
          {
            j = m;
            continue;
            return j ^ 0xFFFFFFFF;
          }
        }
      }
    }
  }
  
  public int b()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
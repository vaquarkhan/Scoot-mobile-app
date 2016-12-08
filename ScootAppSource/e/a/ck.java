package e.a;

public final class ck
{
  public int[] a;
  public boolean b;
  
  public static ck a(j paramj, int paramInt)
  {
    int m = 8;
    ck localck = new ck();
    localck.a = new int[paramInt];
    int k = 0;
    int j = 8;
    if (k < paramInt)
    {
      int i = m;
      boolean bool;
      label70:
      int[] arrayOfInt;
      if (m != 0)
      {
        i = (o.b(paramj, "deltaScale") + j + 256) % 256;
        if ((k == 0) && (i == 0))
        {
          bool = true;
          localck.b = bool;
        }
      }
      else
      {
        arrayOfInt = localck.a;
        if (i != 0) {
          break label121;
        }
      }
      for (;;)
      {
        arrayOfInt[k] = j;
        j = localck.a[k];
        k += 1;
        m = i;
        break;
        bool = false;
        break label70;
        label121:
        j = i;
      }
    }
    return localck;
  }
  
  public void a(k paramk)
  {
    int i = 0;
    if (this.b) {
      p.b(paramk, 0, "SPS: ");
    }
    for (;;)
    {
      return;
      int j = 8;
      while (i < this.a.length)
      {
        p.b(paramk, this.a[i] - j - 256, "SPS: ");
        j = this.a[i];
        i += 1;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\ck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
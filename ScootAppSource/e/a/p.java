package e.a;

public final class p
{
  public static void a(k paramk)
  {
    paramk.a(1);
    paramk.a();
  }
  
  public static void a(k paramk, int paramInt)
  {
    int i = 0;
    int j = 0;
    if (i < 15) {
      if (paramInt >= (1 << i) + j) {}
    }
    for (;;)
    {
      paramk.a(0, i);
      paramk.a(1);
      paramk.a(paramInt - j, i);
      return;
      j += (1 << i);
      i += 1;
      break;
      i = 0;
    }
  }
  
  public static void a(k paramk, int paramInt1, int paramInt2)
  {
    paramk.a(paramInt1, paramInt2);
  }
  
  public static void a(k paramk, int paramInt, String paramString)
  {
    a(paramk, paramInt);
    af.a(paramString, new Object[] { Integer.valueOf(paramInt) });
  }
  
  public static void a(k paramk, long paramLong, int paramInt, String paramString)
  {
    int i = 0;
    while (i < paramInt)
    {
      paramk.a((int)(paramLong >> paramInt - i - 1) & 0x1);
      i += 1;
    }
    af.a(paramString, new Object[] { Long.valueOf(paramLong) });
  }
  
  public static void a(k paramk, boolean paramBoolean, String paramString)
  {
    int j = 1;
    if (paramBoolean)
    {
      i = 1;
      paramk.a(i);
      if (!paramBoolean) {
        break label42;
      }
    }
    label42:
    for (int i = j;; i = 0)
    {
      af.a(paramString, new Object[] { Integer.valueOf(i) });
      return;
      i = 0;
      break;
    }
  }
  
  public static void b(k paramk, int paramInt, String paramString)
  {
    a(paramk, bh.b(paramInt));
    af.a(paramString, new Object[] { Integer.valueOf(paramInt) });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
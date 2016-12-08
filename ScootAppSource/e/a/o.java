package e.a;

public final class o
{
  public static int a(j paramj)
  {
    int j = 0;
    int i = 0;
    while ((paramj.b() == 0) && (i < 31)) {
      i += 1;
    }
    if (i > 0)
    {
      long l = paramj.a(i);
      j = (int)((1 << i) - 1 + l);
    }
    return j;
  }
  
  public static int a(j paramj, int paramInt, String paramString)
  {
    paramInt = paramj.a(paramInt);
    af.a(paramString, new Object[] { Integer.valueOf(paramInt) });
    return paramInt;
  }
  
  public static int a(j paramj, String paramString)
  {
    int i = a(paramj);
    af.a(paramString, new Object[] { Integer.valueOf(i) });
    return i;
  }
  
  public static int b(j paramj, int paramInt, String paramString)
  {
    return a(paramj, paramInt, paramString);
  }
  
  public static int b(j paramj, String paramString)
  {
    int i = at.a(a(paramj));
    af.a(paramString, new Object[] { Integer.valueOf(i) });
    return i;
  }
  
  public static boolean b(j paramj)
  {
    return (paramj.c() >= 32) || (paramj.b(1) != 1) || (paramj.b(24) << 9 != 0);
  }
  
  public static boolean c(j paramj, String paramString)
  {
    int i = 1;
    boolean bool;
    if (paramj.b() == 0)
    {
      bool = false;
      if (!bool) {
        break label37;
      }
    }
    for (;;)
    {
      af.a(paramString, new Object[] { Integer.valueOf(i) });
      return bool;
      bool = true;
      break;
      label37:
      i = 0;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
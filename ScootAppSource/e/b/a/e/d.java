package e.b.a.e;

import e.b.a.i;
import java.io.DataInput;

final class d
  extends i
{
  final int b;
  final g c;
  final g d;
  
  d(String paramString, int paramInt, g paramg1, g paramg2)
  {
    super(paramString);
    this.b = paramInt;
    this.c = paramg1;
    this.d = paramg2;
  }
  
  static d a(DataInput paramDataInput, String paramString)
  {
    return new d(paramString, (int)c.a(paramDataInput), g.a(paramDataInput), g.a(paramDataInput));
  }
  
  private g i(long paramLong)
  {
    int i = this.b;
    g localg1 = this.c;
    g localg2 = this.d;
    try
    {
      l1 = localg1.a(paramLong, i, localg2.b());
      try
      {
        long l2 = localg2.a(paramLong, i, localg1.b());
        paramLong = l2;
      }
      catch (ArithmeticException localArithmeticException2)
      {
        for (;;) {}
      }
      catch (IllegalArgumentException localIllegalArgumentException2)
      {
        for (;;) {}
      }
      if (l1 > paramLong) {
        return localg1;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException1)
    {
      for (;;)
      {
        l1 = paramLong;
      }
    }
    catch (ArithmeticException localArithmeticException1)
    {
      for (;;)
      {
        long l1 = paramLong;
      }
    }
    return localg2;
  }
  
  public String a(long paramLong)
  {
    return i(paramLong).a();
  }
  
  public int b(long paramLong)
  {
    return this.b + i(paramLong).b();
  }
  
  public int c(long paramLong)
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof d)) {
        break;
      }
      paramObject = (d)paramObject;
    } while ((e().equals(((d)paramObject).e())) && (this.b == ((d)paramObject).b) && (this.c.equals(((d)paramObject).c)) && (this.d.equals(((d)paramObject).d)));
    return false;
    return false;
  }
  
  public boolean f()
  {
    return false;
  }
  
  public long g(long paramLong)
  {
    int i = this.b;
    g localg1 = this.c;
    g localg2 = this.d;
    for (;;)
    {
      long l2;
      long l1;
      try
      {
        l2 = localg1.a(paramLong, i, localg2.b());
        l1 = l2;
        if (paramLong > 0L)
        {
          l1 = l2;
          if (l2 < 0L) {
            l1 = paramLong;
          }
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException2)
      {
        l1 = paramLong;
        continue;
      }
      catch (ArithmeticException localArithmeticException2)
      {
        l1 = paramLong;
        continue;
      }
      try
      {
        l2 = localg2.a(paramLong, i, localg1.b());
        if ((paramLong <= 0L) || (l2 >= 0L)) {
          break label120;
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException1)
      {
        continue;
      }
      catch (ArithmeticException localArithmeticException1)
      {
        continue;
      }
      if (l1 > paramLong) {
        return paramLong;
      }
      return l1;
      label120:
      paramLong = l2;
    }
  }
  
  public long h(long paramLong)
  {
    paramLong += 1L;
    int i = this.b;
    g localg1 = this.c;
    g localg2 = this.d;
    try
    {
      l2 = localg1.b(paramLong, i, localg2.b());
      l1 = l2;
      if (paramLong < 0L)
      {
        l1 = l2;
        if (l2 > 0L) {
          l1 = paramLong;
        }
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException2)
    {
      for (;;)
      {
        l1 = paramLong;
      }
    }
    catch (ArithmeticException localArithmeticException2)
    {
      for (;;)
      {
        label86:
        long l1 = paramLong;
      }
    }
    try
    {
      l2 = localg2.b(paramLong, i, localg1.b());
      if ((paramLong >= 0L) || (l2 <= 0L)) {
        break label131;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException1)
    {
      break label86;
    }
    catch (ArithmeticException localArithmeticException1)
    {
      break label86;
      paramLong = l2;
      break label86;
    }
    l2 = paramLong;
    if (l1 > paramLong) {
      l2 = l1;
    }
    return l2 - 1L;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
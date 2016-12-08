package e.b.a.e;

import e.b.a.a;
import e.b.a.b.t;
import java.io.DataInput;

final class e
{
  final char a;
  final int b;
  final int c;
  final int d;
  final boolean e;
  final int f;
  
  e(char paramChar, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4)
  {
    if ((paramChar != 'u') && (paramChar != 'w') && (paramChar != 's')) {
      throw new IllegalArgumentException("Unknown mode: " + paramChar);
    }
    this.a = paramChar;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramBoolean;
    this.f = paramInt4;
  }
  
  private long a(a parama, long paramLong)
  {
    try
    {
      long l = c(parama, paramLong);
      return l;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      if ((this.b == 2) && (this.c == 29))
      {
        while (!parama.E().b(paramLong)) {
          paramLong = parama.E().a(paramLong, 1);
        }
        return c(parama, paramLong);
      }
      throw localIllegalArgumentException;
    }
  }
  
  static e a(DataInput paramDataInput)
  {
    return new e((char)paramDataInput.readUnsignedByte(), paramDataInput.readUnsignedByte(), paramDataInput.readByte(), paramDataInput.readUnsignedByte(), paramDataInput.readBoolean(), (int)c.a(paramDataInput));
  }
  
  private long b(a parama, long paramLong)
  {
    try
    {
      long l = c(parama, paramLong);
      return l;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      if ((this.b == 2) && (this.c == 29))
      {
        while (!parama.E().b(paramLong)) {
          paramLong = parama.E().a(paramLong, -1);
        }
        return c(parama, paramLong);
      }
      throw localIllegalArgumentException;
    }
  }
  
  private long c(a parama, long paramLong)
  {
    if (this.c >= 0) {
      return parama.u().b(paramLong, this.c);
    }
    paramLong = parama.u().b(paramLong, 1);
    paramLong = parama.C().a(paramLong, 1);
    return parama.u().a(paramLong, this.c);
  }
  
  private long d(a parama, long paramLong)
  {
    int i = parama.t().a(paramLong);
    int j = this.d - i;
    long l = paramLong;
    if (j != 0)
    {
      if (!this.e) {
        break label65;
      }
      i = j;
      if (j < 0) {
        i = j + 7;
      }
    }
    for (;;)
    {
      l = parama.t().a(paramLong, i);
      return l;
      label65:
      i = j;
      if (j > 0) {
        i = j - 7;
      }
    }
  }
  
  public long a(long paramLong, int paramInt1, int paramInt2)
  {
    long l2;
    t localt;
    long l1;
    if (this.a == 'w')
    {
      paramInt1 += paramInt2;
      l2 = paramInt1 + paramLong;
      localt = t.N();
      paramLong = localt.C().b(l2, this.b);
      paramLong = localt.e().b(paramLong, 0);
      l1 = a(localt, localt.e().a(paramLong, this.f));
      if (this.d != 0) {
        break label127;
      }
      paramLong = l1;
      if (l1 <= l2) {
        paramLong = a(localt, localt.E().a(l1, 1));
      }
    }
    for (;;)
    {
      return paramLong - paramInt1;
      if (this.a == 's') {
        break;
      }
      paramInt1 = 0;
      break;
      label127:
      l1 = d(localt, l1);
      paramLong = l1;
      if (l1 <= l2)
      {
        paramLong = localt.E().a(l1, 1);
        paramLong = d(localt, a(localt, localt.C().b(paramLong, this.b)));
      }
    }
  }
  
  public long b(long paramLong, int paramInt1, int paramInt2)
  {
    long l2;
    t localt;
    long l1;
    if (this.a == 'w')
    {
      paramInt1 += paramInt2;
      l2 = paramInt1 + paramLong;
      localt = t.N();
      paramLong = localt.C().b(l2, this.b);
      paramLong = localt.e().b(paramLong, 0);
      l1 = b(localt, localt.e().a(paramLong, this.f));
      if (this.d != 0) {
        break label127;
      }
      paramLong = l1;
      if (l1 >= l2) {
        paramLong = b(localt, localt.E().a(l1, -1));
      }
    }
    for (;;)
    {
      return paramLong - paramInt1;
      if (this.a == 's') {
        break;
      }
      paramInt1 = 0;
      break;
      label127:
      l1 = d(localt, l1);
      paramLong = l1;
      if (l1 >= l2)
      {
        paramLong = localt.E().a(l1, -1);
        paramLong = d(localt, b(localt, localt.C().b(paramLong, this.b)));
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof e)) {
        break;
      }
      paramObject = (e)paramObject;
    } while ((this.a == ((e)paramObject).a) && (this.b == ((e)paramObject).b) && (this.c == ((e)paramObject).c) && (this.d == ((e)paramObject).d) && (this.e == ((e)paramObject).e) && (this.f == ((e)paramObject).f));
    return false;
    return false;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\e\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
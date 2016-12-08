package e.a;

import java.nio.ByteBuffer;
import java.util.Comparator;

public class bs
{
  public static final Comparator<bs> a = new bt();
  private ByteBuffer b;
  private long c;
  private long d;
  private long e;
  private long f;
  private boolean g;
  private cv h;
  private int i;
  
  public bs(bs parambs, ByteBuffer paramByteBuffer)
  {
    this(paramByteBuffer, parambs.c, parambs.d, parambs.e, parambs.f, parambs.g, parambs.h);
    this.i = parambs.i;
  }
  
  public bs(ByteBuffer paramByteBuffer, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean, cv paramcv)
  {
    this(paramByteBuffer, paramLong1, paramLong2, paramLong3, paramLong4, paramBoolean, paramcv, 0);
  }
  
  public bs(ByteBuffer paramByteBuffer, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean, cv paramcv, int paramInt)
  {
    this.b = paramByteBuffer;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramLong3;
    this.f = paramLong4;
    this.g = paramBoolean;
    this.h = paramcv;
    this.i = paramInt;
  }
  
  public ByteBuffer b()
  {
    return this.b;
  }
  
  public long c()
  {
    return this.c;
  }
  
  public long d()
  {
    return this.e;
  }
  
  public cv e()
  {
    return this.h;
  }
  
  public int f()
  {
    return this.i;
  }
  
  public boolean g()
  {
    return this.g;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
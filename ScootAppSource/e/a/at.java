package e.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public final class at
{
  public static int a(int paramInt)
  {
    return (((paramInt & 0x1) << 1) - 1) * ((paramInt >> 1) + (paramInt & 0x1));
  }
  
  public static int a(cn paramcn)
  {
    int j = paramcn.i;
    if (paramcn.z) {}
    for (int i = 0;; i = 1) {
      return j + 1 << i;
    }
  }
  
  public static ByteBuffer a(ByteBuffer paramByteBuffer)
  {
    b(paramByteBuffer);
    return c(paramByteBuffer);
  }
  
  public static void a(ByteBuffer paramByteBuffer, List<ByteBuffer> paramList1, List<ByteBuffer> paramList2)
  {
    ByteBuffer localByteBuffer1 = paramByteBuffer.duplicate();
    for (;;)
    {
      ByteBuffer localByteBuffer2;
      if (localByteBuffer1.hasRemaining())
      {
        localByteBuffer2 = a(localByteBuffer1);
        if (localByteBuffer2 != null) {
          break label24;
        }
      }
      label24:
      bn localbn;
      do
      {
        return;
        localbn = bn.a(localByteBuffer2);
        if (localbn.a == bo.h)
        {
          if (paramList2 != null) {
            paramList2.add(localByteBuffer2);
          }
          paramByteBuffer.position(localByteBuffer1.position());
          break;
        }
      } while (localbn.a != bo.g);
      if (paramList1 != null) {
        paramList1.add(localByteBuffer2);
      }
      paramByteBuffer.position(localByteBuffer1.position());
    }
  }
  
  public static final void b(ByteBuffer paramByteBuffer)
  {
    if (!paramByteBuffer.hasRemaining()) {}
    int j;
    do
    {
      return;
      while (!paramByteBuffer.hasRemaining()) {
        i = -1;
      }
      j = i << 8 | paramByteBuffer.get() & 0xFF;
      int i = j;
    } while ((0xFFFFFF & j) != 1);
    paramByteBuffer.position(paramByteBuffer.position());
  }
  
  public static final ByteBuffer c(ByteBuffer paramByteBuffer)
  {
    if (!paramByteBuffer.hasRemaining()) {
      return null;
    }
    int k = paramByteBuffer.position();
    ByteBuffer localByteBuffer = paramByteBuffer.slice();
    localByteBuffer.order(ByteOrder.BIG_ENDIAN);
    int i = -1;
    int m;
    while (paramByteBuffer.hasRemaining())
    {
      int j = i << 8 | paramByteBuffer.get() & 0xFF;
      i = j;
      if ((0xFFFFFF & j) == 1)
      {
        m = paramByteBuffer.position();
        if (j != 1) {
          break label99;
        }
      }
    }
    label99:
    for (i = 4;; i = 3)
    {
      paramByteBuffer.position(m - i);
      localByteBuffer.limit(paramByteBuffer.position() - k);
      return localByteBuffer;
    }
  }
  
  public static void d(ByteBuffer paramByteBuffer)
  {
    ByteBuffer localByteBuffer1 = paramByteBuffer.duplicate();
    paramByteBuffer = paramByteBuffer.duplicate();
    int i = paramByteBuffer.position();
    for (;;)
    {
      ByteBuffer localByteBuffer2 = a(localByteBuffer1);
      if (localByteBuffer2 == null) {
        return;
      }
      paramByteBuffer.position(i);
      paramByteBuffer.putInt(localByteBuffer2.remaining());
      i += localByteBuffer2.remaining() + 4;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
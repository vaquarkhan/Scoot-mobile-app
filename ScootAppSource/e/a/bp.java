package e.a;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class bp
{
  public static am a(String paramString, long paramLong)
  {
    return new am(new FileOutputStream(paramString).getChannel(), paramString, paramLong);
  }
  
  public static void a(ByteBuffer paramByteBuffer, String paramString)
  {
    paramByteBuffer.put((byte)paramString.length());
    paramByteBuffer.put(az.a(paramString));
  }
  
  public static void a(ByteBuffer paramByteBuffer, String paramString, int paramInt)
  {
    paramByteBuffer.put((byte)paramString.length());
    paramByteBuffer.put(az.a(paramString));
    b(paramByteBuffer, paramInt - paramString.length());
  }
  
  public static void a(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    if (paramByteBuffer2.hasArray())
    {
      paramByteBuffer1.put(paramByteBuffer2.array(), paramByteBuffer2.arrayOffset() + paramByteBuffer2.position(), Math.min(paramByteBuffer1.remaining(), paramByteBuffer2.remaining()));
      return;
    }
    paramByteBuffer1.put(a(paramByteBuffer2, paramByteBuffer1.remaining()));
  }
  
  public static void a(WritableByteChannel paramWritableByteChannel, long paramLong)
  {
    paramWritableByteChannel.write((ByteBuffer)ByteBuffer.allocate(8).putLong(paramLong).flip());
  }
  
  public static byte[] a(ByteBuffer paramByteBuffer, int paramInt)
  {
    byte[] arrayOfByte = new byte[Math.min(paramByteBuffer.remaining(), paramInt)];
    paramByteBuffer.duplicate().get(arrayOfByte);
    return arrayOfByte;
  }
  
  public static int b(ByteBuffer paramByteBuffer, int paramInt)
  {
    paramInt = Math.min(paramByteBuffer.remaining(), paramInt);
    paramByteBuffer.position(paramByteBuffer.position() + paramInt);
    return paramInt;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
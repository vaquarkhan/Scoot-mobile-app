package e.a;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class am
  implements cm
{
  private FileChannel a;
  private String b;
  private long c;
  
  public am(FileChannel paramFileChannel, String paramString, long paramLong)
  {
    this.a = paramFileChannel;
    this.b = paramString;
    this.c = paramLong;
  }
  
  public long a()
  {
    return this.a.position();
  }
  
  public cm a(long paramLong)
  {
    this.a.position(paramLong);
    return this;
  }
  
  public void a(FileChannel paramFileChannel)
  {
    this.a = paramFileChannel;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public long c()
  {
    return this.c;
  }
  
  public void close()
  {
    this.a.close();
  }
  
  public boolean isOpen()
  {
    return this.a.isOpen();
  }
  
  public int read(ByteBuffer paramByteBuffer)
  {
    return this.a.read(paramByteBuffer);
  }
  
  public int write(ByteBuffer paramByteBuffer)
  {
    return this.a.write(paramByteBuffer);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
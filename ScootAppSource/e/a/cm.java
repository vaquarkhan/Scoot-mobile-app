package e.a;

import java.io.Closeable;
import java.nio.channels.ByteChannel;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public abstract interface cm
  extends Closeable, ByteChannel, Channel, ReadableByteChannel, WritableByteChannel
{
  public abstract long a();
  
  public abstract cm a(long paramLong);
  
  public abstract void a(FileChannel paramFileChannel);
  
  public abstract String b();
  
  public abstract long c();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package e.a;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.HashMap;
import java.util.Map;

public final class bf
{
  private static Map<x, String> a = new HashMap();
  
  static
  {
    a.put(x.a, "m2v1");
    a.put(x.c, "avc1");
    a.put(x.d, "mjp2");
  }
  
  public static void a(cm paramcm, bl parambl)
  {
    long l = paramcm.a();
    paramcm.close();
    RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramcm.b(), "rws");
    localRandomAccessFile.setLength(Math.max(paramcm.c() * 2L, 256000L));
    MappedByteBuffer localMappedByteBuffer = localRandomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, localRandomAccessFile.length());
    localMappedByteBuffer.position((int)l);
    parambl.b(localMappedByteBuffer);
    int i = localMappedByteBuffer.position();
    parambl = localRandomAccessFile.getChannel();
    parambl.truncate(i);
    paramcm.a(parambl);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
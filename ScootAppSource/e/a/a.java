package e.a;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  private static i a;
  
  private static final MappedByteBuffer a(File paramFile)
  {
    RandomAccessFile localRandomAccessFile = new RandomAccessFile(paramFile, "rw");
    paramFile = localRandomAccessFile.getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, paramFile.length());
    localRandomAccessFile.close();
    return paramFile;
  }
  
  private static List<ByteBuffer> a(bu[] paramArrayOfbu)
  {
    ArrayList localArrayList = new ArrayList();
    int j = paramArrayOfbu.length;
    int i = 0;
    while (i < j)
    {
      bu localbu = paramArrayOfbu[i];
      ByteBuffer localByteBuffer = ByteBuffer.allocate(1024);
      localbu.b(localByteBuffer);
      localByteBuffer.flip();
      localArrayList.add(localByteBuffer);
      i += 1;
    }
    return localArrayList;
  }
  
  private static List<ByteBuffer> a(cn[] paramArrayOfcn)
  {
    ArrayList localArrayList = new ArrayList();
    int j = paramArrayOfcn.length;
    int i = 0;
    while (i < j)
    {
      cn localcn = paramArrayOfcn[i];
      ByteBuffer localByteBuffer = ByteBuffer.allocate(1024);
      localcn.b(localByteBuffer);
      localByteBuffer.flip();
      localArrayList.add(localByteBuffer);
      i += 1;
    }
    return localArrayList;
  }
  
  private static void a(ap paramap, File paramFile, List<Long> paramList)
  {
    paramFile = new bg(a(paramFile));
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i = 0;
    Object localObject = paramFile.a();
    if (localObject != null)
    {
      localObject = ((bs)localObject).b();
      at.a((ByteBuffer)localObject, localArrayList1, localArrayList2);
      at.d((ByteBuffer)localObject);
      long l2 = ((Long)paramList.get(i)).longValue();
      if (paramList.size() - 1 > i) {}
      for (long l1 = ((Long)paramList.get(i + 1)).longValue() - l2;; l1 = 250000L)
      {
        paramap.a(new be((ByteBuffer)localObject, l2, 1000000L, l1, i, true, null, l2, 0));
        i += 1;
        break;
      }
    }
    a(paramap, paramFile.b(), paramFile.c());
  }
  
  private static void a(ap paramap, cn[] paramArrayOfcn, bu[] paramArrayOfbu)
  {
    cn localcn = paramArrayOfcn[0];
    dp localdp = bd.a("avc1", new cp(localcn.j + 1 << 4, at.a(localcn) << 4), "JCodec");
    a = new i(localcn.n, 0, localcn.s, a(paramArrayOfcn), a(paramArrayOfbu));
    localdp.a(a);
    paramap.a(localdp);
  }
  
  public void a(File paramFile, String paramString, List<Long> paramList)
  {
    paramString = bp.a(paramString, paramFile.length());
    bd localbd = new bd(paramString, n.a);
    a(localbd.a(dg.a, 1000000), paramFile, paramList);
    localbd.a();
    paramString.close();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
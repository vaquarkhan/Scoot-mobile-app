package b.a.a.a.a.b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ac
  implements Closeable
{
  private static final Logger b = Logger.getLogger(ac.class.getName());
  int a;
  private final RandomAccessFile c;
  private int d;
  private ae e;
  private ae f;
  private final byte[] g = new byte[16];
  
  public ac(File paramFile)
  {
    if (!paramFile.exists()) {
      a(paramFile);
    }
    this.c = b(paramFile);
    c();
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt)
  {
    return ((paramArrayOfByte[paramInt] & 0xFF) << 24) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 3)] & 0xFF);
  }
  
  private ae a(int paramInt)
  {
    if (paramInt == 0) {
      return ae.a;
    }
    this.c.seek(paramInt);
    return new ae(paramInt, this.c.readInt());
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(this.g, new int[] { paramInt1, paramInt2, paramInt3, paramInt4 });
    this.c.seek(0L);
    this.c.write(this.g);
  }
  
  private void a(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    paramInt1 = b(paramInt1);
    if (paramInt1 + paramInt3 <= this.a)
    {
      this.c.seek(paramInt1);
      this.c.write(paramArrayOfByte, paramInt2, paramInt3);
      return;
    }
    int i = this.a - paramInt1;
    this.c.seek(paramInt1);
    this.c.write(paramArrayOfByte, paramInt2, i);
    this.c.seek(16L);
    this.c.write(paramArrayOfByte, paramInt2 + i, paramInt3 - i);
  }
  
  private static void a(File paramFile)
  {
    File localFile = new File(paramFile.getPath() + ".tmp");
    RandomAccessFile localRandomAccessFile = b(localFile);
    try
    {
      localRandomAccessFile.setLength(4096L);
      localRandomAccessFile.seek(0L);
      byte[] arrayOfByte = new byte[16];
      a(arrayOfByte, new int[] { 4096, 0, 0, 0 });
      localRandomAccessFile.write(arrayOfByte);
      localRandomAccessFile.close();
      if (!localFile.renameTo(paramFile)) {
        throw new IOException("Rename failed!");
      }
    }
    finally
    {
      localRandomAccessFile.close();
    }
  }
  
  private static void a(byte[] paramArrayOfByte, int... paramVarArgs)
  {
    int i = 0;
    int k = paramVarArgs.length;
    int j = 0;
    while (i < k)
    {
      b(paramArrayOfByte, j, paramVarArgs[i]);
      j += 4;
      i += 1;
    }
  }
  
  private int b(int paramInt)
  {
    if (paramInt < this.a) {
      return paramInt;
    }
    return paramInt + 16 - this.a;
  }
  
  private static RandomAccessFile b(File paramFile)
  {
    return new RandomAccessFile(paramFile, "rwd");
  }
  
  private static <T> T b(T paramT, String paramString)
  {
    if (paramT == null) {
      throw new NullPointerException(paramString);
    }
    return paramT;
  }
  
  private void b(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    paramInt1 = b(paramInt1);
    if (paramInt1 + paramInt3 <= this.a)
    {
      this.c.seek(paramInt1);
      this.c.readFully(paramArrayOfByte, paramInt2, paramInt3);
      return;
    }
    int i = this.a - paramInt1;
    this.c.seek(paramInt1);
    this.c.readFully(paramArrayOfByte, paramInt2, i);
    this.c.seek(16L);
    this.c.readFully(paramArrayOfByte, paramInt2 + i, paramInt3 - i);
  }
  
  private static void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[paramInt1] = ((byte)(paramInt2 >> 24));
    paramArrayOfByte[(paramInt1 + 1)] = ((byte)(paramInt2 >> 16));
    paramArrayOfByte[(paramInt1 + 2)] = ((byte)(paramInt2 >> 8));
    paramArrayOfByte[(paramInt1 + 3)] = ((byte)paramInt2);
  }
  
  private void c()
  {
    this.c.seek(0L);
    this.c.readFully(this.g);
    this.a = a(this.g, 0);
    if (this.a > this.c.length()) {
      throw new IOException("File is truncated. Expected length: " + this.a + ", Actual length: " + this.c.length());
    }
    this.d = a(this.g, 4);
    int i = a(this.g, 8);
    int j = a(this.g, 12);
    this.e = a(i);
    this.f = a(j);
  }
  
  private void c(int paramInt)
  {
    int m = paramInt + 4;
    paramInt = d();
    if (paramInt >= m) {
      return;
    }
    int i = this.a;
    int k;
    int j;
    do
    {
      k = paramInt + i;
      j = i << 1;
      i = j;
      paramInt = k;
    } while (k < m);
    d(j);
    paramInt = b(this.f.b + 4 + this.f.c);
    if (paramInt < this.e.b)
    {
      FileChannel localFileChannel = this.c.getChannel();
      localFileChannel.position(this.a);
      paramInt -= 4;
      if (localFileChannel.transferTo(16L, paramInt, localFileChannel) != paramInt) {
        throw new AssertionError("Copied insufficient number of bytes!");
      }
    }
    if (this.f.b < this.e.b)
    {
      paramInt = this.a + this.f.b - 16;
      a(j, this.d, this.e.b, paramInt);
      this.f = new ae(paramInt, this.f.c);
    }
    for (;;)
    {
      this.a = j;
      return;
      a(j, this.d, this.e.b, this.f.b);
    }
  }
  
  private int d()
  {
    return this.a - a();
  }
  
  private void d(int paramInt)
  {
    this.c.setLength(paramInt);
    this.c.getChannel().force(true);
  }
  
  public int a()
  {
    if (this.d == 0) {
      return 16;
    }
    if (this.f.b >= this.e.b) {
      return this.f.b - this.e.b + 4 + this.f.c + 16;
    }
    return this.f.b + 4 + this.f.c + this.a - this.e.b;
  }
  
  public void a(ag paramag)
  {
    try
    {
      int j = this.e.b;
      int i = 0;
      while (i < this.d)
      {
        ae localae = a(j);
        paramag.a(new af(this, localae, null), localae.c);
        j = localae.b;
        j = b(localae.c + (j + 4));
        i += 1;
      }
      return;
    }
    finally {}
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      b(paramArrayOfByte, "buffer");
      if (((paramInt1 | paramInt2) < 0) || (paramInt2 > paramArrayOfByte.length - paramInt1)) {
        throw new IndexOutOfBoundsException();
      }
    }
    finally {}
    c(paramInt2);
    boolean bool = b();
    int i;
    ae localae;
    if (bool)
    {
      i = 16;
      localae = new ae(i, paramInt2);
      b(this.g, 0, paramInt2);
      a(localae.b, this.g, 0, 4);
      a(localae.b + 4, paramArrayOfByte, paramInt1, paramInt2);
      if (!bool) {
        break label195;
      }
    }
    label195:
    for (paramInt1 = localae.b;; paramInt1 = this.e.b)
    {
      a(this.a, this.d + 1, paramInt1, localae.b);
      this.f = localae;
      this.d += 1;
      if (bool) {
        this.e = this.f;
      }
      return;
      i = b(this.f.b + 4 + this.f.c);
      break;
    }
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return a() + 4 + paramInt1 <= paramInt2;
  }
  
  /* Error */
  public boolean b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 172	b/a/a/a/a/b/ac:d	I
    //   6: istore_1
    //   7: iload_1
    //   8: ifne +9 -> 17
    //   11: iconst_1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_2
    //   19: goto -6 -> 13
    //   22: astore_3
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_3
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	ac
    //   6	2	1	i	int
    //   12	7	2	bool	boolean
    //   22	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public void close()
  {
    try
    {
      this.c.close();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName()).append('[');
    localStringBuilder.append("fileLength=").append(this.a);
    localStringBuilder.append(", size=").append(this.d);
    localStringBuilder.append(", first=").append(this.e);
    localStringBuilder.append(", last=").append(this.f);
    localStringBuilder.append(", element lengths=[");
    try
    {
      a(new ad(this, localStringBuilder));
      localStringBuilder.append("]]");
      return localStringBuilder.toString();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        b.log(Level.WARNING, "read error", localIOException);
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\b\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
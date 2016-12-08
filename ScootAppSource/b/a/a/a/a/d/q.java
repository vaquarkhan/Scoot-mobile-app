package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.ac;
import b.a.a.a.a.b.m;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class q
  implements k
{
  private final Context a;
  private final File b;
  private final String c;
  private final File d;
  private ac e;
  private File f;
  
  public q(Context paramContext, File paramFile, String paramString1, String paramString2)
  {
    this.a = paramContext;
    this.b = paramFile;
    this.c = paramString2;
    this.d = new File(this.b, paramString1);
    this.e = new ac(this.d);
    e();
  }
  
  private void a(File paramFile1, File paramFile2)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    try
    {
      FileInputStream localFileInputStream = new FileInputStream(paramFile1);
      localObject1 = localObject2;
      m.a(localFileInputStream, "Failed to close file input stream");
    }
    finally
    {
      try
      {
        paramFile2 = a(paramFile2);
        localObject1 = paramFile2;
        m.a(localFileInputStream, paramFile2, new byte['Ѐ']);
        m.a(localFileInputStream, "Failed to close file input stream");
        m.a(paramFile2, "Failed to close output stream");
        paramFile1.delete();
        return;
      }
      finally
      {
        for (;;) {}
      }
      paramFile2 = finally;
      localFileInputStream = null;
    }
    m.a((Closeable)localObject1, "Failed to close output stream");
    paramFile1.delete();
    throw paramFile2;
  }
  
  private void e()
  {
    this.f = new File(this.b, this.c);
    if (!this.f.exists()) {
      this.f.mkdirs();
    }
  }
  
  public int a()
  {
    return this.e.a();
  }
  
  public OutputStream a(File paramFile)
  {
    return new FileOutputStream(paramFile);
  }
  
  public List<File> a(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    File[] arrayOfFile = this.f.listFiles();
    int j = arrayOfFile.length;
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        localArrayList.add(arrayOfFile[i]);
        if (localArrayList.size() < paramInt) {}
      }
      else
      {
        return localArrayList;
      }
      i += 1;
    }
  }
  
  public void a(String paramString)
  {
    this.e.close();
    a(this.d, new File(this.f, paramString));
    this.e = new ac(this.d);
  }
  
  public void a(List<File> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      File localFile = (File)paramList.next();
      m.a(this.a, String.format("deleting sent analytics file %s", new Object[] { localFile.getName() }));
      localFile.delete();
    }
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.e.a(paramArrayOfByte);
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return this.e.a(paramInt1, paramInt2);
  }
  
  public boolean b()
  {
    return this.e.b();
  }
  
  public List<File> c()
  {
    return Arrays.asList(this.f.listFiles());
  }
  
  public void d()
  {
    try
    {
      this.e.close();
      this.d.delete();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\b\a\a\a\a\d\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
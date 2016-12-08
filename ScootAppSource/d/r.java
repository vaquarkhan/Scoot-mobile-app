package d;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class r
{
  private static final Logger a = Logger.getLogger(r.class.getName());
  
  public static ac a(OutputStream paramOutputStream)
  {
    return a(paramOutputStream, new ae());
  }
  
  private static ac a(OutputStream paramOutputStream, ae paramae)
  {
    if (paramOutputStream == null) {
      throw new IllegalArgumentException("out == null");
    }
    if (paramae == null) {
      throw new IllegalArgumentException("timeout == null");
    }
    return new s(paramae, paramOutputStream);
  }
  
  public static ac a(Socket paramSocket)
  {
    if (paramSocket == null) {
      throw new IllegalArgumentException("socket == null");
    }
    a locala = c(paramSocket);
    return locala.sink(a(paramSocket.getOutputStream(), locala));
  }
  
  public static ad a(File paramFile)
  {
    if (paramFile == null) {
      throw new IllegalArgumentException("file == null");
    }
    return a(new FileInputStream(paramFile));
  }
  
  public static ad a(InputStream paramInputStream)
  {
    return a(paramInputStream, new ae());
  }
  
  private static ad a(InputStream paramInputStream, ae paramae)
  {
    if (paramInputStream == null) {
      throw new IllegalArgumentException("in == null");
    }
    if (paramae == null) {
      throw new IllegalArgumentException("timeout == null");
    }
    return new t(paramae, paramInputStream);
  }
  
  public static i a(ac paramac)
  {
    if (paramac == null) {
      throw new IllegalArgumentException("sink == null");
    }
    return new v(paramac);
  }
  
  public static j a(ad paramad)
  {
    if (paramad == null) {
      throw new IllegalArgumentException("source == null");
    }
    return new x(paramad);
  }
  
  public static ac b(File paramFile)
  {
    if (paramFile == null) {
      throw new IllegalArgumentException("file == null");
    }
    return a(new FileOutputStream(paramFile));
  }
  
  public static ad b(Socket paramSocket)
  {
    if (paramSocket == null) {
      throw new IllegalArgumentException("socket == null");
    }
    a locala = c(paramSocket);
    return locala.source(a(paramSocket.getInputStream(), locala));
  }
  
  private static a c(Socket paramSocket)
  {
    return new u(paramSocket);
  }
  
  public static ac c(File paramFile)
  {
    if (paramFile == null) {
      throw new IllegalArgumentException("file == null");
    }
    return a(new FileOutputStream(paramFile, true));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
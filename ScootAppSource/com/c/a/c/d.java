package com.c.a.c;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

final class d
  extends FileOutputStream
{
  public static final FilenameFilter a = new e();
  private final String b;
  private File c;
  private File d;
  private boolean e = false;
  
  public d(File paramFile, String paramString)
  {
    super(new File(paramFile, paramString + ".cls_temp"));
    this.b = (paramFile + File.separator + paramString);
    this.c = new File(this.b + ".cls_temp");
  }
  
  public void a()
  {
    if (this.e) {
      return;
    }
    this.e = true;
    super.flush();
    super.close();
  }
  
  public void close()
  {
    File localFile;
    try
    {
      boolean bool = this.e;
      if (bool) {}
      for (;;)
      {
        return;
        this.e = true;
        super.flush();
        super.close();
        localFile = new File(this.b + ".cls");
        if (!this.c.renameTo(localFile)) {
          break;
        }
        this.c = null;
        this.d = localFile;
      }
      str = "";
    }
    finally {}
    String str;
    if (localFile.exists()) {
      str = " (target already exists)";
    }
    for (;;)
    {
      throw new IOException("Could not rename temp file: " + this.c + " -> " + localFile + str);
      if (!this.c.exists()) {
        str = " (source does not exist)";
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
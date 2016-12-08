package com.c.a.c;

import b.a.a.a.a.b.ac;
import b.a.a.a.a.b.m;
import b.a.a.a.f;
import b.a.a.a.t;
import java.io.File;
import java.io.IOException;

final class bs
  implements ax
{
  private final File a;
  private final int b;
  private ac c;
  
  public bs(File paramFile, int paramInt)
  {
    this.a = paramFile;
    this.b = paramInt;
  }
  
  private void d()
  {
    if (this.c == null) {}
    try
    {
      this.c = new ac(this.a);
      return;
    }
    catch (IOException localIOException)
    {
      f.h().e("CrashlyticsCore", "Could not open log file: " + this.a, localIOException);
    }
  }
  
  public b a()
  {
    if (!this.a.exists()) {}
    do
    {
      return null;
      d();
    } while (this.c == null);
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 0;
    byte[] arrayOfByte = new byte[this.c.a()];
    try
    {
      this.c.a(new bt(this, arrayOfByte, arrayOfInt));
      return b.a(arrayOfByte, 0, arrayOfInt[0]);
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        f.h().e("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", localIOException);
      }
    }
  }
  
  public void b()
  {
    m.a(this.c, "There was a problem closing the Crashlytics log file.");
    this.c = null;
  }
  
  public void c()
  {
    b();
    this.a.delete();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
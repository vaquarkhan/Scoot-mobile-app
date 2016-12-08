package com.c.a.c;

import b.a.a.a.a.f.a;
import b.a.a.a.f;
import b.a.a.a.t;
import java.io.File;
import java.io.IOException;

final class y
{
  private final String a;
  private final a b;
  
  public y(String paramString, a parama)
  {
    this.a = paramString;
    this.b = parama;
  }
  
  private File d()
  {
    return new File(this.b.a(), this.a);
  }
  
  public boolean a()
  {
    try
    {
      boolean bool = d().createNewFile();
      return bool;
    }
    catch (IOException localIOException)
    {
      f.h().e("CrashlyticsCore", "Error creating marker: " + this.a, localIOException);
    }
    return false;
  }
  
  public boolean b()
  {
    return d().exists();
  }
  
  public boolean c()
  {
    return d().delete();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
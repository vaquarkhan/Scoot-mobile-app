package com.c.a.c;

import b.a.a.a.f;
import b.a.a.a.t;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class bz
  implements bu
{
  private final File a;
  private final Map<String, String> b;
  
  public bz(File paramFile)
  {
    this(paramFile, Collections.emptyMap());
  }
  
  public bz(File paramFile, Map<String, String> paramMap)
  {
    this.a = paramFile;
    this.b = new HashMap(paramMap);
    if (this.a.length() == 0L) {
      this.b.putAll(bv.a);
    }
  }
  
  public boolean a()
  {
    f.h().a("CrashlyticsCore", "Removing report at " + this.a.getPath());
    return this.a.delete();
  }
  
  public String b()
  {
    return d().getName();
  }
  
  public String c()
  {
    String str = b();
    return str.substring(0, str.lastIndexOf('.'));
  }
  
  public File d()
  {
    return this.a;
  }
  
  public Map<String, String> e()
  {
    return Collections.unmodifiableMap(this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
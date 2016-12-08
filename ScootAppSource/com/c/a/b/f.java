package com.c.a.b;

import java.io.InputStream;
import java.util.Properties;

final class f
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  
  f(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
  }
  
  public static f a(InputStream paramInputStream)
  {
    Properties localProperties = new Properties();
    localProperties.load(paramInputStream);
    return a(localProperties);
  }
  
  public static f a(Properties paramProperties)
  {
    return new f(paramProperties.getProperty("version_code"), paramProperties.getProperty("version_name"), paramProperties.getProperty("build_id"), paramProperties.getProperty("package_name"));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
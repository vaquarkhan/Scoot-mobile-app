package com.squareup.okhttp.internal.framed;

import d.k;

public final class Header
{
  public static final k RESPONSE_STATUS = k.a(":status");
  public static final k TARGET_AUTHORITY = k.a(":authority");
  public static final k TARGET_HOST = k.a(":host");
  public static final k TARGET_METHOD = k.a(":method");
  public static final k TARGET_PATH = k.a(":path");
  public static final k TARGET_SCHEME = k.a(":scheme");
  public static final k VERSION = k.a(":version");
  final int hpackSize;
  public final k name;
  public final k value;
  
  public Header(k paramk1, k paramk2)
  {
    this.name = paramk1;
    this.value = paramk2;
    this.hpackSize = (paramk1.f() + 32 + paramk2.f());
  }
  
  public Header(k paramk, String paramString)
  {
    this(paramk, k.a(paramString));
  }
  
  public Header(String paramString1, String paramString2)
  {
    this(k.a(paramString1), k.a(paramString2));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof Header))
    {
      paramObject = (Header)paramObject;
      bool1 = bool2;
      if (this.name.equals(((Header)paramObject).name))
      {
        bool1 = bool2;
        if (this.value.equals(((Header)paramObject).value)) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return (this.name.hashCode() + 527) * 31 + this.value.hashCode();
  }
  
  public String toString()
  {
    return String.format("%s: %s", new Object[] { this.name.a(), this.value.a() });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\Header.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
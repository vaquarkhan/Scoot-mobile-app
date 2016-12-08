package com.twitter.sdk.android.core.internal.scribe;

public final class c
{
  @com.google.a.a.c(a="client")
  public final String a;
  @com.google.a.a.c(a="page")
  public final String b;
  @com.google.a.a.c(a="section")
  public final String c;
  @com.google.a.a.c(a="component")
  public final String d;
  @com.google.a.a.c(a="element")
  public final String e;
  @com.google.a.a.c(a="action")
  public final String f;
  
  public c(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
    this.f = paramString6;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (c)paramObject;
      if (this.f != null)
      {
        if (this.f.equals(((c)paramObject).f)) {}
      }
      else {
        while (((c)paramObject).f != null) {
          return false;
        }
      }
      if (this.a != null)
      {
        if (this.a.equals(((c)paramObject).a)) {}
      }
      else {
        while (((c)paramObject).a != null) {
          return false;
        }
      }
      if (this.d != null)
      {
        if (this.d.equals(((c)paramObject).d)) {}
      }
      else {
        while (((c)paramObject).d != null) {
          return false;
        }
      }
      if (this.e != null)
      {
        if (this.e.equals(((c)paramObject).e)) {}
      }
      else {
        while (((c)paramObject).e != null) {
          return false;
        }
      }
      if (this.b != null)
      {
        if (this.b.equals(((c)paramObject).b)) {}
      }
      else {
        while (((c)paramObject).b != null) {
          return false;
        }
      }
      if (this.c == null) {
        break;
      }
    } while (this.c.equals(((c)paramObject).c));
    for (;;)
    {
      return false;
      if (((c)paramObject).c == null) {
        break;
      }
    }
  }
  
  public int hashCode()
  {
    int i1 = 0;
    int i;
    int j;
    label33:
    int k;
    label48:
    int m;
    if (this.a != null)
    {
      i = this.a.hashCode();
      if (this.b == null) {
        break label131;
      }
      j = this.b.hashCode();
      if (this.c == null) {
        break label136;
      }
      k = this.c.hashCode();
      if (this.d == null) {
        break label141;
      }
      m = this.d.hashCode();
      label64:
      if (this.e == null) {
        break label147;
      }
    }
    label131:
    label136:
    label141:
    label147:
    for (int n = this.e.hashCode();; n = 0)
    {
      if (this.f != null) {
        i1 = this.f.hashCode();
      }
      return (n + (m + (k + (j + i * 31) * 31) * 31) * 31) * 31 + i1;
      i = 0;
      break;
      j = 0;
      break label33;
      k = 0;
      break label48;
      m = 0;
      break label64;
    }
  }
  
  public String toString()
  {
    return "client=" + this.a + ", page=" + this.b + ", section=" + this.c + ", component=" + this.d + ", element=" + this.e + ", action=" + this.f;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\twitter\sdk\android\core\internal\scribe\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
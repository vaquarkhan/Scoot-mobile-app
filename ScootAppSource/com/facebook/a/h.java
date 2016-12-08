package com.facebook.a;

import com.facebook.AccessToken;
import com.facebook.b.as;
import com.facebook.w;
import java.io.Serializable;

final class h
  implements Serializable
{
  private final String a;
  private final String b;
  
  h(AccessToken paramAccessToken)
  {
    this(paramAccessToken.b(), w.i());
  }
  
  h(String paramString1, String paramString2)
  {
    String str = paramString1;
    if (as.a(paramString1)) {
      str = null;
    }
    this.a = str;
    this.b = paramString2;
  }
  
  String a()
  {
    return this.a;
  }
  
  String b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof h)) {}
    do
    {
      return false;
      paramObject = (h)paramObject;
    } while ((!as.a(((h)paramObject).a, this.a)) || (!as.a(((h)paramObject).b, this.b)));
    return true;
  }
  
  public int hashCode()
  {
    int j = 0;
    int i;
    if (this.a == null)
    {
      i = 0;
      if (this.b != null) {
        break label33;
      }
    }
    for (;;)
    {
      return i ^ j;
      i = this.a.hashCode();
      break;
      label33:
      j = this.b.hashCode();
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
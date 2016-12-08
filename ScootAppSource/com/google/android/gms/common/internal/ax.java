package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;

final class ax
{
  private final String a;
  private final String b;
  private final ComponentName c;
  
  public ax(String paramString1, String paramString2)
  {
    this.a = b.a(paramString1);
    this.b = b.a(paramString2);
    this.c = null;
  }
  
  public Intent a()
  {
    if (this.a != null) {
      return new Intent(this.a).setPackage(this.b);
    }
    return new Intent().setComponent(this.c);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof ax)) {
        return false;
      }
      paramObject = (ax)paramObject;
    } while ((br.a(this.a, ((ax)paramObject).a)) && (br.a(this.c, ((ax)paramObject).c)));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.a, this.c });
  }
  
  public String toString()
  {
    if (this.a == null) {
      return this.c.flattenToString();
    }
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\common\internal\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
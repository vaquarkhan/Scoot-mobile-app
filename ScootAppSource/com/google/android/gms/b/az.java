package com.google.android.gms.b;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.br;

public final class az<O extends b>
{
  private final a<O> a;
  private final O b;
  
  public i<?> a()
  {
    return this.a.d();
  }
  
  public String b()
  {
    return this.a.f();
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof az)) {
        return false;
      }
      paramObject = (az)paramObject;
    } while ((br.a(this.a, ((az)paramObject).a)) && (br.a(this.b, ((az)paramObject).b)));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { this.a, this.b });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.internal.br;
import com.google.android.gms.location.places.k;

public final class ae
  implements k
{
  private final String a;
  private final int b;
  private final int c;
  private final CharSequence d;
  private int e;
  
  public ae(String paramString, int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3)
  {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramCharSequence;
    this.e = paramInt3;
  }
  
  public k b()
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof ae)) {
        return false;
      }
      paramObject = (ae)paramObject;
    } while ((((ae)paramObject).b == this.b) && (((ae)paramObject).c == this.c) && (br.a(((ae)paramObject).a, this.a)) && (br.a(((ae)paramObject).d, this.d)));
    return false;
  }
  
  public int hashCode()
  {
    return br.a(new Object[] { Integer.valueOf(this.b), Integer.valueOf(this.c), this.a, this.d });
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\location\places\internal\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
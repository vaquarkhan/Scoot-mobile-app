package com.google.android.gms.b;

import java.util.Arrays;

final class o
{
  final int a;
  final byte[] b;
  
  o(int paramInt, byte[] paramArrayOfByte)
  {
    this.a = paramInt;
    this.b = paramArrayOfByte;
  }
  
  int a()
  {
    return e.f(this.a) + 0 + this.b.length;
  }
  
  void a(e parame)
  {
    parame.e(this.a);
    parame.d(this.b);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof o)) {
        return false;
      }
      paramObject = (o)paramObject;
    } while ((this.a == ((o)paramObject).a) && (Arrays.equals(this.b, ((o)paramObject).b)));
    return false;
  }
  
  public int hashCode()
  {
    return (this.a + 527) * 31 + Arrays.hashCode(this.b);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
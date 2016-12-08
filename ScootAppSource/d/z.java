package d;

final class z
{
  final byte[] a;
  int b;
  int c;
  boolean d;
  boolean e;
  z f;
  z g;
  
  z()
  {
    this.a = new byte['ࠀ'];
    this.e = true;
    this.d = false;
  }
  
  z(z paramz)
  {
    this(paramz.a, paramz.b, paramz.c);
    paramz.d = true;
  }
  
  z(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = false;
    this.d = true;
  }
  
  public z a()
  {
    if (this.f != this) {}
    for (z localz = this.f;; localz = null)
    {
      this.g.f = this.f;
      this.f.g = this.g;
      this.f = null;
      this.g = null;
      return localz;
    }
  }
  
  public z a(int paramInt)
  {
    if ((paramInt <= 0) || (paramInt > this.c - this.b)) {
      throw new IllegalArgumentException();
    }
    z localz = new z(this);
    localz.c = (localz.b + paramInt);
    this.b += paramInt;
    this.g.a(localz);
    return localz;
  }
  
  public z a(z paramz)
  {
    paramz.g = this;
    paramz.f = this.f;
    this.f.g = paramz;
    this.f = paramz;
    return paramz;
  }
  
  public void a(z paramz, int paramInt)
  {
    if (!paramz.e) {
      throw new IllegalArgumentException();
    }
    if (paramz.c + paramInt > 2048)
    {
      if (paramz.d) {
        throw new IllegalArgumentException();
      }
      if (paramz.c + paramInt - paramz.b > 2048) {
        throw new IllegalArgumentException();
      }
      System.arraycopy(paramz.a, paramz.b, paramz.a, 0, paramz.c - paramz.b);
      paramz.c -= paramz.b;
      paramz.b = 0;
    }
    System.arraycopy(this.a, this.b, paramz.a, paramz.c, paramInt);
    paramz.c += paramInt;
    this.b += paramInt;
  }
  
  public void b()
  {
    if (this.g == this) {
      throw new IllegalStateException();
    }
    if (!this.g.e) {}
    for (;;)
    {
      return;
      int j = this.c - this.b;
      int k = this.g.c;
      if (this.g.d) {}
      for (int i = 0; j <= i + (2048 - k); i = this.g.b)
      {
        a(this.g, j);
        a();
        aa.a(this);
        return;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
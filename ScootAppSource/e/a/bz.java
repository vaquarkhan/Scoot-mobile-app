package e.a;

public final class bz
{
  private final int a;
  private final int b;
  
  public bz(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int a(int paramInt)
  {
    return (int)(this.a * paramInt / this.b);
  }
  
  public long a(long paramLong)
  {
    return this.a * paramLong / this.b;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public bz c()
  {
    return new bz(this.b, this.a);
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (getClass() != paramObject.getClass()) {
        return false;
      }
      paramObject = (bz)paramObject;
      if (this.b != ((bz)paramObject).b) {
        return false;
      }
    } while (this.a == ((bz)paramObject).a);
    return false;
  }
  
  public int hashCode()
  {
    return (this.b + 31) * 31 + this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
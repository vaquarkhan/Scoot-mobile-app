package e.a;

public final class cp
{
  private int a;
  private int b;
  
  public cp(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
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
      paramObject = (cp)paramObject;
      if (this.b != ((cp)paramObject).b) {
        return false;
      }
    } while (this.a == ((cp)paramObject).a);
    return false;
  }
  
  public int hashCode()
  {
    return (this.b + 31) * 31 + this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
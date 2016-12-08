package e.a;

public final class cv
{
  private short a;
  private byte b;
  private byte c;
  private byte d;
  private boolean e;
  
  public short a()
  {
    return this.a;
  }
  
  public byte b()
  {
    return this.b;
  }
  
  public byte c()
  {
    return this.c;
  }
  
  public byte d()
  {
    return this.d;
  }
  
  public boolean e()
  {
    return this.e;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append(String.format("%02d:%02d:%02d", new Object[] { Short.valueOf(this.a), Byte.valueOf(this.b), Byte.valueOf(this.c) }));
    if (this.e) {}
    for (String str = ";";; str = ":") {
      return str + String.format("%02d", new Object[] { Byte.valueOf(this.d) });
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package e.a;

public final class bc
{
  private long[] a;
  private int b;
  private int c;
  
  public bc()
  {
    this(128);
  }
  
  public bc(int paramInt)
  {
    this.c = paramInt;
    this.a = new long[paramInt];
  }
  
  public void a(long paramLong)
  {
    if (this.b >= this.a.length)
    {
      arrayOfLong = new long[this.a.length + this.c];
      System.arraycopy(this.a, 0, arrayOfLong, 0, this.a.length);
      this.a = arrayOfLong;
    }
    long[] arrayOfLong = this.a;
    int i = this.b;
    this.b = (i + 1);
    arrayOfLong[i] = paramLong;
  }
  
  public long[] a()
  {
    long[] arrayOfLong = new long[this.b];
    System.arraycopy(this.a, 0, arrayOfLong, 0, this.b);
    return arrayOfLong;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
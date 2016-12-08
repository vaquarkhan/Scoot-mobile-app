package e.a;

public final class ax
{
  private int[] a;
  private int b;
  private int c;
  
  public ax()
  {
    this(128);
  }
  
  public ax(int paramInt)
  {
    this.c = paramInt;
    this.a = new int[paramInt];
  }
  
  public void a(int paramInt)
  {
    if (this.b >= this.a.length)
    {
      arrayOfInt = new int[this.a.length + this.c];
      System.arraycopy(this.a, 0, arrayOfInt, 0, this.a.length);
      this.a = arrayOfInt;
    }
    int[] arrayOfInt = this.a;
    int i = this.b;
    this.b = (i + 1);
    arrayOfInt[i] = paramInt;
  }
  
  public int[] a()
  {
    int[] arrayOfInt = new int[this.b];
    System.arraycopy(this.a, 0, arrayOfInt, 0, this.b);
    return arrayOfInt;
  }
  
  public int b()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
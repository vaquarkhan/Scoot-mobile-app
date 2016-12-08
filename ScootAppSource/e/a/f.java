package e.a;

public final class f
{
  public static final f a = new f(255);
  private int b;
  
  private f(int paramInt)
  {
    this.b = paramInt;
  }
  
  public static f a(int paramInt)
  {
    if (paramInt == a.b) {
      return a;
    }
    return new f(paramInt);
  }
  
  public int a()
  {
    return this.b;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
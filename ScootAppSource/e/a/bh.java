package e.a;

public final class bh
{
  public static final int a(int paramInt)
  {
    int i = paramInt >> 31;
    return (paramInt ^ i) - i;
  }
  
  public static final int b(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    return (a(paramInt) << 1) - ((paramInt ^ 0xFFFFFFFF) >>> 31);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
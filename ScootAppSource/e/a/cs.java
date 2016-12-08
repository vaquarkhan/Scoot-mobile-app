package e.a;

public enum cs
{
  private cs() {}
  
  public static cs a(int paramInt)
  {
    cs[] arrayOfcs = values();
    int j = arrayOfcs.length;
    int i = 0;
    while (i < j)
    {
      cs localcs = arrayOfcs[i];
      if (localcs.ordinal() == paramInt) {
        return localcs;
      }
      i += 1;
    }
    return null;
  }
  
  public boolean a()
  {
    return (this != c) && (this != e);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
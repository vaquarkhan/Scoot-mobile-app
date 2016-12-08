package com.c.a.c;

final class bo
  extends bn
{
  private final bn[] a;
  
  public bo(bn... paramVarArgs)
  {
    super(0, new bn[0]);
    this.a = paramVarArgs;
  }
  
  public int b()
  {
    int i = 0;
    bn[] arrayOfbn = this.a;
    int k = arrayOfbn.length;
    int j = 0;
    while (i < k)
    {
      j += arrayOfbn[i].b();
      i += 1;
    }
    return j;
  }
  
  public void b(f paramf)
  {
    bn[] arrayOfbn = this.a;
    int j = arrayOfbn.length;
    int i = 0;
    while (i < j)
    {
      arrayOfbn[i].b(paramf);
      i += 1;
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
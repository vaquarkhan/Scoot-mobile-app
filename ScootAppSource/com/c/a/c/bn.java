package com.c.a.c;

abstract class bn
{
  private final int a;
  private final bn[] b;
  
  public bn(int paramInt, bn... paramVarArgs)
  {
    this.a = paramInt;
    if (paramVarArgs != null) {}
    for (;;)
    {
      this.b = paramVarArgs;
      return;
      paramVarArgs = bd.a();
    }
  }
  
  public int a()
  {
    return 0;
  }
  
  public void a(f paramf) {}
  
  public int b()
  {
    int i = c();
    return i + f.l(i) + f.j(this.a);
  }
  
  public void b(f paramf)
  {
    paramf.g(this.a, 2);
    paramf.k(c());
    a(paramf);
    bn[] arrayOfbn = this.b;
    int j = arrayOfbn.length;
    int i = 0;
    while (i < j)
    {
      arrayOfbn[i].b(paramf);
      i += 1;
    }
  }
  
  public int c()
  {
    int j = a();
    bn[] arrayOfbn = this.b;
    int k = arrayOfbn.length;
    int i = 0;
    while (i < k)
    {
      j += arrayOfbn[i].b();
      i += 1;
    }
    return j;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\c\a\c\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.google.android.gms.b;

public abstract class g<M extends g<M>>
  extends m
{
  protected i d;
  
  public void a(e parame)
  {
    if (this.d == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.d.a())
      {
        this.d.b(i).a(parame);
        i += 1;
      }
    }
  }
  
  protected final boolean a(d paramd, int paramInt)
  {
    int i = paramd.k();
    if (!paramd.b(paramInt)) {
      return false;
    }
    int j = p.b(paramInt);
    o localo = new o(paramInt, paramd.a(i, paramd.k() - i));
    paramd = null;
    if (this.d == null) {
      this.d = new i();
    }
    for (;;)
    {
      Object localObject = paramd;
      if (paramd == null)
      {
        localObject = new j();
        this.d.a(j, (j)localObject);
      }
      ((j)localObject).a(localo);
      return true;
      paramd = this.d.a(j);
    }
  }
  
  protected int b()
  {
    int j = 0;
    if (this.d != null)
    {
      int i = 0;
      for (;;)
      {
        k = i;
        if (j >= this.d.a()) {
          break;
        }
        i += this.d.b(j).a();
        j += 1;
      }
    }
    int k = 0;
    return k;
  }
  
  public M c()
  {
    g localg = (g)super.d();
    k.a(this, localg);
    return localg;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
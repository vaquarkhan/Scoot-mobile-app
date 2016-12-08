package android.support.v7.widget;

final class ec
  implements aj
{
  ec(RecyclerView paramRecyclerView) {}
  
  public fd a(int paramInt)
  {
    fd localfd = this.a.a(paramInt, true);
    if (localfd == null) {}
    while (this.a.d.c(localfd.a)) {
      return null;
    }
    return localfd;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, true);
    this.a.i = true;
    fa.a(this.a.h, paramInt2);
  }
  
  public void a(int paramInt1, int paramInt2, Object paramObject)
  {
    this.a.a(paramInt1, paramInt2, paramObject);
    this.a.j = true;
  }
  
  public void a(ak paramak)
  {
    c(paramak);
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, false);
    this.a.i = true;
  }
  
  public void b(ak paramak)
  {
    c(paramak);
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    this.a.f(paramInt1, paramInt2);
    this.a.i = true;
  }
  
  void c(ak paramak)
  {
    switch (paramak.a)
    {
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      return;
    case 1: 
      this.a.f.a(this.a, paramak.b, paramak.d);
      return;
    case 2: 
      this.a.f.b(this.a, paramak.b, paramak.d);
      return;
    case 4: 
      this.a.f.a(this.a, paramak.b, paramak.d, paramak.c);
      return;
    }
    this.a.f.a(this.a, paramak.b, paramak.d, 1);
  }
  
  public void d(int paramInt1, int paramInt2)
  {
    this.a.e(paramInt1, paramInt2);
    this.a.i = true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\android\support\v7\widget\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
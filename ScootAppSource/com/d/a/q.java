package com.d.a;

final class q
  extends o
{
  int d;
  
  q(float paramFloat, int paramInt)
  {
    this.a = paramFloat;
    this.d = paramInt;
    this.b = Integer.TYPE;
    this.c = true;
  }
  
  public void a(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == Integer.class))
    {
      this.d = ((Integer)paramObject).intValue();
      this.c = true;
    }
  }
  
  public Object b()
  {
    return Integer.valueOf(this.d);
  }
  
  public int g()
  {
    return this.d;
  }
  
  public q h()
  {
    q localq = new q(c(), this.d);
    localq.a(d());
    return localq;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.d.b;

public abstract class b<T>
  extends c<T, Integer>
{
  public b(String paramString)
  {
    super(Integer.class, paramString);
  }
  
  public abstract void a(T paramT, int paramInt);
  
  public final void a(T paramT, Integer paramInteger)
  {
    a(paramT, Integer.valueOf(paramInteger.intValue()));
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
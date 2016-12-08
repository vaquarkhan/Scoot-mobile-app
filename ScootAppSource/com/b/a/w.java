package com.b.a;

public final class w<T>
{
  public final T a;
  public final c b;
  public final ad c;
  public boolean d = false;
  
  private w(ad paramad)
  {
    this.a = null;
    this.b = null;
    this.c = paramad;
  }
  
  private w(T paramT, c paramc)
  {
    this.a = paramT;
    this.b = paramc;
    this.c = null;
  }
  
  public static <T> w<T> a(ad paramad)
  {
    return new w(paramad);
  }
  
  public static <T> w<T> a(T paramT, c paramc)
  {
    return new w(paramT, paramc);
  }
  
  public boolean a()
  {
    return this.c == null;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\b\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
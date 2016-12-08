package com.d.b;

public abstract class a<T>
  extends c<T, Float>
{
  public a(String paramString)
  {
    super(Float.class, paramString);
  }
  
  public abstract void a(T paramT, float paramFloat);
  
  public final void a(T paramT, Float paramFloat)
  {
    a(paramT, paramFloat.floatValue());
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\d\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
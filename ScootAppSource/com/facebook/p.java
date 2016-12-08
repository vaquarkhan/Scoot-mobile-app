package com.facebook;

public class p
  extends RuntimeException
{
  public p() {}
  
  public p(String paramString)
  {
    super(paramString);
  }
  
  public p(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public p(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
  
  public String toString()
  {
    return getMessage();
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.mixpanel.android.a.c;

public class b
  extends Exception
{
  private int a;
  
  public b(int paramInt)
  {
    this.a = paramInt;
  }
  
  public b(int paramInt, String paramString)
  {
    super(paramString);
    this.a = paramInt;
  }
  
  public b(int paramInt, Throwable paramThrowable)
  {
    super(paramThrowable);
    this.a = paramInt;
  }
  
  public int a()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.facebook;

public final class o
  extends p
{
  private int a;
  private String b;
  
  public o(String paramString1, int paramInt, String paramString2)
  {
    super(paramString1);
    this.a = paramInt;
    this.b = paramString2;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public final String toString()
  {
    return "{FacebookDialogException: " + "errorCode: " + a() + ", message: " + getMessage() + ", url: " + b() + "}";
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\facebook\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
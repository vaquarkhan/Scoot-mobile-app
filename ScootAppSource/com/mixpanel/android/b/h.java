package com.mixpanel.android.b;

public final class h
  extends Exception
{
  private final int a;
  
  public h(String paramString1, String paramString2)
  {
    super(paramString1);
    try
    {
      i = Integer.parseInt(paramString2);
      this.a = i;
      return;
    }
    catch (NumberFormatException paramString1)
    {
      for (;;)
      {
        int i = 0;
      }
    }
  }
  
  public int a()
  {
    return this.a;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
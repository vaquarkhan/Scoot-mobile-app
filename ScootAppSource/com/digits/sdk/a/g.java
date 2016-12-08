package com.digits.sdk.a;

public final class g
{
  public static boolean a(char paramChar)
  {
    return ((' ' <= paramChar) && (paramChar <= '~')) || (paramChar == '\r') || (paramChar == '\n');
  }
  
  public static boolean a(CharSequence paramCharSequence)
  {
    int j = paramCharSequence.length();
    int i = 0;
    while (i < j)
    {
      if (!a(paramCharSequence.charAt(i))) {
        return false;
      }
      i += 1;
    }
    return true;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\digits\sdk\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
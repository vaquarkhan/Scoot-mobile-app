package e.b.a.d;

import java.io.IOException;

public final class y
{
  private static final double a = Math.log(10.0D);
  
  static int a(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.charAt(paramInt) - '0';
    return (i << 1) + (i << 3) + paramCharSequence.charAt(paramInt + 1) - 48;
  }
  
  static String a(String paramString, int paramInt)
  {
    int i = paramInt + 32;
    if (paramString.length() <= i + 3) {}
    for (String str = paramString; paramInt <= 0; str = paramString.substring(0, i).concat("...")) {
      return "Invalid format: \"" + str + '"';
    }
    if (paramInt >= paramString.length()) {
      return "Invalid format: \"" + str + "\" is too short";
    }
    return "Invalid format: \"" + str + "\" is malformed at \"" + str.substring(paramInt) + '"';
  }
  
  public static void a(Appendable paramAppendable, int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0)
    {
      paramAppendable.append('-');
      if (paramInt != Integer.MIN_VALUE) {
        i = -paramInt;
      }
    }
    else
    {
      if (i >= 10) {
        break label53;
      }
      paramAppendable.append((char)(i + 48));
      return;
    }
    paramAppendable.append("2147483648");
    return;
    label53:
    if (i < 100)
    {
      paramInt = (i + 1) * 13421772 >> 27;
      paramAppendable.append((char)(paramInt + 48));
      paramAppendable.append((char)(i - (paramInt << 3) - (paramInt << 1) + 48));
      return;
    }
    paramAppendable.append(Integer.toString(i));
  }
  
  public static void a(Appendable paramAppendable, int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 < 0)
    {
      paramAppendable.append('-');
      i = paramInt2;
      if (paramInt1 != Integer.MIN_VALUE) {
        i = -paramInt1;
      }
    }
    else
    {
      if (i >= 10) {
        break label98;
      }
      while (paramInt2 > 1)
      {
        paramAppendable.append('0');
        paramInt2 -= 1;
      }
    }
    while (i > 10)
    {
      paramAppendable.append('0');
      i -= 1;
    }
    paramAppendable.append("2147483648");
    return;
    paramAppendable.append((char)(i + 48));
    return;
    label98:
    if (i < 100)
    {
      while (paramInt2 > 2)
      {
        paramAppendable.append('0');
        paramInt2 -= 1;
      }
      paramInt1 = (i + 1) * 13421772 >> 27;
      paramAppendable.append((char)(paramInt1 + 48));
      paramAppendable.append((char)(i - (paramInt1 << 3) - (paramInt1 << 1) + 48));
      return;
    }
    if (i < 1000) {
      paramInt1 = 3;
    }
    while (paramInt2 > paramInt1)
    {
      paramAppendable.append('0');
      paramInt2 -= 1;
      continue;
      if (i < 10000) {
        paramInt1 = 4;
      } else {
        paramInt1 = (int)(Math.log(i) / a) + 1;
      }
    }
    paramAppendable.append(Integer.toString(i));
  }
  
  public static void a(StringBuffer paramStringBuffer, int paramInt1, int paramInt2)
  {
    try
    {
      a(paramStringBuffer, paramInt1, paramInt2);
      return;
    }
    catch (IOException paramStringBuffer) {}
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\d\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
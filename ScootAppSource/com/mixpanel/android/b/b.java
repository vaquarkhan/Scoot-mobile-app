package com.mixpanel.android.b;

public final class b
{
  private static char[] a;
  private static byte[] b;
  
  static
  {
    int m = 0;
    a = new char[64];
    int i = 65;
    int j = 0;
    while (i <= 90)
    {
      a[j] = i;
      i = (char)(i + 1);
      j += 1;
    }
    i = 97;
    while (i <= 122)
    {
      a[j] = i;
      i = (char)(i + 1);
      j += 1;
    }
    i = 48;
    while (i <= 57)
    {
      a[j] = i;
      i = (char)(i + 1);
      j += 1;
    }
    char[] arrayOfChar = a;
    int k = j + 1;
    arrayOfChar[j] = '+';
    a[k] = '/';
    b = new byte[''];
    j = 0;
    for (;;)
    {
      k = m;
      if (j >= b.length) {
        break;
      }
      b[j] = -1;
      j += 1;
    }
    while (k < 64)
    {
      b[a[k]] = ((byte)k);
      k += 1;
    }
  }
  
  public static String a(String paramString)
  {
    return new String(a(paramString.getBytes()));
  }
  
  public static char[] a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  public static char[] a(byte[] paramArrayOfByte, int paramInt)
  {
    int i2 = (paramInt * 4 + 2) / 3;
    char[] arrayOfChar = new char[(paramInt + 2) / 3 * 4];
    int k = 0;
    int j = 0;
    if (j < paramInt)
    {
      int m = j + 1;
      int i3 = paramArrayOfByte[j] & 0xFF;
      int n;
      if (m < paramInt)
      {
        j = paramArrayOfByte[m] & 0xFF;
        n = m + 1;
        m = j;
        j = n;
        label71:
        if (j >= paramInt) {
          break label224;
        }
        n = j + 1;
        int i1 = paramArrayOfByte[j] & 0xFF;
        j = n;
        n = i1;
        label97:
        i1 = k + 1;
        arrayOfChar[k] = a[(i3 >>> 2)];
        k = i1 + 1;
        arrayOfChar[i1] = a[((i3 & 0x3) << 4 | m >>> 4)];
        if (k >= i2) {
          break label230;
        }
        i = a[((m & 0xF) << 2 | n >>> 6)];
        label167:
        arrayOfChar[k] = i;
        k += 1;
        if (k >= i2) {
          break label236;
        }
      }
      label224:
      label230:
      label236:
      for (int i = a[(n & 0x3F)];; i = 61)
      {
        arrayOfChar[k] = i;
        k += 1;
        break;
        n = 0;
        j = m;
        m = n;
        break label71;
        n = 0;
        break label97;
        i = 61;
        break label167;
      }
    }
    return arrayOfChar;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\mixpanel\android\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
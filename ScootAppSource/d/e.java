package d;

import java.io.UnsupportedEncodingException;

final class e
{
  private static final byte[] a = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static final byte[] b = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
  
  public static String a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, a);
  }
  
  private static String a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    byte[] arrayOfByte = new byte[(paramArrayOfByte1.length + 2) * 4 / 3];
    int k = paramArrayOfByte1.length - paramArrayOfByte1.length % 3;
    int j = 0;
    while (j < k)
    {
      int m = i + 1;
      arrayOfByte[i] = paramArrayOfByte2[((paramArrayOfByte1[j] & 0xFF) >> 2)];
      i = m + 1;
      arrayOfByte[m] = paramArrayOfByte2[((paramArrayOfByte1[j] & 0x3) << 4 | (paramArrayOfByte1[(j + 1)] & 0xFF) >> 4)];
      m = i + 1;
      arrayOfByte[i] = paramArrayOfByte2[((paramArrayOfByte1[(j + 1)] & 0xF) << 2 | (paramArrayOfByte1[(j + 2)] & 0xFF) >> 6)];
      arrayOfByte[m] = paramArrayOfByte2[(paramArrayOfByte1[(j + 2)] & 0x3F)];
      j += 3;
      i = m + 1;
    }
    switch (paramArrayOfByte1.length % 3)
    {
    }
    for (;;)
    {
      try
      {
        paramArrayOfByte1 = new String(arrayOfByte, 0, i, "US-ASCII");
        return paramArrayOfByte1;
      }
      catch (UnsupportedEncodingException paramArrayOfByte1)
      {
        throw new AssertionError(paramArrayOfByte1);
      }
      j = i + 1;
      arrayOfByte[i] = paramArrayOfByte2[((paramArrayOfByte1[k] & 0xFF) >> 2)];
      i = j + 1;
      arrayOfByte[j] = paramArrayOfByte2[((paramArrayOfByte1[k] & 0x3) << 4)];
      j = i + 1;
      arrayOfByte[i] = 61;
      i = j + 1;
      arrayOfByte[j] = 61;
      continue;
      j = i + 1;
      arrayOfByte[i] = paramArrayOfByte2[((paramArrayOfByte1[k] & 0xFF) >> 2)];
      i = j + 1;
      arrayOfByte[j] = paramArrayOfByte2[((paramArrayOfByte1[k] & 0x3) << 4 | (paramArrayOfByte1[(k + 1)] & 0xFF) >> 4)];
      j = i + 1;
      arrayOfByte[i] = paramArrayOfByte2[((paramArrayOfByte1[(k + 1)] & 0xF) << 2)];
      i = j + 1;
      arrayOfByte[j] = 61;
    }
  }
  
  public static byte[] a(String paramString)
  {
    int n = paramString.length();
    int i;
    byte[] arrayOfByte;
    int i1;
    int m;
    int k;
    label76:
    int j;
    if (n > 0)
    {
      i = paramString.charAt(n - 1);
      if ((i == 61) || (i == 10) || (i == 13) || (i == 32) || (i == 9)) {}
    }
    else
    {
      arrayOfByte = new byte[(int)(n * 6L / 8L)];
      i1 = 0;
      m = 0;
      k = 0;
      i = 0;
      if (i1 >= n) {
        break label296;
      }
      j = paramString.charAt(i1);
      if ((j < 65) || (j > 90)) {
        break label189;
      }
      j -= 65;
      label107:
      j = (byte)j | m << 6;
      k += 1;
      if (k % 4 != 0) {
        break label399;
      }
      m = i + 1;
      arrayOfByte[i] = ((byte)(j >> 16));
      int i2 = m + 1;
      arrayOfByte[m] = ((byte)(j >> 8));
      i = i2 + 1;
      arrayOfByte[i2] = ((byte)j);
    }
    for (;;)
    {
      i1 += 1;
      m = j;
      break label76;
      n -= 1;
      break;
      label189:
      if ((j >= 97) && (j <= 122))
      {
        j -= 71;
        break label107;
      }
      if ((j >= 48) && (j <= 57))
      {
        j += 4;
        break label107;
      }
      if ((j == 43) || (j == 45))
      {
        j = 62;
        break label107;
      }
      if ((j == 47) || (j == 95))
      {
        j = 63;
        break label107;
      }
      if ((j != 10) && (j != 13) && (j != 32))
      {
        if (j == 9)
        {
          j = m;
        }
        else
        {
          return null;
          label296:
          k %= 4;
          if (k == 1) {
            return null;
          }
          if (k == 2)
          {
            arrayOfByte[i] = ((byte)(m << 12 >> 16));
            j = i + 1;
          }
          while (j == arrayOfByte.length)
          {
            return arrayOfByte;
            j = i;
            if (k == 3)
            {
              k = m << 6;
              m = i + 1;
              arrayOfByte[i] = ((byte)(k >> 16));
              j = m + 1;
              arrayOfByte[m] = ((byte)(k >> 8));
            }
          }
          paramString = new byte[j];
          System.arraycopy(arrayOfByte, 0, paramString, 0, j);
          return paramString;
        }
      }
      else {
        label399:
        j = m;
      }
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
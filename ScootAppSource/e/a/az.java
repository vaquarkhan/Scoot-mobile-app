package e.a;

public final class az
{
  public static byte[] a(String paramString)
  {
    paramString = paramString.toCharArray();
    byte[] arrayOfByte = new byte[paramString.length];
    int i = 0;
    while (i < paramString.length)
    {
      arrayOfByte[i] = ((byte)paramString[i]);
      i += 1;
    }
    return arrayOfByte;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\a\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
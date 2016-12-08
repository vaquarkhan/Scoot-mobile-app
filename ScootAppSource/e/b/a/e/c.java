package e.b.a.e;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c
{
  static long a(DataInput paramDataInput)
  {
    int i = paramDataInput.readUnsignedByte();
    switch (i >> 6)
    {
    default: 
      return (i << 26 >> 26) * 1800000L;
    case 1: 
      return (i << 26 >> 2 | paramDataInput.readUnsignedByte() << 16 | paramDataInput.readUnsignedByte() << 8 | paramDataInput.readUnsignedByte()) * 60000L;
    case 2: 
      return (i << 58 >> 26 | paramDataInput.readUnsignedByte() << 24 | paramDataInput.readUnsignedByte() << 16 | paramDataInput.readUnsignedByte() << 8 | paramDataInput.readUnsignedByte()) * 1000L;
    }
    return paramDataInput.readLong();
  }
  
  public static e.b.a.i a(DataInput paramDataInput, String paramString)
  {
    switch (paramDataInput.readUnsignedByte())
    {
    default: 
      throw new IOException("Invalid encoding");
    case 70: 
      paramString = new i(paramString, paramDataInput.readUTF(), (int)a(paramDataInput), (int)a(paramDataInput));
      paramDataInput = paramString;
      if (paramString.equals(e.b.a.i.a)) {
        paramDataInput = e.b.a.i.a;
      }
      return paramDataInput;
    case 67: 
      return a.b(f.a(paramDataInput, paramString));
    }
    return f.a(paramDataInput, paramString);
  }
  
  public static e.b.a.i a(InputStream paramInputStream, String paramString)
  {
    if ((paramInputStream instanceof DataInput)) {
      return a((DataInput)paramInputStream, paramString);
    }
    return a(new DataInputStream(paramInputStream), paramString);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\e\b\a\e\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
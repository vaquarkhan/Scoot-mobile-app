package com.google.android.gms.b;

import java.io.IOException;

public abstract class m
{
  protected volatile int e = -1;
  
  public static final <T extends m> T a(T paramT, byte[] paramArrayOfByte)
  {
    return a(paramT, paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static final <T extends m> T a(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      paramArrayOfByte = d.a(paramArrayOfByte, paramInt1, paramInt2);
      paramT.b(paramArrayOfByte);
      paramArrayOfByte.a(0);
      return paramT;
    }
    catch (l paramT)
    {
      throw paramT;
    }
    catch (IOException paramT)
    {
      throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
    }
  }
  
  public void a(e parame) {}
  
  protected int b()
  {
    return 0;
  }
  
  public abstract m b(d paramd);
  
  public m d()
  {
    return (m)super.clone();
  }
  
  public int e()
  {
    if (this.e < 0) {
      f();
    }
    return this.e;
  }
  
  public int f()
  {
    int i = b();
    this.e = i;
    return i;
  }
  
  public String toString()
  {
    return n.a(this);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\google\android\gms\b\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
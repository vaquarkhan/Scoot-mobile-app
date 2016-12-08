package com.squareup.okhttp.internal.framed;

import d.f;
import d.k;
import java.util.List;
import java.util.Map;

final class Hpack$Writer
{
  private final f out;
  
  Hpack$Writer(f paramf)
  {
    this.out = paramf;
  }
  
  void writeByteString(k paramk)
  {
    writeInt(paramk.f(), 127, 0);
    this.out.a(paramk);
  }
  
  void writeHeaders(List<Header> paramList)
  {
    int j = paramList.size();
    int i = 0;
    if (i < j)
    {
      k localk = ((Header)paramList.get(i)).name.e();
      Integer localInteger = (Integer)Hpack.access$200().get(localk);
      if (localInteger != null)
      {
        writeInt(localInteger.intValue() + 1, 15, 0);
        writeByteString(((Header)paramList.get(i)).value);
      }
      for (;;)
      {
        i += 1;
        break;
        this.out.b(0);
        writeByteString(localk);
        writeByteString(((Header)paramList.get(i)).value);
      }
    }
  }
  
  void writeInt(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2)
    {
      this.out.b(paramInt3 | paramInt1);
      return;
    }
    this.out.b(paramInt3 | paramInt2);
    paramInt1 -= paramInt2;
    while (paramInt1 >= 128)
    {
      this.out.b(paramInt1 & 0x7F | 0x80);
      paramInt1 >>>= 7;
    }
    this.out.b(paramInt1);
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\Hpack$Writer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
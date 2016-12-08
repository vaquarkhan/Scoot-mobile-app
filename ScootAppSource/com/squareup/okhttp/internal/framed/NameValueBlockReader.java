package com.squareup.okhttp.internal.framed;

import d.j;
import d.k;
import d.q;
import d.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class NameValueBlockReader
{
  private int compressedLimit;
  private final q inflaterSource = new q(new NameValueBlockReader.1(this, paramj), new NameValueBlockReader.2(this));
  private final j source = r.a(this.inflaterSource);
  
  public NameValueBlockReader(j paramj) {}
  
  private void doneReading()
  {
    if (this.compressedLimit > 0)
    {
      this.inflaterSource.a();
      if (this.compressedLimit != 0) {
        throw new IOException("compressedLimit > 0: " + this.compressedLimit);
      }
    }
  }
  
  private k readByteString()
  {
    int i = this.source.k();
    return this.source.c(i);
  }
  
  public void close()
  {
    this.source.close();
  }
  
  public List<Header> readNameValueBlock(int paramInt)
  {
    this.compressedLimit += paramInt;
    int i = this.source.k();
    if (i < 0) {
      throw new IOException("numberOfPairs < 0: " + i);
    }
    if (i > 1024) {
      throw new IOException("numberOfPairs > 1024: " + i);
    }
    ArrayList localArrayList = new ArrayList(i);
    paramInt = 0;
    while (paramInt < i)
    {
      k localk1 = readByteString().e();
      k localk2 = readByteString();
      if (localk1.f() == 0) {
        throw new IOException("name.size == 0");
      }
      localArrayList.add(new Header(localk1, localk2));
      paramInt += 1;
    }
    doneReading();
    return localArrayList;
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\NameValueBlockReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.Protocol;
import d.i;
import d.j;

public abstract interface Variant
{
  public abstract Protocol getProtocol();
  
  public abstract FrameReader newReader(j paramj, boolean paramBoolean);
  
  public abstract FrameWriter newWriter(i parami, boolean paramBoolean);
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\Variant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
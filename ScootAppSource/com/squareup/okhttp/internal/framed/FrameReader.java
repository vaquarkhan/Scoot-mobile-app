package com.squareup.okhttp.internal.framed;

import java.io.Closeable;

public abstract interface FrameReader
  extends Closeable
{
  public abstract boolean nextFrame(FrameReader.Handler paramHandler);
  
  public abstract void readConnectionPreface();
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\framed\FrameReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
package com.squareup.okhttp.internal;

import d.ac;
import d.f;
import d.m;
import java.io.IOException;

class FaultHidingSink
  extends m
{
  private boolean hasErrors;
  
  public FaultHidingSink(ac paramac)
  {
    super(paramac);
  }
  
  public void close()
  {
    if (this.hasErrors) {
      return;
    }
    try
    {
      super.close();
      return;
    }
    catch (IOException localIOException)
    {
      this.hasErrors = true;
      onException(localIOException);
    }
  }
  
  public void flush()
  {
    if (this.hasErrors) {
      return;
    }
    try
    {
      super.flush();
      return;
    }
    catch (IOException localIOException)
    {
      this.hasErrors = true;
      onException(localIOException);
    }
  }
  
  protected void onException(IOException paramIOException) {}
  
  public void write(f paramf, long paramLong)
  {
    if (this.hasErrors)
    {
      paramf.g(paramLong);
      return;
    }
    try
    {
      super.write(paramf, paramLong);
      return;
    }
    catch (IOException paramf)
    {
      this.hasErrors = true;
      onException(paramf);
    }
  }
}


/* Location:              D:\Android\dex2jar-2.0\classes-dex2jar.jar!\com\squareup\okhttp\internal\FaultHidingSink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */